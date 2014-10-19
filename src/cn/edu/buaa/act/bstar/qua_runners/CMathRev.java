package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

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
