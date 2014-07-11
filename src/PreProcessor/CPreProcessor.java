package PreProcessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Context.CFileMgr;
import Global.CGlobalDef;
import Parser.BStarLexer;
import Parser.BStarParser;

public class CPreProcessor {
	private TreeMap<String, ParseTree> include_map = new TreeMap<>();
	
	private ParseTree get_parse_tree(File in_file) throws IOException{
		ParseTree return_result = null;
		if(in_file.exists() && in_file.canRead()){
			InputStream in_stream = new FileInputStream(in_file);
			ANTLRInputStream input = new ANTLRInputStream(in_stream);
			BStarLexer lexer = new BStarLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        BStarParser parser = new BStarParser(tokens);
	        return_result = parser.abmachine();
		}
		else{
			CGlobalDef.cout_end(in_file.getAbsolutePath() + " can't be found or read!");
		}
		
		return return_result;
	}
	
	private void include_file(File in_file) throws IOException{
		ParseTree parse_tree = get_parse_tree(in_file);
		if(parse_tree != null && !include_map.containsKey(in_file.getCanonicalPath())){
			CGlobalDef.cout_end("Included " + in_file.getCanonicalPath());
			include_map.put(in_file.getCanonicalPath(), parse_tree);
			CPreProcrVisitor visitor = new CPreProcrVisitor();
			visitor.visit(parse_tree);
			for(String cur_str: visitor.includes_list){
				include_file(new File(CFileMgr.get_base_dic() + cur_str));
			}
		}
	}
	
	public void test_run(String in_str) throws IOException{
		include_file(new File(in_str));
		for(Map.Entry<String, ParseTree> cur_entry: include_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey());
		}
	}
}
