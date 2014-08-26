package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAssignValue extends CQuaternion {
	public CAssignValue(){
		type = QuaType.ASSIGN_VALUE;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssignValue();
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
		if((src_data.is_nil ||
				dst_data.is_value_data() && src_data.is_value_data()) ||
				dst_data.type.equals(src_data.type) 
				){
			dst_data.assign(src_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}