package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetUnion extends CQuaternion {
	public CSetUnion() {
		type = QuaType.SET_UNION;
	}

	@Override
	public CQuaternion dup() {
		return new CSetUnion();
	}

	@Override
	public int scane(int in_index) {
		// TODO Auto-generated method stub
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity left_set = data_0.to_data_entity(),
				right_set = data_1.to_data_entity(),
				result_set = left_set.set_union(right_set);
				
		if(data_2.is_temp() && CLangVM.get_data(data_2.str_data_0) == null){
			CLangVM.add_local_id(data_2.str_data_0, result_set);
			return_result = CGlobalDef.NORMAL;
		}
		else{
			CDataEntity dst_set = CLangVM.get_data(data_2.str_data_0);
			if(dst_set != null){
				dst_set.assign(result_set);
				return_result = CGlobalDef.NORMAL;
			}
			else{
				//TODO 错误处理
			}
		}
		return return_result;
	}

}
