package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CLangVM;


public class CFuncCall extends CQuaRunner {
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
	
	public int run() throws InterpreterError{
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
