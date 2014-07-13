package com.bstar.Quaternion;

public class CQuaFactory {
	public static CQuaternion create_qua(QuaType in_type, CQuaData data_0){
		CQuaternion return_result = null;
		if(in_type == QuaType.INCLUDE){
			return_result = new CQuaInclude(data_0);
		}
		return return_result;
	}
}
