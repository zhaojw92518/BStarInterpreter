package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CReturn extends CQuaternion {
	public CReturn(CQuaData in_return_value){
		type = QuaType.RETURN;
		data_0 = in_return_value;
	}
	
	public CReturn(){
		type = QuaType.RETURN;
	}
	
	public CQuaternion dup(){
		return new CReturn();
	}
}
