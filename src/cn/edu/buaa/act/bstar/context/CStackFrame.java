package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CStackFrame {
	private String func_name = null;
	private TreeMap<String, CDataEntity> symbol_map = new TreeMap<>();
	private CFuncLocation func_location = null;
	
	private LinkedList<CDataEntity> para_list = new LinkedList<>();
	
	public CStackFrame(){
		
	}
	
	public CStackFrame(String in_func_name){
		func_name = in_func_name;
	}
	
	public CDataEntity get_data(String in_id){
		return symbol_map.get(in_id);
	}
	
	public boolean is_have(String in_id){
		return symbol_map.containsKey(in_id);
	}
	
	public void set_data(String in_id, CDataEntity in_data){
		symbol_map.put(in_id, in_data);
	}
	
	public void add_id(String in_id, CDataEntity in_data){
		symbol_map.put(in_id, in_data);
	}
	
	public void set_func_name(String in_name){
		func_name = in_name;
	}
	
	public LinkedList<CDataEntity> get_para_list(){
		return para_list;
	}
	
	public void set_func_location(CFuncLocation in_func_location){
		func_location = in_func_location;
	}
	
	public CFuncLocation get_func_location(){
		return func_location;
	}
	
	//debug
	public void print_all(){
		for(Map.Entry<String, CDataEntity> cur_entry: symbol_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey() + "   " + cur_entry.getValue().type);
		}
	}
	//debug end
}
