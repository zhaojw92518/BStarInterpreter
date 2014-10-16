package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

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
