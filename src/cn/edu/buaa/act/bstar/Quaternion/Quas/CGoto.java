package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CGoto extends CQuaternion {
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
