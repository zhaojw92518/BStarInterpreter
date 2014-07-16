package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGloAttr extends CQuaternion {
	public CGloAttr(){
		type = QuaType.GLO_ATTR;
	}
	
	public CQuaternion dup(){
		return new CGloAttr();
	}
}
