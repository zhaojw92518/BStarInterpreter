package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;
import com.bstar.Quaternion.Interfaces.IBinaryComp;

public abstract class CBinaryComp extends CQuaternion implements IBinaryComp{
	public CBinaryComp(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst, QuaType in_type){
		data_0 = in_src_0;
		data_1 = in_src_1;
		data_2 = in_dst;
		type = in_type;
	}
	
	public CBinaryComp(){
		
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		
		return return_result;
	}
}
