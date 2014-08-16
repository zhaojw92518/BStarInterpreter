package com.bstar.Context;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import com.bstar.Global.CGlobalDef;

public class CFuncTable {
	private TreeMap<String, CFuncData> func_datas = new TreeMap<>();
	
	public CFuncTable(){
	
	}
	
	public boolean add_func(String in_name, String in_type, int in_index){
		boolean return_result = false;
		if(!func_datas.containsKey(in_name)){
			func_datas.put(in_name, new CFuncData(in_type, in_index));
		}
		return return_result;
	}
	
	public void add_func_para(String in_type){
		func_datas.lastEntry().getValue().add_para(in_type);
	}
	
	public boolean is_paras_right(String in_name, LinkedList<CDataEntity> in_paras){
		boolean return_result = false;
		CFuncData cur_func = func_datas.get(in_name);
		if(cur_func != null && cur_func.para_types.size() == in_paras.size()){
			return_result = true;
			for(int i = 0; i < in_paras.size(); ++i){
				String cur_para_type = cur_func.para_types.get(i);
				CDataEntity cur_para_data = in_paras.get(i);
				if(cur_para_data.is_value_data() &&(
						cur_para_type.equals("double") ||
						cur_para_type.equals("int") ||
						cur_para_type.equals("char")
						)){
					cur_para_data.type = cur_para_type;
				}
				if(!cur_para_type.equals(cur_para_data.type)){
					return_result = false;
					break;
				}
			}
		}
		return return_result;
	}
	
	public int get_func_index(String in_name){
		int return_result = CGlobalDef.ERROR_INDEX;
		CFuncData cur_func = func_datas.get(in_name);
		if(cur_func != null){
			return_result = cur_func.func_index;
		}
		return return_result;
	}
	
	//debug
	public void print_all_func(){
		for(Map.Entry<String, CFuncData> cur_entry: func_datas.entrySet()){
			for(int i = 0; i < cur_entry.getKey().length() + 2; ++i){
				CGlobalDef.cout("=");
			}
			CGlobalDef.cout_end("");
			CGlobalDef.cout("=");
			CGlobalDef.cout(cur_entry.getKey());
			CGlobalDef.cout_end("=");
			CGlobalDef.cout_dividing_line();
			cur_entry.getValue().print_all_para();
		}
	}
	//debug end
	
	class CFuncData{
		public String return_type;
		public int func_index = -1;
		public LinkedList<String> para_types = new LinkedList<>();
	
		public CFuncData(String in_type, int in_index){
			return_type = in_type;
			func_index = in_index;
		}
		
		public void add_para(String in_type){
			para_types.add(in_type);
		}
		
		//debug
		public void print_all_para(){
			for(String cur_type: para_types){
				CGlobalDef.cout_end(cur_type);
			}
		}
		//debug end
	}
}
