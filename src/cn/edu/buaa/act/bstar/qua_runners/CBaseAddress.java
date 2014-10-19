package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CBaseAddress extends CQuaRunner {
	public CBaseAddress() {
		type = QuaType.BASE_ADDRESS;
	}
	
	@Override
	public CQuaternion dup() {
		return new CBaseAddress();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity base_data = CDataEntity.create_entity(data_0);
		if(base_data == null){
			//TODO 错误处理
		}
		else{
			if(!base_data.is_struct_data()){
				//TODO 错误处理
			}
			else{
				CDataEntity address_result = base_data.struct_get_data(data_1.str_data_0);
				if(address_result == null){
					//TODO 错误处理
				}
				else{
					return_result = assign_to_local_id(address_result, data_2);
				}
			}
		}
		return return_result;
	}

}
