package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncDef extends CQuaternion {
	public CFuncDef(CQuaData in_func_name, CQuaData in_return_type){
		type = QuaType.FUNC_DEFINE;
		data_0 = in_func_name;
		data_1 = in_return_type;
	}
	
	public CFuncDef(){
		type = QuaType.FUNC_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CFuncDef();
	}
}
