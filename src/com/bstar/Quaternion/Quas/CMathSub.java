package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CMathSub extends CBinaryComp {
	public CMathSub(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst){
		super(in_src_0, in_src_1, in_dst, QuaType.MATH_SUB);
	}
	
	public CMathSub(){
		type = QuaType.MATH_SUB;
	}
	
	public double math_compute(double in_src_0, double in_src_1){
		return in_src_0 - in_src_1;
	}
	
	public CQuaternion dup(){
		return new CMathSub();
	}
}
