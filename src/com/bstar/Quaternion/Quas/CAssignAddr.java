package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAssignAddr extends CQuaternion {
	public CAssignAddr() {
		type = QuaType.ASSIGN_ADDR;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssignAddr();
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
