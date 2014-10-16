package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CReturn extends CQuaternion {
	public CReturn(CQuaData in_return_value){
		type = QuaType.RETURN;
		data_0 = in_return_value;
	}
	
	public CReturn(){
		type = QuaType.RETURN;
	}
	
	public CQuaternion dup(){
		return new CReturn();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity ret_data = data_0.to_data_entity();
		if(ret_data == null){
			//TODO 错误处理
		}
		else{
			CLangVM.set_return_result(ret_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
