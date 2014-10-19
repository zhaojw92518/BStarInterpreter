package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CGetReturn extends CQuaRunner {
	public CGetReturn(){
		type = QuaType.GET_RETURN;
	}
	@Override
	public CQuaternion dup() {
		return new CGetReturn();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity dst_data = CDataEntity.create_entity(data_0);
		if(dst_data == null){
			if(data_0.is_temp()){
				dst_data = new CDataEntity();
				dst_data.type = "double";
				CLangVM.add_local_id(data_0.str_data_0, dst_data);
			}
			else{
				//TODO 错误处理
			}
		}
		//TODO 类型匹配
		dst_data.value_data = CLangVM.get_return_result().value_data;
		return_result = CGlobalDef.NORMAL;
		return return_result;
	}
}
