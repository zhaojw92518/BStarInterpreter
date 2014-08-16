package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
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
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}
}
