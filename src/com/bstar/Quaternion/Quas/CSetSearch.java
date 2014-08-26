package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CSetSearch extends CQuaternion {
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
		CDataEntity search_cdt = data_0.to_data_entity();
		if(search_cdt != null){
			CDataEntity search_set = data_1.to_data_entity();
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
