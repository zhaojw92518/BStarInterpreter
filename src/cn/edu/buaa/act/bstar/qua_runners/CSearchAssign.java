package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CSearchAssign extends CQuaRunner {
	public CSearchAssign() {
		type = QuaType.SEARCH_ASSIGN;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity src_data = CDataEntity.create_entity(data_0),
				    dst_data = CDataEntity.create_entity(data_1);
		if(dst_data == null){
			//TODO 错误处理
		}
		if(src_data == null){
			//TODO 错误处理
		}
		//TODO 错误处理
		CDataEntity search_result = new CDataEntity("int");
		if(src_data.is_nil){
			search_result.value_data = 0.0;
		}
		else{
			search_result.value_data = 1.0;
		}
		assign_to_local_id(search_result, data_2);
		
		if(src_data.type_equal_to(dst_data) || src_data.is_nil){
			dst_data.assign(src_data);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}

	@Override
	public CQuaternion dup() {
		return new CSearchAssign();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

}
