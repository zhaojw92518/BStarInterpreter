package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CBaseAddress extends CQuaternion {
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
		CDataEntity base_data = data_0.to_data_entity();
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
