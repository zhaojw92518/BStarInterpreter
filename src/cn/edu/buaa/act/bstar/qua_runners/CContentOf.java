package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;

public class CContentOf extends CQuaRunner {
	
	public CContentOf(){
		type = QuaType.CONTENT_OF;
	}
	
	@Override
	public CQuaternion dup() {
		return new CContentOf();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity src_data = CDataEntity.create_entity(data_0);
		if(src_data != null){
			CDataEntity content_data = src_data.get_content();
			if(content_data != null){
				return_result = assign_to_local_id(content_data, data_1);
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
