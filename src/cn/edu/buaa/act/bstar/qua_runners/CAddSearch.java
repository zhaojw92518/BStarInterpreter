package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.CTypeTable;

public class CAddSearch extends CQuaRunner {
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
		CDataEntity search_cdt = CDataEntity.create_entity(data_2);
		if(search_cdt != null && search_cdt.type.equals(CTypeTable.cdt_search)){
			CDataEntity cdt_latter = CDataEntity.create_entity(data_1);
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
