package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.CTypeTable;

public class CCdtEqu extends CQuaRunner {
	public CCdtEqu() {
		type = QuaType.CDT_EQU;
	}
	
	@Override
	public CQuaternion dup() {
		return new CCdtEqu();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity left_data = CDataEntity.create_entity(data_0),
				right_data = CDataEntity.create_entity(data_1);
		if(left_data != null && right_data != null){
			CDataEntity cdt_result = CLangVM.get_type_init_value(CTypeTable.type_int);
			if(left_data.is_equal_to(right_data)){
				cdt_result.value_data = 1.0;
			}
			else{
				cdt_result.value_data = 0.0;
			}
			assign_to_local_id(cdt_result, data_2);
			return_result = CGlobalDef.NORMAL;
		}
		else{
			//TODO 错误处理
		}
		return return_result;
	}

}
