package cn.edu.buaa.act.bstar.context;

import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CCodeNodeMgr {
	private CCodeNode root_node = null;
	private TreeMap<String, CCodeNode> node_list = null;
	private Map.Entry<String, CCodeNode> cur_entry = null;
	
	public CCodeNodeMgr(CCodeNode in_root_node, 
			TreeMap<String, CCodeNode> in_node_list){
		root_node = in_root_node;
		node_list = in_node_list;
	}
	
	
	public void run() throws InterpreterError{
		CGlobalDef.cout_end("CodeNodeMgr Run");
	}
	
	//For Scane
	public void start_node_order(){
		if(node_list != null && !node_list.isEmpty()){
			cur_entry = node_list.firstEntry();
		}
	}
	
	public CCodeNode get_cur_node(){
		CCodeNode return_result = null;
		if(cur_entry != null){
			return_result = cur_entry.getValue();
		}
		return return_result;
	}
	
	public void next_node(){
		cur_entry = node_list.higherEntry(cur_entry.getKey());
	}
	
	public CFuncLocation search_func(String in_func_name){
		return root_node.search_func(in_func_name);
	}
	
	public CFuncLocation get_main_func(){
		return root_node.get_main_func();
	}
}
