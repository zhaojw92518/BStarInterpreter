package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAssign extends CQuaternion {
	public CAssign(){
		type = QuaType.ASSIGN;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssign();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity dst_data = data_0.to_data_entity(),
				    src_data = data_1.to_data_entity();
		if(dst_data == null){
			//TODO 错误处理
		}
		if(src_data == null){
			//TODO 错误处理
		}
		//TODO 错误处理
		dst_data.value_data = src_data.value_data;
		return_result = CGlobalDef.NORMAL;
		return return_result;
	}
}
