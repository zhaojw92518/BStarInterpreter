package com.bstar.Quaternion;

import java.util.TreeMap;

import com.bstar.Global.CGlobalDef;
import com.bstar.Parser.BStarParser;
import com.bstar.Quaternion.Quas.*;

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
		
		token_to_qua.put(BStarParser.NOT, 	QuaType.BOOL_NOT);
		token_to_qua.put(BStarParser.ADDR,	QuaType.ADDRESS_OF);
		
		token_to_qua.put(BStarParser.UNION, QuaType.SET_UNION);
		token_to_qua.put(BStarParser.INTER, QuaType.SET_INTER);
		
		token_to_qua.put(BStarParser.L_ANGLE_BRACKET, 	QuaType.CDT_LES);
		token_to_qua.put(BStarParser.ELES, 				QuaType.CDT_ELES);
		token_to_qua.put(BStarParser.R_ANGLE_BRACKET, 	QuaType.CDT_GRE);
		token_to_qua.put(BStarParser.EGRE, 				QuaType.CDT_EGRE);
		token_to_qua.put(BStarParser.NOTBELONG, 		QuaType.CDT_NOT_BELONG);
		token_to_qua.put(BStarParser.BELONG, 			QuaType.CDT_BELONG);
		token_to_qua.put(BStarParser.EQU, 				QuaType.CDT_EQU);
		token_to_qua.put(BStarParser.UEQU, 				QuaType.CDT_UEQU);
		
		add_qua(QuaType.GLO_ATTR, 			new CGloAttr());
		add_qua(QuaType.GLO_ATTR_END, 		new CGloAttrEnd());
		add_qua(QuaType.FUNC_ATTR, 			new CFuncAttr());
		add_qua(QuaType.FUNC_ATTR_END, 		new CFuncAttrEnd());
		add_qua(QuaType.VAR_DEFINE, 		new CVarDef());
		add_qua(QuaType.VAR_TYPEDEF, 		new CVarTypeDef());
		add_qua(QuaType.CST_DEFINE, 		new CCstDef());
		add_qua(QuaType.FUNC_DEFINE, 		new CFuncDef());
		add_qua(QuaType.FUNC_DEFINE_END, 	new CFuncDefEnd());
		add_qua(QuaType.LABEL, 				new CLabel());
		add_qua(QuaType.GOTO, 				new CGoto());
		add_qua(QuaType.IF_NOT, 			new CIfNot());
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
		add_qua(QuaType.ASSIGN_VALUE, 		new CAssignValue());
		add_qua(QuaType.ASSIGN_ADDR, 		new CAssignAddr());
		add_qua(QuaType.BASE_ADDRESS, 		new CBaseAddress());
		add_qua(QuaType.DEF_SEARCH_CDT, 	new CDefSearchCDT());
		add_qua(QuaType.ADD_SEARCH, 		new CAddSearch());
		add_qua(QuaType.SET_SEARCH, 		new CSetSearch());
		add_qua(QuaType.CALL_PARA, 			new CCallPara());
		add_qua(QuaType.GET_RETURN, 		new CGetReturn());
		add_qua(QuaType.SET_UNION, 			new CSetUnion());
		add_qua(QuaType.SET_INTER, 			new CSetInter());
		add_qua(QuaType.CDT_LES, 			new CCdtLes());
		add_qua(QuaType.CDT_ELES, 			new CCdtEles());
		add_qua(QuaType.CDT_GRE, 			new CCdtGre());
		add_qua(QuaType.CDT_EGRE, 			new CCdtEgre());
		add_qua(QuaType.CDT_NOT_BELONG, 	new CCdtNotBelong());
		add_qua(QuaType.CDT_BELONG, 		new CCdtBelong());
		add_qua(QuaType.CDT_EQU, 			new CCdtEqu());
		add_qua(QuaType.CDT_UEQU, 			new CCdtUequ());
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
