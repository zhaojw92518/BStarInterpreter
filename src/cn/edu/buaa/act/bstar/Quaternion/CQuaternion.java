package cn.edu.buaa.act.bstar.Quaternion;

import cn.edu.buaa.act.bstar.Context.CDataEntity;
import cn.edu.buaa.act.bstar.Context.CLangVM;
import cn.edu.buaa.act.bstar.Global.CGlobalDef;
import cn.edu.buaa.act.bstar.Quaternion.Interfaces.IDup;
import cn.edu.buaa.act.bstar.Quaternion.Interfaces.IRun;
import cn.edu.buaa.act.bstar.Quaternion.Interfaces.IScane;

public abstract class CQuaternion implements IDup, IScane, IRun{
	
	public QuaType type = null;
	public CQuaData data_0 = null, data_1 = null, data_2 = null;
	
	public CQuaternion(){
		
	}
	
	public QuaType get_type(){
		return type;
	}
	
	public String toString(){
		return type + " " + data_0 + " " + data_1 + " " + data_2;
	}
	
	private String get_single_table_str(String in_str){
		String return_result = null;
		//打表表格宽度
		int table_width = 20;
		if(in_str.length() > table_width){
			return_result = in_str.substring(0, table_width - 1);
		}
		else{
			return_result = in_str;
			return_result += blank_str.substring(0, table_width - in_str.length());
		}
		return return_result;
	}
	
	private static final String blank_str = "                    ";
	private String get_data_str(CQuaData in_data){
		if(in_data == null){
			return blank_str;
		}
		else{
			return get_single_table_str(in_data.toString());
		}
	}
	
	public String to_table_str(){
		String return_result = "|" + get_single_table_str(type.toString());
		return_result += "|";
		return_result += get_data_str(data_0);
		return_result += "|";
		return_result += get_data_str(data_1);
		return_result += "|";
		return_result += get_data_str(data_2);
		return_result += "|";
		return return_result;
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
