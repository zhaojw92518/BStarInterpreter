package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CAssignValue extends CQuaternion {
	public CAssignValue(){
		type = QuaType.ASSIGN_VALUE;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAssignValue();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity dst_data = data_0.to_data_entity(),
				    src_data = data_1.to_data_entity();
		if(dst_data == null){
			//TODO 错误处理
		}
		if(src_data == null){
			//TODO 错误处理
		}
		//TODO 错误处理
		if(src_data.type_equal_to(dst_data) || src_data.is_nil){
			dst_data.assign(src_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}
}
