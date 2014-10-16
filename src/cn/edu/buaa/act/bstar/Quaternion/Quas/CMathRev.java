package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

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
