package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CVarDef extends CQuaternion{
	public CVarDef(CQuaData in_id_name, CQuaData in_id_type, CQuaData in_value){
		type = QuaType.VAR_DEFINE;
		data_0 = in_id_name;
		data_1 = in_id_type;
		data_2 = in_value;
	}
	
	public CVarDef(){
		type = QuaType.VAR_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CVarDef();
	}
}
