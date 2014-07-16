package com.bstar.Quaternion;

import java.util.TreeMap;

import com.bstar.Quaternion.Quas.CFuncAttr;
import com.bstar.Quaternion.Quas.CFuncAttrEnd;
import com.bstar.Quaternion.Quas.CFuncCall;
import com.bstar.Quaternion.Quas.CFuncDef;
import com.bstar.Quaternion.Quas.CFuncDefEnd;
import com.bstar.Quaternion.Quas.CFuncPara;
import com.bstar.Quaternion.Quas.CCstDef;
import com.bstar.Quaternion.Quas.CGloAttr;
import com.bstar.Quaternion.Quas.CGloAttrEnd;
import com.bstar.Quaternion.Quas.CVarDef;
import com.bstar.Quaternion.Quas.CMathDiv;
import com.bstar.Quaternion.Quas.CMathMul;
import com.bstar.Quaternion.Quas.CReturn;

public class CQuaFactory {
	public static TreeMap<QuaType, CQuaternion> qua_map = new TreeMap<>();
	public static void init_factory(){
		qua_map.put(QuaType.GLO_ATTR, 			new CGloAttr());
		qua_map.put(QuaType.GLO_ATTR_END, 		new CGloAttrEnd());
		qua_map.put(QuaType.FUNC_ATTR, 			new CFuncAttr());
		qua_map.put(QuaType.FUNC_ATTR_END, 		new CFuncAttrEnd());
		qua_map.put(QuaType.VAR_DEFINE, 		new CVarDef());
		qua_map.put(QuaType.CST_DEFINE, 		new CCstDef());
		qua_map.put(QuaType.FUNC_DEFINE, 		new CFuncDef());
		qua_map.put(QuaType.FUNC_DEFINE_END, 	new CFuncDefEnd());
		qua_map.put(QuaType.FUNC_PARA, 			new CFuncPara());
		qua_map.put(QuaType.RETURN, 			new CReturn());
		qua_map.put(QuaType.FUNC_CALL, 			new CFuncCall());
		qua_map.put(QuaType.MATH_MUL, 			new CMathMul());
		qua_map.put(QuaType.MATH_DIV, 			new CMathDiv());
	}
	
	public static CQuaternion create_qua(QuaType in_type){
		CQuaternion return_result = qua_map.get(in_type).dup();
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0){
		CQuaternion return_result = qua_map.get(in_type).dup();
		return_result.data_0 = in_data_0;
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0, CQuaData in_data_1){
		CQuaternion return_result = qua_map.get(in_type).dup();
		return_result.data_0 = in_data_0;
		return_result.data_1 = in_data_1;
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0, CQuaData in_data_1, CQuaData in_data_2){
		CQuaternion return_result = qua_map.get(in_type).dup();
		return_result.data_0 = in_data_0;
		return_result.data_1 = in_data_1;
		return_result.data_2 = in_data_2;
		return return_result;
	}
}