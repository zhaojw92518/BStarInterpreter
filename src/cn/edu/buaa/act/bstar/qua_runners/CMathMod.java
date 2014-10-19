package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CMathMod extends CBinaryComp {
	public CMathMod(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst){
		super(in_src_0, in_src_1, in_dst, QuaType.MATH_MOD);
	}
	
	public CMathMod(){
		type = QuaType.MATH_MOD;
	}
	
	public double math_compute(double in_src_0, double in_src_1){
		return in_src_0 % in_src_1;
	}
	
	public CQuaternion dup(){
		return new CMathMod();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
}
