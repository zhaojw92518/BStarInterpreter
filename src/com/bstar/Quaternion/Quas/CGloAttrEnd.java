package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGloAttrEnd extends CQuaternion {
	public CGloAttrEnd(){
		type = QuaType.GLO_ATTR_END;
	}
	
	@Override
	public CQuaternion dup(){
		return new CGloAttrEnd();
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
