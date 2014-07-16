package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCstDef extends CQuaternion {
	public CCstDef(CQuaData in_id_name, CQuaData in_id_type, CQuaData in_cst_value) {
		type = QuaType.CST_DEFINE;
		data_0 = in_id_name;
		data_1 = in_id_type;
		data_2 = in_cst_value;
	}
	
	public CCstDef(){
		type = QuaType.CST_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CCstDef();
	}
}
