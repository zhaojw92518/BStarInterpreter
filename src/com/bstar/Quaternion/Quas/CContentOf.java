package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CContentOf extends CQuaternion {
	
	public CContentOf(){
		type = QuaType.CONTENT_OF;
	}
	
	@Override
	public CQuaternion dup() {
		return new CContentOf();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity src_data = data_0.to_data_entity();
		if(src_data != null){
			CDataEntity content_data = src_data.get_content();
			if(content_data != null){
				if(data_1.is_temp()){
					CLangVM.add_local_id(data_1.str_data_0, content_data);
					return_result = CGlobalDef.NORMAL;
				}
				else{
					CDataEntity dst_data = data_1.to_data_entity();
					if(dst_data != null && dst_data.type_equal_to(content_data)){
						dst_data.assign(content_data);
						return_result = CGlobalDef.NORMAL;
					}
				}
			}
			else{
				//TODO 错误处理
			}
		}
		else{
			//TODO 错误处理
		}
		return return_result;
	}
}
