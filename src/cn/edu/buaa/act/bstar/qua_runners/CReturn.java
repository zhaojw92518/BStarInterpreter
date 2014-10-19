package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CReturn extends CQuaRunner {
	public CReturn(CQuaData in_return_value){
		type = QuaType.RETURN;
		data_0 = in_return_value;
	}
	
	public CReturn(){
		type = QuaType.RETURN;
	}
	
	public CQuaternion dup(){
		return new CReturn();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity ret_data = CDataEntity.create_entity(data_0);
		if(ret_data == null){
			//TODO 错误处理
		}
		else{
			CLangVM.set_return_result(ret_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
