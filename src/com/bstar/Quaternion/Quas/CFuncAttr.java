package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncAttr extends CQuaternion {
	public CFuncAttr(){
		type = QuaType.FUNC_ATTR;
	}
	
	public CQuaternion dup(){
		return new CFuncAttr();
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
