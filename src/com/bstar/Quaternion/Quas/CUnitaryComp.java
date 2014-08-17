package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.Interfaces.IUnitaryComp;

public abstract class CUnitaryComp extends CQuaternion implements IUnitaryComp{
	public CUnitaryComp(){
		
	}
	
	@Override
	public int run(){
		return CGlobalDef.NORMAL;
	}
}
