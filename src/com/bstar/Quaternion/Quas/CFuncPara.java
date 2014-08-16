package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaData;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CFuncPara extends CQuaternion {
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
