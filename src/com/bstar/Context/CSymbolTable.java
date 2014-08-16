package com.bstar.Context;

import java.util.Map;
import java.util.TreeMap;

import com.bstar.Global.CGlobalDef;

public class CSymbolTable {
	private String func_name = null;
	private TreeMap<String, CDataEntity> symbol_map = new TreeMap<>();
	private int cur_index = CGlobalDef.ERROR_INDEX;
	
	public CSymbolTable(){
		
	}
	
	public CSymbolTable(String in_func_name){
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
	
	public void set_cur_index(int in_index){
		cur_index = in_index;
	}
	
	public int get_cur_index(){
		return cur_index;
	}
	
	//debug
	public void print_all(){
		for(Map.Entry<String, CDataEntity> cur_entry: symbol_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey() + "   " + cur_entry.getValue().type);
		}
	}
	//debug end
}
