package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CContentOf extends CQuaternion {
	
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
		CDataEntity src_data = data_0.to_data_entity();
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