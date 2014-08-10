package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetAddr extends CQuaternion {
	public CSetAddr(){
		type = QuaType.SET_ADDR;
	}
	
	@Override
	public CQuaternion dup() {
		return new CSetAddr();
	}

}
