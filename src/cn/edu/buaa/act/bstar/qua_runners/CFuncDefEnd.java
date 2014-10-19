package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
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
		int pop_result = CLangVM.pop_func();
		if(pop_result == CGlobalDef.END){
			return_result = CGlobalDef.END;
		}
		else{
			CLangVM.jump_to(pop_result + 1);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
	
	public int scane(int in_index) {
		CLangVM.set_state(VMState.GLOBAL);
		return CGlobalDef.NORMAL;
	}
}
