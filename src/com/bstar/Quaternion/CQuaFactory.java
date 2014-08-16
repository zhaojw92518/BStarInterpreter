package com.bstar.Quaternion;

import java.util.TreeMap;

import com.bstar.Global.CGlobalDef;
import com.bstar.Parser.BStarParser;
import com.bstar.Quaternion.Quas.CAddressOf;
import com.bstar.Quaternion.Quas.CAssign;
import com.bstar.Quaternion.Quas.CBoolNot;
import com.bstar.Quaternion.Quas.CCallPara;
import com.bstar.Quaternion.Quas.CContentOf;
import com.bstar.Quaternion.Quas.CFuncAttr;
import com.bstar.Quaternion.Quas.CFuncAttrEnd;
import com.bstar.Quaternion.Quas.CFuncCall;
import com.bstar.Quaternion.Quas.CFuncDef;
import com.bstar.Quaternion.Quas.CFuncDefEnd;
import com.bstar.Quaternion.Quas.CFuncPara;
import com.bstar.Quaternion.Quas.CCstDef;
import com.bstar.Quaternion.Quas.CGetAddr;
import com.bstar.Quaternion.Quas.CGetReturn;
import com.bstar.Quaternion.Quas.CGloAttr;
import com.bstar.Quaternion.Quas.CGloAttrEnd;
import com.bstar.Quaternion.Quas.CMathAdd;
import com.bstar.Quaternion.Quas.CMathMod;
import com.bstar.Quaternion.Quas.CMathRev;
import com.bstar.Quaternion.Quas.CMathSub;
import com.bstar.Quaternion.Quas.CSetAddr;
import com.bstar.Quaternion.Quas.CVarDef;
import com.bstar.Quaternion.Quas.CMathDiv;
import com.bstar.Quaternion.Quas.CMathMul;
import com.bstar.Quaternion.Quas.CReturn;

public class CQuaFactory {
	private static TreeMap<QuaType, CQuaternion> qua_map = new TreeMap<>();
	private static TreeMap<Integer, QuaType> token_to_qua = new TreeMap<>();
	
	private static void add_qua(QuaType in_type, CQuaternion in_qua){
		if(qua_map.containsKey(in_type)){
			CGlobalDef.info_box(in_type + " repeated!");
		}
		else{
			qua_map.put(in_type, in_qua);
		}
	}
	
	public static void init_factory(){
		token_to_qua.put(BStarParser.ADD, QuaType.MATH_ADD);
		token_to_qua.put(BStarParser.SUB, QuaType.MATH_SUB);
		token_to_qua.put(BStarParser.MUL, QuaType.MATH_MUL);
		token_to_qua.put(BStarParser.DIV, QuaType.MATH_DIV);
		token_to_qua.put(BStarParser.MOD, QuaType.MATH_MOD);
		
		token_to_qua.put(BStarParser.NOT, QuaType.BOOL_NOT);
		token_to_qua.put(BStarParser.ADDR, QuaType.ADDRESS_OF);
		//防止乘法运算与指针取值的冲突
		//token_to_qua.put(BStarParser.MUL, QuaType.CONTENT_OF);
		
		add_qua(QuaType.GLO_ATTR, 			new CGloAttr());
		add_qua(QuaType.GLO_ATTR_END, 		new CGloAttrEnd());
		add_qua(QuaType.FUNC_ATTR, 			new CFuncAttr());
		add_qua(QuaType.FUNC_ATTR_END, 		new CFuncAttrEnd());
		add_qua(QuaType.VAR_DEFINE, 		new CVarDef());
		add_qua(QuaType.CST_DEFINE, 		new CCstDef());
		add_qua(QuaType.FUNC_DEFINE, 		new CFuncDef());
		add_qua(QuaType.FUNC_DEFINE_END, 	new CFuncDefEnd());
		add_qua(QuaType.FUNC_PARA, 			new CFuncPara());
		add_qua(QuaType.RETURN, 			new CReturn());
		add_qua(QuaType.FUNC_CALL, 			new CFuncCall());
		add_qua(QuaType.MATH_ADD, 			new CMathAdd());
		add_qua(QuaType.MATH_SUB, 			new CMathSub());
		add_qua(QuaType.MATH_MUL, 			new CMathMul());
		add_qua(QuaType.MATH_DIV, 			new CMathDiv());
		add_qua(QuaType.MATH_MOD, 			new CMathMod());
		add_qua(QuaType.MATH_REV, 			new CMathRev());
		add_qua(QuaType.BOOL_NOT, 			new CBoolNot());
		add_qua(QuaType.ADDRESS_OF, 		new CAddressOf());
		add_qua(QuaType.CONTENT_OF, 		new CContentOf());
		add_qua(QuaType.GET_ADDR, 			new CGetAddr());
		add_qua(QuaType.SET_ADDR, 			new CSetAddr());
		add_qua(QuaType.ASSIGN, 			new CAssign());
		add_qua(QuaType.CALL_PARA, 			new CCallPara());
		add_qua(QuaType.GET_RETURN, 		new CGetReturn());
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
