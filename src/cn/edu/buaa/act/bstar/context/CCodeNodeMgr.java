package cn.edu.buaa.act.bstar.context;

import java.util.TreeMap;

import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CCodeNodeMgr {
	private CCodeNode root_node = null;
	private TreeMap<String, CCodeNode> node_list = null;
	
	public CCodeNodeMgr(CCodeNode in_root_node, 
			TreeMap<String, CCodeNode> in_node_list){
		
	}
	
	public CFuncLocation search_func(String in_func_name){
		return null;
	}
	
	public void run() throws InterpreterError{
		CGlobalDef.cout_end("CodeNodeMgr Run");
	}
}
