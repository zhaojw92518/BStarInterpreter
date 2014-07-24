package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CContentOf extends CQuaternion {
	
	public CContentOf(){
		type = QuaType.CONTENT_OF;
	}
	
	@Override
	public CQuaternion dup() {
		return new CContentOf();
	}
}
