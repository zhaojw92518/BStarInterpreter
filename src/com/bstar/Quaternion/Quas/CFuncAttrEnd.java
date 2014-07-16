package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncAttrEnd extends CQuaternion {
	public CFuncAttrEnd(){
		type = QuaType.FUNC_ATTR_END;
	}
	
	public CQuaternion dup(){
		return new CFuncAttrEnd();
	}
}
