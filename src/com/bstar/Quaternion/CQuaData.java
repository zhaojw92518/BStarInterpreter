package com.bstar.Quaternion;
import java.util.LinkedList;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Global.CMath;


public class CQuaData {
	public QuaDataType type = QuaDataType.INIT;
	public String str_data_0 = null;
	public String str_data_1 = null;
	public CQuaData templet_type = null;
	public double value_data = 0.0;
	public LinkedList<CQuaData> list_data = null;
	
	public CQuaData(){
		
	}
	
	public CQuaData(CQuaData in_data){
		type = in_data.type;
		if(in_data.str_data_0 != null){
			str_data_0 = new String(in_data.str_data_0);
		}
		if(in_data.str_data_1 != null){
			str_data_1 = new String(in_data.str_data_1);
		}
		if(in_data.templet_type != null){
			templet_type = new CQuaData(in_data.templet_type);
		}
		value_data = in_data.value_data;
		if(in_data.list_data != null){
			for(CQuaData cur_data: in_data.list_data){
				add_list_data(cur_data);
			}
		}
	}
	
	public void add_list_data(CQuaData in_data){
		if(list_data == null){
			list_data = new LinkedList<>();
		}
		list_data.add(in_data);
	}
	
	public String toString(){
		String return_result = null;
		if(type == QuaDataType.TYPE){
			return_result = str_data_0;
			if(templet_type != null){
				return_result += "<" + templet_type.toString() + ">";
			}
		}
		else if(type == QuaDataType.ID){
			return_result = str_data_0;
		}
		else if(type == QuaDataType.DOUBLE || type == QuaDataType.INT){
			return_result = CMath.double_to_str(value_data);
		}
		else{
			return_result = new String();
		}
		return return_result;
	}
	
	public CDataEntity to_data_entity(){
		CDataEntity return_result = null;
		if(type.is_value_type()){
			return_result = new CDataEntity(type.type_to_str());
			return_result.value_data = value_data;
		}
		else if(type == QuaDataType.ID){
			return_result = CLangVM.get_data(str_data_0);
		}
		return return_result;
	}
	
	public boolean is_temp(){
		return type == QuaDataType.ID && str_data_0.charAt(0) == '@';
	}
}
