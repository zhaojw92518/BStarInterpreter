package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGetReturn extends CQuaternion {
	public CGetReturn(){
		type = QuaType.GET_RETURN;
	}
	@Override
	public CQuaternion dup() {
		return new CGetReturn();
	}

}
