package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;

public class CSetSearch extends CQuaRunner {
	public CSetSearch() {
		type = QuaType.SET_SEARCH;
	}
	
	@Override
	public CQuaternion dup() {
		return new CSetSearch();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity search_cdt = CDataEntity.create_entity(data_0);
		if(search_cdt != null){
			CDataEntity search_set = CDataEntity.create_entity(data_1);
			if(search_set != null && search_set.is_set_data()){
				CDataEntity search_result = search_set.set_search(search_cdt);
				if(search_result != null){
					return_result = assign_to_local_id(search_result, data_2);
				}
				else{
					//TODO 错误处理以及查询为空
				}
			}
			else{
				//TODO 错误处理
			}
		}
		else{
			//TODO 错误处理
		}
		return return_result;
	}
}
