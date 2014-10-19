package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CSetUnion extends CQuaRunner {
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
		CDataEntity left_set = CDataEntity.create_entity(data_0),
				right_set = CDataEntity.create_entity(data_1),
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
