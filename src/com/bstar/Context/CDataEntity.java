package com.bstar.Context;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.bstar.Global.CGlobalDef;
import com.sun.corba.se.impl.util.IdentityHashtable;

public class CDataEntity {
	public boolean is_const = false, is_nil = false;
	public String type = null, str_data = "";
	public int type_pointer = 0;
	public CDataEntity pointer_data = null;
	public double value_data = 0.0;
	private TreeMap<String, CDataEntity> struct_data = null;
	public CSetStruct set_data = null;
	
	private void clone_struct_data(TreeMap<String, CDataEntity> in_struct_data){
		struct_init();
		for(Map.Entry<String, CDataEntity> cur_entry: in_struct_data.entrySet()){
			struct_data.put(new String(cur_entry.getKey()), cur_entry.getValue().clone());
		}
	}
	
	public void assign(CDataEntity in_data){
		if(in_data.is_nil){
			is_nil = true;
			str_data = "";
			value_data = 0.0;
			struct_data = null;
			set_data = null;
			pointer_data = null;
		}
		else{
			is_const = in_data.is_const;
			type = in_data.type;
			str_data = in_data.str_data;
			type_pointer = in_data.type_pointer;
			pointer_data = in_data.pointer_data;
			value_data = in_data.value_data;
			if(in_data.struct_data != null){
				clone_struct_data(in_data.struct_data);
			}
			else{
				struct_data = null;
			}
			if(in_data.set_data != null){
				set_data = in_data.set_data.clone();
			}
			else{
				set_data = null;
			}
		}
	}
	
	public CDataEntity(){
		
	}
	
	public CDataEntity(String in_type){
		type = in_type;
	}
	
	public CDataEntity(CDataEntity in_data){
		is_const = in_data.is_const;
		is_nil = in_data.is_nil;
		type = in_data.type;
		str_data = in_data.str_data;
		type_pointer = in_data.type_pointer;
		pointer_data = in_data.pointer_data;
		value_data = in_data.value_data;
		if(in_data.struct_data != null){
			clone_struct_data(in_data.struct_data);
		}
		if(in_data.set_data != null){
			set_data = in_data.set_data.clone();
		}
		
	}
	
	public CDataEntity clone(){
		return new CDataEntity(this);
	}
	
	public boolean is_value_data(){
		return type.equals("double") || 
				type.equals("int") ||
				type.equals("char") ;
	}
	
	//Struct operation
	public void struct_init(){
		struct_data = new TreeMap<>();
	}
	
	public boolean struct_is_have(String in_id){
		boolean return_result = false;
		if(struct_data != null){
			return_result = struct_data.containsKey(in_id);
		}
		return return_result;
	}
	
	public void struct_add_data(String in_id, CDataEntity in_data){
		if(struct_data == null){
			CGlobalDef.info_box("Typedef " + in_id + " error: struct_data haven't init");
		}
		struct_data.put(in_id, in_data);
	}
	
	public CDataEntity struct_get_data(String in_id){
		return struct_data.get(in_id);
	}
	
	public boolean is_equal_to(CDataEntity in_data){
		boolean return_result = false;
		if(is_value_data()&& in_data.is_value_data()){
			return_result = (value_data == in_data.value_data);
		}
		else{
			return_result = (System.identityHashCode(this) == System.identityHashCode(in_data));
		}
		return return_result;
	}
	
	public boolean is_struct_data(){
		return struct_data != null;
	}
	
	public boolean is_struct_have(String in_id){
		return is_struct_data() && struct_data.containsKey(in_id);
	}
	//Struct operation end
	
	//Set operation
	public void set_init(String in_type){
		set_data = new CSetStruct(in_type);
	}
	
	public CDataEntity set_search(CDataEntity in_search_cdt){
		CDataEntity return_result = null;
		if(set_data == null){
			CGlobalDef.info_box("Set haven't initialized");
		}
		if(in_search_cdt.type == "@cdt_search"){
			return_result = set_data.search_struct_data(in_search_cdt.struct_data);
		}
		else{
			CGlobalDef.info_box("Set search's type is wrong");
		}
		return return_result;
	}
	
	public boolean set_add_data(CDataEntity in_data){
		if(set_data == null){
			CGlobalDef.info_box("Set haven't initialized");
		}
		return set_data.add_data(in_data); 
	}
	
	private CDataEntity set_clone(){
		CDataEntity return_result = new CDataEntity();
		return_result.type = this.type;
		return_result.set_init(set_data.get_type());
		return return_result;
	}
	
	public CDataEntity set_union(CDataEntity in_data){
		CDataEntity return_result = null;
		CSetStruct set_struct_union = set_data.set_union(in_data.set_data);
		if(set_struct_union != null){
			return_result = set_clone();
			return_result.set_data = set_struct_union;
		}
		return return_result;
	}
	//Set operation end
	
	//Pointer operation
	public CDataEntity get_address(){
		CDataEntity return_result = new CDataEntity();
		return_result.type = this.type;
		return_result.type_pointer = this.type_pointer + 1;
		return_result.pointer_data = this;
		return return_result;
	}
	
	public CDataEntity get_content(){
		CDataEntity return_result = null;
		if(pointer_data != null){
			return_result = pointer_data;
		}
		return return_result;
	}
	//Pointer operation end
}
