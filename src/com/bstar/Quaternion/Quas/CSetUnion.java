package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetUnion extends CQuaternion {
	public CSetUnion() {
		type = QuaType.SET_UNION;
	}

	@Override
	public CQuaternion dup() {
		return new CSetUnion();
	}

	@Override
	public int scane(int in_index) {
		// TODO Auto-generated method stub
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return CGlobalDef.NORMAL;
	}

}
