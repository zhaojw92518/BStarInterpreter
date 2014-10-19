package cn.edu.buaa.act.bstar.context;

import java.util.ArrayList;

import cn.edu.buaa.act.bstar.qua_runners.CQuaRunner;

public class CCodeNode {
	private ArrayList<CQuaRunner> qua_list = new ArrayList<>();
	private CFuncTable func_table = new CFuncTable();
	
	public CCodeNode(){
		
	}
}
