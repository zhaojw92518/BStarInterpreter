package com.bstar.Context;

import java.util.TreeMap;

public class CSymbolTable {
	private String func_name = null;
	private TreeMap<String, CDataEntity> symbol_map = new TreeMap<>();
	
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
}
