package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;


public class CFuncCall extends CQuaternion {
	public CFuncCall(CQuaData in_call_func_name){
		type = QuaType.FUNC_CALL;
		data_0 = in_call_func_name;
	}
	
	public CFuncCall(){
		type = QuaType.FUNC_CALL;
	}
	
	public CQuaternion dup(){
		return new CFuncCall();
	}
}
