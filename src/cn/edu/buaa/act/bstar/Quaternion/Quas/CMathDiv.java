package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CMathDiv extends CBinaryComp{
	public CMathDiv(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst){
		super(in_src_0, in_src_1, in_dst, QuaType.MATH_DIV);
	}
	
	public CMathDiv(){
		type = QuaType.MATH_DIV;
	}
	
	public double math_compute(double in_src_0, double in_src_1){
		return in_src_0 / in_src_1;
	}
	
	public CQuaternion dup(){
		return new CMathDiv();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
}
