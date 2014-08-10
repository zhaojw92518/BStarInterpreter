package com.bstar.Context;

import java.util.Stack;

public class CContext {
	private CSymbolTable global_area = new CSymbolTable();
	private Stack<CSymbolTable> local_stack = new Stack<>();
	
	public CContext(){
		
	}
	
	public void push_func(String in_func_name){
		local_stack.push(new CSymbolTable(in_func_name));
	}
	
	public void pop_func(){
		local_stack.pop();
	}
	
	private CSymbolTable is_have(String in_id){
		CSymbolTable return_result = null;
		if(local_stack.lastElement().is_have(in_id)){
			return_result = local_stack.lastElement();
		}
		else{
			if(global_area.is_have(in_id)){
				return_result = global_area;
			}
		}
		return return_result;
	}
	
	public CDataEntity get_data(String in_id){
		CDataEntity return_result = local_stack.lastElement().get_data(in_id);
		if(return_result == null){
			return_result = global_area.get_data(in_id);
		}
		return return_result;
	}
	
	public boolean set_data(String in_id, CDataEntity in_data){
		boolean return_result = false;
		CSymbolTable cur_table = is_have(in_id);
		if(cur_table != null){
			cur_table.set_data(in_id, in_data);
			return_result = true;
		}
		return return_result;
	}
	
	public boolean add_local_id(String in_id, CDataEntity in_data){
		boolean return_result = false;
		if(!local_stack.lastElement().is_have(in_id)){
			local_stack.lastElement().add_id(in_id, in_data);
			return_result = true;
		}
		return return_result;
	}
	
	public boolean add_global_id(String in_id, CDataEntity in_data){
		boolean return_result = false;
		if(!global_area.is_have(in_id)){
			global_area.add_id(in_id, in_data);
			return_result = true;
		}
		return return_result;
	}
}
