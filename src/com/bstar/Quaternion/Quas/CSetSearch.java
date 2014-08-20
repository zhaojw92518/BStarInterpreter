package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetSearch extends CQuaternion {
	public CSetSearch() {
		type = QuaType.SET_SEARCH;
	}
	
	@Override
	public CQuaternion dup() {
		return new CSetSearch();
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
