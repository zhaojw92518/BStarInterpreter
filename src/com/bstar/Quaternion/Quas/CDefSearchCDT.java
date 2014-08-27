package com.bstar.Quaternion.Quas;

import com.bstar.Context.CDataEntity;
import com.bstar.Context.CLangVM;
import com.bstar.Context.CTypeTable;
import com.bstar.Global.CGlobalDef;
import com.bstar.Quaternion.CQuaternion;
import com.bstar.Quaternion.QuaType;
/**
 * 
 * @author Umbrella
 * 定义一个搜索条件
 */
public class CDefSearchCDT extends CQuaternion {
	public CDefSearchCDT() {
		type = QuaType.DEF_SEARCH_CDT;
	}
	
	@Override
	public CQuaternion dup() {
		return new CDefSearchCDT();
	}

	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}

	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		if(CLangVM.get_data(data_0.str_data_0) == null){
			CDataEntity cdt_search = CLangVM.get_type_init_value(CTypeTable.cdt_search);
			CLangVM.add_local_id(data_0.str_data_0, cdt_search);
			return_result = CGlobalDef.NORMAL;
		}
		else{
			CDataEntity cdt_search = CLangVM.get_type_init_value(CTypeTable.cdt_search);
			CLangVM.set_data(data_0.str_data_0, cdt_search);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}

}
