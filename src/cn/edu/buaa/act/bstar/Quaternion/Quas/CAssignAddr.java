package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CAssignAddr extends CQuaternion {
	public CAssignAddr() {
		type = QuaType.ASSIGN_ADDR;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssignAddr();
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
