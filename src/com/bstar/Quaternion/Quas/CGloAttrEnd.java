package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGloAttrEnd extends CQuaternion {
	public CGloAttrEnd(){
		type = QuaType.GLO_ATTR_END;
	}
	
	public CQuaternion dup(){
		return new CGloAttrEnd();
	}
}
