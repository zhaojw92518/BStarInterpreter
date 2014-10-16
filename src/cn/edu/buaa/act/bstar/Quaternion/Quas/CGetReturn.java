package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;

public class CGetReturn extends CQuaternion {
	public CGetReturn(){
		type = QuaType.GET_RETURN;
	}
	@Override
	public CQuaternion dup() {
		return new CGetReturn();
	}
	
	@Override
	public int scane(int in_index) {
		return CGlobalDef.NORMAL;
	}
	
	@Override
	public int run() {
		int return_result = CGlobalDef.ERROR;
		CDataEntity dst_data = data_0.to_data_entity();
		if(dst_data == null){
			if(data_0.is_temp()){
				dst_data = new CDataEntity();
				dst_data.type = "double";
				CLangVM.add_local_id(data_0.str_data_0, dst_data);
			}
			else{
				//TODO 错误处理
			}
		}
		//TODO 类型匹配
		dst_data.value_data = CLangVM.get_return_result().value_data;
		return_result = CGlobalDef.NORMAL;
		return return_result;
	}
}
