package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCallPara extends CQuaternion {
	public CCallPara(){
		type = QuaType.CALL_PARA;
	}
	@Override
	public CQuaternion dup() {
		return new CCallPara();
	}

}
