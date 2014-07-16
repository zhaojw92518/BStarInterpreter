package com.bstar.Quaternion;
import java.util.LinkedList;

import org.antlr.v4.runtime.misc.NotNull;

import com.bstar.Global.CGlobalDef;
import com.bstar.Parser.BStarBaseVisitor;
import com.bstar.Parser.BStarParser;

public class CQuaGenerator extends BStarBaseVisitor<CQuaData>{
	private LinkedList<CQuaternion> quas = new LinkedList<>();
	private void add_qua(CQuaternion in_qua){
		quas.add(in_qua);
	}
	
	public void init(){
		quas.clear();
	}
	
	public void print_quas(){
		for(CQuaternion cur_qua: quas){
			CGlobalDef.cout_end(cur_qua.to_table_str());
		}
	}
	
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitBelong(@NotNull BStarParser.BelongContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCode_text(@NotNull BStarParser.Code_textContext ctx) { return visitChildren(ctx); }

	@Override public CQuaData visitType(@NotNull BStarParser.TypeContext ctx) {
		CQuaData return_result = new CQuaData();
		if(ctx.normal_type() != null){
			return_result = visitNormal_type(ctx.normal_type());
		}
		else if(ctx.set_type() != null){
			return_result = visitSet_type(ctx.set_type());
		}
		else if(ctx.id() != null){
			//不知道尖括号是什么
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAnd_pro_e(@NotNull BStarParser.And_pro_eContext ctx) { 
		CQuaData return_result = visitPro_term_e(ctx.pro_term_e(0));
		//TODO 完成关系语句运算
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction(@NotNull BStarParser.FunctionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPara_define_list(@NotNull BStarParser.Para_define_listContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInvariant(@NotNull BStarParser.InvariantContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitQuan_e(@NotNull BStarParser.Quan_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAbmachine(@NotNull BStarParser.AbmachineContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCom_statement(@NotNull BStarParser.Com_statementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitChar_str(@NotNull BStarParser.Char_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitElement(@NotNull BStarParser.ElementContext ctx) { 
		return visitPro_e(ctx.pro_e()); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitEnum_type(@NotNull BStarParser.Enum_typeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPro_e(@NotNull BStarParser.Pro_eContext ctx) {
		CQuaData return_result = visitOr_pro_e(ctx.or_pro_e().get(0));
		//TODO 完成关系运算
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCondition_term(@NotNull BStarParser.Condition_termContext ctx) { 
		CQuaData return_result = visitMse(ctx.mse());
		//TODO 完成关系运算
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCst_define(@NotNull BStarParser.Cst_defineContext ctx) { 
		CQuaData cur_type = visitType(ctx.type());
		for(int i = 0; i < ctx.point_id().size(); ++i){
			CQuaData cur_id = visitPoint_id(ctx.point_id(i)),
					 temp_type = new CQuaData(cur_type);
			temp_type.value_data = cur_id.value_data;
			cur_id.value_data = 0.0;
			add_qua(
				CQuaFactory.create_qua(
						QuaType.CST_DEFINE, 
						cur_id, 
						temp_type, 
						visitElement(ctx.element(i))
						)
				);
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_define(@NotNull BStarParser.Function_defineContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitOne_e(@NotNull BStarParser.One_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitId_list(@NotNull BStarParser.Id_listContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInclude(@NotNull BStarParser.IncludeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStatement(@NotNull BStarParser.StatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDefines(@NotNull BStarParser.DefinesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAddr_get(@NotNull BStarParser.Addr_getContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStruct_type(@NotNull BStarParser.Struct_typeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_call(@NotNull BStarParser.Function_callContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAppend_paras(@NotNull BStarParser.Append_parasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitSet_type(@NotNull BStarParser.Set_typeContext ctx) { 
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.TYPE;
		return_result.str_data_0 = "set";
		return_result.templet_type = visitType(ctx.type());
		return visitChildren(ctx); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCdeclare_operations(@NotNull BStarParser.Cdeclare_operationsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitWhile_stat(@NotNull BStarParser.While_statContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAt_str(@NotNull BStarParser.At_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPara_value_list(@NotNull BStarParser.Para_value_listContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitIncludes(@NotNull BStarParser.IncludesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPro_term_e(@NotNull BStarParser.Pro_term_eContext ctx) { 
		CQuaData return_result = null;
		if(ctx.quan_e() != null){
			return_result = visitQuan_e(ctx.quan_e());
		}
		else if(ctx.condition_term() != null){
			return_result = visitCondition_term(ctx.condition_term());
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitId(@NotNull BStarParser.IdContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitReal(@NotNull BStarParser.RealContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitMse_1(@NotNull BStarParser.Mse_1Context ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitMse_0(@NotNull BStarParser.Mse_0Context ctx) { return visitChildren(ctx); }
	
	@Override public CQuaData visitVar_define(@NotNull BStarParser.Var_defineContext ctx) { 
		if(ctx.start.getType() != BStarParser.TYPEDEF){
			CQuaData cur_type = visitType(ctx.type());
			for(BStarParser.Single_var_defineContext cur_var_ctx: ctx.single_var_define()){
				CQuaData cur_id = visitPoint_id(cur_var_ctx.point_id()),
						 temp_type = new CQuaData(cur_type);
				temp_type.value_data = cur_id.value_data;
				cur_id.value_data = 0.0;
				CQuaData cur_element = null;
				if(cur_var_ctx.element() != null){
					cur_element = visitElement(cur_var_ctx.element());
				}
				add_qua(CQuaFactory.create_qua(QuaType.VAR_DEFINE, cur_id, temp_type, cur_element));
			}
		}
		else{
			if(ctx.enum_type() != null){
				
			}
			else if(ctx.type() != null){
				
			}
			else if(ctx.struct_type() != null){
				
			}
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitReturn_stat(@NotNull BStarParser.Return_statContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitImp_pro_e(@NotNull BStarParser.Imp_pro_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitMse(@NotNull BStarParser.MseContext ctx) { 
		CQuaData return_result = visitMse_1(ctx.mse_1(0));
		
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDeclare_operations(@NotNull BStarParser.Declare_operationsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitNormal_type(@NotNull BStarParser.Normal_typeContext ctx) { 
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.TYPE;
		return_result.str_data_0 = ctx.getText();
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitUnary_e(@NotNull BStarParser.Unary_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDefine(@NotNull BStarParser.DefineContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitRobust(@NotNull BStarParser.RobustContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDeclares(@NotNull BStarParser.DeclaresContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFalse_str(@NotNull BStarParser.False_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInteger(@NotNull BStarParser.IntegerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStatement_at(@NotNull BStarParser.Statement_atContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAddr_id(@NotNull BStarParser.Addr_idContext ctx) { return visitChildren(ctx); }

	@Override public CQuaData visitCv_define(@NotNull BStarParser.Cv_defineContext ctx) { 
		if(ctx.single_cv_define() != null){
			for(BStarParser.Single_cv_defineContext cur_ctx: ctx.single_cv_define()){
				visitSingle_cv_define(cur_ctx);
			}
		}
		return null; 
	}
	
	@Override public CQuaData visitSingle_cv_define(@NotNull BStarParser.Single_cv_defineContext ctx){
		if(ctx.var_define() != null){
			visitVar_define(ctx.var_define());
		}
		else if(ctx.cst_define() != null){
			visitCst_define(ctx.cst_define());
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAttributes_2(@NotNull BStarParser.Attributes_2Context ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitElement_take(@NotNull BStarParser.Element_takeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAssign_stat(@NotNull BStarParser.Assign_statContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPoint(@NotNull BStarParser.PointContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitTerm(@NotNull BStarParser.TermContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCfunction_declare(@NotNull BStarParser.Cfunction_declareContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitTrue_str(@NotNull BStarParser.True_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitString(@NotNull BStarParser.StringContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitOr_pro_e(@NotNull BStarParser.Or_pro_eContext ctx) { 
		CQuaData return_result = visitAnd_pro_e(ctx.and_pro_e(0));
		//TODO 完成关系语句运算
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_declare(@NotNull BStarParser.Function_declareContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAttributes(@NotNull BStarParser.AttributesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitOperations(@NotNull BStarParser.OperationsContext ctx) { return visitChildren(ctx); }

	@Override public CQuaData visitPoint_id(@NotNull BStarParser.Point_idContext ctx) { 
		CQuaData return_result = null;
		if(ctx.start.getType() == BStarParser.MUL){
			return_result = visitPoint_id(ctx.point_id());
			++return_result.value_data;
		}
		else if(ctx.start.getType() == BStarParser.L_BRACKET){
			return_result = visitPoint_id(ctx.point_id());
		}
		else if(ctx.id() != null){
			return_result = new CQuaData();
			return_result.type = QuaDataType.ID;
			return_result.str_data_0 = ctx.id().getText();			
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitIf_stat(@NotNull BStarParser.If_statContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitNil(@NotNull BStarParser.NilContext ctx) { return visitChildren(ctx); }
}