package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaDataType;
import com.bstar.Quaternion.QuaType;

public class CAddressOf extends CQuaternion {
	public CAddressOf(){
		type = QuaType.ADDRESS_OF;
	}
	@Override
	public CQuaternion dup() {
		return new CAddressOf();
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
			CDataEntity addr_data = src_data.get_address();
			if(data_1.is_temp()){
				CLangVM.add_local_id(data_1.str_data_0, addr_data);
				return_result = CGlobalDef.NORMAL;
			}
			else{
				CDataEntity dst_data = data_1.to_data_entity();
				if(dst_data.type != null && dst_data.type.equals(dst_data.type)){
					dst_data.assign(addr_data);
				}
			}
		}
		return return_result;
	}

}
