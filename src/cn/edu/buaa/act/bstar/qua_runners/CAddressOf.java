package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaDataType;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CAddressOf extends CQuaRunner {
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
		CDataEntity src_data = CDataEntity.create_entity(data_0);
		if(src_data != null){
			CDataEntity addr_data = src_data.get_address();
			if(data_1.is_temp()){
				CLangVM.add_local_id(data_1.str_data_0, addr_data);
				return_result = CGlobalDef.NORMAL;
			}
			else{
				CDataEntity dst_data = CDataEntity.create_entity(data_1);
				if(dst_data.type != null && dst_data.type.equals(dst_data.type)){
					dst_data.assign(addr_data);
					return_result = CGlobalDef.NORMAL;
				}
			}
		}
		return return_result;
	}

}
