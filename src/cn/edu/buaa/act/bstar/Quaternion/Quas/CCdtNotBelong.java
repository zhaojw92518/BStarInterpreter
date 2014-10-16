package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CCdtNotBelong extends CQuaternion {
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
