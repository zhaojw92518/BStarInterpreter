package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncDefEnd extends CQuaternion {
	public CFuncDefEnd() {
		type = QuaType.FUNC_DEFINE_END;
	}
	
	public CQuaternion dup(){
		return new CFuncDefEnd();
	}
}
