package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtEqu extends CQuaternion {
	public CCdtEqu() {
		type = QuaType.CDT_EQU;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtEqu();
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
