package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncPara extends CQuaternion {
	public CFuncPara(CQuaData in_para) {
		type = QuaType.FUNC_PARA;
		data_0 = in_para;
	}
	
	public CFuncPara(){
		type = QuaType.FUNC_PARA;
	}
	
	public CQuaternion dup(){
		return new CFuncPara();
	}
}
