package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CCallPara extends CQuaRunner {
	public CCallPara(){
		type = QuaType.CALL_PARA;
	}
	@Override
	public CQuaternion dup() {
		return new CCallPara();
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		CDataEntity call_para = CDataEntity.create_entity(data_0);
		if(call_para != null){
			CLangVM.add_para(call_para.clone());
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
}
