package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

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
