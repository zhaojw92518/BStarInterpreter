package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CSetInter extends CQuaRunner {
	public CSetInter() {
		type = QuaType.SET_INTER;
	}
	
	@Override
	public CQuaternion dup() {
		return new CSetInter();
	}

	@Override
	public int scane(int in_index) {
		// TODO Auto-generated method stub
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return CGlobalDef.NORMAL;
	}

}
