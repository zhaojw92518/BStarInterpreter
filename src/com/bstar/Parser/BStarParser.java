package com.bstar.Parser;
// Generated from .\BStar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BStarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MACHINE=1, INVARIANT=2, ATTRIBUTE=3, OPERATIONS=4, END=5, INCLUDE=6, FUNCTION=7, 
		ROBUST=8, PRECONDITION=9, POSTCONDITION=10, SHORT_TYPE=11, INT_TYPE=12, 
		LONG_TYPE=13, FLOAT_TYPE=14, DOUBLE_TYPE=15, CHAR_TYPE=16, STRING_TYPE=17, 
		PROPOSITION_TYPE=18, SET_TYPE=19, TUPLE_TYPE=20, BOOL_TYPE=21, ENUM_TYPE=22, 
		CONST=23, UNSIGNED=24, TRUE=25, FALSE=26, NIL=27, STRUCT=28, VOID=29, 
		RETURN=30, IF=31, ELSE=32, WHILE=33, TYPEDEF=34, SUF=35, DEFINE=36, FORALL=37, 
		COMMA=38, POINT=39, AT=40, SEMICOLON=41, L_BRACKET=42, R_BRACKET=43, L_BRACE=44, 
		R_BRACE=45, L_ANGLE_BRACKET=46, R_ANGLE_BRACKET=47, ADD=48, SUB=49, MUL=50, 
		DIV=51, MOD=52, NOT=53, CONJUNCTION=54, DISJUNCTION=55, IMPLICATION=56, 
		EXIST=57, EGRE=58, ELES=59, EQU=60, UEQU=61, SEPERATOR=62, BELONG=63, 
		NOTBELONG=64, INTER=65, UNION=66, DIFFER=67, ASSIGNMENT=68, ADDRGET=69, 
		ADDR=70, CHAR=71, STRING=72, AT_STR=73, INTEGER=74, REAL=75, ID=76, WS=77, 
		COMMENT=78, COMMENT_2=79;
	public static final String[] tokenNames = {
		"<INVALID>", "'MACHINE'", "'INVARIANT'", "'ATTRIBUTES'", "'OPERATIONS'", 
		"'END'", "'INCLUDE'", "'FUNCTION'", "'ROBUST'", "'Precondition'", "'Postcondition'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'string'", 
		"'proposition'", "'set'", "'tuple'", "'bool'", "'enum'", "'const'", "'unsigned'", 
		"'true'", "'false'", "'nil'", "'struct'", "'void'", "'return'", "'if'", 
		"'else'", "'while'", "'typedef'", "'.bs'", "'#define'", "'#'", "','", 
		"'.'", "'@'", "';'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'~'", "'&&'", "'||'", "'=>'", "'!'", "'>='", 
		"'<='", "'=='", "'!='", "'|'", "':'", "'!:'", "'/-\\'", "'\\-/'", "'--'", 
		"'='", "'->'", "'&'", "CHAR", "STRING", "AT_STR", "INTEGER", "REAL", "ID", 
		"WS", "COMMENT", "COMMENT_2"
	};
	public static final int
		RULE_abmachine = 0, RULE_code_text = 1, RULE_includes = 2, RULE_attributes = 3, 
		RULE_cv_define = 4, RULE_single_cv_define = 5, RULE_single_var_define = 6, 
		RULE_var_define = 7, RULE_cst_define = 8, RULE_operations = 9, RULE_function_define = 10, 
		RULE_declare_operations = 11, RULE_declares = 12, RULE_function_declare = 13, 
		RULE_cdeclare_operations = 14, RULE_cfunction_declare = 15, RULE_defines = 16, 
		RULE_type = 17, RULE_normal_type = 18, RULE_set_type = 19, RULE_struct_type = 20, 
		RULE_enum_type = 21, RULE_point_id = 22, RULE_addr_id = 23, RULE_robust = 24, 
		RULE_function = 25, RULE_para_define_list = 26, RULE_function_call = 27, 
		RULE_para_value_list = 28, RULE_append_paras = 29, RULE_attributes_2 = 30, 
		RULE_com_statement = 31, RULE_invariant = 32, RULE_statement = 33, RULE_element_take = 34, 
		RULE_assign_stat = 35, RULE_return_stat = 36, RULE_while_stat = 37, RULE_if_stat = 38, 
		RULE_define = 39, RULE_include = 40, RULE_point = 41, RULE_belong = 42, 
		RULE_addr_get = 43, RULE_nil = 44, RULE_id = 45, RULE_string = 46, RULE_at_str = 47, 
		RULE_true_str = 48, RULE_false_str = 49, RULE_integer = 50, RULE_real = 51, 
		RULE_char_str = 52, RULE_statement_at = 53, RULE_term = 54, RULE_one_e = 55, 
		RULE_unary_e = 56, RULE_mse_0 = 57, RULE_mse_1_latter = 58, RULE_mse_1 = 59, 
		RULE_mse_latter = 60, RULE_mse = 61, RULE_condition_term = 62, RULE_condition_term_latter = 63, 
		RULE_id_list = 64, RULE_quan_e = 65, RULE_pro_term_e = 66, RULE_and_pro_e = 67, 
		RULE_or_pro_e = 68, RULE_imp_pro_e = 69, RULE_pro_e = 70, RULE_element = 71;
	public static final String[] ruleNames = {
		"abmachine", "code_text", "includes", "attributes", "cv_define", "single_cv_define", 
		"single_var_define", "var_define", "cst_define", "operations", "function_define", 
		"declare_operations", "declares", "function_declare", "cdeclare_operations", 
		"cfunction_declare", "defines", "type", "normal_type", "set_type", "struct_type", 
		"enum_type", "point_id", "addr_id", "robust", "function", "para_define_list", 
		"function_call", "para_value_list", "append_paras", "attributes_2", "com_statement", 
		"invariant", "statement", "element_take", "assign_stat", "return_stat", 
		"while_stat", "if_stat", "define", "include", "point", "belong", "addr_get", 
		"nil", "id", "string", "at_str", "true_str", "false_str", "integer", "real", 
		"char_str", "statement_at", "term", "one_e", "unary_e", "mse_0", "mse_1_latter", 
		"mse_1", "mse_latter", "mse", "condition_term", "condition_term_latter", 
		"id_list", "quan_e", "pro_term_e", "and_pro_e", "or_pro_e", "imp_pro_e", 
		"pro_e", "element"
	};

	@Override
	public String getGrammarFileName() { return "BStar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public BStarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AbmachineContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public Code_textContext code_text() {
			return getRuleContext(Code_textContext.class,0);
		}
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public AbmachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abmachine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAbmachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbmachineContext abmachine() throws RecognitionException {
		AbmachineContext _localctx = new AbmachineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abmachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(MACHINE);
			setState(145); id();
			setState(147);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(146); includes();
				}
			}

			setState(154);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(149); match(ATTRIBUTE);
				setState(151);
				_la = _input.LA(1);
				if (_la==DEFINE) {
					{
					setState(150); defines();
					}
				}

				setState(153); cv_define();
				}
			}

			setState(157);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(156); code_text();
				}
			}

			setState(159); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_textContext extends ParserRuleContext {
		public Cdeclare_operationsContext cdeclare_operations() {
			return getRuleContext(Cdeclare_operationsContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Declare_operationsContext declare_operations() {
			return getRuleContext(Declare_operationsContext.class,0);
		}
		public Code_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCode_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_textContext code_text() throws RecognitionException {
		Code_textContext _localctx = new Code_textContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_text);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); operations();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); declare_operations();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163); cdeclare_operations();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludesContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public List<TerminalNode> L_ANGLE_BRACKET() { return getTokens(BStarParser.L_ANGLE_BRACKET); }
		public TerminalNode R_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.R_ANGLE_BRACKET, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<TerminalNode> SUF() { return getTokens(BStarParser.SUF); }
		public TerminalNode L_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.L_ANGLE_BRACKET, i);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public List<TerminalNode> R_ANGLE_BRACKET() { return getTokens(BStarParser.R_ANGLE_BRACKET); }
		public TerminalNode SUF(int i) {
			return getToken(BStarParser.SUF, i);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166); include();
				setState(173);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(167); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(168); match(L_ANGLE_BRACKET);
					setState(169); id();
					setState(170); match(SUF);
					setState(171); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); match(SEMICOLON);
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(ATTRIBUTE);
			setState(183);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(182); defines();
				}
			}

			setState(185); cv_define();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cv_defineContext extends ParserRuleContext {
		public Single_cv_defineContext single_cv_define(int i) {
			return getRuleContext(Single_cv_defineContext.class,i);
		}
		public List<Single_cv_defineContext> single_cv_define() {
			return getRuleContexts(Single_cv_defineContext.class);
		}
		public Cv_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCv_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cv_defineContext cv_define() throws RecognitionException {
		Cv_defineContext _localctx = new Cv_defineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cv_define);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187); single_cv_define();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_cv_defineContext extends ParserRuleContext {
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Cst_defineContext cst_define() {
			return getRuleContext(Cst_defineContext.class,0);
		}
		public Single_cv_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_cv_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSingle_cv_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_cv_defineContext single_cv_define() throws RecognitionException {
		Single_cv_defineContext _localctx = new Single_cv_defineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_single_cv_define);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case PROPOSITION_TYPE:
			case SET_TYPE:
			case UNSIGNED:
			case VOID:
			case TYPEDEF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); var_define();
				setState(193); match(SEMICOLON);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); cst_define();
				setState(196); match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_var_defineContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public Single_var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_var_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSingle_var_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_var_defineContext single_var_define() throws RecognitionException {
		Single_var_defineContext _localctx = new Single_var_defineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_var_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); point_id();
			setState(203);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(201); match(ASSIGNMENT);
				setState(202); element();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_defineContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(BStarParser.TYPEDEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public List<Single_var_defineContext> single_var_define() {
			return getRuleContexts(Single_var_defineContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public Single_var_defineContext single_var_define(int i) {
			return getRuleContext(Single_var_defineContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitVar_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defineContext var_define() throws RecognitionException {
		Var_defineContext _localctx = new Var_defineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_define);
		int _la;
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); type();
				setState(206); single_var_define();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207); match(COMMA);
					setState(208); single_var_define();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(TYPEDEF);
				setState(215); enum_type();
				setState(216); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); match(TYPEDEF);
				setState(219); type();
				setState(220); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); match(TYPEDEF);
				setState(223); struct_type();
				setState(224); point_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cst_defineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
		public TerminalNode CONST() { return getToken(BStarParser.CONST, 0); }
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Cst_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cst_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCst_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cst_defineContext cst_define() throws RecognitionException {
		Cst_defineContext _localctx = new Cst_defineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cst_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(CONST);
			setState(229); type();
			setState(230); point_id();
			setState(231); match(ASSIGNMENT);
			setState(232); element();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233); match(COMMA);
				setState(234); point_id();
				setState(235); match(ASSIGNMENT);
				setState(236); element();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationsContext extends ParserRuleContext {
		public List<Function_defineContext> function_define() {
			return getRuleContexts(Function_defineContext.class);
		}
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Function_defineContext function_define(int i) {
			return getRuleContext(Function_defineContext.class,i);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(OPERATIONS);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244); function_define();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defineContext extends ParserRuleContext {
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public Com_statementContext com_statement() {
			return getRuleContext(Com_statementContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public Function_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defineContext function_define() throws RecognitionException {
		Function_defineContext _localctx = new Function_defineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); type();
			setState(250); point_id();
			setState(251); match(L_BRACKET);
			setState(252); para_define_list();
			setState(253); match(R_BRACKET);
			setState(254); match(L_BRACE);
			setState(255); com_statement();
			setState(256); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_operationsContext extends ParserRuleContext {
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public DeclaresContext declares() {
			return getRuleContext(DeclaresContext.class,0);
		}
		public Declare_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDeclare_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_operationsContext declare_operations() throws RecognitionException {
		Declare_operationsContext _localctx = new Declare_operationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(OPERATIONS);
			setState(259); declares();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaresContext extends ParserRuleContext {
		public List<Function_declareContext> function_declare() {
			return getRuleContexts(Function_declareContext.class);
		}
		public Function_declareContext function_declare(int i) {
			return getRuleContext(Function_declareContext.class,i);
		}
		public DeclaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declares; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDeclares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaresContext declares() throws RecognitionException {
		DeclaresContext _localctx = new DeclaresContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261); function_declare();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declareContext extends ParserRuleContext {
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public Function_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declareContext function_declare() throws RecognitionException {
		Function_declareContext _localctx = new Function_declareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); type();
			setState(267); point_id();
			setState(268); match(L_BRACKET);
			setState(269); para_define_list();
			setState(270); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cdeclare_operationsContext extends ParserRuleContext {
		public List<Cfunction_declareContext> cfunction_declare() {
			return getRuleContexts(Cfunction_declareContext.class);
		}
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Cfunction_declareContext cfunction_declare(int i) {
			return getRuleContext(Cfunction_declareContext.class,i);
		}
		public Cdeclare_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdeclare_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCdeclare_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cdeclare_operationsContext cdeclare_operations() throws RecognitionException {
		Cdeclare_operationsContext _localctx = new Cdeclare_operationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cdeclare_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(OPERATIONS);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273); cfunction_declare();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfunction_declareContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public RobustContext robust() {
			return getRuleContext(RobustContext.class,0);
		}
		public Function_declareContext function_declare() {
			return getRuleContext(Function_declareContext.class,0);
		}
		public Cfunction_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfunction_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCfunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cfunction_declareContext cfunction_declare() throws RecognitionException {
		Cfunction_declareContext _localctx = new Cfunction_declareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cfunction_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); function_declare();
			setState(279); robust();
			setState(280); function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinesContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282); define();
				setState(283); id();
				setState(284); element();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Normal_typeContext normal_type() {
			return getRuleContext(Normal_typeContext.class,0);
		}
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			setState(299);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case PROPOSITION_TYPE:
			case UNSIGNED:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(292); id();
				setState(297);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(293); match(L_ANGLE_BRACKET);
					setState(294); type();
					setState(295); match(R_ANGLE_BRACKET);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Normal_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(BStarParser.INT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(BStarParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(BStarParser.CHAR_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(BStarParser.FLOAT_TYPE, 0); }
		public TerminalNode PROPOSITION_TYPE() { return getToken(BStarParser.PROPOSITION_TYPE, 0); }
		public List<TerminalNode> LONG_TYPE() { return getTokens(BStarParser.LONG_TYPE); }
		public TerminalNode STRING_TYPE() { return getToken(BStarParser.STRING_TYPE, 0); }
		public TerminalNode VOID() { return getToken(BStarParser.VOID, 0); }
		public TerminalNode LONG_TYPE(int i) {
			return getToken(BStarParser.LONG_TYPE, i);
		}
		public TerminalNode UNSIGNED() { return getToken(BStarParser.UNSIGNED, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(BStarParser.SHORT_TYPE, 0); }
		public Normal_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitNormal_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_typeContext normal_type() throws RecognitionException {
		Normal_typeContext _localctx = new Normal_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_normal_type);
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(UNSIGNED);
				setState(303); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305); match(UNSIGNED);
				setState(306); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308); match(UNSIGNED);
				setState(309); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310); match(LONG_TYPE);
				setState(311); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312); match(UNSIGNED);
				setState(313); match(LONG_TYPE);
				setState(314); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(315); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(316); match(UNSIGNED);
				setState(317); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(318); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(319); match(UNSIGNED);
				setState(320); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(321); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(322); match(UNSIGNED);
				setState(323); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(324); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(325); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(326); match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public At_strContext at_str() {
			return getRuleContext(At_strContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SET_TYPE() { return getToken(BStarParser.SET_TYPE, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(SET_TYPE);
			setState(330); match(L_ANGLE_BRACKET);
			setState(331); type();
			setState(332); match(R_ANGLE_BRACKET);
			setState(334);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(333); at_str();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(BStarParser.STRUCT, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(STRUCT);
			setState(337); match(L_BRACE);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(338); type();
				setState(339); point_id();
				setState(340); match(SEMICOLON);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_typeContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<Unary_eContext> unary_e() {
			return getRuleContexts(Unary_eContext.class);
		}
		public Unary_eContext unary_e(int i) {
			return getRuleContext(Unary_eContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(BStarParser.ENUM_TYPE, 0); }
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitEnum_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_typeContext enum_type() throws RecognitionException {
		Enum_typeContext _localctx = new Enum_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(ENUM_TYPE);
			setState(350); match(L_BRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(351); id();
				setState(354);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(352); match(ASSIGNMENT);
					setState(353); unary_e();
					}
				}

				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(356); match(COMMA);
					setState(357); id();
					setState(360);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(358); match(ASSIGNMENT);
						setState(359); unary_e();
						}
					}

					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Point_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public Point_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPoint_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Point_idContext point_id() throws RecognitionException {
		Point_idContext _localctx = new Point_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_point_id);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); match(MUL);
				setState(375); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(377); match(L_BRACKET);
				setState(378); point_id();
				setState(379); match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Addr_idContext extends ParserRuleContext {
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Addr_idContext addr_id() {
			return getRuleContext(Addr_idContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Addr_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAddr_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addr_idContext addr_id() throws RecognitionException {
		Addr_idContext _localctx = new Addr_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addr_id);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); match(ADDR);
				setState(384); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(385); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(386); match(L_BRACKET);
				setState(387); addr_id();
				setState(388); match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RobustContext extends ParserRuleContext {
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public TerminalNode ROBUST() { return getToken(BStarParser.ROBUST, 0); }
		public RobustContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robust; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitRobust(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobustContext robust() throws RecognitionException {
		RobustContext _localctx = new RobustContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_robust);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(ROBUST);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393); match(PRECONDITION);
				setState(394); pro_e();
				setState(395); match(POSTCONDITION);
				setState(396); pro_e();
				}
				}
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRECONDITION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public TerminalNode FUNCTION() { return getToken(BStarParser.FUNCTION, 0); }
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(FUNCTION);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(403); match(PRECONDITION);
				setState(404); pro_e();
				setState(405); match(POSTCONDITION);
				setState(406); pro_e();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRECONDITION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Para_define_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Para_define_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_define_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPara_define_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_define_listContext para_define_list() throws RecognitionException {
		Para_define_listContext _localctx = new Para_define_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_para_define_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(412); type();
				setState(413); point_id();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(414); match(COMMA);
					setState(415); type();
					setState(416); point_id();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Para_value_listContext para_value_list() {
			return getRuleContext(Para_value_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Append_parasContext append_paras() {
			return getRuleContext(Append_parasContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); id();
			setState(426); match(L_BRACKET);
			setState(427); para_value_list();
			setState(428); match(R_BRACKET);
			setState(430);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(429); append_paras();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Para_value_listContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Para_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_value_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPara_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_value_listContext para_value_list() throws RecognitionException {
		Para_value_listContext _localctx = new Para_value_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_para_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(432); element();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433); match(COMMA);
					setState(434); element();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Append_parasContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode AT(int i) {
			return getToken(BStarParser.AT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> AT() { return getTokens(BStarParser.AT); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Append_parasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_paras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAppend_paras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_parasContext append_paras() throws RecognitionException {
		Append_parasContext _localctx = new Append_parasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_append_paras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); match(AT);
			setState(443); id();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(444); match(COMMA);
				setState(445); id();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451); match(AT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attributes_2Context extends ParserRuleContext {
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public Attributes_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAttributes_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attributes_2Context attributes_2() throws RecognitionException {
		Attributes_2Context _localctx = new Attributes_2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_attributes_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); cv_define();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Com_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Attributes_2Context attributes_2() {
			return getRuleContext(Attributes_2Context.class,0);
		}
		public InvariantContext invariant() {
			return getRuleContext(InvariantContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Com_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCom_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Com_statementContext com_statement() throws RecognitionException {
		Com_statementContext _localctx = new Com_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_com_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(455); attributes_2();
				}
				break;
			}
			setState(459);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(458); invariant();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				{
				setState(461); statement();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(BStarParser.INVARIANT, 0); }
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(INVARIANT);
			setState(468); pro_e();
			setState(469); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Statement_atContext statement_at() {
			return getRuleContext(Statement_atContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Element_takeContext element_take() {
			return getRuleContext(Element_takeContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		int _la;
		try {
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472); assign_stat();
				setState(473); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475); element_take();
				setState(476); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478); function_call();
				setState(479); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(481); return_stat();
				setState(482); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(484); while_stat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(485); if_stat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(486); match(L_BRACE);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					{
					setState(487); statement();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493); match(R_BRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(494); statement_at();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_takeContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public Element_takeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_take; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElement_take(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_takeContext element_take() throws RecognitionException {
		Element_takeContext _localctx = new Element_takeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_element_take);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497); id();
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(498); match(POINT);
					setState(499); id();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(528);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(505); point();
				setState(506); match(L_ANGLE_BRACKET);
				setState(509);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(507); id();
					}
					break;
				case INTEGER:
					{
					setState(508); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(511); belong();
				setState(512); element();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513); match(COMMA);
					setState(516);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(514); id();
						}
						break;
					case INTEGER:
						{
						setState(515); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(518); belong();
					setState(519); element();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526); match(R_ANGLE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode ADDRGET(int i) {
			return getToken(BStarParser.ADDRGET, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public List<TerminalNode> ADDRGET() { return getTokens(BStarParser.ADDRGET); }
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assign_stat);
		int _la;
		try {
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); point_id();
				setState(531); match(ASSIGNMENT);
				setState(532); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); point_id();
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(539);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(535); match(POINT);
						setState(536); id();
						}
						break;
					case ADDRGET:
						{
						setState(537); match(ADDRGET);
						setState(538); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(541); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(543); match(ASSIGNMENT);
				setState(544); element();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(BStarParser.RETURN, 0); }
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(RETURN);
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(549); element();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BStarParser.WHILE, 0); }
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); match(WHILE);
			setState(553); match(L_BRACKET);
			setState(554); pro_e();
			setState(555); match(R_BRACKET);
			setState(556); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(BStarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(BStarParser.ELSE, 0); }
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); match(IF);
			setState(559); match(L_BRACKET);
			setState(560); pro_e();
			setState(561); match(R_BRACKET);
			setState(562); statement();
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(563); match(ELSE);
				setState(564); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(BStarParser.DEFINE, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(DEFINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(BStarParser.INCLUDE, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(INCLUDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(BStarParser.POINT, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(POINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BelongContext extends ParserRuleContext {
		public TerminalNode BELONG() { return getToken(BStarParser.BELONG, 0); }
		public BelongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belong; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBelong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BelongContext belong() throws RecognitionException {
		BelongContext _localctx = new BelongContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_belong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(BELONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Addr_getContext extends ParserRuleContext {
		public TerminalNode ADDRGET() { return getToken(BStarParser.ADDRGET, 0); }
		public Addr_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr_get; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAddr_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addr_getContext addr_get() throws RecognitionException {
		Addr_getContext _localctx = new Addr_getContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_addr_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(ADDRGET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(BStarParser.NIL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(NIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BStarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BStarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class At_strContext extends ParserRuleContext {
		public TerminalNode AT_STR() { return getToken(BStarParser.AT_STR, 0); }
		public At_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAt_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final At_strContext at_str() throws RecognitionException {
		At_strContext _localctx = new At_strContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_at_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(AT_STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_strContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BStarParser.TRUE, 0); }
		public True_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTrue_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_strContext true_str() throws RecognitionException {
		True_strContext _localctx = new True_strContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_true_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class False_strContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(BStarParser.FALSE, 0); }
		public False_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFalse_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_strContext false_str() throws RecognitionException {
		False_strContext _localctx = new False_strContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_false_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BStarParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(BStarParser.REAL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_strContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BStarParser.CHAR, 0); }
		public Char_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitChar_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_strContext char_str() throws RecognitionException {
		Char_strContext _localctx = new Char_strContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_char_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_atContext extends ParserRuleContext {
		public TerminalNode AT_STR() { return getToken(BStarParser.AT_STR, 0); }
		public Statement_atContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_at; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStatement_at(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_atContext statement_at() throws RecognitionException {
		Statement_atContext _localctx = new Statement_atContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(AT_STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ADDRGET(int i) {
			return getToken(BStarParser.ADDRGET, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> L_ANGLE_BRACKET() { return getTokens(BStarParser.L_ANGLE_BRACKET); }
		public Char_strContext char_str() {
			return getRuleContext(Char_strContext.class,0);
		}
		public TerminalNode R_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.R_ANGLE_BRACKET, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public List<TerminalNode> R_ANGLE_BRACKET() { return getTokens(BStarParser.R_ANGLE_BRACKET); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<TerminalNode> ADDRGET() { return getTokens(BStarParser.ADDRGET); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public False_strContext false_str() {
			return getRuleContext(False_strContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public TerminalNode L_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.L_ANGLE_BRACKET, i);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public True_strContext true_str() {
			return getRuleContext(True_strContext.class,0);
		}
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(597); nil();
				}
				break;

			case 2:
				{
				setState(598); string();
				}
				break;

			case 3:
				{
				setState(599); true_str();
				}
				break;

			case 4:
				{
				setState(600); false_str();
				}
				break;

			case 5:
				{
				setState(601); integer();
				}
				break;

			case 6:
				{
				setState(602); real();
				}
				break;

			case 7:
				{
				setState(603); char_str();
				}
				break;

			case 8:
				{
				setState(604); match(L_BRACE);
				setState(605); element();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(606); match(COMMA);
					setState(607); element();
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613); match(R_BRACE);
				}
				break;

			case 9:
				{
				setState(615); match(L_ANGLE_BRACKET);
				setState(616); element();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(617); match(COMMA);
					setState(618); element();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624); match(R_ANGLE_BRACKET);
				}
				break;

			case 10:
				{
				setState(626); function_call();
				}
				break;

			case 11:
				{
				setState(627); id();
				}
				break;

			case 12:
				{
				setState(628); match(L_BRACKET);
				setState(629); element();
				setState(630); match(R_BRACKET);
				}
				break;

			case 13:
				{
				}
				break;
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==ADDRGET) {
				{
				setState(662);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(635); match(POINT);
					setState(636); match(L_ANGLE_BRACKET);
					setState(639);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(637); id();
						}
						break;
					case INTEGER:
						{
						setState(638); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(641); belong();
					setState(642); element();
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(643); match(COMMA);
						setState(646);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(644); id();
							}
							break;
						case INTEGER:
							{
							setState(645); integer();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(648); belong();
						setState(649); element();
						}
						}
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(656); match(R_ANGLE_BRACKET);
					}
					break;

				case 2:
					{
					setState(658); match(POINT);
					setState(659); id();
					}
					break;

				case 3:
					{
					setState(660); match(ADDRGET);
					setState(661); id();
					}
					break;
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_eContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public One_eContext one_e() {
			return getRuleContext(One_eContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BStarParser.NOT, 0); }
		public One_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOne_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_eContext one_e() throws RecognitionException {
		One_eContext _localctx = new One_eContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_one_e);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667); match(NOT);
				setState(668); one_e();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669); match(MUL);
				setState(670); one_e();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671); match(ADDR);
				setState(672); one_e();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673); term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_eContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public One_eContext one_e() {
			return getRuleContext(One_eContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BStarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(BStarParser.ADD, 0); }
		public Unary_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitUnary_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_eContext unary_e() throws RecognitionException {
		Unary_eContext _localctx = new Unary_eContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unary_e);
		int _la;
		try {
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(677); term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678); one_e();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mse_0Context extends ParserRuleContext {
		public Unary_eContext unary_e() {
			return getRuleContext(Unary_eContext.class,0);
		}
		public Mse_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_0Context mse_0() throws RecognitionException {
		Mse_0Context _localctx = new Mse_0Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_mse_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681); unary_e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mse_1_latterContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(BStarParser.UNION, 0); }
		public Mse_0Context mse_0() {
			return getRuleContext(Mse_0Context.class,0);
		}
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BStarParser.DIV, 0); }
		public TerminalNode INTER() { return getToken(BStarParser.INTER, 0); }
		public TerminalNode MOD() { return getToken(BStarParser.MOD, 0); }
		public Mse_1_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_1_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_1_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_1_latterContext mse_1_latter() throws RecognitionException {
		Mse_1_latterContext _localctx = new Mse_1_latterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_mse_1_latter);
		try {
			setState(693);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(683); match(MUL);
				setState(684); mse_0();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(685); match(DIV);
				setState(686); mse_0();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(687); match(MOD);
				setState(688); mse_0();
				}
				break;
			case INTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(689); match(INTER);
				setState(690); mse_0();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(691); match(UNION);
				setState(692); mse_0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mse_1Context extends ParserRuleContext {
		public Mse_0Context mse_0() {
			return getRuleContext(Mse_0Context.class,0);
		}
		public Mse_1_latterContext mse_1_latter(int i) {
			return getRuleContext(Mse_1_latterContext.class,i);
		}
		public List<Mse_1_latterContext> mse_1_latter() {
			return getRuleContexts(Mse_1_latterContext.class);
		}
		public Mse_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_1Context mse_1() throws RecognitionException {
		Mse_1Context _localctx = new Mse_1Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_mse_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695); mse_0();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (MUL - 50)) | (1L << (DIV - 50)) | (1L << (MOD - 50)) | (1L << (INTER - 50)) | (1L << (UNION - 50)))) != 0)) {
				{
				{
				setState(696); mse_1_latter();
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mse_latterContext extends ParserRuleContext {
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
		}
		public TerminalNode DIFFER() { return getToken(BStarParser.DIFFER, 0); }
		public TerminalNode SUB() { return getToken(BStarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(BStarParser.ADD, 0); }
		public Mse_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_latterContext mse_latter() throws RecognitionException {
		Mse_latterContext _localctx = new Mse_latterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mse_latter);
		try {
			setState(708);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(702); match(ADD);
				setState(703); mse_1();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(704); match(SUB);
				setState(705); mse_1();
				}
				break;
			case DIFFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(706); match(DIFFER);
				setState(707); mse_1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MseContext extends ParserRuleContext {
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
		}
		public List<Mse_latterContext> mse_latter() {
			return getRuleContexts(Mse_latterContext.class);
		}
		public Mse_latterContext mse_latter(int i) {
			return getRuleContext(Mse_latterContext.class,i);
		}
		public MseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MseContext mse() throws RecognitionException {
		MseContext _localctx = new MseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_mse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); mse_1();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (ADD - 48)) | (1L << (SUB - 48)) | (1L << (DIFFER - 48)))) != 0)) {
				{
				{
				setState(711); mse_latter();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_termContext extends ParserRuleContext {
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public Condition_term_latterContext condition_term_latter() {
			return getRuleContext(Condition_term_latterContext.class,0);
		}
		public Condition_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCondition_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_termContext condition_term() throws RecognitionException {
		Condition_termContext _localctx = new Condition_termContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717); mse();
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(718); condition_term_latter();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_term_latterContext extends ParserRuleContext {
		public TerminalNode EGRE() { return getToken(BStarParser.EGRE, 0); }
		public TerminalNode ELES() { return getToken(BStarParser.ELES, 0); }
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode EQU() { return getToken(BStarParser.EQU, 0); }
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public TerminalNode NOTBELONG() { return getToken(BStarParser.NOTBELONG, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode UEQU() { return getToken(BStarParser.UEQU, 0); }
		public TerminalNode BELONG() { return getToken(BStarParser.BELONG, 0); }
		public Condition_term_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_term_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCondition_term_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_term_latterContext condition_term_latter() throws RecognitionException {
		Condition_term_latterContext _localctx = new Condition_term_latterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_condition_term_latter);
		try {
			setState(737);
			switch (_input.LA(1)) {
			case L_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(721); match(L_ANGLE_BRACKET);
				setState(722); mse();
				}
				break;
			case ELES:
				enterOuterAlt(_localctx, 2);
				{
				setState(723); match(ELES);
				setState(724); mse();
				}
				break;
			case R_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(725); match(R_ANGLE_BRACKET);
				setState(726); mse();
				}
				break;
			case EGRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(727); match(EGRE);
				setState(728); mse();
				}
				break;
			case NOTBELONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(729); match(NOTBELONG);
				setState(730); mse();
				}
				break;
			case BELONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(731); match(BELONG);
				setState(732); mse();
				}
				break;
			case EQU:
				enterOuterAlt(_localctx, 7);
				{
				setState(733); match(EQU);
				setState(734); mse();
				}
				break;
			case UEQU:
				enterOuterAlt(_localctx, 8);
				{
				setState(735); match(UEQU);
				setState(736); mse();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_id_list);
		int _la;
		try {
			setState(758);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(739); id();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(740); match(COMMA);
					setState(741); id();
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(747); match(L_BRACKET);
				setState(748); id();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749); match(COMMA);
					setState(750); id();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756); match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quan_eContext extends ParserRuleContext {
		public Imp_pro_eContext imp_pro_e() {
			return getRuleContext(Imp_pro_eContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(BStarParser.EXIST, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(BStarParser.FORALL, 0); }
		public Quan_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quan_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitQuan_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quan_eContext quan_e() throws RecognitionException {
		Quan_eContext _localctx = new Quan_eContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_quan_e);
		try {
			setState(772);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(760); match(EXIST);
				setState(761); id_list();
				setState(762); match(L_BRACKET);
				setState(763); pro_e();
				setState(764); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(766); match(FORALL);
				setState(767); id_list();
				setState(768); match(L_BRACKET);
				setState(769); imp_pro_e();
				setState(770); match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pro_term_eContext extends ParserRuleContext {
		public Quan_eContext quan_e() {
			return getRuleContext(Quan_eContext.class,0);
		}
		public Condition_termContext condition_term() {
			return getRuleContext(Condition_termContext.class,0);
		}
		public Pro_term_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pro_term_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPro_term_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pro_term_eContext pro_term_e() throws RecognitionException {
		Pro_term_eContext _localctx = new Pro_term_eContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pro_term_e);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(774); quan_e();
				}
				break;
			case END:
			case FUNCTION:
			case PRECONDITION:
			case POSTCONDITION:
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case PROPOSITION_TYPE:
			case SET_TYPE:
			case CONST:
			case UNSIGNED:
			case TRUE:
			case FALSE:
			case NIL:
			case VOID:
			case TYPEDEF:
			case DEFINE:
			case COMMA:
			case POINT:
			case SEMICOLON:
			case L_BRACKET:
			case R_BRACKET:
			case L_BRACE:
			case R_BRACE:
			case L_ANGLE_BRACKET:
			case R_ANGLE_BRACKET:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case NOT:
			case CONJUNCTION:
			case DISJUNCTION:
			case IMPLICATION:
			case EGRE:
			case ELES:
			case EQU:
			case UEQU:
			case BELONG:
			case NOTBELONG:
			case INTER:
			case UNION:
			case DIFFER:
			case ADDRGET:
			case ADDR:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(775); condition_term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_pro_eContext extends ParserRuleContext {
		public Pro_term_eContext pro_term_e(int i) {
			return getRuleContext(Pro_term_eContext.class,i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(BStarParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(BStarParser.CONJUNCTION, i);
		}
		public List<Pro_term_eContext> pro_term_e() {
			return getRuleContexts(Pro_term_eContext.class);
		}
		public And_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAnd_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_pro_eContext and_pro_e() throws RecognitionException {
		And_pro_eContext _localctx = new And_pro_eContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); pro_term_e();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(779); match(CONJUNCTION);
				setState(780); pro_term_e();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_pro_eContext extends ParserRuleContext {
		public List<And_pro_eContext> and_pro_e() {
			return getRuleContexts(And_pro_eContext.class);
		}
		public TerminalNode DISJUNCTION(int i) {
			return getToken(BStarParser.DISJUNCTION, i);
		}
		public List<TerminalNode> DISJUNCTION() { return getTokens(BStarParser.DISJUNCTION); }
		public And_pro_eContext and_pro_e(int i) {
			return getRuleContext(And_pro_eContext.class,i);
		}
		public Or_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOr_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_pro_eContext or_pro_e() throws RecognitionException {
		Or_pro_eContext _localctx = new Or_pro_eContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786); and_pro_e();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(787); match(DISJUNCTION);
				setState(788); and_pro_e();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imp_pro_eContext extends ParserRuleContext {
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
		}
		public TerminalNode IMPLICATION() { return getToken(BStarParser.IMPLICATION, 0); }
		public List<Or_pro_eContext> or_pro_e() {
			return getRuleContexts(Or_pro_eContext.class);
		}
		public Imp_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitImp_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imp_pro_eContext imp_pro_e() throws RecognitionException {
		Imp_pro_eContext _localctx = new Imp_pro_eContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794); or_pro_e();
			setState(795); match(IMPLICATION);
			setState(796); or_pro_e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pro_eContext extends ParserRuleContext {
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
		}
		public List<TerminalNode> IMPLICATION() { return getTokens(BStarParser.IMPLICATION); }
		public TerminalNode IMPLICATION(int i) {
			return getToken(BStarParser.IMPLICATION, i);
		}
		public List<Or_pro_eContext> or_pro_e() {
			return getRuleContexts(Or_pro_eContext.class);
		}
		public Pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pro_eContext pro_e() throws RecognitionException {
		Pro_eContext _localctx = new Pro_eContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); or_pro_e();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(799); match(IMPLICATION);
				setState(800); or_pro_e();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); pro_e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3Q\u032b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\5\2\u0096\n\2\3\2\3\2\5\2\u009a\n\2\3\2\5\2\u009d\n\2"+
		"\3\2\5\2\u00a0\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u00a7\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u00b0\n\4\3\4\3\4\6\4\u00b4\n\4\r\4\16\4\u00b5\3\5\3\5"+
		"\5\5\u00ba\n\5\3\5\3\5\3\6\6\6\u00bf\n\6\r\6\16\6\u00c0\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\b\5\b\u00ce\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00e5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f1"+
		"\n\n\f\n\16\n\u00f4\13\n\3\13\3\13\6\13\u00f8\n\13\r\13\16\13\u00f9\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16\u0109\n\16\r"+
		"\16\16\16\u010a\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\6\20\u0115\n\20"+
		"\r\20\16\20\u0116\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0121\n"+
		"\22\r\22\16\22\u0122\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012c\n\23"+
		"\5\23\u012e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u014a\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0151\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0159\n\26\f\26\16\26\u015c\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u0165\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u016b\n\27\7\27\u016d\n\27\f\27\16\27\u0170\13\27\7\27\u0172\n\27\f\27"+
		"\16\27\u0175\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0180"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0189\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u0191\n\32\r\32\16\32\u0192\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\6\33\u019b\n\33\r\33\16\33\u019c\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u01a5\n\34\f\34\16\34\u01a8\13\34\5\34\u01aa\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01b1\n\35\3\36\3\36\3\36\7\36\u01b6\n\36\f\36\16\36\u01b9"+
		"\13\36\5\36\u01bb\n\36\3\37\3\37\3\37\3\37\7\37\u01c1\n\37\f\37\16\37"+
		"\u01c4\13\37\3\37\3\37\3 \3 \3!\5!\u01cb\n!\3!\5!\u01ce\n!\3!\7!\u01d1"+
		"\n!\f!\16!\u01d4\13!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u01eb\n#\f#\16#\u01ee\13#\3#\3#\5#\u01f2\n#\3$\3"+
		"$\3$\7$\u01f7\n$\f$\16$\u01fa\13$\3$\3$\3$\3$\5$\u0200\n$\3$\3$\3$\3$"+
		"\3$\5$\u0207\n$\3$\3$\3$\7$\u020c\n$\f$\16$\u020f\13$\3$\3$\5$\u0213\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u021e\n%\r%\16%\u021f\3%\3%\3%\5%\u0225"+
		"\n%\3&\3&\5&\u0229\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u0238\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\38\38\38\78\u0263\n8\f8\168\u0266\138\38\38\38\38\38\3"+
		"8\78\u026e\n8\f8\168\u0271\138\38\38\38\38\38\38\38\38\38\58\u027c\n8"+
		"\38\38\38\38\58\u0282\n8\38\38\38\38\38\58\u0289\n8\38\38\38\78\u028e"+
		"\n8\f8\168\u0291\138\38\38\38\38\38\38\78\u0299\n8\f8\168\u029c\138\3"+
		"9\39\39\39\39\39\39\59\u02a5\n9\3:\3:\3:\5:\u02aa\n:\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\5<\u02b8\n<\3=\3=\7=\u02bc\n=\f=\16=\u02bf\13=\3>"+
		"\3>\3>\3>\3>\3>\5>\u02c7\n>\3?\3?\7?\u02cb\n?\f?\16?\u02ce\13?\3@\3@\5"+
		"@\u02d2\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02e4\n"+
		"A\3B\3B\3B\7B\u02e9\nB\fB\16B\u02ec\13B\3B\3B\3B\3B\7B\u02f2\nB\fB\16"+
		"B\u02f5\13B\3B\3B\5B\u02f9\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0307"+
		"\nC\3D\3D\5D\u030b\nD\3E\3E\3E\7E\u0310\nE\fE\16E\u0313\13E\3F\3F\3F\7"+
		"F\u0318\nF\fF\16F\u031b\13F\3G\3G\3G\3G\3H\3H\3H\7H\u0324\nH\fH\16H\u0327"+
		"\13H\3I\3I\3I\2J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\2\3\3\2\62\63\u0362\2\u0092\3\2\2\2\4\u00a6\3"+
		"\2\2\2\6\u00b3\3\2\2\2\b\u00b7\3\2\2\2\n\u00be\3\2\2\2\f\u00c8\3\2\2\2"+
		"\16\u00ca\3\2\2\2\20\u00e4\3\2\2\2\22\u00e6\3\2\2\2\24\u00f5\3\2\2\2\26"+
		"\u00fb\3\2\2\2\30\u0104\3\2\2\2\32\u0108\3\2\2\2\34\u010c\3\2\2\2\36\u0112"+
		"\3\2\2\2 \u0118\3\2\2\2\"\u0120\3\2\2\2$\u012d\3\2\2\2&\u0149\3\2\2\2"+
		"(\u014b\3\2\2\2*\u0152\3\2\2\2,\u015f\3\2\2\2.\u017f\3\2\2\2\60\u0188"+
		"\3\2\2\2\62\u018a\3\2\2\2\64\u0194\3\2\2\2\66\u01a9\3\2\2\28\u01ab\3\2"+
		"\2\2:\u01ba\3\2\2\2<\u01bc\3\2\2\2>\u01c7\3\2\2\2@\u01ca\3\2\2\2B\u01d5"+
		"\3\2\2\2D\u01f1\3\2\2\2F\u01f3\3\2\2\2H\u0224\3\2\2\2J\u0226\3\2\2\2L"+
		"\u022a\3\2\2\2N\u0230\3\2\2\2P\u0239\3\2\2\2R\u023b\3\2\2\2T\u023d\3\2"+
		"\2\2V\u023f\3\2\2\2X\u0241\3\2\2\2Z\u0243\3\2\2\2\\\u0245\3\2\2\2^\u0247"+
		"\3\2\2\2`\u0249\3\2\2\2b\u024b\3\2\2\2d\u024d\3\2\2\2f\u024f\3\2\2\2h"+
		"\u0251\3\2\2\2j\u0253\3\2\2\2l\u0255\3\2\2\2n\u027b\3\2\2\2p\u02a4\3\2"+
		"\2\2r\u02a9\3\2\2\2t\u02ab\3\2\2\2v\u02b7\3\2\2\2x\u02b9\3\2\2\2z\u02c6"+
		"\3\2\2\2|\u02c8\3\2\2\2~\u02cf\3\2\2\2\u0080\u02e3\3\2\2\2\u0082\u02f8"+
		"\3\2\2\2\u0084\u0306\3\2\2\2\u0086\u030a\3\2\2\2\u0088\u030c\3\2\2\2\u008a"+
		"\u0314\3\2\2\2\u008c\u031c\3\2\2\2\u008e\u0320\3\2\2\2\u0090\u0328\3\2"+
		"\2\2\u0092\u0093\7\3\2\2\u0093\u0095\5\\/\2\u0094\u0096\5\6\4\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009c\3\2\2\2\u0097\u0099\7\5"+
		"\2\2\u0098\u009a\5\"\22\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\5\n\6\2\u009c\u0097\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2\3\3\2\2\2"+
		"\u00a3\u00a7\5\24\13\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\36\20\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\5\3\2\2\2"+
		"\u00a8\u00af\5R*\2\u00a9\u00b0\5^\60\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac"+
		"\5\\/\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7+"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\7\3\2\2\2\u00b7\u00b9\7\5\2\2"+
		"\u00b8\u00ba\5\"\22\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\t\3\2\2\2\u00bd\u00bf\5\f\7\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\13\3\2\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\7+\2\2\u00c4\u00c9"+
		"\3\2\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7+\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\r\3\2\2\2\u00ca\u00cd\5.\30\2"+
		"\u00cb\u00cc\7F\2\2\u00cc\u00ce\5\u0090I\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\17\3\2\2\2\u00cf\u00d0\5$\23\2\u00d0\u00d5\5\16\b\2\u00d1"+
		"\u00d2\7(\2\2\u00d2\u00d4\5\16\b\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e5\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9\u00da\5,\27\2\u00da\u00db\5\\"+
		"/\2\u00db\u00e5\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\5$\23\2\u00de\u00df"+
		"\5.\30\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e2\5*\26\2\u00e2"+
		"\u00e3\5.\30\2\u00e3\u00e5\3\2\2\2\u00e4\u00cf\3\2\2\2\u00e4\u00d8\3\2"+
		"\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\21\3\2\2\2\u00e6\u00e7"+
		"\7\31\2\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\7F\2\2\u00ea"+
		"\u00f2\5\u0090I\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7"+
		"F\2\2\u00ee\u00ef\5\u0090I\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\23\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\6\2\2\u00f6\u00f8\5\26\f\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\25\3\2\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\5.\30\2\u00fd\u00fe"+
		"\7,\2\2\u00fe\u00ff\5\66\34\2\u00ff\u0100\7-\2\2\u0100\u0101\7.\2\2\u0101"+
		"\u0102\5@!\2\u0102\u0103\7/\2\2\u0103\27\3\2\2\2\u0104\u0105\7\6\2\2\u0105"+
		"\u0106\5\32\16\2\u0106\31\3\2\2\2\u0107\u0109\5\34\17\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\33\3\2\2\2\u010c\u010d\5$\23\2\u010d\u010e\5.\30\2\u010e\u010f\7,\2\2"+
		"\u010f\u0110\5\66\34\2\u0110\u0111\7-\2\2\u0111\35\3\2\2\2\u0112\u0114"+
		"\7\6\2\2\u0113\u0115\5 \21\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\37\3\2\2\2\u0118\u0119\5\34\17"+
		"\2\u0119\u011a\5\62\32\2\u011a\u011b\5\64\33\2\u011b!\3\2\2\2\u011c\u011d"+
		"\5P)\2\u011d\u011e\5\\/\2\u011e\u011f\5\u0090I\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123#\3\2\2\2\u0124\u012e\5&\24\2\u0125\u012e\5(\25\2\u0126\u012b"+
		"\5\\/\2\u0127\u0128\7\60\2\2\u0128\u0129\5$\23\2\u0129\u012a\7\61\2\2"+
		"\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012e"+
		"%\3\2\2\2\u012f\u014a\7\r\2\2\u0130\u0131\7\32\2\2\u0131\u014a\7\r\2\2"+
		"\u0132\u014a\7\16\2\2\u0133\u0134\7\32\2\2\u0134\u014a\7\16\2\2\u0135"+
		"\u014a\7\17\2\2\u0136\u0137\7\32\2\2\u0137\u014a\7\17\2\2\u0138\u0139"+
		"\7\17\2\2\u0139\u014a\7\17\2\2\u013a\u013b\7\32\2\2\u013b\u013c\7\17\2"+
		"\2\u013c\u014a\7\17\2\2\u013d\u014a\7\22\2\2\u013e\u013f\7\32\2\2\u013f"+
		"\u014a\7\22\2\2\u0140\u014a\7\20\2\2\u0141\u0142\7\32\2\2\u0142\u014a"+
		"\7\20\2\2\u0143\u014a\7\21\2\2\u0144\u0145\7\32\2\2\u0145\u014a\7\21\2"+
		"\2\u0146\u014a\7\23\2\2\u0147\u014a\7\24\2\2\u0148\u014a\7\37\2\2\u0149"+
		"\u012f\3\2\2\2\u0149\u0130\3\2\2\2\u0149\u0132\3\2\2\2\u0149\u0133\3\2"+
		"\2\2\u0149\u0135\3\2\2\2\u0149\u0136\3\2\2\2\u0149\u0138\3\2\2\2\u0149"+
		"\u013a\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0140\3\2"+
		"\2\2\u0149\u0141\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149"+
		"\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\'\3\2\2\2"+
		"\u014b\u014c\7\25\2\2\u014c\u014d\7\60\2\2\u014d\u014e\5$\23\2\u014e\u0150"+
		"\7\61\2\2\u014f\u0151\5`\61\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151)\3\2\2\2\u0152\u0153\7\36\2\2\u0153\u015a\7.\2\2\u0154\u0155\5"+
		"$\23\2\u0155\u0156\5.\30\2\u0156\u0157\7+\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7/\2\2\u015e"+
		"+\3\2\2\2\u015f\u0160\7\30\2\2\u0160\u0173\7.\2\2\u0161\u0164\5\\/\2\u0162"+
		"\u0163\7F\2\2\u0163\u0165\5r:\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2"+
		"\2\u0165\u016e\3\2\2\2\u0166\u0167\7(\2\2\u0167\u016a\5\\/\2\u0168\u0169"+
		"\7F\2\2\u0169\u016b\5r:\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u0166\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0161\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7/\2\2\u0177"+
		"-\3\2\2\2\u0178\u0179\7\64\2\2\u0179\u0180\5.\30\2\u017a\u0180\5\\/\2"+
		"\u017b\u017c\7,\2\2\u017c\u017d\5.\30\2\u017d\u017e\7-\2\2\u017e\u0180"+
		"\3\2\2\2\u017f\u0178\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u0180"+
		"/\3\2\2\2\u0181\u0182\7H\2\2\u0182\u0189\5\60\31\2\u0183\u0189\5\\/\2"+
		"\u0184\u0185\7,\2\2\u0185\u0186\5\60\31\2\u0186\u0187\7-\2\2\u0187\u0189"+
		"\3\2\2\2\u0188\u0181\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0189"+
		"\61\3\2\2\2\u018a\u0190\7\n\2\2\u018b\u018c\7\13\2\2\u018c\u018d\5\u008e"+
		"H\2\u018d\u018e\7\f\2\2\u018e\u018f\5\u008eH\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018b\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\63\3\2\2\2\u0194\u019a\7\t\2\2\u0195\u0196\7\13\2\2\u0196\u0197"+
		"\5\u008eH\2\u0197\u0198\7\f\2\2\u0198\u0199\5\u008eH\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0195\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\65\3\2\2\2\u019e\u019f\5$\23\2\u019f\u01a6\5.\30"+
		"\2\u01a0\u01a1\7(\2\2\u01a1\u01a2\5$\23\2\u01a2\u01a3\5.\30\2\u01a3\u01a5"+
		"\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u019e\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\67\3\2\2\2\u01ab\u01ac\5\\/\2\u01ac\u01ad"+
		"\7,\2\2\u01ad\u01ae\5:\36\2\u01ae\u01b0\7-\2\2\u01af\u01b1\5<\37\2\u01b0"+
		"\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b19\3\2\2\2\u01b2\u01b7\5\u0090"+
		"I\2\u01b3\u01b4\7(\2\2\u01b4\u01b6\5\u0090I\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		";\3\2\2\2\u01bc\u01bd\7*\2\2\u01bd\u01c2\5\\/\2\u01be\u01bf\7(\2\2\u01bf"+
		"\u01c1\5\\/\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c6\7*\2\2\u01c6=\3\2\2\2\u01c7\u01c8\5\n\6\2\u01c8?\3\2\2\2\u01c9"+
		"\u01cb\5> \2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2"+
		"\2\u01cc\u01ce\5B\"\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d2"+
		"\3\2\2\2\u01cf\u01d1\5D#\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3A\3\2\2\2\u01d4\u01d2\3\2\2\2"+
		"\u01d5\u01d6\7\4\2\2\u01d6\u01d7\5\u008eH\2\u01d7\u01d8\7+\2\2\u01d8C"+
		"\3\2\2\2\u01d9\u01f2\7+\2\2\u01da\u01db\5H%\2\u01db\u01dc\7+\2\2\u01dc"+
		"\u01f2\3\2\2\2\u01dd\u01de\5F$\2\u01de\u01df\7+\2\2\u01df\u01f2\3\2\2"+
		"\2\u01e0\u01e1\58\35\2\u01e1\u01e2\7+\2\2\u01e2\u01f2\3\2\2\2\u01e3\u01e4"+
		"\5J&\2\u01e4\u01e5\7+\2\2\u01e5\u01f2\3\2\2\2\u01e6\u01f2\5L\'\2\u01e7"+
		"\u01f2\5N(\2\u01e8\u01ec\7.\2\2\u01e9\u01eb\5D#\2\u01ea\u01e9\3\2\2\2"+
		"\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\7/\2\2\u01f0\u01f2\5l\67\2\u01f1"+
		"\u01d9\3\2\2\2\u01f1\u01da\3\2\2\2\u01f1\u01dd\3\2\2\2\u01f1\u01e0\3\2"+
		"\2\2\u01f1\u01e3\3\2\2\2\u01f1\u01e6\3\2\2\2\u01f1\u01e7\3\2\2\2\u01f1"+
		"\u01e8\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2E\3\2\2\2\u01f3\u01f8\5\\/\2\u01f4"+
		"\u01f5\7)\2\2\u01f5\u01f7\5\\/\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2"+
		"\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0212\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fb\u01fc\5T+\2\u01fc\u01ff\7\60\2\2\u01fd\u0200\5\\/\2\u01fe"+
		"\u0200\5f\64\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\5V,\2\u0202\u020d\5\u0090I\2\u0203\u0206\7(\2\2\u0204"+
		"\u0207\5\\/\2\u0205\u0207\5f\64\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5V,\2\u0209\u020a\5\u0090I\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0203\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0211\7\61\2\2\u0211\u0213\3\2\2\2\u0212\u01fb\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213G\3\2\2\2\u0214\u0215\5.\30\2\u0215\u0216\7F\2\2\u0216\u0217"+
		"\5\u0090I\2\u0217\u0225\3\2\2\2\u0218\u021d\5.\30\2\u0219\u021a\7)\2\2"+
		"\u021a\u021e\5\\/\2\u021b\u021c\7G\2\2\u021c\u021e\5\\/\2\u021d\u0219"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7F\2\2\u0222\u0223\5\u0090"+
		"I\2\u0223\u0225\3\2\2\2\u0224\u0214\3\2\2\2\u0224\u0218\3\2\2\2\u0225"+
		"I\3\2\2\2\u0226\u0228\7 \2\2\u0227\u0229\5\u0090I\2\u0228\u0227\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229K\3\2\2\2\u022a\u022b\7#\2\2\u022b\u022c\7"+
		",\2\2\u022c\u022d\5\u008eH\2\u022d\u022e\7-\2\2\u022e\u022f\5D#\2\u022f"+
		"M\3\2\2\2\u0230\u0231\7!\2\2\u0231\u0232\7,\2\2\u0232\u0233\5\u008eH\2"+
		"\u0233\u0234\7-\2\2\u0234\u0237\5D#\2\u0235\u0236\7\"\2\2\u0236\u0238"+
		"\5D#\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238O\3\2\2\2\u0239\u023a"+
		"\7&\2\2\u023aQ\3\2\2\2\u023b\u023c\7\b\2\2\u023cS\3\2\2\2\u023d\u023e"+
		"\7)\2\2\u023eU\3\2\2\2\u023f\u0240\7A\2\2\u0240W\3\2\2\2\u0241\u0242\7"+
		"G\2\2\u0242Y\3\2\2\2\u0243\u0244\7\35\2\2\u0244[\3\2\2\2\u0245\u0246\7"+
		"N\2\2\u0246]\3\2\2\2\u0247\u0248\7J\2\2\u0248_\3\2\2\2\u0249\u024a\7K"+
		"\2\2\u024aa\3\2\2\2\u024b\u024c\7\33\2\2\u024cc\3\2\2\2\u024d\u024e\7"+
		"\34\2\2\u024ee\3\2\2\2\u024f\u0250\7L\2\2\u0250g\3\2\2\2\u0251\u0252\7"+
		"M\2\2\u0252i\3\2\2\2\u0253\u0254\7I\2\2\u0254k\3\2\2\2\u0255\u0256\7K"+
		"\2\2\u0256m\3\2\2\2\u0257\u027c\5Z.\2\u0258\u027c\5^\60\2\u0259\u027c"+
		"\5b\62\2\u025a\u027c\5d\63\2\u025b\u027c\5f\64\2\u025c\u027c\5h\65\2\u025d"+
		"\u027c\5j\66\2\u025e\u025f\7.\2\2\u025f\u0264\5\u0090I\2\u0260\u0261\7"+
		"(\2\2\u0261\u0263\5\u0090I\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0267\u0268\7/\2\2\u0268\u027c\3\2\2\2\u0269\u026a\7\60\2\2\u026a"+
		"\u026f\5\u0090I\2\u026b\u026c\7(\2\2\u026c\u026e\5\u0090I\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7\61\2\2\u0273\u027c\3"+
		"\2\2\2\u0274\u027c\58\35\2\u0275\u027c\5\\/\2\u0276\u0277\7,\2\2\u0277"+
		"\u0278\5\u0090I\2\u0278\u0279\7-\2\2\u0279\u027c\3\2\2\2\u027a\u027c\3"+
		"\2\2\2\u027b\u0257\3\2\2\2\u027b\u0258\3\2\2\2\u027b\u0259\3\2\2\2\u027b"+
		"\u025a\3\2\2\2\u027b\u025b\3\2\2\2\u027b\u025c\3\2\2\2\u027b\u025d\3\2"+
		"\2\2\u027b\u025e\3\2\2\2\u027b\u0269\3\2\2\2\u027b\u0274\3\2\2\2\u027b"+
		"\u0275\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u027a\3\2\2\2\u027c\u029a\3\2"+
		"\2\2\u027d\u027e\7)\2\2\u027e\u0281\7\60\2\2\u027f\u0282\5\\/\2\u0280"+
		"\u0282\5f\64\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0284\5V,\2\u0284\u028f\5\u0090I\2\u0285\u0288\7(\2\2\u0286"+
		"\u0289\5\\/\2\u0287\u0289\5f\64\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2"+
		"\2\2\u0289\u028a\3\2\2\2\u028a\u028b\5V,\2\u028b\u028c\5\u0090I\2\u028c"+
		"\u028e\3\2\2\2\u028d\u0285\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u0293\7\61\2\2\u0293\u0299\3\2\2\2\u0294\u0295\7)\2\2\u0295\u0299\5\\"+
		"/\2\u0296\u0297\7G\2\2\u0297\u0299\5\\/\2\u0298\u027d\3\2\2\2\u0298\u0294"+
		"\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029bo\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7\67\2\2"+
		"\u029e\u02a5\5p9\2\u029f\u02a0\7\64\2\2\u02a0\u02a5\5p9\2\u02a1\u02a2"+
		"\7H\2\2\u02a2\u02a5\5p9\2\u02a3\u02a5\5n8\2\u02a4\u029d\3\2\2\2\u02a4"+
		"\u029f\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5q\3\2\2\2"+
		"\u02a6\u02a7\t\2\2\2\u02a7\u02aa\5n8\2\u02a8\u02aa\5p9\2\u02a9\u02a6\3"+
		"\2\2\2\u02a9\u02a8\3\2\2\2\u02aas\3\2\2\2\u02ab\u02ac\5r:\2\u02acu\3\2"+
		"\2\2\u02ad\u02ae\7\64\2\2\u02ae\u02b8\5t;\2\u02af\u02b0\7\65\2\2\u02b0"+
		"\u02b8\5t;\2\u02b1\u02b2\7\66\2\2\u02b2\u02b8\5t;\2\u02b3\u02b4\7C\2\2"+
		"\u02b4\u02b8\5t;\2\u02b5\u02b6\7D\2\2\u02b6\u02b8\5t;\2\u02b7\u02ad\3"+
		"\2\2\2\u02b7\u02af\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8w\3\2\2\2\u02b9\u02bd\5t;\2\u02ba\u02bc\5v<\2\u02bb"+
		"\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02bey\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\62\2\2\u02c1\u02c7"+
		"\5x=\2\u02c2\u02c3\7\63\2\2\u02c3\u02c7\5x=\2\u02c4\u02c5\7E\2\2\u02c5"+
		"\u02c7\5x=\2\u02c6\u02c0\3\2\2\2\u02c6\u02c2\3\2\2\2\u02c6\u02c4\3\2\2"+
		"\2\u02c7{\3\2\2\2\u02c8\u02cc\5x=\2\u02c9\u02cb\5z>\2\u02ca\u02c9\3\2"+
		"\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"}\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d1\5|?\2\u02d0\u02d2\5\u0080A\2"+
		"\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\177\3\2\2\2\u02d3\u02d4"+
		"\7\60\2\2\u02d4\u02e4\5|?\2\u02d5\u02d6\7=\2\2\u02d6\u02e4\5|?\2\u02d7"+
		"\u02d8\7\61\2\2\u02d8\u02e4\5|?\2\u02d9\u02da\7<\2\2\u02da\u02e4\5|?\2"+
		"\u02db\u02dc\7B\2\2\u02dc\u02e4\5|?\2\u02dd\u02de\7A\2\2\u02de\u02e4\5"+
		"|?\2\u02df\u02e0\7>\2\2\u02e0\u02e4\5|?\2\u02e1\u02e2\7?\2\2\u02e2\u02e4"+
		"\5|?\2\u02e3\u02d3\3\2\2\2\u02e3\u02d5\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3"+
		"\u02d9\3\2\2\2\u02e3\u02db\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e3\u02df\3\2"+
		"\2\2\u02e3\u02e1\3\2\2\2\u02e4\u0081\3\2\2\2\u02e5\u02ea\5\\/\2\u02e6"+
		"\u02e7\7(\2\2\u02e7\u02e9\5\\/\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2"+
		"\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f9\3\2\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ed\u02ee\7,\2\2\u02ee\u02f3\5\\/\2\u02ef\u02f0\7(\2\2\u02f0"+
		"\u02f2\5\\/\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6"+
		"\u02f7\7-\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02e5\3\2\2\2\u02f8\u02ed\3\2"+
		"\2\2\u02f9\u0083\3\2\2\2\u02fa\u02fb\7;\2\2\u02fb\u02fc\5\u0082B\2\u02fc"+
		"\u02fd\7,\2\2\u02fd\u02fe\5\u008eH\2\u02fe\u02ff\7-\2\2\u02ff\u0307\3"+
		"\2\2\2\u0300\u0301\7\'\2\2\u0301\u0302\5\u0082B\2\u0302\u0303\7,\2\2\u0303"+
		"\u0304\5\u008cG\2\u0304\u0305\7-\2\2\u0305\u0307\3\2\2\2\u0306\u02fa\3"+
		"\2\2\2\u0306\u0300\3\2\2\2\u0307\u0085\3\2\2\2\u0308\u030b\5\u0084C\2"+
		"\u0309\u030b\5~@\2\u030a\u0308\3\2\2\2\u030a\u0309\3\2\2\2\u030b\u0087"+
		"\3\2\2\2\u030c\u0311\5\u0086D\2\u030d\u030e\78\2\2\u030e\u0310\5\u0086"+
		"D\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0089\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0319\5\u0088"+
		"E\2\u0315\u0316\79\2\2\u0316\u0318\5\u0088E\2\u0317\u0315\3\2\2\2\u0318"+
		"\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u008b\3\2"+
		"\2\2\u031b\u0319\3\2\2\2\u031c\u031d\5\u008aF\2\u031d\u031e\7:\2\2\u031e"+
		"\u031f\5\u008aF\2\u031f\u008d\3\2\2\2\u0320\u0325\5\u008aF\2\u0321\u0322"+
		"\7:\2\2\u0322\u0324\5\u008aF\2\u0323\u0321\3\2\2\2\u0324\u0327\3\2\2\2"+
		"\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u008f\3\2\2\2\u0327\u0325"+
		"\3\2\2\2\u0328\u0329\5\u008eH\2\u0329\u0091\3\2\2\2N\u0095\u0099\u009c"+
		"\u009f\u00a6\u00af\u00b5\u00b9\u00c0\u00c8\u00cd\u00d5\u00e4\u00f2\u00f9"+
		"\u010a\u0116\u0122\u012b\u012d\u0149\u0150\u015a\u0164\u016a\u016e\u0173"+
		"\u017f\u0188\u0192\u019c\u01a6\u01a9\u01b0\u01b7\u01ba\u01c2\u01ca\u01cd"+
		"\u01d2\u01ec\u01f1\u01f8\u01ff\u0206\u020d\u0212\u021d\u021f\u0224\u0228"+
		"\u0237\u0264\u026f\u027b\u0281\u0288\u028f\u0298\u029a\u02a4\u02a9\u02b7"+
		"\u02bd\u02c6\u02cc\u02d1\u02e3\u02ea\u02f3\u02f8\u0306\u030a\u0311\u0319"+
		"\u0325";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}