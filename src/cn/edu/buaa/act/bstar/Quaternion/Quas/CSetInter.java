package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CSetInter extends CQuaternion {
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
