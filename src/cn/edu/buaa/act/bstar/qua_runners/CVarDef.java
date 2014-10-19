package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.VMState;

public class CVarDef extends CQuaRunner{
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
					CDataEntity cur_data = CDataEntity.create_entity(data_2);
					cur_data.type = data_1.str_data_0;
					CLangVM.add_global_id(data_0.str_data_0, cur_data);
				}
				else{
					CLangVM.add_global_id(
							data_0.str_data_0, 
							CLangVM.get_type_init_value(data_1));
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
				CDataEntity cur_data = CDataEntity.create_entity(data_2);
				cur_data.type = data_1.str_data_0;
				CLangVM.add_local_id(data_0.str_data_0, cur_data);
			}
			else{
				CDataEntity cur_init_value = CLangVM.get_type_init_value(data_1);
				CLangVM.add_local_id(
						data_0.str_data_0, 
						cur_init_value);
			}
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
