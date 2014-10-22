package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CFuncData{
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
	
	public boolean is_para_right(LinkedList<CDataEntity> in_paras){
		boolean return_result = false;
		if(para_types.size() == in_paras.size()){
			return_result = true;
			for(int i = 0; i < in_paras.size(); ++i){
				String cur_para_type = para_types.get(i);
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
}
