package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CCallPara extends CQuaternion {
	public CCallPara(){
		type = QuaType.CALL_PARA;
	}
	@Override
	public CQuaternion dup() {
		return new CCallPara();
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		CDataEntity call_para = data_0.to_data_entity();
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
