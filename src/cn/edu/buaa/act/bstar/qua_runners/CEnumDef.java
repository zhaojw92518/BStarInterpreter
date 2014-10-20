package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CEnumDef extends CQuaRunner {
	public CEnumDef() {
		type = QuaType.ENUM_DEF;
	}
	
	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}

	@Override
	public CQuaternion dup() {
		return new CEnumDef();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

}
