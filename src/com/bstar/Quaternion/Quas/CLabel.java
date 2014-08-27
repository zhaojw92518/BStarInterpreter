package com.bstar.Quaternion.Quas;

import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CLabel extends CQuaternion {
	public CLabel() {
		type = QuaType.LABEL;
	}
	
	@Override
	public CQuaternion dup() {
		return new CLabel();
	}

	@Override
	public int scane(int in_index) {
		CLangVM.add_label((int)data_0.value_data, in_index);
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}

}
