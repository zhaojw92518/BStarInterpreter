package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CLabel extends CQuaternion {
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
