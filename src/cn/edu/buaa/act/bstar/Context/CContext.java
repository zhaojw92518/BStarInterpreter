package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.Stack;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;

public class CContext {
	private CStackFrame global_area = new CStackFrame();
	private Stack<CStackFrame> local_stack = new Stack<>();
	
	public CContext(){
		
	}
	
	public void push_func(String in_func_name){
		local_stack.push(new CStackFrame(in_func_name));
	}
	
	
	public CFuncLocation pop_func(){
		CFuncLocation return_result = null;
		local_stack.pop();
		if(!local_stack.isEmpty()){
			return_result = local_stack.lastElement().get_func_location();
		}
		return return_result;
	}
	
	public boolean is_local_have(String in_id){
		return local_stack.lastElement().is_have(in_id);
	}
	
	public boolean is_global_have(String in_id){
		return global_area.is_have(in_id);
	}
	
	private CStackFrame is_have(String in_id){
		CStackFrame return_result = null;
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
		CStackFrame cur_table = is_have(in_id);
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
	
	public int get_stack_level(){
		return local_stack.size();
	}

	public void save_func_location(CFuncLocation in_func_location){
		local_stack.lastElement().set_func_location(in_func_location);
	}
	
	public LinkedList<CDataEntity> get_cur_para_list(){
		LinkedList<CDataEntity> return_result = null;
		if(!local_stack.isEmpty()){
			return_result = local_stack.lastElement().get_para_list();
		}
		return return_result;
	}
	
	//debug
	public void print_global(){
		CGlobalDef.cout_dividing_line();
		CGlobalDef.cout_end("Global Area");
		CGlobalDef.cout_dividing_line();
		global_area.print_all();
		CGlobalDef.cout_dividing_line();
	}
	//debug end
}
