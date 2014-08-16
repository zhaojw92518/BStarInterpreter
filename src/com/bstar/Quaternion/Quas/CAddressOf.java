package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAddressOf extends CQuaternion {
	public CAddressOf(){
		type = QuaType.ADDRESS_OF;
	}
	@Override
	public CQuaternion dup() {
		return new CAddressOf();
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
