package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.quaternion.QuaType;
import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.qua_runners.interfaces.IBinaryComp;

public abstract class CBinaryComp extends CQuaRunner implements IBinaryComp{
	public CBinaryComp(CQuaData in_src_0, CQuaData in_src_1, CQuaData in_dst, QuaType in_type){
		data_0 = in_src_0;
		data_1 = in_src_1;
		data_2 = in_dst;
		type = in_type;
	}
	
	public CBinaryComp(){
		
	}
	
	public int run(){
		int return_result = CGlobalDef.ERROR;
		CDataEntity src_data_0 = CDataEntity.create_entity(data_0),
				    src_data_1 = CDataEntity.create_entity(data_1),
				    dst_data   = CDataEntity.create_entity(data_2);
		if(src_data_0 == null){
			//TODO 错误处理
			CGlobalDef.cout_end(data_0.toString() + "not found");
		}
		if(src_data_1 == null){
			//TODO 错误处理
			CGlobalDef.cout_end(data_1.toString() + "not found");
		}
		if(dst_data == null){
			if(data_2.is_temp()){
				dst_data = new CDataEntity();
				dst_data.type = "double";
				CLangVM.add_local_id(data_2.str_data_0, dst_data);
			}
			else{
				//TODO 错误处理
			}
		}
		//TODO 类型检查
		dst_data.value_data = math_compute(
				src_data_0.value_data, 
				src_data_1.value_data);
		return_result = CGlobalDef.NORMAL;
		return return_result;
	}
}
