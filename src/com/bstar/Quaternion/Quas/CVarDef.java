package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Context.VMState;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CVarDef extends CQuaternion{
	public CVarDef(CQuaData in_id_name, CQuaData in_id_type, CQuaData in_value){
		type = QuaType.VAR_DEFINE;
		data_0 = in_id_name;
		data_1 = in_id_type;
		data_2 = in_value;
	}
	
	public CVarDef(){
		type = QuaType.VAR_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CVarDef();
	}
	
	@Override
	public int scane(int in_index) {
		int return_result = CGlobalDef.ERROR;
		if(CLangVM.get_state() == VMState.GLOBAL){
			if(!CLangVM.is_global_have(data_0.str_data_0)){
				if(data_2 != null){
					CDataEntity cur_data = data_2.to_data_entity();
					cur_data.type = data_1.str_data_0;
					CLangVM.add_global_id(data_0.str_data_0, cur_data);
				}
				else{
					CLangVM.add_global_id(
							data_0.str_data_0, 
							CLangVM.get_type_init_value(data_1.str_data_0));
				}
				return_result = CGlobalDef.NORMAL;
			}
		}
		return return_result;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		if(!CLangVM.is_local_have(data_0.str_data_0)){
			if(data_2 != null){
				CDataEntity cur_data = data_2.to_data_entity();
				cur_data.type = data_1.str_data_0;
				CLangVM.add_local_id(data_0.str_data_0, cur_data);
			}
			else{
				CLangVM.add_local_id(
						data_0.str_data_0, 
						CLangVM.get_type_init_value(data_1.str_data_0));
			}
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
