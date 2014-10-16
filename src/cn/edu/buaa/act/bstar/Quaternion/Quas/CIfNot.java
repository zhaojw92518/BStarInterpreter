package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CIfNot extends CQuaternion {
	public CIfNot() {
		type = QuaType.IF_NOT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CIfNot();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity cdt_result = data_0.to_data_entity();
		if(cdt_result.is_value_data()){
			return_result = CGlobalDef.NORMAL;
			if(cdt_result.value_data == 0){
				CLangVM.go_to((int)data_1.value_data);
			}
		}
		else{
			//TODO 错误处理
		}
		return return_result;
	}

}