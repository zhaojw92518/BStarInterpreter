package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncAttrEnd extends CQuaternion {
	public CFuncAttrEnd(){
		type = QuaType.FUNC_ATTR_END;
	}
	
	public CQuaternion dup(){
		return new CFuncAttrEnd();
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
