package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CBaseAddress extends CQuaternion {
	public CBaseAddress() {
		type = QuaType.BASE_ADDRESS;
	}
	
	@Override
	public CQuaternion dup() {
		return new CBaseAddress();
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
