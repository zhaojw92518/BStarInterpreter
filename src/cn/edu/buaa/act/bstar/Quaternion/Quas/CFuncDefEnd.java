package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Context.VMState;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CFuncDefEnd extends CQuaternion {
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
