package com.bstar.Context;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import com.bstar.Context.CFuncTable.CFuncData;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;

public class CLangVM {
	private static CContext context = new CContext();
	private static LinkedList<CDataEntity> para_list = new LinkedList<>();
	private static CDataEntity return_result = null;
	private static VMState vm_state = VMState.GLOBAL;
	private static CFuncTable func_table = new CFuncTable();
	private static LinkedList<CQuaternion> quas = null;
	private static int program_counter = 0;
	private static ArrayList<CSystemFunc> system_funcs = new ArrayList<>();
	private static CInitValueTable init_value_table = new CInitValueTable();
	
	public static void init(){
		func_table.add_func("printf", "void", -1);
		func_table.add_func_para("double");
		system_funcs.add(new CFuncPrinf());
	}
	
	//debug
	public static void print_func_table(){
		func_table.print_all_func();
	}
	
	public static void print_global_symbol(){
		context.print_global();
	}
	//debug end
	
	public static void run(){
		int main_index = func_table.get_func_index("main");
		if(main_index != CGlobalDef.ERROR_INDEX){
			push_func("main");
			program_counter = main_index;
			while(true){
				int run_result = quas.get(program_counter).run();
				
				if(run_result == CGlobalDef.ERROR){
					CGlobalDef.cout_end("ERROR");
					break;
				}
				else if(run_result == CGlobalDef.END){
					CGlobalDef.cout_end("NORMAL END");
					break;
				}
				program_counter++;
				CGlobalDef.cout_end(quas.get(program_counter).to_table_str());
			}
		}
		else{
			//TODO 错误处理，为定义main函数
		}
		
	}
	
	public static void set_quas(LinkedList<CQuaternion> in_quas){
		quas = in_quas;
	}
	
	public static void jump_to(int in_index){
		program_counter = in_index - 1;
	}
	
	public static boolean func_call(String in_func_name){
		boolean return_result = false;
		int call_index = CLangVM.get_func_index(in_func_name);
		if(call_index != CGlobalDef.ERROR_INDEX && CLangVM.is_call_para_right(in_func_name)){
			if(call_index < 0){
				system_funcs.get(-call_index - 1).run();
			}
			else{
				context.save_func_index(program_counter);
				push_func(in_func_name);
				jump_to(call_index);
			}
			return_result = true;
		}
		return return_result;
	}
	
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
	
	public static int pop_func(){
		return context.pop_func();
	}
	
	public static int get_stack_level(){
		return context.get_stack_level();
	}
	
	public static CDataEntity get_data(String in_id){
		return context.get_data(in_id);
	}
	
	public static boolean is_local_have(String in_id){
		return context.is_local_have(in_id);
	}
	
	public static boolean is_global_have(String in_id){
		return context.is_global_have(in_id);
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
	
	public static VMState get_state(){
		return vm_state;
	}
	
	public static void set_state(VMState in_state){
		vm_state = in_state;
	}
	
	public static boolean scane_add_func(String in_name, String in_type, int in_index){
		return func_table.add_func(in_name, in_type, in_index);
	}
	
	public static void scane_add_func_para(String in_type){
		func_table.add_func_para(in_type);
	}
	
	public static boolean is_call_para_right(String in_name){
		return func_table.is_paras_right(in_name, para_list);
	}
	
	public static int get_func_index(String in_name){
		return func_table.get_func_index(in_name);
	}
	
	public static void set_return_result(CDataEntity in_data){
		return_result = in_data;
	}
	
	public static CDataEntity get_return_result(){
		return return_result;
	}
	
	public static CDataEntity get_front_para(){
		return para_list.pollFirst();
	}
	
	public static CDataEntity get_type_init_value(String in_type){
		return init_value_table.get_type_init_value(in_type);
	}
}
