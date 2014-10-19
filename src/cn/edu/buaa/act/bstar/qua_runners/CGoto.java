package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CGoto extends CQuaRunner {
	public CGoto() {
		type = QuaType.GOTO;
	}
	
	@Override
	public CQuaternion dup() {
		return new CGoto();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		CLangVM.go_to((int)data_0.value_data);
		return CGlobalDef.NORMAL;
	}
}
