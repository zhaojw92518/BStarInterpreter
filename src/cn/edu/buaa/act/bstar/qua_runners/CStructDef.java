package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaDataType;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CStructDef extends CQuaRunner {
	public CStructDef() {
		type = QuaType.STRUCT_DEF;
	}
	
	@Override
	public CQuaternion dup() {
		return new CStructDef();
	}

	@Override
	public int scane(int in_index) {
		int return_result = CGlobalDef.ERROR;
		if(data_0.type == QuaDataType.ID_LIST 
				&& data_1.type == QuaDataType.TYPE_LIST){
			CDataEntity cur_type = new CDataEntity();
			cur_type.type = data_2.str_data_0;
			cur_type.struct_init();
			for(int i = 0; i < data_0.list_data.size(); ++i){
				cur_type.struct_add_data(
						data_0.list_data.get(i).str_data_0, 
						CLangVM.get_type_init_value(data_1.list_data.get(i).str_data_0));
			}
			CLangVM.add_type_init_value(cur_type);
			return_result = CGlobalDef.NORMAL;
		}
		return return_result;
	}

	@Override
	public int run() {
		return CGlobalDef.NORMAL;
	}
}
