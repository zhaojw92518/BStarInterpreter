package com.bstar.Context;

import java.util.TreeMap;

public class CInitValueTable {
	private TreeMap<String, CDataEntity> init_value_map = new TreeMap<>();
	
	private void add_map(CDataEntity in_entity){
		init_value_map.put(in_entity.type, in_entity);
	}
	
	public CInitValueTable(){
		CDataEntity data_entity;
		
		data_entity = new CDataEntity();
		data_entity.type = "int";
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = "double";
		data_entity.value_data = 0.0;
		add_map(data_entity);
		
		data_entity = new CDataEntity();
		data_entity.type = "char";
		data_entity.value_data = 0.0;
		add_map(data_entity);
	}
	
	public CDataEntity get_type_init_value(String in_type){
		return init_value_map.get(in_type).clone();
	}
}
