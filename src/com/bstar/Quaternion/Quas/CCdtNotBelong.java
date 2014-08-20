package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtNotBelong extends CQuaternion {
	public CCdtNotBelong() {
		type = QuaType.CDT_NOT_BELONG;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtNotBelong();
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
