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
		RULE_char_str = 52, RULE_statement_at = 53, RULE_term_latter = 54, RULE_term_element_comma = 55, 
		RULE_term_set = 56, RULE_term_tuple = 57, RULE_term = 58, RULE_one_e = 59, 
		RULE_unary_e = 60, RULE_mse_0 = 61, RULE_mse_1_latter = 62, RULE_mse_1 = 63, 
		RULE_mse_latter = 64, RULE_mse = 65, RULE_condition_term = 66, RULE_condition_term_latter = 67, 
		RULE_id_list = 68, RULE_quan_e = 69, RULE_pro_term_e = 70, RULE_and_pro_e = 71, 
		RULE_or_pro_e = 72, RULE_imp_pro_e = 73, RULE_pro_e = 74, RULE_element = 75;
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
		"char_str", "statement_at", "term_latter", "term_element_comma", "term_set", 
		"term_tuple", "term", "one_e", "unary_e", "mse_0", "mse_1_latter", "mse_1", 
		"mse_latter", "mse", "condition_term", "condition_term_latter", "id_list", 
		"quan_e", "pro_term_e", "and_pro_e", "or_pro_e", "imp_pro_e", "pro_e", 
		"element"
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
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public Code_textContext code_text() {
			return getRuleContext(Code_textContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
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
			setState(152); match(MACHINE);
			setState(153); id();
			setState(155);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(154); includes();
				}
			}

			setState(162);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(157); match(ATTRIBUTE);
				setState(159);
				_la = _input.LA(1);
				if (_la==DEFINE) {
					{
					setState(158); defines();
					}
				}

				setState(161); cv_define();
				}
			}

			setState(165);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(164); code_text();
				}
			}

			setState(167); match(END);
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
		public Declare_operationsContext declare_operations() {
			return getRuleContext(Declare_operationsContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
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
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); operations();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); declare_operations();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); cdeclare_operations();
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
		public TerminalNode SUF(int i) {
			return getToken(BStarParser.SUF, i);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.R_ANGLE_BRACKET, i);
		}
		public List<TerminalNode> L_ANGLE_BRACKET() { return getTokens(BStarParser.L_ANGLE_BRACKET); }
		public TerminalNode L_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.L_ANGLE_BRACKET, i);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public List<TerminalNode> SUF() { return getTokens(BStarParser.SUF); }
		public List<TerminalNode> R_ANGLE_BRACKET() { return getTokens(BStarParser.R_ANGLE_BRACKET); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
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
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174); include();
				setState(181);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(175); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(176); match(L_ANGLE_BRACKET);
					setState(177); id();
					setState(178); match(SUF);
					setState(179); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); match(SEMICOLON);
				}
				}
				setState(187); 
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
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
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
			setState(189); match(ATTRIBUTE);
			setState(191);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(190); defines();
				}
			}

			setState(193); cv_define();
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
		public List<Single_cv_defineContext> single_cv_define() {
			return getRuleContexts(Single_cv_defineContext.class);
		}
		public Single_cv_defineContext single_cv_define(int i) {
			return getRuleContext(Single_cv_defineContext.class,i);
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
			setState(196); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195); single_cv_define();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
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
		public Cst_defineContext cst_define() {
			return getRuleContext(Cst_defineContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
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
			setState(206);
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
				setState(200); var_define();
				setState(201); match(SEMICOLON);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); cst_define();
				setState(204); match(SEMICOLON);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
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
			setState(211);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(208); match(MUL);
				setState(209); point_id();
				}
				break;
			case ID:
				{
				setState(210); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(215);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(213); match(ASSIGNMENT);
				setState(214); element();
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
		public List<Single_var_defineContext> single_var_define() {
			return getRuleContexts(Single_var_defineContext.class);
		}
		public TerminalNode TYPEDEF() { return getToken(BStarParser.TYPEDEF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Single_var_defineContext single_var_define(int i) {
			return getRuleContext(Single_var_defineContext.class,i);
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
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); type();
				setState(218); single_var_define();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219); match(COMMA);
					setState(220); single_var_define();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(TYPEDEF);
				setState(227); enum_type();
				setState(228); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); match(TYPEDEF);
				setState(231); type();
				setState(232); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234); match(TYPEDEF);
				setState(235); struct_type();
				setState(236); point_id();
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
		public TerminalNode CONST() { return getToken(BStarParser.CONST, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
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
			setState(240); match(CONST);
			setState(241); type();
			setState(242); point_id();
			setState(243); match(ASSIGNMENT);
			setState(244); element();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245); match(COMMA);
				setState(246); point_id();
				setState(247); match(ASSIGNMENT);
				setState(248); element();
				}
				}
				setState(254);
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
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Function_defineContext function_define(int i) {
			return getRuleContext(Function_defineContext.class,i);
		}
		public List<Function_defineContext> function_define() {
			return getRuleContexts(Function_defineContext.class);
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
			setState(255); match(OPERATIONS);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256); function_define();
				}
				}
				setState(259); 
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
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Com_statementContext com_statement() {
			return getRuleContext(Com_statementContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
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
			setState(261); type();
			setState(262); point_id();
			setState(263); match(L_BRACKET);
			setState(264); para_define_list();
			setState(265); match(R_BRACKET);
			setState(266); match(L_BRACE);
			setState(267); com_statement();
			setState(268); match(R_BRACE);
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
			setState(270); match(OPERATIONS);
			setState(271); declares();
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
		public Function_declareContext function_declare(int i) {
			return getRuleContext(Function_declareContext.class,i);
		}
		public List<Function_declareContext> function_declare() {
			return getRuleContexts(Function_declareContext.class);
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
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273); function_declare();
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

	public static class Function_declareContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(278); type();
			setState(279); point_id();
			setState(280); match(L_BRACKET);
			setState(281); para_define_list();
			setState(282); match(R_BRACKET);
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
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Cfunction_declareContext cfunction_declare(int i) {
			return getRuleContext(Cfunction_declareContext.class,i);
		}
		public List<Cfunction_declareContext> cfunction_declare() {
			return getRuleContexts(Cfunction_declareContext.class);
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
			setState(284); match(OPERATIONS);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285); cfunction_declare();
				}
				}
				setState(288); 
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
		public RobustContext robust() {
			return getRuleContext(RobustContext.class,0);
		}
		public Function_declareContext function_declare() {
			return getRuleContext(Function_declareContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(290); function_declare();
			setState(291); robust();
			setState(292); function();
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
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
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
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294); define();
				setState(295); id();
				setState(296); element();
				}
				}
				setState(300); 
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
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Normal_typeContext normal_type() {
			return getRuleContext(Normal_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
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
			setState(311);
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
				setState(302); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); id();
				setState(309);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(305); match(L_ANGLE_BRACKET);
					setState(306); type();
					setState(307); match(R_ANGLE_BRACKET);
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
		public TerminalNode PROPOSITION_TYPE() { return getToken(BStarParser.PROPOSITION_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(BStarParser.INT_TYPE, 0); }
		public List<TerminalNode> LONG_TYPE() { return getTokens(BStarParser.LONG_TYPE); }
		public TerminalNode FLOAT_TYPE() { return getToken(BStarParser.FLOAT_TYPE, 0); }
		public TerminalNode LONG_TYPE(int i) {
			return getToken(BStarParser.LONG_TYPE, i);
		}
		public TerminalNode CHAR_TYPE() { return getToken(BStarParser.CHAR_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(BStarParser.DOUBLE_TYPE, 0); }
		public TerminalNode VOID() { return getToken(BStarParser.VOID, 0); }
		public TerminalNode UNSIGNED() { return getToken(BStarParser.UNSIGNED, 0); }
		public TerminalNode STRING_TYPE() { return getToken(BStarParser.STRING_TYPE, 0); }
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
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); match(UNSIGNED);
				setState(315); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); match(UNSIGNED);
				setState(318); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320); match(UNSIGNED);
				setState(321); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322); match(LONG_TYPE);
				setState(323); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(324); match(UNSIGNED);
				setState(325); match(LONG_TYPE);
				setState(326); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(327); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(328); match(UNSIGNED);
				setState(329); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(330); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(331); match(UNSIGNED);
				setState(332); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(333); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(334); match(UNSIGNED);
				setState(335); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(336); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(337); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(338); match(VOID);
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
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode SET_TYPE() { return getToken(BStarParser.SET_TYPE, 0); }
		public At_strContext at_str() {
			return getRuleContext(At_strContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
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
			setState(341); match(SET_TYPE);
			setState(342); match(L_ANGLE_BRACKET);
			setState(343); type();
			setState(344); match(R_ANGLE_BRACKET);
			setState(346);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(345); at_str();
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
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public TerminalNode STRUCT() { return getToken(BStarParser.STRUCT, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
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
			setState(348); match(STRUCT);
			setState(349); match(L_BRACE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(350); type();
				setState(351); point_id();
				setState(352); match(SEMICOLON);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(R_BRACE);
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
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<Unary_eContext> unary_e() {
			return getRuleContexts(Unary_eContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public Unary_eContext unary_e(int i) {
			return getRuleContext(Unary_eContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(BStarParser.ENUM_TYPE, 0); }
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
			setState(361); match(ENUM_TYPE);
			setState(362); match(L_BRACE);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(363); id();
				setState(366);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(364); match(ASSIGNMENT);
					setState(365); unary_e();
					}
				}

				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(368); match(COMMA);
					setState(369); id();
					setState(372);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(370); match(ASSIGNMENT);
						setState(371); unary_e();
						}
					}

					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384); match(R_BRACE);
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
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
			setState(393);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); match(MUL);
				setState(387); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(389); match(L_BRACKET);
				setState(390); point_id();
				setState(391); match(R_BRACKET);
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public Addr_idContext addr_id() {
			return getRuleContext(Addr_idContext.class,0);
		}
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
			setState(402);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); match(ADDR);
				setState(396); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); match(L_BRACKET);
				setState(399); addr_id();
				setState(400); match(R_BRACKET);
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
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public TerminalNode ROBUST() { return getToken(BStarParser.ROBUST, 0); }
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
		}
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
			setState(404); match(ROBUST);
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405); match(PRECONDITION);
				setState(406); pro_e();
				setState(407); match(POSTCONDITION);
				setState(408); pro_e();
				}
				}
				setState(412); 
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
		public TerminalNode FUNCTION() { return getToken(BStarParser.FUNCTION, 0); }
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
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
			setState(414); match(FUNCTION);
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(415); match(PRECONDITION);
				setState(416); pro_e();
				setState(417); match(POSTCONDITION);
				setState(418); pro_e();
				}
				}
				setState(422); 
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
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
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
			setState(435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(424); type();
				setState(425); point_id();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(426); match(COMMA);
					setState(427); type();
					setState(428); point_id();
					}
					}
					setState(434);
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_value_listContext para_value_list() {
			return getRuleContext(Para_value_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(437); id();
			setState(438); match(L_BRACKET);
			setState(439); para_value_list();
			setState(440); match(R_BRACKET);
			setState(442);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(441); append_paras();
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
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
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
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(444); element();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(445); match(COMMA);
					setState(446); element();
					}
					}
					setState(451);
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
		public List<TerminalNode> AT() { return getTokens(BStarParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(BStarParser.AT, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
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
			setState(454); match(AT);
			setState(455); id();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(456); match(COMMA);
				setState(457); id();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463); match(AT);
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
			setState(465); cv_define();
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
		public Attributes_2Context attributes_2() {
			return getRuleContext(Attributes_2Context.class,0);
		}
		public InvariantContext invariant() {
			return getRuleContext(InvariantContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(467); attributes_2();
				}
				break;
			}
			setState(471);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(470); invariant();
				}
			}

			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				{
				setState(473); statement();
				}
				}
				setState(478);
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
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode INVARIANT() { return getToken(BStarParser.INVARIANT, 0); }
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
			setState(479); match(INVARIANT);
			setState(480); pro_e();
			setState(481); match(SEMICOLON);
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
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Statement_atContext statement_at() {
			return getRuleContext(Statement_atContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Element_takeContext element_take() {
			return getRuleContext(Element_takeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
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
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484); assign_stat();
				setState(485); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487); element_take();
				setState(488); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490); function_call();
				setState(491); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(493); return_stat();
				setState(494); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(496); while_stat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(497); if_stat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(498); match(L_BRACE);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					{
					setState(499); statement();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505); match(R_BRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(506); statement_at();
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
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
			setState(509); id();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(510); match(POINT);
					setState(511); id();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(540);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(517); point();
				setState(518); match(L_ANGLE_BRACKET);
				setState(521);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(519); id();
					}
					break;
				case INTEGER:
					{
					setState(520); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(523); belong();
				setState(524); element();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(525); match(COMMA);
					setState(528);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(526); id();
						}
						break;
					case INTEGER:
						{
						setState(527); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(530); belong();
					setState(531); element();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538); match(R_ANGLE_BRACKET);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public List<TerminalNode> ADDRGET() { return getTokens(BStarParser.ADDRGET); }
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
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542); point_id();
				setState(543); match(ASSIGNMENT);
				setState(544); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546); point_id();
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(551);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(547); match(POINT);
						setState(548); id();
						}
						break;
					case ADDRGET:
						{
						setState(549); match(ADDRGET);
						setState(550); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(553); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(555); match(ASSIGNMENT);
				setState(556); element();
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
		public TerminalNode RETURN() { return getToken(BStarParser.RETURN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
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
			setState(560); match(RETURN);
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(561); element();
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BStarParser.WHILE, 0); }
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
			setState(564); match(WHILE);
			setState(565); match(L_BRACKET);
			setState(566); pro_e();
			setState(567); match(R_BRACKET);
			setState(568); statement();
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode ELSE() { return getToken(BStarParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(BStarParser.IF, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(570); match(IF);
			setState(571); match(L_BRACKET);
			setState(572); pro_e();
			setState(573); match(R_BRACKET);
			setState(574); statement();
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(575); match(ELSE);
				setState(576); statement();
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
			setState(579); match(DEFINE);
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
			setState(581); match(INCLUDE);
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
			setState(583); match(POINT);
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
			setState(585); match(BELONG);
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
			setState(587); match(ADDRGET);
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
			setState(589); match(NIL);
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
			setState(591); match(ID);
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
			setState(593); match(STRING);
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
			setState(597); match(TRUE);
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
			setState(599); match(FALSE);
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
			setState(601); match(INTEGER);
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
			setState(603); match(REAL);
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
			setState(605); match(CHAR);
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
			setState(607); match(AT_STR);
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

	public static class Term_latterContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public TerminalNode POINT() { return getToken(BStarParser.POINT, 0); }
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
		public TerminalNode ADDRGET() { return getToken(BStarParser.ADDRGET, 0); }
		public Term_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_latterContext term_latter() throws RecognitionException {
		Term_latterContext _localctx = new Term_latterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term_latter);
		int _la;
		try {
			setState(636);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609); match(POINT);
				setState(610); match(L_ANGLE_BRACKET);
				setState(613);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(611); id();
					}
					break;
				case INTEGER:
					{
					setState(612); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(615); belong();
				setState(616); element();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(617); match(COMMA);
					setState(620);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(618); id();
						}
						break;
					case INTEGER:
						{
						setState(619); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(622); belong();
					setState(623); element();
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630); match(R_ANGLE_BRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632); match(POINT);
				setState(633); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634); match(ADDRGET);
				setState(635); id();
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

	public static class Term_element_commaContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BStarParser.COMMA, 0); }
		public Term_element_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_element_comma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_element_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_element_commaContext term_element_comma() throws RecognitionException {
		Term_element_commaContext _localctx = new Term_element_commaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_term_element_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); match(COMMA);
			setState(639); element();
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

	public static class Term_setContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Term_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_setContext term_set() throws RecognitionException {
		Term_setContext _localctx = new Term_setContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_term_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); match(L_BRACE);
			setState(642); element();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(643); match(COMMA);
				setState(644); element();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650); match(R_BRACE);
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

	public static class Term_tupleContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Term_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_tupleContext term_tuple() throws RecognitionException {
		Term_tupleContext _localctx = new Term_tupleContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_term_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); match(L_ANGLE_BRACKET);
			setState(653); element();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654); match(COMMA);
				setState(655); element();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661); match(R_ANGLE_BRACKET);
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
		public Term_latterContext term_latter(int i) {
			return getRuleContext(Term_latterContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public True_strContext true_str() {
			return getRuleContext(True_strContext.class,0);
		}
		public Term_setContext term_set() {
			return getRuleContext(Term_setContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Char_strContext char_str() {
			return getRuleContext(Char_strContext.class,0);
		}
		public False_strContext false_str() {
			return getRuleContext(False_strContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public List<Term_latterContext> term_latter() {
			return getRuleContexts(Term_latterContext.class);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public Term_tupleContext term_tuple() {
			return getRuleContext(Term_tupleContext.class,0);
		}
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
		enterRule(_localctx, 116, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(663); nil();
				}
				break;

			case 2:
				{
				setState(664); string();
				}
				break;

			case 3:
				{
				setState(665); true_str();
				}
				break;

			case 4:
				{
				setState(666); false_str();
				}
				break;

			case 5:
				{
				setState(667); integer();
				}
				break;

			case 6:
				{
				setState(668); real();
				}
				break;

			case 7:
				{
				setState(669); char_str();
				}
				break;

			case 8:
				{
				setState(670); term_set();
				}
				break;

			case 9:
				{
				setState(671); term_tuple();
				}
				break;

			case 10:
				{
				setState(672); function_call();
				}
				break;

			case 11:
				{
				setState(673); id();
				}
				break;

			case 12:
				{
				setState(674); match(L_BRACKET);
				setState(675); element();
				setState(676); match(R_BRACKET);
				}
				break;

			case 13:
				{
				}
				break;
			}
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==ADDRGET) {
				{
				{
				setState(681); term_latter();
				}
				}
				setState(686);
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
		public TerminalNode NOT() { return getToken(BStarParser.NOT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public One_eContext one_e() {
			return getRuleContext(One_eContext.class,0);
		}
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
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
		enterRule(_localctx, 118, RULE_one_e);
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687); match(NOT);
				setState(688); one_e();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689); match(MUL);
				setState(690); one_e();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691); match(ADDR);
				setState(692); one_e();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693); term();
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
		enterRule(_localctx, 120, RULE_unary_e);
		int _la;
		try {
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(697); term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); one_e();
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
		enterRule(_localctx, 122, RULE_mse_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); unary_e();
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
		public TerminalNode INTER() { return getToken(BStarParser.INTER, 0); }
		public TerminalNode MOD() { return getToken(BStarParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(BStarParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
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
		enterRule(_localctx, 124, RULE_mse_1_latter);
		try {
			setState(713);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(703); match(MUL);
				setState(704); mse_0();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); match(DIV);
				setState(706); mse_0();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(707); match(MOD);
				setState(708); mse_0();
				}
				break;
			case INTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(709); match(INTER);
				setState(710); mse_0();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(711); match(UNION);
				setState(712); mse_0();
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
		public List<Mse_1_latterContext> mse_1_latter() {
			return getRuleContexts(Mse_1_latterContext.class);
		}
		public Mse_1_latterContext mse_1_latter(int i) {
			return getRuleContext(Mse_1_latterContext.class,i);
		}
		public Mse_0Context mse_0() {
			return getRuleContext(Mse_0Context.class,0);
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
		enterRule(_localctx, 126, RULE_mse_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); mse_0();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (MUL - 50)) | (1L << (DIV - 50)) | (1L << (MOD - 50)) | (1L << (INTER - 50)) | (1L << (UNION - 50)))) != 0)) {
				{
				{
				setState(716); mse_1_latter();
				}
				}
				setState(721);
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
		public TerminalNode SUB() { return getToken(BStarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(BStarParser.ADD, 0); }
		public TerminalNode DIFFER() { return getToken(BStarParser.DIFFER, 0); }
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
		}
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
		enterRule(_localctx, 128, RULE_mse_latter);
		try {
			setState(728);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(722); match(ADD);
				setState(723); mse_1();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); match(SUB);
				setState(725); mse_1();
				}
				break;
			case DIFFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(726); match(DIFFER);
				setState(727); mse_1();
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
		public List<Mse_latterContext> mse_latter() {
			return getRuleContexts(Mse_latterContext.class);
		}
		public Mse_latterContext mse_latter(int i) {
			return getRuleContext(Mse_latterContext.class,i);
		}
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
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
		enterRule(_localctx, 130, RULE_mse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); mse_1();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (ADD - 48)) | (1L << (SUB - 48)) | (1L << (DIFFER - 48)))) != 0)) {
				{
				{
				setState(731); mse_latter();
				}
				}
				setState(736);
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
		enterRule(_localctx, 132, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); mse();
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(738); condition_term_latter();
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
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public TerminalNode EGRE() { return getToken(BStarParser.EGRE, 0); }
		public TerminalNode UEQU() { return getToken(BStarParser.UEQU, 0); }
		public TerminalNode NOTBELONG() { return getToken(BStarParser.NOTBELONG, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode ELES() { return getToken(BStarParser.ELES, 0); }
		public TerminalNode EQU() { return getToken(BStarParser.EQU, 0); }
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
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
		enterRule(_localctx, 134, RULE_condition_term_latter);
		try {
			setState(757);
			switch (_input.LA(1)) {
			case L_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(741); match(L_ANGLE_BRACKET);
				setState(742); mse();
				}
				break;
			case ELES:
				enterOuterAlt(_localctx, 2);
				{
				setState(743); match(ELES);
				setState(744); mse();
				}
				break;
			case R_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(745); match(R_ANGLE_BRACKET);
				setState(746); mse();
				}
				break;
			case EGRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(747); match(EGRE);
				setState(748); mse();
				}
				break;
			case NOTBELONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(749); match(NOTBELONG);
				setState(750); mse();
				}
				break;
			case BELONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(751); match(BELONG);
				setState(752); mse();
				}
				break;
			case EQU:
				enterOuterAlt(_localctx, 7);
				{
				setState(753); match(EQU);
				setState(754); mse();
				}
				break;
			case UEQU:
				enterOuterAlt(_localctx, 8);
				{
				setState(755); match(UEQU);
				setState(756); mse();
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
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
		enterRule(_localctx, 136, RULE_id_list);
		int _la;
		try {
			setState(778);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(759); id();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(760); match(COMMA);
					setState(761); id();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); match(L_BRACKET);
				setState(768); id();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(769); match(COMMA);
					setState(770); id();
					}
					}
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(776); match(R_BRACKET);
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(BStarParser.EXIST, 0); }
		public TerminalNode FORALL() { return getToken(BStarParser.FORALL, 0); }
		public Imp_pro_eContext imp_pro_e() {
			return getRuleContext(Imp_pro_eContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_quan_e);
		try {
			setState(792);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(780); match(EXIST);
				setState(781); id_list();
				setState(782); match(L_BRACKET);
				setState(783); pro_e();
				setState(784); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(786); match(FORALL);
				setState(787); id_list();
				setState(788); match(L_BRACKET);
				setState(789); imp_pro_e();
				setState(790); match(R_BRACKET);
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
		public Condition_termContext condition_term() {
			return getRuleContext(Condition_termContext.class,0);
		}
		public Quan_eContext quan_e() {
			return getRuleContext(Quan_eContext.class,0);
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
		enterRule(_localctx, 140, RULE_pro_term_e);
		try {
			setState(796);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(794); quan_e();
				}
				break;
			case EOF:
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
				setState(795); condition_term();
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
		public TerminalNode CONJUNCTION(int i) {
			return getToken(BStarParser.CONJUNCTION, i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(BStarParser.CONJUNCTION); }
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
		enterRule(_localctx, 142, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); pro_term_e();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(799); match(CONJUNCTION);
				setState(800); pro_term_e();
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

	public static class Or_pro_eContext extends ParserRuleContext {
		public List<TerminalNode> DISJUNCTION() { return getTokens(BStarParser.DISJUNCTION); }
		public List<And_pro_eContext> and_pro_e() {
			return getRuleContexts(And_pro_eContext.class);
		}
		public TerminalNode DISJUNCTION(int i) {
			return getToken(BStarParser.DISJUNCTION, i);
		}
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
		enterRule(_localctx, 144, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); and_pro_e();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(807); match(DISJUNCTION);
				setState(808); and_pro_e();
				}
				}
				setState(813);
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
		public TerminalNode IMPLICATION() { return getToken(BStarParser.IMPLICATION, 0); }
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
		}
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
		enterRule(_localctx, 146, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); or_pro_e();
			setState(815); match(IMPLICATION);
			setState(816); or_pro_e();
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
		public TerminalNode IMPLICATION(int i) {
			return getToken(BStarParser.IMPLICATION, i);
		}
		public List<TerminalNode> IMPLICATION() { return getTokens(BStarParser.IMPLICATION); }
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
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
		enterRule(_localctx, 148, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); or_pro_e();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(819); match(IMPLICATION);
				setState(820); or_pro_e();
				}
				}
				setState(825);
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
		enterRule(_localctx, 150, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); pro_e();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3Q\u033f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\5\2\u009e\n\2\3\2\3\2\5\2\u00a2"+
		"\n\2\3\2\5\2\u00a5\n\2\3\2\5\2\u00a8\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u00af"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b8\n\4\3\4\3\4\6\4\u00bc\n\4\r"+
		"\4\16\4\u00bd\3\5\3\5\5\5\u00c2\n\5\3\5\3\5\3\6\6\6\u00c7\n\6\r\6\16\6"+
		"\u00c8\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d1\n\7\3\b\3\b\3\b\5\b\u00d6\n\b"+
		"\3\b\3\b\5\b\u00da\n\b\3\t\3\t\3\t\3\t\7\t\u00e0\n\t\f\t\16\t\u00e3\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f1\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fd\n\n\f\n\16\n\u0100\13\n\3"+
		"\13\3\13\6\13\u0104\n\13\r\13\16\13\u0105\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\6\16\u0115\n\16\r\16\16\16\u0116\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\6\20\u0121\n\20\r\20\16\20\u0122\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u012d\n\22\r\22\16\22\u012e\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0138\n\23\5\23\u013a\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0156\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u015d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0165\n\26\f\26\16\26\u0168\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0171\n\27\3\27\3\27\3\27\3\27\5\27\u0177\n\27\7\27\u0179\n\27\f"+
		"\27\16\27\u017c\13\27\7\27\u017e\n\27\f\27\16\27\u0181\13\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u018c\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0195\n\31\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u019d"+
		"\n\32\r\32\16\32\u019e\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01a7\n\33\r"+
		"\33\16\33\u01a8\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01b1\n\34\f\34\16"+
		"\34\u01b4\13\34\5\34\u01b6\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u01bd\n"+
		"\35\3\36\3\36\3\36\7\36\u01c2\n\36\f\36\16\36\u01c5\13\36\5\36\u01c7\n"+
		"\36\3\37\3\37\3\37\3\37\7\37\u01cd\n\37\f\37\16\37\u01d0\13\37\3\37\3"+
		"\37\3 \3 \3!\5!\u01d7\n!\3!\5!\u01da\n!\3!\7!\u01dd\n!\f!\16!\u01e0\13"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7"+
		"#\u01f7\n#\f#\16#\u01fa\13#\3#\3#\5#\u01fe\n#\3$\3$\3$\7$\u0203\n$\f$"+
		"\16$\u0206\13$\3$\3$\3$\3$\5$\u020c\n$\3$\3$\3$\3$\3$\5$\u0213\n$\3$\3"+
		"$\3$\7$\u0218\n$\f$\16$\u021b\13$\3$\3$\5$\u021f\n$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\6%\u022a\n%\r%\16%\u022b\3%\3%\3%\5%\u0231\n%\3&\3&\5&\u0235"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u0244\n(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\58\u0268\n8\3"+
		"8\38\38\38\38\58\u026f\n8\38\38\38\78\u0274\n8\f8\168\u0277\138\38\38"+
		"\38\38\38\38\58\u027f\n8\39\39\39\3:\3:\3:\3:\7:\u0288\n:\f:\16:\u028b"+
		"\13:\3:\3:\3;\3;\3;\3;\7;\u0293\n;\f;\16;\u0296\13;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02aa\n<\3<\7<\u02ad\n<\f<\16"+
		"<\u02b0\13<\3=\3=\3=\3=\3=\3=\3=\5=\u02b9\n=\3>\3>\3>\5>\u02be\n>\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02cc\n@\3A\3A\7A\u02d0\nA\fA\16A\u02d3"+
		"\13A\3B\3B\3B\3B\3B\3B\5B\u02db\nB\3C\3C\7C\u02df\nC\fC\16C\u02e2\13C"+
		"\3D\3D\5D\u02e6\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E"+
		"\u02f8\nE\3F\3F\3F\7F\u02fd\nF\fF\16F\u0300\13F\3F\3F\3F\3F\7F\u0306\n"+
		"F\fF\16F\u0309\13F\3F\3F\5F\u030d\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\5G\u031b\nG\3H\3H\5H\u031f\nH\3I\3I\3I\7I\u0324\nI\fI\16I\u0327\13"+
		"I\3J\3J\3J\7J\u032c\nJ\fJ\16J\u032f\13J\3K\3K\3K\3K\3L\3L\3L\7L\u0338"+
		"\nL\fL\16L\u033b\13L\3M\3M\3M\2N\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\3"+
		"\3\2\62\63\u0373\2\u009a\3\2\2\2\4\u00ae\3\2\2\2\6\u00bb\3\2\2\2\b\u00bf"+
		"\3\2\2\2\n\u00c6\3\2\2\2\f\u00d0\3\2\2\2\16\u00d5\3\2\2\2\20\u00f0\3\2"+
		"\2\2\22\u00f2\3\2\2\2\24\u0101\3\2\2\2\26\u0107\3\2\2\2\30\u0110\3\2\2"+
		"\2\32\u0114\3\2\2\2\34\u0118\3\2\2\2\36\u011e\3\2\2\2 \u0124\3\2\2\2\""+
		"\u012c\3\2\2\2$\u0139\3\2\2\2&\u0155\3\2\2\2(\u0157\3\2\2\2*\u015e\3\2"+
		"\2\2,\u016b\3\2\2\2.\u018b\3\2\2\2\60\u0194\3\2\2\2\62\u0196\3\2\2\2\64"+
		"\u01a0\3\2\2\2\66\u01b5\3\2\2\28\u01b7\3\2\2\2:\u01c6\3\2\2\2<\u01c8\3"+
		"\2\2\2>\u01d3\3\2\2\2@\u01d6\3\2\2\2B\u01e1\3\2\2\2D\u01fd\3\2\2\2F\u01ff"+
		"\3\2\2\2H\u0230\3\2\2\2J\u0232\3\2\2\2L\u0236\3\2\2\2N\u023c\3\2\2\2P"+
		"\u0245\3\2\2\2R\u0247\3\2\2\2T\u0249\3\2\2\2V\u024b\3\2\2\2X\u024d\3\2"+
		"\2\2Z\u024f\3\2\2\2\\\u0251\3\2\2\2^\u0253\3\2\2\2`\u0255\3\2\2\2b\u0257"+
		"\3\2\2\2d\u0259\3\2\2\2f\u025b\3\2\2\2h\u025d\3\2\2\2j\u025f\3\2\2\2l"+
		"\u0261\3\2\2\2n\u027e\3\2\2\2p\u0280\3\2\2\2r\u0283\3\2\2\2t\u028e\3\2"+
		"\2\2v\u02a9\3\2\2\2x\u02b8\3\2\2\2z\u02bd\3\2\2\2|\u02bf\3\2\2\2~\u02cb"+
		"\3\2\2\2\u0080\u02cd\3\2\2\2\u0082\u02da\3\2\2\2\u0084\u02dc\3\2\2\2\u0086"+
		"\u02e3\3\2\2\2\u0088\u02f7\3\2\2\2\u008a\u030c\3\2\2\2\u008c\u031a\3\2"+
		"\2\2\u008e\u031e\3\2\2\2\u0090\u0320\3\2\2\2\u0092\u0328\3\2\2\2\u0094"+
		"\u0330\3\2\2\2\u0096\u0334\3\2\2\2\u0098\u033c\3\2\2\2\u009a\u009b\7\3"+
		"\2\2\u009b\u009d\5\\/\2\u009c\u009e\5\6\4\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a4\3\2\2\2\u009f\u00a1\7\5\2\2\u00a0\u00a2\5\""+
		"\22\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\5\n\6\2\u00a4\u009f\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a8\5\4\3\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\7\2\2\u00aa\3\3\2\2\2\u00ab\u00af\5\24\13"+
		"\2\u00ac\u00af\5\30\r\2\u00ad\u00af\5\36\20\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\5\3\2\2\2\u00b0\u00b7\5R*\2\u00b1"+
		"\u00b8\5^\60\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\5\\/\2\u00b4\u00b5\7%"+
		"\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b0\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\7\3\2\2\2\u00bf\u00c1\7\5\2\2\u00c0\u00c2\5\"\22"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\5\n\6\2\u00c4\t\3\2\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\13\3\2\2"+
		"\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\7+\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce"+
		"\5\22\n\2\u00ce\u00cf\7+\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1\r\3\2\2\2\u00d2\u00d3\7\64\2\2\u00d3\u00d6\5.\30"+
		"\2\u00d4\u00d6\5\\/\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d8\7F\2\2\u00d8\u00da\5\u0098M\2\u00d9\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\17\3\2\2\2\u00db\u00dc\5$\23\2\u00dc\u00e1"+
		"\5\16\b\2\u00dd\u00de\7(\2\2\u00de\u00e0\5\16\b\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00f1"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\5,\27\2\u00e6"+
		"\u00e7\5\\/\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9\u00ea\5$\23"+
		"\2\u00ea\u00eb\5.\30\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed\u00ee"+
		"\5*\26\2\u00ee\u00ef\5.\30\2\u00ef\u00f1\3\2\2\2\u00f0\u00db\3\2\2\2\u00f0"+
		"\u00e4\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\21\3\2\2"+
		"\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\5.\30\2\u00f5"+
		"\u00f6\7F\2\2\u00f6\u00fe\5\u0098M\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\5"+
		".\30\2\u00f9\u00fa\7F\2\2\u00fa\u00fb\5\u0098M\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\23\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\7\6\2\2\u0102\u0104"+
		"\5\26\f\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\25\3\2\2\2\u0107\u0108\5$\23\2\u0108\u0109"+
		"\5.\30\2\u0109\u010a\7,\2\2\u010a\u010b\5\66\34\2\u010b\u010c\7-\2\2\u010c"+
		"\u010d\7.\2\2\u010d\u010e\5@!\2\u010e\u010f\7/\2\2\u010f\27\3\2\2\2\u0110"+
		"\u0111\7\6\2\2\u0111\u0112\5\32\16\2\u0112\31\3\2\2\2\u0113\u0115\5\34"+
		"\17\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\33\3\2\2\2\u0118\u0119\5$\23\2\u0119\u011a\5.\30"+
		"\2\u011a\u011b\7,\2\2\u011b\u011c\5\66\34\2\u011c\u011d\7-\2\2\u011d\35"+
		"\3\2\2\2\u011e\u0120\7\6\2\2\u011f\u0121\5 \21\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\37\3\2\2"+
		"\2\u0124\u0125\5\34\17\2\u0125\u0126\5\62\32\2\u0126\u0127\5\64\33\2\u0127"+
		"!\3\2\2\2\u0128\u0129\5P)\2\u0129\u012a\5\\/\2\u012a\u012b\5\u0098M\2"+
		"\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f#\3\2\2\2\u0130\u013a\5&\24\2\u0131"+
		"\u013a\5(\25\2\u0132\u0137\5\\/\2\u0133\u0134\7\60\2\2\u0134\u0135\5$"+
		"\23\2\u0135\u0136\7\61\2\2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0130\3\2\2\2\u0139\u0131\3\2"+
		"\2\2\u0139\u0132\3\2\2\2\u013a%\3\2\2\2\u013b\u0156\7\r\2\2\u013c\u013d"+
		"\7\32\2\2\u013d\u0156\7\r\2\2\u013e\u0156\7\16\2\2\u013f\u0140\7\32\2"+
		"\2\u0140\u0156\7\16\2\2\u0141\u0156\7\17\2\2\u0142\u0143\7\32\2\2\u0143"+
		"\u0156\7\17\2\2\u0144\u0145\7\17\2\2\u0145\u0156\7\17\2\2\u0146\u0147"+
		"\7\32\2\2\u0147\u0148\7\17\2\2\u0148\u0156\7\17\2\2\u0149\u0156\7\22\2"+
		"\2\u014a\u014b\7\32\2\2\u014b\u0156\7\22\2\2\u014c\u0156\7\20\2\2\u014d"+
		"\u014e\7\32\2\2\u014e\u0156\7\20\2\2\u014f\u0156\7\21\2\2\u0150\u0151"+
		"\7\32\2\2\u0151\u0156\7\21\2\2\u0152\u0156\7\23\2\2\u0153\u0156\7\24\2"+
		"\2\u0154\u0156\7\37\2\2\u0155\u013b\3\2\2\2\u0155\u013c\3\2\2\2\u0155"+
		"\u013e\3\2\2\2\u0155\u013f\3\2\2\2\u0155\u0141\3\2\2\2\u0155\u0142\3\2"+
		"\2\2\u0155\u0144\3\2\2\2\u0155\u0146\3\2\2\2\u0155\u0149\3\2\2\2\u0155"+
		"\u014a\3\2\2\2\u0155\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014f\3\2"+
		"\2\2\u0155\u0150\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\'\3\2\2\2\u0157\u0158\7\25\2\2\u0158\u0159\7\60\2"+
		"\2\u0159\u015a\5$\23\2\u015a\u015c\7\61\2\2\u015b\u015d\5`\61\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d)\3\2\2\2\u015e\u015f\7\36\2\2"+
		"\u015f\u0166\7.\2\2\u0160\u0161\5$\23\2\u0161\u0162\5.\30\2\u0162\u0163"+
		"\7+\2\2\u0163\u0165\3\2\2\2\u0164\u0160\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\7/\2\2\u016a+\3\2\2\2\u016b\u016c\7\30\2\2\u016c\u017f"+
		"\7.\2\2\u016d\u0170\5\\/\2\u016e\u016f\7F\2\2\u016f\u0171\5z>\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u017a\3\2\2\2\u0172\u0173\7("+
		"\2\2\u0173\u0176\5\\/\2\u0174\u0175\7F\2\2\u0175\u0177\5z>\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0172\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u016d\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0183\7/\2\2\u0183-\3\2\2\2\u0184\u0185\7\64\2\2\u0185\u018c"+
		"\5.\30\2\u0186\u018c\5\\/\2\u0187\u0188\7,\2\2\u0188\u0189\5.\30\2\u0189"+
		"\u018a\7-\2\2\u018a\u018c\3\2\2\2\u018b\u0184\3\2\2\2\u018b\u0186\3\2"+
		"\2\2\u018b\u0187\3\2\2\2\u018c/\3\2\2\2\u018d\u018e\7H\2\2\u018e\u0195"+
		"\5\60\31\2\u018f\u0195\5\\/\2\u0190\u0191\7,\2\2\u0191\u0192\5\60\31\2"+
		"\u0192\u0193\7-\2\2\u0193\u0195\3\2\2\2\u0194\u018d\3\2\2\2\u0194\u018f"+
		"\3\2\2\2\u0194\u0190\3\2\2\2\u0195\61\3\2\2\2\u0196\u019c\7\n\2\2\u0197"+
		"\u0198\7\13\2\2\u0198\u0199\5\u0096L\2\u0199\u019a\7\f\2\2\u019a\u019b"+
		"\5\u0096L\2\u019b\u019d\3\2\2\2\u019c\u0197\3\2\2\2\u019d\u019e\3\2\2"+
		"\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\63\3\2\2\2\u01a0\u01a6"+
		"\7\t\2\2\u01a1\u01a2\7\13\2\2\u01a2\u01a3\5\u0096L\2\u01a3\u01a4\7\f\2"+
		"\2\u01a4\u01a5\5\u0096L\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\65\3\2\2"+
		"\2\u01aa\u01ab\5$\23\2\u01ab\u01b2\5.\30\2\u01ac\u01ad\7(\2\2\u01ad\u01ae"+
		"\5$\23\2\u01ae\u01af\5.\30\2\u01af\u01b1\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01aa\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\67\3\2\2\2\u01b7\u01b8\5\\/\2\u01b8\u01b9\7,\2\2\u01b9\u01ba\5:\36\2"+
		"\u01ba\u01bc\7-\2\2\u01bb\u01bd\5<\37\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd9\3\2\2\2\u01be\u01c3\5\u0098M\2\u01bf\u01c0\7(\2\2\u01c0"+
		"\u01c2\5\u0098M\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01be\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7;\3\2\2\2\u01c8\u01c9\7*\2\2\u01c9"+
		"\u01ce\5\\/\2\u01ca\u01cb\7(\2\2\u01cb\u01cd\5\\/\2\u01cc\u01ca\3\2\2"+
		"\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7*\2\2\u01d2=\3\2\2\2\u01d3\u01d4"+
		"\5\n\6\2\u01d4?\3\2\2\2\u01d5\u01d7\5> \2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5B\"\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\5D#\2\u01dc\u01db\3\2\2"+
		"\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfA"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7\4\2\2\u01e2\u01e3\5\u0096L"+
		"\2\u01e3\u01e4\7+\2\2\u01e4C\3\2\2\2\u01e5\u01fe\7+\2\2\u01e6\u01e7\5"+
		"H%\2\u01e7\u01e8\7+\2\2\u01e8\u01fe\3\2\2\2\u01e9\u01ea\5F$\2\u01ea\u01eb"+
		"\7+\2\2\u01eb\u01fe\3\2\2\2\u01ec\u01ed\58\35\2\u01ed\u01ee\7+\2\2\u01ee"+
		"\u01fe\3\2\2\2\u01ef\u01f0\5J&\2\u01f0\u01f1\7+\2\2\u01f1\u01fe\3\2\2"+
		"\2\u01f2\u01fe\5L\'\2\u01f3\u01fe\5N(\2\u01f4\u01f8\7.\2\2\u01f5\u01f7"+
		"\5D#\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\7/"+
		"\2\2\u01fc\u01fe\5l\67\2\u01fd\u01e5\3\2\2\2\u01fd\u01e6\3\2\2\2\u01fd"+
		"\u01e9\3\2\2\2\u01fd\u01ec\3\2\2\2\u01fd\u01ef\3\2\2\2\u01fd\u01f2\3\2"+
		"\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"E\3\2\2\2\u01ff\u0204\5\\/\2\u0200\u0201\7)\2\2\u0201\u0203\5\\/\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u021e\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\5T+\2\u0208\u020b"+
		"\7\60\2\2\u0209\u020c\5\\/\2\u020a\u020c\5f\64\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5V,\2\u020e\u0219\5\u0098"+
		"M\2\u020f\u0212\7(\2\2\u0210\u0213\5\\/\2\u0211\u0213\5f\64\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5V,\2\u0215"+
		"\u0216\5\u0098M\2\u0216\u0218\3\2\2\2\u0217\u020f\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7\61\2\2\u021d\u021f\3\2\2\2\u021e\u0207\3"+
		"\2\2\2\u021e\u021f\3\2\2\2\u021fG\3\2\2\2\u0220\u0221\5.\30\2\u0221\u0222"+
		"\7F\2\2\u0222\u0223\5\u0098M\2\u0223\u0231\3\2\2\2\u0224\u0229\5.\30\2"+
		"\u0225\u0226\7)\2\2\u0226\u022a\5\\/\2\u0227\u0228\7G\2\2\u0228\u022a"+
		"\5\\/\2\u0229\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7F"+
		"\2\2\u022e\u022f\5\u0098M\2\u022f\u0231\3\2\2\2\u0230\u0220\3\2\2\2\u0230"+
		"\u0224\3\2\2\2\u0231I\3\2\2\2\u0232\u0234\7 \2\2\u0233\u0235\5\u0098M"+
		"\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235K\3\2\2\2\u0236\u0237"+
		"\7#\2\2\u0237\u0238\7,\2\2\u0238\u0239\5\u0096L\2\u0239\u023a\7-\2\2\u023a"+
		"\u023b\5D#\2\u023bM\3\2\2\2\u023c\u023d\7!\2\2\u023d\u023e\7,\2\2\u023e"+
		"\u023f\5\u0096L\2\u023f\u0240\7-\2\2\u0240\u0243\5D#\2\u0241\u0242\7\""+
		"\2\2\u0242\u0244\5D#\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244O"+
		"\3\2\2\2\u0245\u0246\7&\2\2\u0246Q\3\2\2\2\u0247\u0248\7\b\2\2\u0248S"+
		"\3\2\2\2\u0249\u024a\7)\2\2\u024aU\3\2\2\2\u024b\u024c\7A\2\2\u024cW\3"+
		"\2\2\2\u024d\u024e\7G\2\2\u024eY\3\2\2\2\u024f\u0250\7\35\2\2\u0250[\3"+
		"\2\2\2\u0251\u0252\7N\2\2\u0252]\3\2\2\2\u0253\u0254\7J\2\2\u0254_\3\2"+
		"\2\2\u0255\u0256\7K\2\2\u0256a\3\2\2\2\u0257\u0258\7\33\2\2\u0258c\3\2"+
		"\2\2\u0259\u025a\7\34\2\2\u025ae\3\2\2\2\u025b\u025c\7L\2\2\u025cg\3\2"+
		"\2\2\u025d\u025e\7M\2\2\u025ei\3\2\2\2\u025f\u0260\7I\2\2\u0260k\3\2\2"+
		"\2\u0261\u0262\7K\2\2\u0262m\3\2\2\2\u0263\u0264\7)\2\2\u0264\u0267\7"+
		"\60\2\2\u0265\u0268\5\\/\2\u0266\u0268\5f\64\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5V,\2\u026a\u0275\5\u0098"+
		"M\2\u026b\u026e\7(\2\2\u026c\u026f\5\\/\2\u026d\u026f\5f\64\2\u026e\u026c"+
		"\3\2\2\2\u026e\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5V,\2\u0271"+
		"\u0272\5\u0098M\2\u0272\u0274\3\2\2\2\u0273\u026b\3\2\2\2\u0274\u0277"+
		"\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0278\u0279\7\61\2\2\u0279\u027f\3\2\2\2\u027a\u027b\7"+
		")\2\2\u027b\u027f\5\\/\2\u027c\u027d\7G\2\2\u027d\u027f\5\\/\2\u027e\u0263"+
		"\3\2\2\2\u027e\u027a\3\2\2\2\u027e\u027c\3\2\2\2\u027fo\3\2\2\2\u0280"+
		"\u0281\7(\2\2\u0281\u0282\5\u0098M\2\u0282q\3\2\2\2\u0283\u0284\7.\2\2"+
		"\u0284\u0289\5\u0098M\2\u0285\u0286\7(\2\2\u0286\u0288\5\u0098M\2\u0287"+
		"\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\7/\2\2\u028d"+
		"s\3\2\2\2\u028e\u028f\7\60\2\2\u028f\u0294\5\u0098M\2\u0290\u0291\7(\2"+
		"\2\u0291\u0293\5\u0098M\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0297\u0298\7\61\2\2\u0298u\3\2\2\2\u0299\u02aa\5Z.\2\u029a\u02aa"+
		"\5^\60\2\u029b\u02aa\5b\62\2\u029c\u02aa\5d\63\2\u029d\u02aa\5f\64\2\u029e"+
		"\u02aa\5h\65\2\u029f\u02aa\5j\66\2\u02a0\u02aa\5r:\2\u02a1\u02aa\5t;\2"+
		"\u02a2\u02aa\58\35\2\u02a3\u02aa\5\\/\2\u02a4\u02a5\7,\2\2\u02a5\u02a6"+
		"\5\u0098M\2\u02a6\u02a7\7-\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02aa\3\2\2\2"+
		"\u02a9\u0299\3\2\2\2\u02a9\u029a\3\2\2\2\u02a9\u029b\3\2\2\2\u02a9\u029c"+
		"\3\2\2\2\u02a9\u029d\3\2\2\2\u02a9\u029e\3\2\2\2\u02a9\u029f\3\2\2\2\u02a9"+
		"\u02a0\3\2\2\2\u02a9\u02a1\3\2\2\2\u02a9\u02a2\3\2\2\2\u02a9\u02a3\3\2"+
		"\2\2\u02a9\u02a4\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ae\3\2\2\2\u02ab"+
		"\u02ad\5n8\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2"+
		"\2\u02ae\u02af\3\2\2\2\u02afw\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2"+
		"\7\67\2\2\u02b2\u02b9\5x=\2\u02b3\u02b4\7\64\2\2\u02b4\u02b9\5x=\2\u02b5"+
		"\u02b6\7H\2\2\u02b6\u02b9\5x=\2\u02b7\u02b9\5v<\2\u02b8\u02b1\3\2\2\2"+
		"\u02b8\u02b3\3\2\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9y\3"+
		"\2\2\2\u02ba\u02bb\t\2\2\2\u02bb\u02be\5v<\2\u02bc\u02be\5x=\2\u02bd\u02ba"+
		"\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be{\3\2\2\2\u02bf\u02c0\5z>\2\u02c0}\3"+
		"\2\2\2\u02c1\u02c2\7\64\2\2\u02c2\u02cc\5|?\2\u02c3\u02c4\7\65\2\2\u02c4"+
		"\u02cc\5|?\2\u02c5\u02c6\7\66\2\2\u02c6\u02cc\5|?\2\u02c7\u02c8\7C\2\2"+
		"\u02c8\u02cc\5|?\2\u02c9\u02ca\7D\2\2\u02ca\u02cc\5|?\2\u02cb\u02c1\3"+
		"\2\2\2\u02cb\u02c3\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cc\177\3\2\2\2\u02cd\u02d1\5|?\2\u02ce\u02d0\5~@\2\u02cf"+
		"\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u0081\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\7\62\2\2\u02d5"+
		"\u02db\5\u0080A\2\u02d6\u02d7\7\63\2\2\u02d7\u02db\5\u0080A\2\u02d8\u02d9"+
		"\7E\2\2\u02d9\u02db\5\u0080A\2\u02da\u02d4\3\2\2\2\u02da\u02d6\3\2\2\2"+
		"\u02da\u02d8\3\2\2\2\u02db\u0083\3\2\2\2\u02dc\u02e0\5\u0080A\2\u02dd"+
		"\u02df\5\u0082B\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u0085\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e5\5\u0084C\2\u02e4\u02e6\5\u0088E\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6"+
		"\3\2\2\2\u02e6\u0087\3\2\2\2\u02e7\u02e8\7\60\2\2\u02e8\u02f8\5\u0084"+
		"C\2\u02e9\u02ea\7=\2\2\u02ea\u02f8\5\u0084C\2\u02eb\u02ec\7\61\2\2\u02ec"+
		"\u02f8\5\u0084C\2\u02ed\u02ee\7<\2\2\u02ee\u02f8\5\u0084C\2\u02ef\u02f0"+
		"\7B\2\2\u02f0\u02f8\5\u0084C\2\u02f1\u02f2\7A\2\2\u02f2\u02f8\5\u0084"+
		"C\2\u02f3\u02f4\7>\2\2\u02f4\u02f8\5\u0084C\2\u02f5\u02f6\7?\2\2\u02f6"+
		"\u02f8\5\u0084C\2\u02f7\u02e7\3\2\2\2\u02f7\u02e9\3\2\2\2\u02f7\u02eb"+
		"\3\2\2\2\u02f7\u02ed\3\2\2\2\u02f7\u02ef\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7"+
		"\u02f3\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u0089\3\2\2\2\u02f9\u02fe\5\\"+
		"/\2\u02fa\u02fb\7(\2\2\u02fb\u02fd\5\\/\2\u02fc\u02fa\3\2\2\2\u02fd\u0300"+
		"\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u030d\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0301\u0302\7,\2\2\u0302\u0307\5\\/\2\u0303\u0304\7(\2"+
		"\2\u0304\u0306\5\\/\2\u0305\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030b\7-\2\2\u030b\u030d\3\2\2\2\u030c\u02f9\3\2\2\2\u030c\u0301\3\2"+
		"\2\2\u030d\u008b\3\2\2\2\u030e\u030f\7;\2\2\u030f\u0310\5\u008aF\2\u0310"+
		"\u0311\7,\2\2\u0311\u0312\5\u0096L\2\u0312\u0313\7-\2\2\u0313\u031b\3"+
		"\2\2\2\u0314\u0315\7\'\2\2\u0315\u0316\5\u008aF\2\u0316\u0317\7,\2\2\u0317"+
		"\u0318\5\u0094K\2\u0318\u0319\7-\2\2\u0319\u031b\3\2\2\2\u031a\u030e\3"+
		"\2\2\2\u031a\u0314\3\2\2\2\u031b\u008d\3\2\2\2\u031c\u031f\5\u008cG\2"+
		"\u031d\u031f\5\u0086D\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2\2\u031f"+
		"\u008f\3\2\2\2\u0320\u0325\5\u008eH\2\u0321\u0322\78\2\2\u0322\u0324\5"+
		"\u008eH\2\u0323\u0321\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2"+
		"\u0325\u0326\3\2\2\2\u0326\u0091\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032d"+
		"\5\u0090I\2\u0329\u032a\79\2\2\u032a\u032c\5\u0090I\2\u032b\u0329\3\2"+
		"\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u0093\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\5\u0092J\2\u0331\u0332"+
		"\7:\2\2\u0332\u0333\5\u0092J\2\u0333\u0095\3\2\2\2\u0334\u0339\5\u0092"+
		"J\2\u0335\u0336\7:\2\2\u0336\u0338\5\u0092J\2\u0337\u0335\3\2\2\2\u0338"+
		"\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0097\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033c\u033d\5\u0096L\2\u033d\u0099\3\2\2\2O\u009d"+
		"\u00a1\u00a4\u00a7\u00ae\u00b7\u00bd\u00c1\u00c8\u00d0\u00d5\u00d9\u00e1"+
		"\u00f0\u00fe\u0105\u0116\u0122\u012e\u0137\u0139\u0155\u015c\u0166\u0170"+
		"\u0176\u017a\u017f\u018b\u0194\u019e\u01a8\u01b2\u01b5\u01bc\u01c3\u01c6"+
		"\u01ce\u01d6\u01d9\u01de\u01f8\u01fd\u0204\u020b\u0212\u0219\u021e\u0229"+
		"\u022b\u0230\u0234\u0243\u0267\u026e\u0275\u027e\u0289\u0294\u02a9\u02ae"+
		"\u02b8\u02bd\u02cb\u02d1\u02da\u02e0\u02e5\u02f7\u02fe\u0307\u030c\u031a"+
		"\u031e\u0325\u032d\u0339";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}