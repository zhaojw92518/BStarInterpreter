package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Context.CTypeTable;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;

public class CAddSearch extends CQuaternion {
	public CAddSearch() {
		type = QuaType.ADD_SEARCH;
	}
	
	@Override
	public CQuaternion dup() {
		return new CAddSearch();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity search_cdt = data_2.to_data_entity();
		if(search_cdt != null && search_cdt.type.equals(CTypeTable.cdt_search)){
			CDataEntity cdt_latter = data_1.to_data_entity();
			if(cdt_latter != null){
				search_cdt.struct_add_data(data_0.str_data_0, cdt_latter);
				return_result = CGlobalDef.NORMAL;
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
