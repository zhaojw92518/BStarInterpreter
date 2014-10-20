package cn.edu.buaa.act.bstar.context;

import java.util.ArrayList;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.qua_runners.CQuaRunner;

public class CCodeNode {
	private String file_name = null;
	private ArrayList<CQuaRunner> qua_list = new ArrayList<>();
	private CFuncTable func_table = new CFuncTable();
	private TreeMap<String, CCodeNode> include_map = new TreeMap<>();
	
	public CCodeNode(){
		
	}
	
	public void set_file_name(String in_file_name){
		file_name = in_file_name;
	}
	
	public void add_runner(CQuaRunner in_ruuner){
		qua_list.add(in_ruuner);
	}
	
	public void put_include_map(String in_id, CCodeNode in_node){
		include_map.put(in_id, in_node);
	}
	
	public TreeMap<String, CCodeNode> get_include_map(){
		return include_map;
	}
}
