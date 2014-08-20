package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtGre extends CQuaternion {
	public CCdtGre() {
		type = QuaType.CDT_GRE;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtGre();
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
