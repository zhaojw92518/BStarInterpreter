package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CMathRev extends CUnitaryComp {
	public CMathRev(){
		type = QuaType.MATH_REV;
	}
	
	public double math_compute(double in_src_0){
		return -in_src_0;
	}

	@Override
	public CQuaternion dup() {
		return new CMathRev();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
}
