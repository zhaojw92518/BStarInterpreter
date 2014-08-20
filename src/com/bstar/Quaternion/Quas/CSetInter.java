package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetInter extends CQuaternion {
	public CSetInter() {
		type = QuaType.SET_INTER;
	}
	
	@Override
	public CQuaternion dup() {
		return new CSetInter();
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
