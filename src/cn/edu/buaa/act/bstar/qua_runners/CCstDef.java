package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.VMState;

public class CCstDef extends CQuaRunner{
	public CCstDef(CQuaData in_id_name, CQuaData in_id_type, CQuaData in_cst_value) {
		type = QuaType.CST_DEFINE;
		data_0 = in_id_name;
		data_1 = in_id_type;
		data_2 = in_cst_value;
	}
	
	public CCstDef(){
		type = QuaType.CST_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CCstDef();
	}
	
	@Override
	public int scane(int in_index) {
		int return_result = CGlobalDef.ERROR;
		if(CLangVM.get_state() == VMState.GLOBAL){
			if(!CLangVM.is_global_have(data_0.str_data_0)){
				CDataEntity cur_data = CDataEntity.create_entity(data_2);
				cur_data.type = data_1.str_data_0;
				cur_data.is_const = true;
				CLangVM.add_global_id(data_0.str_data_0, cur_data);
				return_result = CGlobalDef.NORMAL;
			}
		}
		return return_result;
	}
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		if(!CLangVM.is_local_have(data_0.str_data_0)){
			CDataEntity cur_data = CDataEntity.create_entity(data_2);
			cur_data.type = data_1.str_data_0;
			cur_data.is_const = true;
			CLangVM.add_local_id(data_0.str_data_0, cur_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
