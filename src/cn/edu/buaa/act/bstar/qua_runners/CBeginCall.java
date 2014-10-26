package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CBeginCall extends CQuaRunner {
	public CBeginCall() {
		type = QuaType.BEGIN_CALL;
	}
	
	@Override
	public int run() throws InterpreterError {
		CLangVM.begin_call();
		return CGlobalDef.NORMAL;
	}

	@Override
	public CQuaternion dup() {
		return new CBeginCall();
	}

	@Override
	public int scane(int in_index) throws InterpreterError {
		return CGlobalDef.NORMAL;
	}
}
