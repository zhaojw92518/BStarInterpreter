package com.bstar.Quaternion;

public enum QuaDataType {
	//no value type
	INIT,
	TYPE,
	ID,
	//Special type
	NIL,
	//value type
	INT,
	DOUBLE,
	CHAR,
	//reference type
	STRING,
	TUPLE,
	SET;
	
	public String type_to_str(){
		return super.toString().toLowerCase();
	}
	
	public boolean is_no_value_type(){
		return this.ordinal() >= INIT.ordinal() && 
				this.ordinal() <= ID.ordinal();
	}
	
	public boolean is_value_type(){
		return this.ordinal() >= INT.ordinal() && 
				this.ordinal() <= CHAR.ordinal();
	}
	
	public boolean is_refer_type(){
		return this.ordinal() >= STRING.ordinal() && 
				this.ordinal() <= SET.ordinal();
	}
}
