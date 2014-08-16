package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CGetAddr extends CQuaternion {
	public CGetAddr(){
		type = QuaType.GET_ADDR;
	}
	@Override
	public CQuaternion dup() {
		return new CGetAddr();
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
