package com.bstar.PreProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.bstar.Context.CFileMgr;
import com.bstar.Global.CGlobalDef;
import com.bstar.Parser.BStarLexer;
import com.bstar.Parser.BStarParser;

public class CPreProcessor {
	private TreeMap<String, CPreProcResult> include_map = new TreeMap<>();
	
	private String get_file_str(File in_file) throws IOException{
		String return_result = null;
		if(in_file.exists() && in_file.canRead()){
			StringBuffer fileData = new StringBuffer();
	        BufferedReader reader = new BufferedReader(new FileReader(in_file));
	        char[] buf = new char[1024];
	        int numRead=0;
	        while((numRead=reader.read(buf)) != -1){
	            String readData = String.valueOf(buf, 0, numRead);
	            fileData.append(readData);
	        }
	        reader.close();
	        return_result = fileData.toString();
		}
		else{
			CGlobalDef.cout_end(in_file.getAbsolutePath() + " can't be found or read!");
		}
        return return_result;
	}
	
	private ParseTree get_parse_tree(String in_str){
		ParseTree return_result = null;
		if(in_str != null){
			ANTLRInputStream input = new ANTLRInputStream(in_str);
			BStarLexer lexer = new BStarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
		    BStarParser parser = new BStarParser(tokens);
		    return_result = parser.abmachine();
		}
		return return_result;
	}
	
	private void include_file(File in_file) throws IOException{
		String code_str = get_file_str(in_file);
		ParseTree parse_tree = get_parse_tree(code_str);
		if(parse_tree != null && !include_map.containsKey(in_file.getCanonicalPath())){
			CGlobalDef.cout_end("Included " + in_file.getCanonicalPath());
			CPreProcrVisitor visitor = new CPreProcrVisitor();
			visitor.visit(parse_tree);
			//Debug
			//visitor.print_defines_map();
			//Debug end
			include_map.put(in_file.getCanonicalPath(), 
					new CPreProcResult(
							visitor.get_cv_define_str(code_str),
							visitor.get_code_text_str(code_str)
							));
			for(String cur_str: visitor.includes_list){
				include_file(new File(CFileMgr.get_base_dic() + cur_str));
			}
		}
	}
	
	public void test_run(String in_str) throws IOException{
		include_file(new File(in_str));
		for(Map.Entry<String, CPreProcResult> cur_entry: include_map.entrySet()){
			CGlobalDef.cout_dividing_line();
			CGlobalDef.cout_end(cur_entry.getKey());
			CGlobalDef.cout_end(cur_entry.getValue().cv_define_str);
			CGlobalDef.cout_end(cur_entry.getValue().code_text_str);
			CGlobalDef.cout_dividing_line();
		}
	}
}
