package com.bstar.Quaternion;

import java.util.TreeMap;

import com.bstar.Parser.BStarParser;
import com.bstar.Quaternion.Quas.CAddressOf;
import com.bstar.Quaternion.Quas.CBoolNot;
import com.bstar.Quaternion.Quas.CContentOf;
import com.bstar.Quaternion.Quas.CFuncAttr;
import com.bstar.Quaternion.Quas.CFuncAttrEnd;
import com.bstar.Quaternion.Quas.CFuncCall;
import com.bstar.Quaternion.Quas.CFuncDef;
import com.bstar.Quaternion.Quas.CFuncDefEnd;
import com.bstar.Quaternion.Quas.CFuncPara;
import com.bstar.Quaternion.Quas.CCstDef;
import com.bstar.Quaternion.Quas.CGloAttr;
import com.bstar.Quaternion.Quas.CGloAttrEnd;
import com.bstar.Quaternion.Quas.CMathAdd;
import com.bstar.Quaternion.Quas.CMathMod;
import com.bstar.Quaternion.Quas.CMathRev;
import com.bstar.Quaternion.Quas.CMathSub;
import com.bstar.Quaternion.Quas.CVarDef;
import com.bstar.Quaternion.Quas.CMathDiv;
import com.bstar.Quaternion.Quas.CMathMul;
import com.bstar.Quaternion.Quas.CReturn;

public class CQuaFactory {
	private static TreeMap<QuaType, CQuaternion> qua_map = new TreeMap<>();
	private static TreeMap<Integer, QuaType> token_to_qua = new TreeMap<>();
	
	public static void init_factory(){
		token_to_qua.put(BStarParser.ADD, QuaType.MATH_ADD);
		token_to_qua.put(BStarParser.SUB, QuaType.MATH_SUB);
		token_to_qua.put(BStarParser.MUL, QuaType.MATH_MUL);
		token_to_qua.put(BStarParser.DIV, QuaType.MATH_DIV);
		token_to_qua.put(BStarParser.MOD, QuaType.MATH_MOD);
		
		token_to_qua.put(BStarParser.NOT, QuaType.BOOL_NOT);
		token_to_qua.put(BStarParser.ADDR, QuaType.ADDRESS_OF);
		token_to_qua.put(BStarParser.MUL, QuaType.CONTENT_OF);
		
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
		qua_map.put(QuaType.MATH_ADD, 			new CMathAdd());
		qua_map.put(QuaType.MATH_SUB, 			new CMathSub());
		qua_map.put(QuaType.MATH_MUL, 			new CMathMul());
		qua_map.put(QuaType.MATH_DIV, 			new CMathDiv());
		qua_map.put(QuaType.MATH_MOD, 			new CMathMod());
		qua_map.put(QuaType.MATH_REV, 			new CMathRev());
		qua_map.put(QuaType.BOOL_NOT, 			new CBoolNot());
		qua_map.put(QuaType.ADDRESS_OF, 		new CAddressOf());
		qua_map.put(QuaType.CONTENT_OF, 		new CContentOf());
	}
	
	public static CQuaternion create_qua(int in_type, CQuaData in_data_0, CQuaData in_data_1, CQuaData in_data_2){
		return create_qua(token_to_qua.get(new Integer(in_type)), in_data_0, in_data_1, in_data_2);
	}
	
	public static CQuaternion create_qua(int in_type, CQuaData in_data_0, CQuaData in_data_1){
		return create_qua(token_to_qua.get(new Integer(in_type)), in_data_0, in_data_1);
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
