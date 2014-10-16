package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Context.VMState;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CCstDef extends CQuaternion {
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
				CDataEntity cur_data = data_2.to_data_entity();
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
			CDataEntity cur_data = data_2.to_data_entity();
			cur_data.type = data_1.str_data_0;
			cur_data.is_const = true;
			CLangVM.add_local_id(data_0.str_data_0, cur_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
