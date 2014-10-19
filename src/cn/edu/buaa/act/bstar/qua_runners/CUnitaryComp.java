package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.qua_runners.interfaces.IUnitaryComp;

public abstract class CUnitaryComp extends CQuaRunner implements IUnitaryComp{
	public CUnitaryComp(){
		
	}
	
	@Override
	public int run(){
		return CGlobalDef.NORMAL;
	}
}
