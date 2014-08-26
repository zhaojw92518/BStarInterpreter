package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CIfNot extends CQuaternion {
	public CIfNot() {
		type = QuaType.IF_NOT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CIfNot();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		return CGlobalDef.NORMAL;
	}

}
