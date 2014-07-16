package com.bstar.Quaternion;
import java.util.LinkedList;


public class CQuaData {
	public QuaDataType type = QuaDataType.INIT;
	public String str_data_0 = null;
	public String str_data_1 = null;
	public CQuaData templet_type = null;
	public double value_data = 0.0;
	public LinkedList<CQuaData> list_data = null;
	
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
		else{
			return_result = new String();
		}
		return return_result;
	}
}
