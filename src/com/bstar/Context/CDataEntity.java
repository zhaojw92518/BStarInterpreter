package com.bstar.Context;

public class CDataEntity {
	public boolean is_const = false;
	public String type = null, str_data = "";
	public double value_data = 0.0;
	
	public CDataEntity(){
		
	}
	
	public CDataEntity(String in_type){
		type = in_type;
	}
	
	public CDataEntity(CDataEntity in_data){
		type = in_data.type;
		str_data = in_data.str_data;
		value_data = in_data.value_data;
	}
	
	public CDataEntity clone(){
		return new CDataEntity(this);
	}
	
	public boolean is_value_data(){
		return type.equals("double") || 
				type.equals("int") ||
				type.equals("char") ;
	}
}
