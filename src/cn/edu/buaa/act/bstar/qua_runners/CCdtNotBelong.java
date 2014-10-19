package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CCdtNotBelong extends CQuaRunner {
	public CCdtNotBelong() {
		type = QuaType.CDT_NOT_BELONG;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtNotBelong();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}

}
