package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaDataType;
import com.bstar.Quaternion.QuaType;

public class CVarTypeDef extends CQuaternion {
	public CVarTypeDef() {
		type = QuaType.VAR_TYPEDEF;
	}
	
	@Override
	public CQuaternion dup() {
		return new CVarTypeDef();
	}

	@Override
	public int scane(int in_index) {
		int return_result = CGlobalDef.ERROR;
		if(data_0.type == QuaDataType.ID_LIST 
				&& data_1.type == QuaDataType.TYPE_LIST){
			CDataEntity cur_type = new CDataEntity();
			cur_type.type = data_2.str_data_0;
			cur_type.struct_init();
			for(int i = 0; i < data_0.list_data.size(); ++i){
				cur_type.struct_add_data(
						data_0.list_data.get(i).str_data_0, 
						CLangVM.get_type_init_value(data_1.list_data.get(i).str_data_0));
			}
			CLangVM.add_type_init_value(cur_type);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}

	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}
}
