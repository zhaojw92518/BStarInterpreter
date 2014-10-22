package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CFuncLocation;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.VMState;

public class CFuncDefEnd extends CQuaRunner {
	public CFuncDefEnd() {
		type = QuaType.FUNC_DEFINE_END;
	}
	
	public CQuaternion dup(){
		return new CFuncDefEnd();
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		CFuncLocation pop_result = CLangVM.pop_func();
		if(pop_result == null){
			return_result = CGlobalDef.END;
		}
		else{
			pop_result.qua_index++;
			CLangVM.jump_to_far(pop_result);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
	
	public int scane(int in_index) {
		CLangVM.set_state(VMState.GLOBAL);
		return CGlobalDef.NORMAL;
	}
}
