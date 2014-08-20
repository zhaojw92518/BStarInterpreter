package com.bstar.Quaternion.Quas;

import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;
/**
 * 
 * @author Umbrella
 * 定义一个搜索条件
 */
public class CDefSearchCDT extends CQuaternion {
	public CDefSearchCDT() {
		type = QuaType.DEF_SEARCH_CDT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CDefSearchCDT();
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
