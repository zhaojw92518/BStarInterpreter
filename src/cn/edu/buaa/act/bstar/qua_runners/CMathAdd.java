package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CMathAdd extends CBinaryComp {
	public CMathAdd(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst){
		super(in_src_0, in_src_1, in_dst, QuaType.MATH_ADD);
	}
	
	public CMathAdd(){
		type = QuaType.MATH_ADD;
	}
	
	public double math_compute(double in_src_0, double in_src_1){
		return in_src_0 + in_src_1;
	}
	
	public CQuaternion dup(){
		return new CMathAdd();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
}
