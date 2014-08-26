package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtLes extends CQuaternion {
	public CCdtLes() {
		type = QuaType.CDT_LES;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtLes();
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