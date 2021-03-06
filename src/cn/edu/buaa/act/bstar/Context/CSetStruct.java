package cn.edu.buaa.act.bstar.context;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.antlr.v4.parse.ANTLRParser.lexerAlt_return;

public class CSetStruct {
	private TreeSet<CDataEntity> set_data = new TreeSet<>();
	private String type = null;
	private int pointer_level = 0;
	
	public CSetStruct(String in_type, int in_level){
		type = in_type;
		pointer_level = in_level;
	}
	
	public CSetStruct(CSetStruct in_set){
		type = in_set.type;
		for(CDataEntity cur_data: in_set.set_data){
			set_data.add(cur_data.clone());
		}
	}
	
	public CSetStruct clone(){
		return new CSetStruct(this);
	}
	
	public String get_type(){
		return type;
	}
	
	public int get_level(){
		return pointer_level;
	}
	
	/**
	 * 
	 * @param search_cdt
	 * @return null表示search_cdt的String代表的id不存在
	 */
	public CDataEntity search_struct_data(TreeMap<String, CDataEntity> search_cdt){
		CDataEntity return_result = null;
		for(CDataEntity cur_data: set_data){
			CDataEntity cur_data_content = cur_data.get_content();
			if(cur_data_content != null){
				boolean is_equal = true, is_error = false;
				for(Map.Entry<String, CDataEntity> cur_entry: search_cdt.entrySet()){
					String cur_id = cur_entry.getKey();
					CDataEntity cur_cdt_value = cur_entry.getValue();
					if(cur_data_content.is_struct_data() && cur_data_content.is_struct_have(cur_id)){
						if(!cur_data_content.struct_get_data(cur_id).is_equal_to(cur_cdt_value)){
							is_equal = false;
							break;
						}
					}
					else{
						is_error = true;
						break;
					}
				}
				if(is_equal){
					return_result = cur_data;
					break;
				}
				if(is_error){
					break;
				}
			}
			else{
				//TODO 错误处理
			}
			
		}
		return return_result;
	}
	
	public boolean add_data(CDataEntity in_data){
		boolean return_result = false;
		if(in_data.type.equals(this.type) && in_data.type_pointer - pointer_level == 1){
			set_data.add(in_data);
			return_result = true;
		}
		return return_result;
	}
	
	public CSetStruct set_union(CSetStruct in_set){
		CSetStruct return_result = null;
		if(type.equals(in_set.type)){
			return_result = this.clone();
			return_result.set_data.addAll(in_set.set_data);
		}
		return return_result;
	}
	
	public String toString(){
		String return_result = "{";
		for(CDataEntity cur_data: set_data){
			return_result += cur_data.toString() + ",";
		}
		if(return_result.length() != 1){
			return_result = return_result.substring(0, return_result.length() - 1);
		}
		return_result += "}";
		return return_result;
	}
	
	public boolean is_type_equal(CSetStruct in_set){
		return type.equals(in_set.type) && pointer_level == in_set.pointer_level;
	}
}
