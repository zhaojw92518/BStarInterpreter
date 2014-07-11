package PreProcessor;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;



import Parser.BStarBaseVisitor;
import Parser.BStarParser;

public class CPreProcrVisitor extends BStarBaseVisitor<String>{
	public LinkedList<String> includes_list = new LinkedList<>();
	public LinkedHashMap<String, String> defines_map = new LinkedHashMap<>();
	
	private String def_str_replace(String in_str){
		String return_result = in_str;
		List<String> key_list = new LinkedList<>(defines_map.keySet());
		for(int i = key_list.size() - 1; i >=0; i++){
			return_result = return_result.replaceAll(
					"(?<=(\\A|\\W+))" 	+ 
					return_result		+
					"(?=(\\z|\\W+))", 
					defines_map.get(key_list.get(i))
					);
		}
		return return_result;
	}
	
	@Override public String visitAbmachine(@NotNull BStarParser.AbmachineContext ctx) {
		if(ctx.includes() != null){
			visitIncludes(ctx.includes());
		}
		if(ctx.defines() != null){
			visitDefines(ctx.defines());
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
