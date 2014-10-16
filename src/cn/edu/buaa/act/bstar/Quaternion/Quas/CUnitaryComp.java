package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.Interfaces.IUnitaryComp;

public abstract class CUnitaryComp extends CQuaternion implements IUnitaryComp{
	public CUnitaryComp(){
		
	}
	
	@Override
	public int run(){
		return CGlobalDef.NORMAL;
	}
}
