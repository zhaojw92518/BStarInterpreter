package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Context.CTypeTable;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CCdtEqu extends CQuaternion {
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
		CDataEntity left_data = data_0.to_data_entity(),
				right_data = data_1.to_data_entity();
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
