package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtEgre extends CQuaternion {
	public CCdtEgre() {
		type = QuaType.CDT_EGRE;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtEgre();
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
