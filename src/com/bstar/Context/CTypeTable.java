package com.bstar.Context;

import java.util.TreeMap;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.QuaDataType;

public class CTypeTable {
	public static final String cdt_search = "@cdt_search",
			type_int = "int",
			type_double = "double",
			type_char = "char",
			type_nil = "nil";
	
	private TreeMap<String, CDataEntity> init_value_map = new TreeMap<>();
	
	public void add_map(CDataEntity in_entity){
		init_value_map.put(in_entity.type, in_entity);
	}
	
	public CTypeTable(){
		CDataEntity data_entity;
		
		data_entity = new CDataEntity();
		data_entity.type = type_int;
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = type_double;
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = type_char;
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = type_nil;
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = cdt_search;
		data_entity.struct_init();
		add_map(data_entity);
	}
	
	public CDataEntity get_type_init_value(CQuaData in_type){
		CDataEntity return_result = null;
		if(in_type.type == QuaDataType.TYPE && in_type.str_data_0.equals("set")){
			return_result = new CDataEntity();
			return_result.type = "set";
			return_result.set_init(in_type.templet_type.str_data_0, (int)in_type.value_data);
		}
		else{
			return_result = get_type_init_value(in_type.str_data_0);
			return_result.type_pointer = (int)in_type.value_data;
		}
		return return_result;
	}
	
	public CDataEntity get_type_init_value(String in_type){
		CDataEntity return_result = init_value_map.get(in_type);
		if(return_result != null){
			return_result = return_result.clone();
		}
		return return_result;
	}
}
