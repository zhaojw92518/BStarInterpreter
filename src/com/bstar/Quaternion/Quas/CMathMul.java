package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CMathMul extends CBinaryComp {
	public CMathMul(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst){
		super(in_src_0, in_src_1, in_dst, QuaType.MATH_MUL);
	}
	
	public CMathMul(){
		type = QuaType.MATH_MUL;
	}
	
	public double math_compute(double in_src_0, double in_src_1){
		return in_src_0 * in_src_1;
	}
	
	public CQuaternion dup(){
		return new CMathMul();
	}
}
