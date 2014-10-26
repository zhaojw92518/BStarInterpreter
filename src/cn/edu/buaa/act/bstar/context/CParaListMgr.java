package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.Stack;

public class CParaListMgr {
	private Stack<LinkedList<CDataEntity>> para_list_stack = new Stack<>();
	
	public CParaListMgr(){
		push_para_list();
	}
	
	public void push_para_list(){
		para_list_stack.push(new LinkedList<CDataEntity>());
	}
	
	public void pop_para_list(){
		para_list_stack.pop();
	}
	
	public LinkedList<CDataEntity> get_cur_para_list(){
		return para_list_stack.lastElement();
	}
}
