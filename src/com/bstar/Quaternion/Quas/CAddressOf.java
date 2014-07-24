package com.bstar.Quaternion.Quas;

import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAddressOf extends CQuaternion {
	public CAddressOf(){
		type = QuaType.ADDRESS_OF;
	}
	@Override
	public CQuaternion dup() {
		return new CAddressOf();
	}

}
