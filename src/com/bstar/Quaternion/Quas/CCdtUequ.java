package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtUequ extends CQuaternion {
	public CCdtUequ() {
		type = QuaType.CDT_UEQU;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtUequ();
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
