package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGloAttr extends CQuaternion {
	public CGloAttr(){
		type = QuaType.GLO_ATTR;
	}
	
	@Override
	public CQuaternion dup(){
		return new CGloAttr();
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
