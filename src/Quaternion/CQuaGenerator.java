package Quaternion;
import org.antlr.v4.runtime.misc.NotNull;

import Parser.BStarBaseVisitor;
import Parser.BStarParser;
import Parser.BStarParser.AbmachineContext;
import Parser.BStarParser.Addr_getContext;
import Parser.BStarParser.Addr_idContext;
import Parser.BStarParser.And_pro_eContext;
import Parser.BStarParser.Append_parasContext;
import Parser.BStarParser.Assign_statContext;
import Parser.BStarParser.At_strContext;
import Parser.BStarParser.AttributesContext;
import Parser.BStarParser.Attributes_2Context;
import Parser.BStarParser.BelongContext;
import Parser.BStarParser.Cdeclare_operationsContext;
import Parser.BStarParser.Cfunction_declareContext;
import Parser.BStarParser.Char_strContext;
import Parser.BStarParser.Com_statementContext;
import Parser.BStarParser.Condition_termContext;
import Parser.BStarParser.Cst_defineContext;
import Parser.BStarParser.Cv_defineContext;
import Parser.BStarParser.Declare_operationsContext;
import Parser.BStarParser.DeclaresContext;
import Parser.BStarParser.DefineContext;
import Parser.BStarParser.DefinesContext;
import Parser.BStarParser.ElementContext;
import Parser.BStarParser.Element_takeContext;
import Parser.BStarParser.Enum_typeContext;
import Parser.BStarParser.False_strContext;
import Parser.BStarParser.FunctionContext;
import Parser.BStarParser.Function_callContext;
import Parser.BStarParser.Function_declareContext;
import Parser.BStarParser.Function_defineContext;
import Parser.BStarParser.IdContext;
import Parser.BStarParser.Id_listContext;
import Parser.BStarParser.If_statContext;
import Parser.BStarParser.Imp_pro_eContext;
import Parser.BStarParser.IncludeContext;
import Parser.BStarParser.IncludesContext;
import Parser.BStarParser.IntegerContext;
import Parser.BStarParser.InvariantContext;
import Parser.BStarParser.MachineContext;
import Parser.BStarParser.Machine_hContext;
import Parser.BStarParser.Machine_lContext;
import Parser.BStarParser.MseContext;
import Parser.BStarParser.Mse_0Context;
import Parser.BStarParser.Mse_1Context;
import Parser.BStarParser.NilContext;
import Parser.BStarParser.Normal_typeContext;
import Parser.BStarParser.One_eContext;
import Parser.BStarParser.OperationsContext;
import Parser.BStarParser.Or_pro_eContext;
import Parser.BStarParser.Para_define_listContext;
import Parser.BStarParser.Para_value_listContext;
import Parser.BStarParser.PointContext;
import Parser.BStarParser.Point_idContext;
import Parser.BStarParser.Pro_eContext;
import Parser.BStarParser.Pro_term_eContext;
import Parser.BStarParser.Quan_eContext;
import Parser.BStarParser.RealContext;
import Parser.BStarParser.Return_statContext;
import Parser.BStarParser.RobustContext;
import Parser.BStarParser.Set_typeContext;
import Parser.BStarParser.StatementContext;
import Parser.BStarParser.Statement_atContext;
import Parser.BStarParser.StringContext;
import Parser.BStarParser.Struct_typeContext;
import Parser.BStarParser.TermContext;
import Parser.BStarParser.True_strContext;
import Parser.BStarParser.TypeContext;
import Parser.BStarParser.Unary_eContext;
import Parser.BStarParser.Var_defineContext;
import Parser.BStarParser.While_statContext;

public class CQuaGenerator extends BStarBaseVisitor<CQuaData>{
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
	@Override public CQuaData visitType(@NotNull BStarParser.TypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAnd_pro_e(@NotNull BStarParser.And_pro_eContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitMachine_h(@NotNull BStarParser.Machine_hContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitMachine_l(@NotNull BStarParser.Machine_lContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitElement(@NotNull BStarParser.ElementContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitPro_e(@NotNull BStarParser.Pro_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCondition_term(@NotNull BStarParser.Condition_termContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCst_define(@NotNull BStarParser.Cst_defineContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitMachine(@NotNull BStarParser.MachineContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitSet_type(@NotNull BStarParser.Set_typeContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitPro_term_e(@NotNull BStarParser.Pro_term_eContext ctx) { return visitChildren(ctx); }

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

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitVar_define(@NotNull BStarParser.Var_defineContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitMse(@NotNull BStarParser.MseContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitNormal_type(@NotNull BStarParser.Normal_typeContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitCv_define(@NotNull BStarParser.Cv_defineContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitOr_pro_e(@NotNull BStarParser.Or_pro_eContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitOperations(@NotNull BStarParser.OperationsContext ctx) { return visitChildren(ctx); }

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
	@Override public CQuaData visitPoint_id(@NotNull BStarParser.Point_idContext ctx) { return visitChildren(ctx); }

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
