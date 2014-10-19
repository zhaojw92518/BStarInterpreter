package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.context.CTypeTable;
/**
 * 
 * @author Umbrella
 * 定义一个搜索条件
 */
public class CDefSearchCDT extends CQuaRunner {
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
