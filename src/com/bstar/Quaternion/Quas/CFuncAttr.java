package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncAttr extends CQuaternion {
	public CFuncAttr(){
		type = QuaType.FUNC_ATTR;
	}
	
	public CQuaternion dup(){
		return new CFuncAttr();
	}
}
