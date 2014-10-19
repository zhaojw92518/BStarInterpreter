package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CLabel extends CQuaRunner {
	public CLabel() {
		type = QuaType.LABEL;
	}
	
	@Override
	public CQuaternion dup() {
		return new CLabel();
	}

	@Override
	public int scane(int in_index) {
		CLangVM.add_label((int)data_0.value_data, in_index);
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}

}
