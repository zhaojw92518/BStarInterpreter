package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;


public class CFuncCall extends CQuaternion {
	public CFuncCall(CQuaData in_call_func_name){
		type = QuaType.FUNC_CALL;
		data_0 = in_call_func_name;
	}
	
	public CFuncCall(){
		type = QuaType.FUNC_CALL;
	}
	
	public CQuaternion dup(){
		return new CFuncCall();
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		if(CLangVM.func_call(data_0.str_data_0)){
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
}
