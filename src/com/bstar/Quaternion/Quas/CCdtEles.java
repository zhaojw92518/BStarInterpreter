package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtEles extends CQuaternion {
	public CCdtEles() {
		type = QuaType.CDT_ELES;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtEles();
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
