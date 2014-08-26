package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGoto extends CQuaternion {
	public CGoto() {
		type = QuaType.GOTO;
	}
	
	@Override
	public CQuaternion dup() {
		return new CGoto();
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