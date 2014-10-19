package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CFuncPara extends CQuaRunner {
	//data_0: name
	//data_1: type
	public CFuncPara(){
		type = QuaType.FUNC_PARA;
	}
	
	public CQuaternion dup(){
		return new CFuncPara();
	}
	
	public int scane(int in_index){
		CLangVM.scane_add_func_para(data_1.str_data_0);
		return CGlobalDef.NORMAL;
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		if(!CLangVM.is_local_have(data_0.str_data_0)){
			CLangVM.add_local_id(data_0.str_data_0, CLangVM.pop_front_para_list());
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
