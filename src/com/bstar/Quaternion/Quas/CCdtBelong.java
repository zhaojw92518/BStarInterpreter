package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtBelong extends CQuaternion {
	public CCdtBelong() {
		type = QuaType.CDT_BELONG;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtBelong();
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
