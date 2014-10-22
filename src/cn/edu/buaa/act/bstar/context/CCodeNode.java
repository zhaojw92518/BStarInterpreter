package cn.edu.buaa.act.bstar.context;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.qua_runners.CQuaRunner;

public class CCodeNode {
	private String file_name = null;
	private ArrayList<CQuaRunner> qua_list = new ArrayList<>();
	private CFuncTable func_table = new CFuncTable();
	private TreeMap<String, CCodeNode> include_map = new TreeMap<>();
	private static TreeMap<Integer, Integer> label_map = new TreeMap<>();
	
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
	
	public CFuncTable get_func_table(){
		return func_table;
	}
	
	public void scane_runners() throws InterpreterError{
		for(int i = 0; i < qua_list.size(); i++){
			qua_list.get(i).scane(i);
		}
	}
	
	public CFuncLocation search_func(String in_func_name){
		CFuncLocation return_result = null;
		CFuncData func_data = func_table.get_func_data(in_func_name);
		if(func_data == null){
			for(Map.Entry<String, CCodeNode> cur_entry: include_map.entrySet()){
				CFuncLocation cur_func_location = cur_entry.getValue().search_func(in_func_name);
				if(cur_func_location != null){
					return_result = cur_func_location;
					break;
				}
			}
		}
		else{
			return_result = new CFuncLocation();
			return_result.qua_index = func_data.func_index;
			return_result.code_node = this;
			return_result.func_data = func_data;
		}
		return return_result;
	}
	
	public void add_label(int label_id, int label_location){
		label_map.put(label_id, label_location);
	}
	
	public int get_label_location(int in_label_id){
		return label_map.get(in_label_id);
	}
	
	public CFuncLocation get_main_func(){
		CFuncLocation return_result = null;
		CFuncData func_data = func_table.get_func_data("main");
		if(func_data != null){
			return_result = new CFuncLocation();
			return_result.qua_index = func_data.func_index;
			return_result.code_node = this;
			return_result.func_data = func_data;
		}
		return return_result;
	}
}
