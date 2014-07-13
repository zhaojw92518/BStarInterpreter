package PreProcessor;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import Global.CGlobalDef;
import Parser.BStarBaseVisitor;
import Parser.BStarParser;

public class CPreProcrVisitor extends BStarBaseVisitor<String>{
	public LinkedList<String> includes_list = new LinkedList<>();
	private LinkedHashMap<String, String> defines_map = new LinkedHashMap<>();
	
	private int 	cv_define_start 	= -1, 
					cv_define_end 		= -1, 
					code_text_start 	= -1, 
					code_text_end 		= -1;
	
	
	private String def_str_replace(String in_str){
		String return_result = in_str;
		List<String> key_list = new LinkedList<>(defines_map.keySet());
		for(int i = key_list.size() - 1; i >=0; --i){
			String temp_regex = 
					"(?<=(\\A|\\W+))" 	+ 
					key_list.get(i)		+
					"(?=(\\z|\\W+))";
			return_result = return_result.replaceAll(
					temp_regex,
					defines_map.get(key_list.get(i))
					);
		}
		return return_result;
	}
	
	public String get_cv_define_str(String entire_code_str){
		return def_str_replace(entire_code_str.substring(cv_define_start, cv_define_end));
	}
	
	public String get_code_text_str(String entire_code_str){
		return def_str_replace(entire_code_str.substring(code_text_start, code_text_end));
	}
	
	//For debug
	public void print_defines_map(){
		for(Map.Entry<String, String> cur_entry: defines_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey() + " " + cur_entry.getValue());
		}
	}
	
	@Override public String visitAbmachine(@NotNull BStarParser.AbmachineContext ctx) {
		if(ctx.includes() != null){
			visitIncludes(ctx.includes());
		}
		if(ctx.defines() != null){
			visitDefines(ctx.defines());
		}
		if(ctx.cv_define() != null){
			cv_define_start = ctx.cv_define().start.getStartIndex();
			cv_define_end = ctx.cv_define().stop.getStopIndex() + 1;
		}
		if(ctx.code_text() != null){
			code_text_start = ctx.code_text().start.getStartIndex();
			code_text_end = ctx.code_text().stop.getStopIndex() + 1;
		}
		return null; 
	}
	
	@Override public String visitIncludes(@NotNull BStarParser.IncludesContext ctx) {
		for(int i = 0; i < ctx.string().size(); i++){
			String cur_str = ctx.string(i).getText();
			includes_list.add(cur_str.substring(1, cur_str.length() - 1));
		}
		for(int i = 0; i < ctx.id().size(); i++){
			includes_list.add(ctx.id(i).getText() + ".bs");
		}
		return visitChildren(ctx); 
	}
	
	@Override public String visitDefines(@NotNull BStarParser.DefinesContext ctx) {
		for(int i = 0; i < ctx.define().size(); i++){
			String 	key_str 	= ctx.id(i).getText(),
					value_str 	= ctx.element(i).getText(),
					true_value	= def_str_replace(value_str);
			defines_map.put(key_str, true_value);
		}
		return null;
	}
}
