package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CCdtUequ extends CQuaternion {
	public CCdtUequ() {
		type = QuaType.CDT_UEQU;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtUequ();
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
