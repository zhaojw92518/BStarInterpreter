package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;

public class CSearchAssignNot extends CQuaRunner {
	public CSearchAssignNot() {
		type = QuaType.SEARCH_ASSIGN_NOT;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity src_data = CDataEntity.create_entity(data_0),
					search_result = new CDataEntity("int");
		if(src_data.is_nil){
			search_result.value_data = 1.0;
		}
		else{
			search_result.value_data = 0.0;
		}
		assign_to_local_id(search_result, data_2);
		
		return return_result;
	}

	@Override
	public CQuaternion dup() {
		return new CSearchAssignNot();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

}
