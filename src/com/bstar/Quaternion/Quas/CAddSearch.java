package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAddSearch extends CQuaternion {
	public CAddSearch() {
		type = QuaType.ADD_SEARCH;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAddSearch();
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
