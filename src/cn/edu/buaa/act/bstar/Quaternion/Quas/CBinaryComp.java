package cn.edu.buaa.act.bstar.Quaternion.Quas;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.CQuaData;
import cn.edu.buaa.act.bstar.Quaternion.CQuaternion;
import cn.edu.buaa.act.bstar.Quaternion.QuaType;
import cn.edu.buaa.act.bstar.Quaternion.Interfaces.IBinaryComp;

public abstract class CBinaryComp extends CQuaternion implements IBinaryComp{
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
		CDataEntity src_data_0 = data_0.to_data_entity(),
				    src_data_1 = data_1.to_data_entity(),
				    dst_data   = data_2.to_data_entity();
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
