package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CIfNot extends CQuaRunner {
	public CIfNot() {
		type = QuaType.IF_NOT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CIfNot();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity cdt_result = CDataEntity.create_entity(data_0);
		if(cdt_result.is_value_data()){
			return_result = CGlobalDef.NORMAL;
			if(cdt_result.value_data == 0){
				CLangVM.go_to((int)data_1.value_data);
			}
		}
		else{
			//TODO 错误处理
		}
		return return_result;
	}

}
