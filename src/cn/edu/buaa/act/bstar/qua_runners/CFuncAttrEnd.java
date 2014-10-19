package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CFuncAttrEnd extends CQuaRunner {
	public CFuncAttrEnd(){
		type = QuaType.FUNC_ATTR_END;
	}
	
	public CQuaternion dup(){
		return new CFuncAttrEnd();
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
