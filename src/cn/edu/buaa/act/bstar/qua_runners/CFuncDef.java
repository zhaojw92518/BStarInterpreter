package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.VMState;

public class CFuncDef extends CQuaRunner {
	public CFuncDef(CQuaData in_func_name, CQuaData in_return_type){
		type = QuaType.FUNC_DEFINE;
		data_0 = in_func_name;
		data_1 = in_return_type;
	}
	
	public CFuncDef(){
		type = QuaType.FUNC_DEFINE;
	}
	
	public CQuaternion dup(){
		return new CFuncDef();
	}
	
	public int scane(int in_index){
		CLangVM.set_state(VMState.LOCAL);
		CLangVM.scane_add_func(data_0.str_data_0, data_1.str_data_0, in_index);
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}
}
