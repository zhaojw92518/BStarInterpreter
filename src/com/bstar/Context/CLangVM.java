package com.bstar.Context;

import java.util.LinkedList;

public class CLangVM {
	private static CContext context = new CContext();
	private static LinkedList<CDataEntity> para_list = new LinkedList<>();
	private static CDataEntity return_result = null;
	
	public static void add_para(CDataEntity in_data){
		para_list.add(in_data);
	}
	
	public static void clear_para_list(){
		para_list.clear();
	}
	
	public static CDataEntity pop_front_para_list(){
		return para_list.pollFirst();
	}
	
	public static void push_func(String in_func_name){
		context.push_func(in_func_name);
	}
	
	public static void pop_func(){
		context.pop_func();
	}
	
	public static CDataEntity get_data(String in_id){
		return context.get_data(in_id);
	}
	
	public static boolean set_data(String in_id, CDataEntity in_data){
		return context.set_data(in_id, in_data);
	}
	
	public static boolean add_local_id(String in_id, CDataEntity in_data){
		return context.add_local_id(in_id, in_data);
	}
	
	public static boolean add_global_id(String in_id, CDataEntity in_data){
		return context.add_global_id(in_id, in_data);
	}
}
