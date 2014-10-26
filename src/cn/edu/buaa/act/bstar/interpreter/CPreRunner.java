package cn.edu.buaa.act.bstar.interpreter;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.context.CCodeNode;
import cn.edu.buaa.act.bstar.exception.InterpreterError;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.qua_runners.CAddSearch;
import cn.edu.buaa.act.bstar.qua_runners.CAddressOf;
import cn.edu.buaa.act.bstar.qua_runners.CAssignAddr;
import cn.edu.buaa.act.bstar.qua_runners.CAssignValue;
import cn.edu.buaa.act.bstar.qua_runners.CBaseAddress;
import cn.edu.buaa.act.bstar.qua_runners.CBeginCall;
import cn.edu.buaa.act.bstar.qua_runners.CBoolNot;
import cn.edu.buaa.act.bstar.qua_runners.CCallPara;
import cn.edu.buaa.act.bstar.qua_runners.CCdtBelong;
import cn.edu.buaa.act.bstar.qua_runners.CCdtConj;
import cn.edu.buaa.act.bstar.qua_runners.CCdtDisj;
import cn.edu.buaa.act.bstar.qua_runners.CCdtEgre;
import cn.edu.buaa.act.bstar.qua_runners.CCdtEles;
import cn.edu.buaa.act.bstar.qua_runners.CCdtEqu;
import cn.edu.buaa.act.bstar.qua_runners.CCdtGre;
import cn.edu.buaa.act.bstar.qua_runners.CCdtImpl;
import cn.edu.buaa.act.bstar.qua_runners.CCdtLes;
import cn.edu.buaa.act.bstar.qua_runners.CCdtNotBelong;
import cn.edu.buaa.act.bstar.qua_runners.CCdtUequ;
import cn.edu.buaa.act.bstar.qua_runners.CContentOf;
import cn.edu.buaa.act.bstar.qua_runners.CCstDef;
import cn.edu.buaa.act.bstar.qua_runners.CDefSearchCDT;
import cn.edu.buaa.act.bstar.qua_runners.CEnumDef;
import cn.edu.buaa.act.bstar.qua_runners.CFuncAttr;
import cn.edu.buaa.act.bstar.qua_runners.CFuncAttrEnd;
import cn.edu.buaa.act.bstar.qua_runners.CFuncCall;
import cn.edu.buaa.act.bstar.qua_runners.CFuncDef;
import cn.edu.buaa.act.bstar.qua_runners.CFuncDefEnd;
import cn.edu.buaa.act.bstar.qua_runners.CFuncPara;
import cn.edu.buaa.act.bstar.qua_runners.CGetAddr;
import cn.edu.buaa.act.bstar.qua_runners.CGetReturn;
import cn.edu.buaa.act.bstar.qua_runners.CGloAttr;
import cn.edu.buaa.act.bstar.qua_runners.CGloAttrEnd;
import cn.edu.buaa.act.bstar.qua_runners.CGoto;
import cn.edu.buaa.act.bstar.qua_runners.CIfNot;
import cn.edu.buaa.act.bstar.qua_runners.CLabel;
import cn.edu.buaa.act.bstar.qua_runners.CMathAdd;
import cn.edu.buaa.act.bstar.qua_runners.CMathDiv;
import cn.edu.buaa.act.bstar.qua_runners.CMathMod;
import cn.edu.buaa.act.bstar.qua_runners.CMathMul;
import cn.edu.buaa.act.bstar.qua_runners.CMathRev;
import cn.edu.buaa.act.bstar.qua_runners.CMathSub;
import cn.edu.buaa.act.bstar.qua_runners.CQuaRunner;
import cn.edu.buaa.act.bstar.qua_runners.CReturn;
import cn.edu.buaa.act.bstar.qua_runners.CSearchAssign;
import cn.edu.buaa.act.bstar.qua_runners.CSearchAssignNot;
import cn.edu.buaa.act.bstar.qua_runners.CSetAddr;
import cn.edu.buaa.act.bstar.qua_runners.CSetDiffer;
import cn.edu.buaa.act.bstar.qua_runners.CSetInter;
import cn.edu.buaa.act.bstar.qua_runners.CSetSearch;
import cn.edu.buaa.act.bstar.qua_runners.CSetUnion;
import cn.edu.buaa.act.bstar.qua_runners.CStructDef;
import cn.edu.buaa.act.bstar.qua_runners.CTypeDef;
import cn.edu.buaa.act.bstar.qua_runners.CVarDef;
import cn.edu.buaa.act.bstar.quaternion.CQuaTreeNode;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;

public class CPreRunner {
	private CQuaTreeNode qua_root_node = null;
	private TreeMap<String, CQuaTreeNode> qua_node_map = null;
	
	private CCodeNode code_root_node = null;
	private TreeMap<String, CCodeNode> code_node_map = new TreeMap<>();
	
	public CPreRunner(CQuaTreeNode in_root_node, 
			TreeMap<String, CQuaTreeNode> in_node_map){
		qua_root_node = in_root_node;
		qua_node_map = in_node_map;
	}
	
	private void generate_code_node() throws InterpreterError{
		for(Map.Entry<String, CQuaTreeNode> cur_entry: qua_node_map.entrySet()){
			CCodeNode cur_code_node = qua_to_code(cur_entry.getValue());
			code_node_map.put(cur_entry.getKey(), cur_code_node);
		}
		for(Map.Entry<String, CCodeNode> cur_entry: code_node_map.entrySet()){
			link_include_map(cur_entry.getValue());
		}
		code_root_node = code_node_map.get(qua_root_node.get_file_name());
	}
	
	private CCodeNode qua_to_code(CQuaTreeNode in_qua_node) throws InterpreterError{
		CCodeNode return_result = new CCodeNode();
		return_result.set_file_name(in_qua_node.get_file_name());
		LinkedList<CQuaternion> cur_qua_list = in_qua_node.get_quas();
		for(CQuaternion cur_qua: cur_qua_list){
			CQuaRunner cur_runner = create_runner(cur_qua);
			if(cur_runner != null){
				return_result.add_runner(cur_runner);
			}
		}
		TreeMap<String, CQuaTreeNode> cur_inc_map = in_qua_node.get_include_map();
		for(Map.Entry<String, CQuaTreeNode> cur_entry: cur_inc_map.entrySet()){
			return_result.put_include_map(cur_entry.getKey(), null);
		}
		return return_result;
	}
	
	private void link_include_map(CCodeNode in_code_node){
		TreeMap<String, CCodeNode> code_node_map = in_code_node.get_include_map();
		for(Map.Entry<String, CCodeNode> cur_entry: code_node_map.entrySet()){
			cur_entry.setValue(code_node_map.get(cur_entry.getKey()));
		}
	}
	
	public CCodeNode get_root_node(){
		return code_root_node;
	}
	
	public TreeMap<String, CCodeNode> get_node_map(){
		return code_node_map;
	}
	
	public void run() throws InterpreterError{
		generate_code_node();
		CGlobalDef.cout_end("PreRunner Run");
	}
	
	private CQuaRunner create_runner(CQuaternion in_qua) throws InterpreterError{
		CQuaRunner return_result = null;
		switch (in_qua.type) {
		case GLO_ATTR:
			return_result = new CGloAttr();
			break;
		case GLO_ATTR_END:
			return_result = new CGloAttrEnd();
			break;
		case FUNC_ATTR:
			return_result = new CFuncAttr();
			break;
		case FUNC_ATTR_END:
			return_result = new CFuncAttrEnd();
			break;
		case VAR_DEFINE:
			return_result = new CVarDef();
			break;
		case STRUCT_DEF:
			return_result = new CStructDef();
			break;
		case ENUM_DEF:
			return_result = new CEnumDef();
			break;
		case TYPE_DEF:
			return_result = new CTypeDef();
			break;
		case CST_DEFINE:
			return_result = new CCstDef();
			break;
		case LABEL:
			return_result = new CLabel();
			break;
		case GOTO:
			return_result = new CGoto();
			break;
		case IF_NOT:
			return_result = new CIfNot();
			break;
		case FUNC_DEFINE:
			return_result = new CFuncDef();
			break;
		case FUNC_DEFINE_END:
			return_result = new CFuncDefEnd();
			break;
		case FUNC_PARA:
			return_result = new CFuncPara();
			break;
		case RETURN:
			return_result = new CReturn();
			break;
		case FUNC_CALL:
			return_result = new CFuncCall();
			break;
		case LOOP:
			return_result = null;
			break;
		case LOOP_END:
			return_result = null;
			break;
		case ADDRESS_OF:
			return_result = new CAddressOf();
			break;
		case CONTENT_OF:
			return_result = new CContentOf();
			break;
		case BASE_ADDRESS:
			return_result = new CBaseAddress();
			break;
		case MATH_ADD:
			return_result = new CMathAdd();
			break;
		case MATH_SUB:
			return_result = new CMathSub();
			break;
		case MATH_MUL:
			return_result = new CMathMul();
			break;
		case MATH_DIV:
			return_result = new CMathDiv();
			break;
		case MATH_MOD:
			return_result = new CMathMod();
			break;
		case MATH_REV:
			return_result = new CMathRev();
			break;
		case BOOL_NOT:
			return_result = new CBoolNot();
			break;
		case CDT_LES:
			return_result = new CCdtLes();
			break;
		case CDT_ELES:
			return_result = new CCdtEles();
			break;
		case CDT_GRE:
			return_result = new CCdtGre();
			break;
		case CDT_EGRE:
			return_result = new CCdtEgre();
			break;
		case CDT_NOT_BELONG:
			return_result = new CCdtNotBelong();
			break;
		case CDT_BELONG:
			return_result = new CCdtBelong();
			break;
		case CDT_EQU:
			return_result = new CCdtEqu();
			break;
		case CDT_UEQU:
			return_result = new CCdtUequ();
			break;
		case CDT_CONJ:
			return_result = new CCdtConj();
			break;
		case CDT_DISJ:
			return_result = new CCdtDisj();
			break;
		case CDT_IMPL:
			return_result = new CCdtImpl();
			break;
		case SET_DIFFER:
			return_result = new CSetDiffer();
			break;
		case SET_INTER:
			return_result = new CSetInter();
			break;
		case SET_UNION:
			return_result = new CSetUnion();
			break;
		case GET_ADDR:
			return_result = new CGetAddr();
			break;
		case SET_ADDR:
			return_result = new CSetAddr();
			break;
		case DEF_SEARCH_CDT:
			return_result = new CDefSearchCDT();
			break;
		case ADD_SEARCH:
			return_result = new CAddSearch();
			break;
		case SET_SEARCH:
			return_result = new CSetSearch();
			break;
		case SEARCH_ASSIGN:
			return_result = new CSearchAssign();
			break;
		case SEARCH_ASSIGN_NOT:
			return_result = new CSearchAssignNot();
			break;
		case ASSIGN_VALUE:
			return_result = new CAssignValue();
			break;
		case ASSIGN_ADDR:
			return_result = new CAssignAddr();
			break;
		case BEGIN_CALL:
			return_result = new CBeginCall();
			break;
		case CALL_PARA:
			return_result = new CCallPara();
			break;
		case GET_RETURN:
			return_result = new CGetReturn();
			break;
		
		default:
			throw new InterpreterError(in_qua.type.toString() + " not found");
		}
		if(return_result != null){
			return_result.data_0 = in_qua.data_0;
			return_result.data_1 = in_qua.data_1;
			return_result.data_2 = in_qua.data_2;
			return_result.line_num = in_qua.line_num;
		}
		return return_result;
	}
}
