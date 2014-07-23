package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CBoolNot extends CUnitaryComp {
	public CBoolNot(){
		type = QuaType.BOOL_NOT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CBoolNot();
	}

	@Override
	public double math_compute(double in_src_0) {
		double return_result;
		if(in_src_0 == 0.0){
			return_result = 1.0;
		}
		else{
			return_result = 0.0;
		}
		return return_result;
	}

}
