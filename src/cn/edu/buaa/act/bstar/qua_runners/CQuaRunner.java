package cn.edu.buaa.act.bstar.qua_runners;

import cn.edu.buaa.act.bstar.context.CDataEntity;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.qua_runners.interfaces.IDup;
import cn.edu.buaa.act.bstar.qua_runners.interfaces.IRun;
import cn.edu.buaa.act.bstar.qua_runners.interfaces.IScane;
import cn.edu.buaa.act.bstar.quaternion.CQuaData;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;

public class CQuaRunner extends CQuaternion implements IRun, IDup, IScane{
	@Override
	public int scane(int in_index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CQuaternion dup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 
	 * @param src_data 运算结果
	 * @param dst_qua_data 四元式目标对象
	 */
	protected int assign_to_local_id(CDataEntity src_data, CQuaData dst_qua_data){
		int return_result = CGlobalDef.ERROR;
		if(dst_qua_data.is_temp()){
			if(CLangVM.get_data(dst_qua_data.str_data_0) == null){
				CLangVM.add_local_id(dst_qua_data.str_data_0, src_data);
				return_result = CGlobalDef.NORMAL;
			}
			else{
				CLangVM.set_data(dst_qua_data.str_data_0, src_data);
				return_result = CGlobalDef.NORMAL;
			}
		}
		else{
			CDataEntity dst_data = CLangVM.get_data(dst_qua_data.str_data_0);
			if(dst_data != null){
				dst_data.assign(src_data);
				return_result = CGlobalDef.NORMAL;
			}
			else{
				//TODO 错误处理
			}
		}
		return return_result;
	}

}
