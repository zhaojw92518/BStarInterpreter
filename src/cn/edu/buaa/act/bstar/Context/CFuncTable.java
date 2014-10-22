package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

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
		if(cur_func != null){
			return_result = cur_func.is_para_right(in_paras);
		}
		return return_result;
	}
	
	public CFuncData get_func_data(String in_name){
		return func_datas.get(in_name);
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
	
	
}
