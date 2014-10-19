package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CAssignValue extends CQuaRunner {
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
		CDataEntity dst_data = CDataEntity.create_entity(data_0),
				    src_data = CDataEntity.create_entity(data_1);
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
