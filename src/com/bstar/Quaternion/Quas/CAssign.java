package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAssign extends CQuaternion {
	public CAssign(){
		type = QuaType.ASSIGN;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssign();
	}

}
