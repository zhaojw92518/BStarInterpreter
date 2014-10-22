package cn.edu.buaa.act.bstar.context;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;

public class CLangVM {
	private static CContext context = new CContext();
	private static CDataEntity return_result = null;
	private static VMState vm_state = VMState.GLOBAL;
	private static CFuncTable system_func_table = new CFuncTable();
	private static CFuncLocation program_counter = new CFuncLocation();
	private static ArrayList<CSystemFunc> system_funcs = new ArrayList<>();
	private static CTypeTable init_value_table = new CTypeTable();
	
	private static CCodeNodeMgr code_node_mgr = null;
	
	public static void init(){
		system_func_table.add_func("printf", "void", -1);
		system_func_table.add_func_para("double");
		system_funcs.add(new CFuncPrinf());
	}
	
	//debug
	public static void print_global_symbol(){
		context.print_global();
	}
	//debug end
	
	public static void run(CCodeNodeMgr in_code_node_mgr) throws InterpreterError{
		CGlobalDef.cout_end("LangVM Run");
		code_node_mgr = in_code_node_mgr;
		init();
		scane();
	}
	
	public static void scane() throws InterpreterError {
		code_node_mgr.start_node_order();
		while(true){
			CCodeNode cur_node = code_node_mgr.get_cur_node();
			if(cur_node == null){
				break;
			}
			else{
				cur_node.scane_runners();
				code_node_mgr.next_node();
			}
		}
	}
	
	public static void start_vm() throws InterpreterError{
		CFuncLocation main_func_location = code_node_mgr.get_main_func();
		if(main_func_location != null){
			push_func("main");
			jump_to_far(main_func_location);
			while(true){
				
			}
		}
		else{
			throw new InterpreterError("Main function not found");
		}
	}
	
	public static void run(){
		/*int main_index = func_table.get_func_index("main");
		if(main_index != CGlobalDef.ERROR_INDEX){
			push_func("main");
			program_counter = main_index;
			while(true){
				CGlobalDef.cout_end(quas.get(program_counter).to_table_str());
				CQuaternion cur_qua = quas.get(program_counter);
				int run_result = cur_qua.run();
				
				if(run_result == CGlobalDef.ERROR){
					CGlobalDef.cout_end("ERROR");
					break;
				}
				else if(run_result == CGlobalDef.END){
					CGlobalDef.cout_end("NORMAL END");
					break;
				}
				program_counter++;
			}
		}
		else{
			//TODO 错误处理，为定义main函数
		}*/
		
	}
	
	public static void jump_to_far(CFuncLocation in_func_location){
		program_counter = in_func_location;
	}
	
	public static void jump_to_near(int in_index){
		program_counter.qua_index = in_index;
	}
	
	public static boolean func_call(String in_func_name) throws InterpreterError{
		boolean return_result = false;
		CFuncLocation call_location = get_func_location(in_func_name);
		if(call_location != null){
			if(call_location.func_data.is_para_right(context.get_cur_para_list())){
				if(call_location.qua_index < 0){
					system_funcs.get(-call_location.qua_index - 1).run();
				}
				else{
					context.save_func_location(program_counter);
					push_func(in_func_name);
					jump_to_far(call_location);
				}
				return_result = true;
			}
			else{
				//TODO 检查参数错误
			}
		}
		return return_result;
	}
	
	public static void add_para(CDataEntity in_data){
		context.get_cur_para_list().add(in_data);
	}
	
	public static void clear_para_list(){
		context.get_cur_para_list().clear();
	}
	
	public static CDataEntity pop_front_para_list(){
		return context.get_cur_para_list().pollFirst();
	}
	
	public static void push_func(String in_func_name){
		context.push_func(in_func_name);
	}
	
	public static CFuncLocation pop_func(){
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
		return code_node_mgr.get_cur_node().get_func_table().add_func(in_name, in_type, in_index);
	}
	
	public static void scane_add_func_para(String in_type){
		code_node_mgr.get_cur_node().get_func_table().add_func_para(in_type);
	}
	
	public static CFuncLocation get_func_location(String in_name) throws InterpreterError{
		CFuncLocation return_result = code_node_mgr.search_func(in_name);
		if(return_result == null){
			int system_func_index = system_func_table.get_func_data(in_name).func_index;
			if(system_func_index == CGlobalDef.ERROR_INDEX){
				throw new InterpreterError("function " + in_name + " not found");
			}
			else{
				return_result = new CFuncLocation();
				return_result.qua_index = system_func_index;
			}
		}
		return return_result;
	}
	
	public static void set_return_result(CDataEntity in_data){
		return_result = in_data;
	}
	
	public static CDataEntity get_return_result(){
		return return_result;
	}
	
	public static CDataEntity get_front_para(){
		return context.get_cur_para_list().pollFirst();
	}
	
	public static CDataEntity get_type_init_value(CQuaData in_type){
		return init_value_table.get_type_init_value(in_type);
	}
	
	public static CDataEntity get_type_init_value(String in_type){
		return init_value_table.get_type_init_value(in_type);
	}
	
	public static void add_type_init_value(CDataEntity in_data){
		init_value_table.add_map(in_data);
	}
	
	public static void add_label(int label_id, int label_location){
		code_node_mgr.get_cur_node().add_label(label_id, label_location);
	}
	
	public static void go_to(int label_id){
		jump_to_near(code_node_mgr.get_cur_node().get_label_location(label_id));
	}
}
