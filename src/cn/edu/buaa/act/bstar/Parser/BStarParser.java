package cn.edu.buaa.act.bstar.Parser;
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
		RETURN=30, IF=31, ELSE=32, WHILE=33, BREAK=34, CONTINUE=35, TYPEDEF=36, 
		SUF=37, DEFINE=38, FORALL=39, COMMA=40, POINT=41, AT=42, SEMICOLON=43, 
		L_BRACKET=44, R_BRACKET=45, L_BRACE=46, R_BRACE=47, L_ANGLE_BRACKET=48, 
		R_ANGLE_BRACKET=49, ADD=50, SUB=51, MUL=52, DIV=53, MOD=54, NOT=55, CONJUNCTION=56, 
		DISJUNCTION=57, IMPLICATION=58, EXIST=59, EGRE=60, ELES=61, EQU=62, UEQU=63, 
		SEPERATOR=64, BELONG=65, NOTBELONG=66, INTER=67, UNION=68, DIFFER=69, 
		ASSIGNMENT=70, ADDRGET=71, ADDR=72, CHAR=73, STRING=74, AT_STR=75, INTEGER=76, 
		REAL=77, ID=78, WS=79, COMMENT=80, COMMENT_2=81;
	public static final String[] tokenNames = {
		"<INVALID>", "'MACHINE'", "'INVARIANT'", "'ATTRIBUTES'", "'OPERATIONS'", 
		"'END'", "'INCLUDE'", "'FUNCTION'", "'ROBUST'", "'Precondition'", "'Postcondition'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'string'", 
		"'proposition'", "'set'", "'tuple'", "'bool'", "'enum'", "'const'", "'unsigned'", 
		"'true'", "'false'", "'nil'", "'struct'", "'void'", "'return'", "'if'", 
		"'else'", "'while'", "'break'", "'continue'", "'typedef'", "'.bs'", "'#define'", 
		"'#'", "','", "'.'", "'@'", "';'", "'('", "')'", "'{'", "'}'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&&'", "'||'", "'=>'", 
		"'!'", "'>='", "'<='", "'=='", "'!='", "'|'", "':'", "'!:'", "'/-\\'", 
		"'\\-/'", "'--'", "'='", "'->'", "'&'", "CHAR", "STRING", "AT_STR", "INTEGER", 
		"REAL", "ID", "WS", "COMMENT", "COMMENT_2"
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
		RULE_break_stat = 35, RULE_continue_stat = 36, RULE_assign_stat = 37, 
		RULE_return_stat = 38, RULE_while_stat = 39, RULE_if_stat = 40, RULE_else_stat = 41, 
		RULE_define = 42, RULE_include = 43, RULE_point = 44, RULE_belong = 45, 
		RULE_addr_get = 46, RULE_nil = 47, RULE_id = 48, RULE_string = 49, RULE_at_str = 50, 
		RULE_true_str = 51, RULE_false_str = 52, RULE_integer = 53, RULE_real = 54, 
		RULE_char_str = 55, RULE_statement_at = 56, RULE_belong_pair = 57, RULE_term_latter = 58, 
		RULE_term_element_comma = 59, RULE_term_set = 60, RULE_term_tuple = 61, 
		RULE_term = 62, RULE_one_e = 63, RULE_unary_e = 64, RULE_mse_0 = 65, RULE_mse_1_latter = 66, 
		RULE_mse_1 = 67, RULE_mse_latter = 68, RULE_mse = 69, RULE_condition_term = 70, 
		RULE_condition_term_latter = 71, RULE_id_list = 72, RULE_quan_e = 73, 
		RULE_pro_term_e = 74, RULE_and_pro_e = 75, RULE_or_pro_e = 76, RULE_imp_pro_e = 77, 
		RULE_pro_e = 78, RULE_element = 79;
	public static final String[] ruleNames = {
		"abmachine", "code_text", "includes", "attributes", "cv_define", "single_cv_define", 
		"single_var_define", "var_define", "cst_define", "operations", "function_define", 
		"declare_operations", "declares", "function_declare", "cdeclare_operations", 
		"cfunction_declare", "defines", "type", "normal_type", "set_type", "struct_type", 
		"enum_type", "point_id", "addr_id", "robust", "function", "para_define_list", 
		"function_call", "para_value_list", "append_paras", "attributes_2", "com_statement", 
		"invariant", "statement", "element_take", "break_stat", "continue_stat", 
		"assign_stat", "return_stat", "while_stat", "if_stat", "else_stat", "define", 
		"include", "point", "belong", "addr_get", "nil", "id", "string", "at_str", 
		"true_str", "false_str", "integer", "real", "char_str", "statement_at", 
		"belong_pair", "term_latter", "term_element_comma", "term_set", "term_tuple", 
		"term", "one_e", "unary_e", "mse_0", "mse_1_latter", "mse_1", "mse_latter", 
		"mse", "condition_term", "condition_term_latter", "id_list", "quan_e", 
		"pro_term_e", "and_pro_e", "or_pro_e", "imp_pro_e", "pro_e", "element"
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
			setState(160); match(MACHINE);
			setState(161); id();
			setState(163);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(162); includes();
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(165); match(ATTRIBUTE);
				setState(167);
				_la = _input.LA(1);
				if (_la==DEFINE) {
					{
					setState(166); defines();
					}
				}

				setState(169); cv_define();
				}
			}

			setState(173);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(172); code_text();
				}
			}

			setState(175); match(END);
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
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); operations();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); declare_operations();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); cdeclare_operations();
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
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182); include();
				setState(189);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(183); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(184); match(L_ANGLE_BRACKET);
					setState(185); id();
					setState(186); match(SUF);
					setState(187); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); match(SEMICOLON);
				}
				}
				setState(195); 
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
			setState(197); match(ATTRIBUTE);
			setState(199);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(198); defines();
				}
			}

			setState(201); cv_define();
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
			setState(204); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(203); single_cv_define();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206); 
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
			setState(214);
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
				setState(208); var_define();
				setState(209); match(SEMICOLON);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); cst_define();
				setState(212); match(SEMICOLON);
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
			setState(219);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(216); match(MUL);
				setState(217); point_id();
				}
				break;
			case ID:
				{
				setState(218); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(221); match(ASSIGNMENT);
				setState(222); element();
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
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); type();
				setState(226); single_var_define();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227); match(COMMA);
					setState(228); single_var_define();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(TYPEDEF);
				setState(235); enum_type();
				setState(236); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); match(TYPEDEF);
				setState(239); type();
				setState(240); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); match(TYPEDEF);
				setState(243); struct_type();
				setState(244); point_id();
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
			setState(248); match(CONST);
			setState(249); type();
			setState(250); point_id();
			setState(251); match(ASSIGNMENT);
			setState(252); element();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253); match(COMMA);
				setState(254); point_id();
				setState(255); match(ASSIGNMENT);
				setState(256); element();
				}
				}
				setState(262);
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
			setState(263); match(OPERATIONS);
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264); function_define();
				}
				}
				setState(267); 
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
			setState(269); type();
			setState(270); point_id();
			setState(271); match(L_BRACKET);
			setState(272); para_define_list();
			setState(273); match(R_BRACKET);
			setState(274); match(L_BRACE);
			setState(275); com_statement();
			setState(276); match(R_BRACE);
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
			setState(278); match(OPERATIONS);
			setState(279); declares();
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
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281); function_declare();
				}
				}
				setState(284); 
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
			setState(286); type();
			setState(287); point_id();
			setState(288); match(L_BRACKET);
			setState(289); para_define_list();
			setState(290); match(R_BRACKET);
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
			setState(292); match(OPERATIONS);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293); cfunction_declare();
				}
				}
				setState(296); 
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
			setState(298); function_declare();
			setState(299); robust();
			setState(300); function();
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
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302); define();
				setState(303); id();
				setState(304); element();
				}
				}
				setState(308); 
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
			setState(319);
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
				setState(310); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(312); id();
				setState(317);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(313); match(L_ANGLE_BRACKET);
					setState(314); type();
					setState(315); match(R_ANGLE_BRACKET);
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
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); match(UNSIGNED);
				setState(323); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325); match(UNSIGNED);
				setState(326); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328); match(UNSIGNED);
				setState(329); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(330); match(LONG_TYPE);
				setState(331); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(332); match(UNSIGNED);
				setState(333); match(LONG_TYPE);
				setState(334); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(336); match(UNSIGNED);
				setState(337); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(338); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(339); match(UNSIGNED);
				setState(340); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(341); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(342); match(UNSIGNED);
				setState(343); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(344); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(345); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(346); match(VOID);
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
			setState(349); match(SET_TYPE);
			setState(350); match(L_ANGLE_BRACKET);
			setState(351); type();
			setState(352); match(R_ANGLE_BRACKET);
			setState(354);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(353); at_str();
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
			setState(356); match(STRUCT);
			setState(357); match(L_BRACE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(358); type();
				setState(359); point_id();
				setState(360); match(SEMICOLON);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367); match(R_BRACE);
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
			setState(369); match(ENUM_TYPE);
			setState(370); match(L_BRACE);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(371); id();
				setState(374);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(372); match(ASSIGNMENT);
					setState(373); unary_e();
					}
				}

				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376); match(COMMA);
					setState(377); id();
					setState(380);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(378); match(ASSIGNMENT);
						setState(379); unary_e();
						}
					}

					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392); match(R_BRACE);
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
			setState(401);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(394); match(MUL);
				setState(395); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(397); match(L_BRACKET);
				setState(398); point_id();
				setState(399); match(R_BRACKET);
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
			setState(410);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(403); match(ADDR);
				setState(404); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(405); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(406); match(L_BRACKET);
				setState(407); addr_id();
				setState(408); match(R_BRACKET);
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
			setState(412); match(ROBUST);
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413); match(PRECONDITION);
				setState(414); pro_e();
				setState(415); match(POSTCONDITION);
				setState(416); pro_e();
				}
				}
				setState(420); 
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
			setState(422); match(FUNCTION);
			setState(428); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423); match(PRECONDITION);
				setState(424); pro_e();
				setState(425); match(POSTCONDITION);
				setState(426); pro_e();
				}
				}
				setState(430); 
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
			setState(443);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(432); type();
				setState(433); point_id();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(434); match(COMMA);
					setState(435); type();
					setState(436); point_id();
					}
					}
					setState(442);
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
			setState(445); id();
			setState(446); match(L_BRACKET);
			setState(447); para_value_list();
			setState(448); match(R_BRACKET);
			setState(450);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(449); append_paras();
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
			setState(460);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (FORALL - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(452); element();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(453); match(COMMA);
					setState(454); element();
					}
					}
					setState(459);
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
			setState(462); match(AT);
			setState(463); id();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464); match(COMMA);
				setState(465); id();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471); match(AT);
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
			setState(473); cv_define();
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
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(475); attributes_2();
				}
				break;
			}
			setState(479);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(478); invariant();
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (RETURN - 25)) | (1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (BREAK - 25)) | (1L << (CONTINUE - 25)) | (1L << (FORALL - 25)) | (1L << (SEMICOLON - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (AT_STR - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				{
				setState(481); statement();
				}
				}
				setState(486);
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
			setState(487); match(INVARIANT);
			setState(488); pro_e();
			setState(489); match(SEMICOLON);
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
		public Continue_statContext continue_stat() {
			return getRuleContext(Continue_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
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
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
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
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); assign_stat();
				setState(493); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495); element_take();
				setState(496); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498); function_call();
				setState(499); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501); return_stat();
				setState(502); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504); while_stat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(505); if_stat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(506); match(L_BRACE);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (RETURN - 25)) | (1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (BREAK - 25)) | (1L << (CONTINUE - 25)) | (1L << (FORALL - 25)) | (1L << (SEMICOLON - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (AT_STR - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					{
					setState(507); statement();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513); match(R_BRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(514); element();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(515); break_stat();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(516); continue_stat();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(517); statement_at();
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
			setState(520); id();
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(521); match(POINT);
					setState(522); id();
					}
					} 
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(551);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(528); point();
				setState(529); match(L_ANGLE_BRACKET);
				setState(532);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(530); id();
					}
					break;
				case INTEGER:
					{
					setState(531); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534); belong();
				setState(535); element();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(536); match(COMMA);
					setState(539);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(537); id();
						}
						break;
					case INTEGER:
						{
						setState(538); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(541); belong();
					setState(542); element();
					}
					}
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(549); match(R_ANGLE_BRACKET);
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

	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(BStarParser.BREAK, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); match(BREAK);
			setState(554); match(SEMICOLON);
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

	public static class Continue_statContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(BStarParser.CONTINUE, 0); }
		public Continue_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitContinue_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statContext continue_stat() throws RecognitionException {
		Continue_statContext _localctx = new Continue_statContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_continue_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(CONTINUE);
			setState(557); match(SEMICOLON);
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
		enterRule(_localctx, 74, RULE_assign_stat);
		int _la;
		try {
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559); point_id();
				setState(560); match(ASSIGNMENT);
				setState(561); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563); point_id();
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(568);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(564); match(POINT);
						setState(565); id();
						}
						break;
					case ADDRGET:
						{
						setState(566); match(ADDRGET);
						setState(567); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(572); match(ASSIGNMENT);
				setState(573); element();
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
		enterRule(_localctx, 76, RULE_return_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(RETURN);
			setState(579);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (FORALL - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(578); element();
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
		enterRule(_localctx, 78, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); match(WHILE);
			setState(582); match(L_BRACKET);
			setState(583); pro_e();
			setState(584); match(R_BRACKET);
			setState(585); statement();
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
		public TerminalNode IF() { return getToken(BStarParser.IF, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statContext else_stat() {
			return getRuleContext(Else_statContext.class,0);
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
		enterRule(_localctx, 80, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(IF);
			setState(588); match(L_BRACKET);
			setState(589); pro_e();
			setState(590); match(R_BRACKET);
			setState(591); statement();
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(592); else_stat();
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

	public static class Else_statContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BStarParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElse_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(ELSE);
			setState(596); statement();
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
		enterRule(_localctx, 84, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); match(DEFINE);
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
		enterRule(_localctx, 86, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); match(INCLUDE);
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
		enterRule(_localctx, 88, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(POINT);
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
		enterRule(_localctx, 90, RULE_belong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); match(BELONG);
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
		enterRule(_localctx, 92, RULE_addr_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(ADDRGET);
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
		enterRule(_localctx, 94, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(NIL);
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
		enterRule(_localctx, 96, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); match(ID);
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
		enterRule(_localctx, 98, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(STRING);
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
		enterRule(_localctx, 100, RULE_at_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); match(AT_STR);
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
		enterRule(_localctx, 102, RULE_true_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); match(TRUE);
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
		enterRule(_localctx, 104, RULE_false_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); match(FALSE);
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
		enterRule(_localctx, 106, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(INTEGER);
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
		enterRule(_localctx, 108, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(REAL);
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
		enterRule(_localctx, 110, RULE_char_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); match(CHAR);
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
		enterRule(_localctx, 112, RULE_statement_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(AT_STR);
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

	public static class Belong_pairContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BelongContext belong() {
			return getRuleContext(BelongContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Belong_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belong_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBelong_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Belong_pairContext belong_pair() throws RecognitionException {
		Belong_pairContext _localctx = new Belong_pairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_belong_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(628); id();
				}
				break;
			case INTEGER:
				{
				setState(629); integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(632); belong();
			setState(633); element();
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
		public TerminalNode POINT() { return getToken(BStarParser.POINT, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Belong_pairContext> belong_pair() {
			return getRuleContexts(Belong_pairContext.class);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Belong_pairContext belong_pair(int i) {
			return getRuleContext(Belong_pairContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
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
		enterRule(_localctx, 116, RULE_term_latter);
		int _la;
		try {
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); match(POINT);
				setState(636); match(L_ANGLE_BRACKET);
				setState(637); belong_pair();
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(638); match(COMMA);
					setState(639); belong_pair();
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645); match(R_ANGLE_BRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647); match(POINT);
				setState(648); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649); match(ADDRGET);
				setState(650); id();
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
		enterRule(_localctx, 118, RULE_term_element_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); match(COMMA);
			setState(654); element();
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
		enterRule(_localctx, 120, RULE_term_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); match(L_BRACE);
			setState(657); element();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(658); match(COMMA);
				setState(659); element();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665); match(R_BRACE);
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
		enterRule(_localctx, 122, RULE_term_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(L_ANGLE_BRACKET);
			setState(668); element();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(669); match(COMMA);
				setState(670); element();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676); match(R_ANGLE_BRACKET);
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
		enterRule(_localctx, 124, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(678); nil();
				}
				break;

			case 2:
				{
				setState(679); string();
				}
				break;

			case 3:
				{
				setState(680); true_str();
				}
				break;

			case 4:
				{
				setState(681); false_str();
				}
				break;

			case 5:
				{
				setState(682); integer();
				}
				break;

			case 6:
				{
				setState(683); real();
				}
				break;

			case 7:
				{
				setState(684); char_str();
				}
				break;

			case 8:
				{
				setState(685); term_set();
				}
				break;

			case 9:
				{
				setState(686); term_tuple();
				}
				break;

			case 10:
				{
				setState(687); function_call();
				}
				break;

			case 11:
				{
				setState(688); id();
				}
				break;

			case 12:
				{
				setState(689); match(L_BRACKET);
				setState(690); element();
				setState(691); match(R_BRACKET);
				}
				break;
			}
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==ADDRGET) {
				{
				{
				setState(695); term_latter();
				}
				}
				setState(700);
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
		enterRule(_localctx, 126, RULE_one_e);
		try {
			setState(708);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(701); match(NOT);
				setState(702); one_e();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); match(MUL);
				setState(704); one_e();
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 3);
				{
				setState(705); match(ADDR);
				setState(706); one_e();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(707); term();
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
		enterRule(_localctx, 128, RULE_unary_e);
		int _la;
		try {
			setState(713);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(711); term();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case MUL:
			case NOT:
			case ADDR:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(712); one_e();
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
		enterRule(_localctx, 130, RULE_mse_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); unary_e();
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
		enterRule(_localctx, 132, RULE_mse_1_latter);
		try {
			setState(727);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); match(MUL);
				setState(718); mse_0();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); match(DIV);
				setState(720); mse_0();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(721); match(MOD);
				setState(722); mse_0();
				}
				break;
			case INTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(723); match(INTER);
				setState(724); mse_0();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(725); match(UNION);
				setState(726); mse_0();
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
		enterRule(_localctx, 134, RULE_mse_1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729); mse_0();
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(730); mse_1_latter();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 136, RULE_mse_latter);
		try {
			setState(742);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(736); match(ADD);
				setState(737); mse_1();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(738); match(SUB);
				setState(739); mse_1();
				}
				break;
			case DIFFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(740); match(DIFFER);
				setState(741); mse_1();
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
		enterRule(_localctx, 138, RULE_mse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744); mse_1();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(745); mse_latter();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 140, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); mse();
			setState(753);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(752); condition_term_latter();
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
		enterRule(_localctx, 142, RULE_condition_term_latter);
		try {
			setState(771);
			switch (_input.LA(1)) {
			case L_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(755); match(L_ANGLE_BRACKET);
				setState(756); mse();
				}
				break;
			case ELES:
				enterOuterAlt(_localctx, 2);
				{
				setState(757); match(ELES);
				setState(758); mse();
				}
				break;
			case R_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(759); match(R_ANGLE_BRACKET);
				setState(760); mse();
				}
				break;
			case EGRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(761); match(EGRE);
				setState(762); mse();
				}
				break;
			case NOTBELONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(763); match(NOTBELONG);
				setState(764); mse();
				}
				break;
			case BELONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(765); match(BELONG);
				setState(766); mse();
				}
				break;
			case EQU:
				enterOuterAlt(_localctx, 7);
				{
				setState(767); match(EQU);
				setState(768); mse();
				}
				break;
			case UEQU:
				enterOuterAlt(_localctx, 8);
				{
				setState(769); match(UEQU);
				setState(770); mse();
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
		enterRule(_localctx, 144, RULE_id_list);
		int _la;
		try {
			setState(792);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(773); id();
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774); match(COMMA);
					setState(775); id();
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(781); match(L_BRACKET);
				setState(782); id();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(783); match(COMMA);
					setState(784); id();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 146, RULE_quan_e);
		try {
			setState(806);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(794); match(EXIST);
				setState(795); id_list();
				setState(796); match(L_BRACKET);
				setState(797); pro_e();
				setState(798); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(800); match(FORALL);
				setState(801); id_list();
				setState(802); match(L_BRACKET);
				setState(803); imp_pro_e();
				setState(804); match(R_BRACKET);
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
		enterRule(_localctx, 148, RULE_pro_term_e);
		try {
			setState(810);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(808); quan_e();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case ADD:
			case SUB:
			case MUL:
			case NOT:
			case ADDR:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(809); condition_term();
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
		enterRule(_localctx, 150, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); pro_term_e();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(813); match(CONJUNCTION);
				setState(814); pro_term_e();
				}
				}
				setState(819);
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
		enterRule(_localctx, 152, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820); and_pro_e();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(821); match(DISJUNCTION);
				setState(822); and_pro_e();
				}
				}
				setState(827);
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
		enterRule(_localctx, 154, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); or_pro_e();
			setState(829); match(IMPLICATION);
			setState(830); or_pro_e();
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
		enterRule(_localctx, 156, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); or_pro_e();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(833); match(IMPLICATION);
				setState(834); or_pro_e();
				}
				}
				setState(839);
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
		enterRule(_localctx, 158, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840); pro_e();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u034d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\5\2\u00a6"+
		"\n\2\3\2\3\2\5\2\u00aa\n\2\3\2\5\2\u00ad\n\2\3\2\5\2\u00b0\n\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\u00b7\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c0\n\4\3"+
		"\4\3\4\6\4\u00c4\n\4\r\4\16\4\u00c5\3\5\3\5\5\5\u00ca\n\5\3\5\3\5\3\6"+
		"\6\6\u00cf\n\6\r\6\16\6\u00d0\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9\n\7\3"+
		"\b\3\b\3\b\5\b\u00de\n\b\3\b\3\b\5\b\u00e2\n\b\3\t\3\t\3\t\3\t\7\t\u00e8"+
		"\n\t\f\t\16\t\u00eb\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00f9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0105\n\n"+
		"\f\n\16\n\u0108\13\n\3\13\3\13\6\13\u010c\n\13\r\13\16\13\u010d\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16\u011d\n\16\r\16\16"+
		"\16\u011e\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\6\20\u0129\n\20\r\20"+
		"\16\20\u012a\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0135\n\22\r"+
		"\22\16\22\u0136\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0140\n\23\5\23"+
		"\u0142\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u015e\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0165\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u016d\n\26\f\26\16\26\u0170\13\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0179\n\27\3\27\3\27\3\27\3\27\5\27\u017f"+
		"\n\27\7\27\u0181\n\27\f\27\16\27\u0184\13\27\7\27\u0186\n\27\f\27\16\27"+
		"\u0189\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0194\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u019d\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u01a5\n\32\r\32\16\32\u01a6\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\6\33\u01af\n\33\r\33\16\33\u01b0\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u01b9\n\34\f\34\16\34\u01bc\13\34\5\34\u01be\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01c5\n\35\3\36\3\36\3\36\7\36\u01ca\n\36\f\36\16\36\u01cd"+
		"\13\36\5\36\u01cf\n\36\3\37\3\37\3\37\3\37\7\37\u01d5\n\37\f\37\16\37"+
		"\u01d8\13\37\3\37\3\37\3 \3 \3!\5!\u01df\n!\3!\5!\u01e2\n!\3!\7!\u01e5"+
		"\n!\f!\16!\u01e8\13!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u01ff\n#\f#\16#\u0202\13#\3#\3#\3#\3#\3#\5#\u0209"+
		"\n#\3$\3$\3$\7$\u020e\n$\f$\16$\u0211\13$\3$\3$\3$\3$\5$\u0217\n$\3$\3"+
		"$\3$\3$\3$\5$\u021e\n$\3$\3$\3$\7$\u0223\n$\f$\16$\u0226\13$\3$\3$\5$"+
		"\u022a\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u023b"+
		"\n\'\r\'\16\'\u023c\3\'\3\'\3\'\5\'\u0242\n\'\3(\3(\5(\u0246\n(\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u0254\n*\3+\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\5;\u0279\n;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\7<\u0283\n<\f<\16<\u0286\13<\3<\3<\3<\3<\3<\3<\5<\u028e\n<\3=\3"+
		"=\3=\3>\3>\3>\3>\7>\u0297\n>\f>\16>\u029a\13>\3>\3>\3?\3?\3?\3?\7?\u02a2"+
		"\n?\f?\16?\u02a5\13?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\5@\u02b8\n@\3@\7@\u02bb\n@\f@\16@\u02be\13@\3A\3A\3A\3A\3A\3A\3A\5A"+
		"\u02c7\nA\3B\3B\3B\5B\u02cc\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D"+
		"\u02da\nD\3E\3E\7E\u02de\nE\fE\16E\u02e1\13E\3F\3F\3F\3F\3F\3F\5F\u02e9"+
		"\nF\3G\3G\7G\u02ed\nG\fG\16G\u02f0\13G\3H\3H\5H\u02f4\nH\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0306\nI\3J\3J\3J\7J\u030b\nJ\f"+
		"J\16J\u030e\13J\3J\3J\3J\3J\7J\u0314\nJ\fJ\16J\u0317\13J\3J\3J\5J\u031b"+
		"\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0329\nK\3L\3L\5L\u032d\nL"+
		"\3M\3M\3M\7M\u0332\nM\fM\16M\u0335\13M\3N\3N\3N\7N\u033a\nN\fN\16N\u033d"+
		"\13N\3O\3O\3O\3O\3P\3P\3P\7P\u0346\nP\fP\16P\u0349\13P\3Q\3Q\3Q\2R\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\3\3\2\64\65\u037e"+
		"\2\u00a2\3\2\2\2\4\u00b6\3\2\2\2\6\u00c3\3\2\2\2\b\u00c7\3\2\2\2\n\u00ce"+
		"\3\2\2\2\f\u00d8\3\2\2\2\16\u00dd\3\2\2\2\20\u00f8\3\2\2\2\22\u00fa\3"+
		"\2\2\2\24\u0109\3\2\2\2\26\u010f\3\2\2\2\30\u0118\3\2\2\2\32\u011c\3\2"+
		"\2\2\34\u0120\3\2\2\2\36\u0126\3\2\2\2 \u012c\3\2\2\2\"\u0134\3\2\2\2"+
		"$\u0141\3\2\2\2&\u015d\3\2\2\2(\u015f\3\2\2\2*\u0166\3\2\2\2,\u0173\3"+
		"\2\2\2.\u0193\3\2\2\2\60\u019c\3\2\2\2\62\u019e\3\2\2\2\64\u01a8\3\2\2"+
		"\2\66\u01bd\3\2\2\28\u01bf\3\2\2\2:\u01ce\3\2\2\2<\u01d0\3\2\2\2>\u01db"+
		"\3\2\2\2@\u01de\3\2\2\2B\u01e9\3\2\2\2D\u0208\3\2\2\2F\u020a\3\2\2\2H"+
		"\u022b\3\2\2\2J\u022e\3\2\2\2L\u0241\3\2\2\2N\u0243\3\2\2\2P\u0247\3\2"+
		"\2\2R\u024d\3\2\2\2T\u0255\3\2\2\2V\u0258\3\2\2\2X\u025a\3\2\2\2Z\u025c"+
		"\3\2\2\2\\\u025e\3\2\2\2^\u0260\3\2\2\2`\u0262\3\2\2\2b\u0264\3\2\2\2"+
		"d\u0266\3\2\2\2f\u0268\3\2\2\2h\u026a\3\2\2\2j\u026c\3\2\2\2l\u026e\3"+
		"\2\2\2n\u0270\3\2\2\2p\u0272\3\2\2\2r\u0274\3\2\2\2t\u0278\3\2\2\2v\u028d"+
		"\3\2\2\2x\u028f\3\2\2\2z\u0292\3\2\2\2|\u029d\3\2\2\2~\u02b7\3\2\2\2\u0080"+
		"\u02c6\3\2\2\2\u0082\u02cb\3\2\2\2\u0084\u02cd\3\2\2\2\u0086\u02d9\3\2"+
		"\2\2\u0088\u02db\3\2\2\2\u008a\u02e8\3\2\2\2\u008c\u02ea\3\2\2\2\u008e"+
		"\u02f1\3\2\2\2\u0090\u0305\3\2\2\2\u0092\u031a\3\2\2\2\u0094\u0328\3\2"+
		"\2\2\u0096\u032c\3\2\2\2\u0098\u032e\3\2\2\2\u009a\u0336\3\2\2\2\u009c"+
		"\u033e\3\2\2\2\u009e\u0342\3\2\2\2\u00a0\u034a\3\2\2\2\u00a2\u00a3\7\3"+
		"\2\2\u00a3\u00a5\5b\62\2\u00a4\u00a6\5\6\4\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a9\7\5\2\2\u00a8\u00aa\5\""+
		"\22\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\5\n\6\2\u00ac\u00a7\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00b0\5\4\3\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2\3\3\2\2\2\u00b3\u00b7\5\24\13"+
		"\2\u00b4\u00b7\5\30\r\2\u00b5\u00b7\5\36\20\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\5\3\2\2\2\u00b8\u00bf\5X-\2\u00b9"+
		"\u00c0\5d\63\2\u00ba\u00bb\7\62\2\2\u00bb\u00bc\5b\62\2\u00bc\u00bd\7"+
		"\'\2\2\u00bd\u00be\7\63\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00b8\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\7\3\2\2\2\u00c7\u00c9\7\5\2\2\u00c8\u00ca\5\"\22"+
		"\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\5\n\6\2\u00cc\t\3\2\2\2\u00cd\u00cf\5\f\7\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\13\3\2\2"+
		"\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4\7-\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d6"+
		"\5\22\n\2\u00d6\u00d7\7-\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d9\r\3\2\2\2\u00da\u00db\7\66\2\2\u00db\u00de\5.\30"+
		"\2\u00dc\u00de\5b\62\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00e0\7H\2\2\u00e0\u00e2\5\u00a0Q\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e9"+
		"\5\16\b\2\u00e5\u00e6\7*\2\2\u00e6\u00e8\5\16\b\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f9"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ee\5,\27\2\u00ee"+
		"\u00ef\5b\62\2\u00ef\u00f9\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\5$\23"+
		"\2\u00f2\u00f3\5.\30\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\u00f6"+
		"\5*\26\2\u00f6\u00f7\5.\30\2\u00f7\u00f9\3\2\2\2\u00f8\u00e3\3\2\2\2\u00f8"+
		"\u00ec\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\21\3\2\2"+
		"\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\5.\30\2\u00fd"+
		"\u00fe\7H\2\2\u00fe\u0106\5\u00a0Q\2\u00ff\u0100\7*\2\2\u0100\u0101\5"+
		".\30\2\u0101\u0102\7H\2\2\u0102\u0103\5\u00a0Q\2\u0103\u0105\3\2\2\2\u0104"+
		"\u00ff\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\23\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\7\6\2\2\u010a\u010c"+
		"\5\26\f\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\25\3\2\2\2\u010f\u0110\5$\23\2\u0110\u0111"+
		"\5.\30\2\u0111\u0112\7.\2\2\u0112\u0113\5\66\34\2\u0113\u0114\7/\2\2\u0114"+
		"\u0115\7\60\2\2\u0115\u0116\5@!\2\u0116\u0117\7\61\2\2\u0117\27\3\2\2"+
		"\2\u0118\u0119\7\6\2\2\u0119\u011a\5\32\16\2\u011a\31\3\2\2\2\u011b\u011d"+
		"\5\34\17\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\33\3\2\2\2\u0120\u0121\5$\23\2\u0121\u0122"+
		"\5.\30\2\u0122\u0123\7.\2\2\u0123\u0124\5\66\34\2\u0124\u0125\7/\2\2\u0125"+
		"\35\3\2\2\2\u0126\u0128\7\6\2\2\u0127\u0129\5 \21\2\u0128\u0127\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\37"+
		"\3\2\2\2\u012c\u012d\5\34\17\2\u012d\u012e\5\62\32\2\u012e\u012f\5\64"+
		"\33\2\u012f!\3\2\2\2\u0130\u0131\5V,\2\u0131\u0132\5b\62\2\u0132\u0133"+
		"\5\u00a0Q\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137#\3\2\2\2\u0138\u0142"+
		"\5&\24\2\u0139\u0142\5(\25\2\u013a\u013f\5b\62\2\u013b\u013c\7\62\2\2"+
		"\u013c\u013d\5$\23\2\u013d\u013e\7\63\2\2\u013e\u0140\3\2\2\2\u013f\u013b"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0138\3\2\2\2\u0141"+
		"\u0139\3\2\2\2\u0141\u013a\3\2\2\2\u0142%\3\2\2\2\u0143\u015e\7\r\2\2"+
		"\u0144\u0145\7\32\2\2\u0145\u015e\7\r\2\2\u0146\u015e\7\16\2\2\u0147\u0148"+
		"\7\32\2\2\u0148\u015e\7\16\2\2\u0149\u015e\7\17\2\2\u014a\u014b\7\32\2"+
		"\2\u014b\u015e\7\17\2\2\u014c\u014d\7\17\2\2\u014d\u015e\7\17\2\2\u014e"+
		"\u014f\7\32\2\2\u014f\u0150\7\17\2\2\u0150\u015e\7\17\2\2\u0151\u015e"+
		"\7\22\2\2\u0152\u0153\7\32\2\2\u0153\u015e\7\22\2\2\u0154\u015e\7\20\2"+
		"\2\u0155\u0156\7\32\2\2\u0156\u015e\7\20\2\2\u0157\u015e\7\21\2\2\u0158"+
		"\u0159\7\32\2\2\u0159\u015e\7\21\2\2\u015a\u015e\7\23\2\2\u015b\u015e"+
		"\7\24\2\2\u015c\u015e\7\37\2\2\u015d\u0143\3\2\2\2\u015d\u0144\3\2\2\2"+
		"\u015d\u0146\3\2\2\2\u015d\u0147\3\2\2\2\u015d\u0149\3\2\2\2\u015d\u014a"+
		"\3\2\2\2\u015d\u014c\3\2\2\2\u015d\u014e\3\2\2\2\u015d\u0151\3\2\2\2\u015d"+
		"\u0152\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0155\3\2\2\2\u015d\u0157\3\2"+
		"\2\2\u015d\u0158\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\'\3\2\2\2\u015f\u0160\7\25\2\2\u0160\u0161\7\62\2"+
		"\2\u0161\u0162\5$\23\2\u0162\u0164\7\63\2\2\u0163\u0165\5f\64\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165)\3\2\2\2\u0166\u0167\7\36\2\2"+
		"\u0167\u016e\7\60\2\2\u0168\u0169\5$\23\2\u0169\u016a\5.\30\2\u016a\u016b"+
		"\7-\2\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\7\61\2\2\u0172+\3\2\2\2\u0173\u0174\7\30\2\2\u0174\u0187"+
		"\7\60\2\2\u0175\u0178\5b\62\2\u0176\u0177\7H\2\2\u0177\u0179\5\u0082B"+
		"\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0182\3\2\2\2\u017a\u017b"+
		"\7*\2\2\u017b\u017e\5b\62\2\u017c\u017d\7H\2\2\u017d\u017f\5\u0082B\2"+
		"\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017a"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0175\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\7\61\2\2\u018b-\3\2\2\2\u018c\u018d\7\66\2"+
		"\2\u018d\u0194\5.\30\2\u018e\u0194\5b\62\2\u018f\u0190\7.\2\2\u0190\u0191"+
		"\5.\30\2\u0191\u0192\7/\2\2\u0192\u0194\3\2\2\2\u0193\u018c\3\2\2\2\u0193"+
		"\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0194/\3\2\2\2\u0195\u0196\7J\2\2\u0196"+
		"\u019d\5\60\31\2\u0197\u019d\5b\62\2\u0198\u0199\7.\2\2\u0199\u019a\5"+
		"\60\31\2\u019a\u019b\7/\2\2\u019b\u019d\3\2\2\2\u019c\u0195\3\2\2\2\u019c"+
		"\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019d\61\3\2\2\2\u019e\u01a4\7\n\2"+
		"\2\u019f\u01a0\7\13\2\2\u01a0\u01a1\5\u009eP\2\u01a1\u01a2\7\f\2\2\u01a2"+
		"\u01a3\5\u009eP\2\u01a3\u01a5\3\2\2\2\u01a4\u019f\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\63\3\2\2\2\u01a8"+
		"\u01ae\7\t\2\2\u01a9\u01aa\7\13\2\2\u01aa\u01ab\5\u009eP\2\u01ab\u01ac"+
		"\7\f\2\2\u01ac\u01ad\5\u009eP\2\u01ad\u01af\3\2\2\2\u01ae\u01a9\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\65"+
		"\3\2\2\2\u01b2\u01b3\5$\23\2\u01b3\u01ba\5.\30\2\u01b4\u01b5\7*\2\2\u01b5"+
		"\u01b6\5$\23\2\u01b6\u01b7\5.\30\2\u01b7\u01b9\3\2\2\2\u01b8\u01b4\3\2"+
		"\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01b2\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\67\3\2\2\2\u01bf\u01c0\5b\62\2\u01c0\u01c1\7.\2\2\u01c1\u01c2"+
		"\5:\36\2\u01c2\u01c4\7/\2\2\u01c3\u01c5\5<\37\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c59\3\2\2\2\u01c6\u01cb\5\u00a0Q\2\u01c7\u01c8\7*\2"+
		"\2\u01c8\u01ca\5\u00a0Q\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf;\3\2\2\2\u01d0\u01d1"+
		"\7,\2\2\u01d1\u01d6\5b\62\2\u01d2\u01d3\7*\2\2\u01d3\u01d5\5b\62\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7,\2\2\u01da"+
		"=\3\2\2\2\u01db\u01dc\5\n\6\2\u01dc?\3\2\2\2\u01dd\u01df\5> \2\u01de\u01dd"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\5B\"\2\u01e1"+
		"\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\5D"+
		"#\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7A\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7\4\2\2"+
		"\u01ea\u01eb\5\u009eP\2\u01eb\u01ec\7-\2\2\u01ecC\3\2\2\2\u01ed\u0209"+
		"\7-\2\2\u01ee\u01ef\5L\'\2\u01ef\u01f0\7-\2\2\u01f0\u0209\3\2\2\2\u01f1"+
		"\u01f2\5F$\2\u01f2\u01f3\7-\2\2\u01f3\u0209\3\2\2\2\u01f4\u01f5\58\35"+
		"\2\u01f5\u01f6\7-\2\2\u01f6\u0209\3\2\2\2\u01f7\u01f8\5N(\2\u01f8\u01f9"+
		"\7-\2\2\u01f9\u0209\3\2\2\2\u01fa\u0209\5P)\2\u01fb\u0209\5R*\2\u01fc"+
		"\u0200\7\60\2\2\u01fd\u01ff\5D#\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0209\7\61\2\2\u0204\u0209\5\u00a0Q\2\u0205\u0209"+
		"\5H%\2\u0206\u0209\5J&\2\u0207\u0209\5r:\2\u0208\u01ed\3\2\2\2\u0208\u01ee"+
		"\3\2\2\2\u0208\u01f1\3\2\2\2\u0208\u01f4\3\2\2\2\u0208\u01f7\3\2\2\2\u0208"+
		"\u01fa\3\2\2\2\u0208\u01fb\3\2\2\2\u0208\u01fc\3\2\2\2\u0208\u0204\3\2"+
		"\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"E\3\2\2\2\u020a\u020f\5b\62\2\u020b\u020c\7+\2\2\u020c\u020e\5b\62\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0229\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\5Z.\2\u0213\u0216"+
		"\7\62\2\2\u0214\u0217\5b\62\2\u0215\u0217\5l\67\2\u0216\u0214\3\2\2\2"+
		"\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5\\/\2\u0219\u0224"+
		"\5\u00a0Q\2\u021a\u021d\7*\2\2\u021b\u021e\5b\62\2\u021c\u021e\5l\67\2"+
		"\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220"+
		"\5\\/\2\u0220\u0221\5\u00a0Q\2\u0221\u0223\3\2\2\2\u0222\u021a\3\2\2\2"+
		"\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\63\2\2\u0228\u022a\3\2\2\2"+
		"\u0229\u0212\3\2\2\2\u0229\u022a\3\2\2\2\u022aG\3\2\2\2\u022b\u022c\7"+
		"$\2\2\u022c\u022d\7-\2\2\u022dI\3\2\2\2\u022e\u022f\7%\2\2\u022f\u0230"+
		"\7-\2\2\u0230K\3\2\2\2\u0231\u0232\5.\30\2\u0232\u0233\7H\2\2\u0233\u0234"+
		"\5\u00a0Q\2\u0234\u0242\3\2\2\2\u0235\u023a\5.\30\2\u0236\u0237\7+\2\2"+
		"\u0237\u023b\5b\62\2\u0238\u0239\7I\2\2\u0239\u023b\5b\62\2\u023a\u0236"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7H\2\2\u023f\u0240\5\u00a0"+
		"Q\2\u0240\u0242\3\2\2\2\u0241\u0231\3\2\2\2\u0241\u0235\3\2\2\2\u0242"+
		"M\3\2\2\2\u0243\u0245\7 \2\2\u0244\u0246\5\u00a0Q\2\u0245\u0244\3\2\2"+
		"\2\u0245\u0246\3\2\2\2\u0246O\3\2\2\2\u0247\u0248\7#\2\2\u0248\u0249\7"+
		".\2\2\u0249\u024a\5\u009eP\2\u024a\u024b\7/\2\2\u024b\u024c\5D#\2\u024c"+
		"Q\3\2\2\2\u024d\u024e\7!\2\2\u024e\u024f\7.\2\2\u024f\u0250\5\u009eP\2"+
		"\u0250\u0251\7/\2\2\u0251\u0253\5D#\2\u0252\u0254\5T+\2\u0253\u0252\3"+
		"\2\2\2\u0253\u0254\3\2\2\2\u0254S\3\2\2\2\u0255\u0256\7\"\2\2\u0256\u0257"+
		"\5D#\2\u0257U\3\2\2\2\u0258\u0259\7(\2\2\u0259W\3\2\2\2\u025a\u025b\7"+
		"\b\2\2\u025bY\3\2\2\2\u025c\u025d\7+\2\2\u025d[\3\2\2\2\u025e\u025f\7"+
		"C\2\2\u025f]\3\2\2\2\u0260\u0261\7I\2\2\u0261_\3\2\2\2\u0262\u0263\7\35"+
		"\2\2\u0263a\3\2\2\2\u0264\u0265\7P\2\2\u0265c\3\2\2\2\u0266\u0267\7L\2"+
		"\2\u0267e\3\2\2\2\u0268\u0269\7M\2\2\u0269g\3\2\2\2\u026a\u026b\7\33\2"+
		"\2\u026bi\3\2\2\2\u026c\u026d\7\34\2\2\u026dk\3\2\2\2\u026e\u026f\7N\2"+
		"\2\u026fm\3\2\2\2\u0270\u0271\7O\2\2\u0271o\3\2\2\2\u0272\u0273\7K\2\2"+
		"\u0273q\3\2\2\2\u0274\u0275\7M\2\2\u0275s\3\2\2\2\u0276\u0279\5b\62\2"+
		"\u0277\u0279\5l\67\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027b\5\\/\2\u027b\u027c\5\u00a0Q\2\u027cu\3\2\2\2\u027d"+
		"\u027e\7+\2\2\u027e\u027f\7\62\2\2\u027f\u0284\5t;\2\u0280\u0281\7*\2"+
		"\2\u0281\u0283\5t;\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287"+
		"\u0288\7\63\2\2\u0288\u028e\3\2\2\2\u0289\u028a\7+\2\2\u028a\u028e\5b"+
		"\62\2\u028b\u028c\7I\2\2\u028c\u028e\5b\62\2\u028d\u027d\3\2\2\2\u028d"+
		"\u0289\3\2\2\2\u028d\u028b\3\2\2\2\u028ew\3\2\2\2\u028f\u0290\7*\2\2\u0290"+
		"\u0291\5\u00a0Q\2\u0291y\3\2\2\2\u0292\u0293\7\60\2\2\u0293\u0298\5\u00a0"+
		"Q\2\u0294\u0295\7*\2\2\u0295\u0297\5\u00a0Q\2\u0296\u0294\3\2\2\2\u0297"+
		"\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7\61\2\2\u029c{\3\2\2\2\u029d\u029e"+
		"\7\62\2\2\u029e\u02a3\5\u00a0Q\2\u029f\u02a0\7*\2\2\u02a0\u02a2\5\u00a0"+
		"Q\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7\63"+
		"\2\2\u02a7}\3\2\2\2\u02a8\u02b8\5`\61\2\u02a9\u02b8\5d\63\2\u02aa\u02b8"+
		"\5h\65\2\u02ab\u02b8\5j\66\2\u02ac\u02b8\5l\67\2\u02ad\u02b8\5n8\2\u02ae"+
		"\u02b8\5p9\2\u02af\u02b8\5z>\2\u02b0\u02b8\5|?\2\u02b1\u02b8\58\35\2\u02b2"+
		"\u02b8\5b\62\2\u02b3\u02b4\7.\2\2\u02b4\u02b5\5\u00a0Q\2\u02b5\u02b6\7"+
		"/\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02a8\3\2\2\2\u02b7\u02a9\3\2\2\2\u02b7"+
		"\u02aa\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02ac\3\2\2\2\u02b7\u02ad\3\2"+
		"\2\2\u02b7\u02ae\3\2\2\2\u02b7\u02af\3\2\2\2\u02b7\u02b0\3\2\2\2\u02b7"+
		"\u02b1\3\2\2\2\u02b7\u02b2\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b8\u02bc\3\2"+
		"\2\2\u02b9\u02bb\5v<\2\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\177\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf"+
		"\u02c0\79\2\2\u02c0\u02c7\5\u0080A\2\u02c1\u02c2\7\66\2\2\u02c2\u02c7"+
		"\5\u0080A\2\u02c3\u02c4\7J\2\2\u02c4\u02c7\5\u0080A\2\u02c5\u02c7\5~@"+
		"\2\u02c6\u02bf\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c5"+
		"\3\2\2\2\u02c7\u0081\3\2\2\2\u02c8\u02c9\t\2\2\2\u02c9\u02cc\5~@\2\u02ca"+
		"\u02cc\5\u0080A\2\u02cb\u02c8\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u0083"+
		"\3\2\2\2\u02cd\u02ce\5\u0082B\2\u02ce\u0085\3\2\2\2\u02cf\u02d0\7\66\2"+
		"\2\u02d0\u02da\5\u0084C\2\u02d1\u02d2\7\67\2\2\u02d2\u02da\5\u0084C\2"+
		"\u02d3\u02d4\78\2\2\u02d4\u02da\5\u0084C\2\u02d5\u02d6\7E\2\2\u02d6\u02da"+
		"\5\u0084C\2\u02d7\u02d8\7F\2\2\u02d8\u02da\5\u0084C\2\u02d9\u02cf\3\2"+
		"\2\2\u02d9\u02d1\3\2\2\2\u02d9\u02d3\3\2\2\2\u02d9\u02d5\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02da\u0087\3\2\2\2\u02db\u02df\5\u0084C\2\u02dc\u02de"+
		"\5\u0086D\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2"+
		"\2\u02df\u02e0\3\2\2\2\u02e0\u0089\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3"+
		"\7\64\2\2\u02e3\u02e9\5\u0088E\2\u02e4\u02e5\7\65\2\2\u02e5\u02e9\5\u0088"+
		"E\2\u02e6\u02e7\7G\2\2\u02e7\u02e9\5\u0088E\2\u02e8\u02e2\3\2\2\2\u02e8"+
		"\u02e4\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u008b\3\2\2\2\u02ea\u02ee\5\u0088"+
		"E\2\u02eb\u02ed\5\u008aF\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u008d\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f1\u02f3\5\u008cG\2\u02f2\u02f4\5\u0090I\2\u02f3\u02f2\3\2\2\2"+
		"\u02f3\u02f4\3\2\2\2\u02f4\u008f\3\2\2\2\u02f5\u02f6\7\62\2\2\u02f6\u0306"+
		"\5\u008cG\2\u02f7\u02f8\7?\2\2\u02f8\u0306\5\u008cG\2\u02f9\u02fa\7\63"+
		"\2\2\u02fa\u0306\5\u008cG\2\u02fb\u02fc\7>\2\2\u02fc\u0306\5\u008cG\2"+
		"\u02fd\u02fe\7D\2\2\u02fe\u0306\5\u008cG\2\u02ff\u0300\7C\2\2\u0300\u0306"+
		"\5\u008cG\2\u0301\u0302\7@\2\2\u0302\u0306\5\u008cG\2\u0303\u0304\7A\2"+
		"\2\u0304\u0306\5\u008cG\2\u0305\u02f5\3\2\2\2\u0305\u02f7\3\2\2\2\u0305"+
		"\u02f9\3\2\2\2\u0305\u02fb\3\2\2\2\u0305\u02fd\3\2\2\2\u0305\u02ff\3\2"+
		"\2\2\u0305\u0301\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0091\3\2\2\2\u0307"+
		"\u030c\5b\62\2\u0308\u0309\7*\2\2\u0309\u030b\5b\62\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u031b\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7.\2\2\u0310\u0315\5b\62"+
		"\2\u0311\u0312\7*\2\2\u0312\u0314\5b\62\2\u0313\u0311\3\2\2\2\u0314\u0317"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0318\u0319\7/\2\2\u0319\u031b\3\2\2\2\u031a\u0307\3\2"+
		"\2\2\u031a\u030f\3\2\2\2\u031b\u0093\3\2\2\2\u031c\u031d\7=\2\2\u031d"+
		"\u031e\5\u0092J\2\u031e\u031f\7.\2\2\u031f\u0320\5\u009eP\2\u0320\u0321"+
		"\7/\2\2\u0321\u0329\3\2\2\2\u0322\u0323\7)\2\2\u0323\u0324\5\u0092J\2"+
		"\u0324\u0325\7.\2\2\u0325\u0326\5\u009cO\2\u0326\u0327\7/\2\2\u0327\u0329"+
		"\3\2\2\2\u0328\u031c\3\2\2\2\u0328\u0322\3\2\2\2\u0329\u0095\3\2\2\2\u032a"+
		"\u032d\5\u0094K\2\u032b\u032d\5\u008eH\2\u032c\u032a\3\2\2\2\u032c\u032b"+
		"\3\2\2\2\u032d\u0097\3\2\2\2\u032e\u0333\5\u0096L\2\u032f\u0330\7:\2\2"+
		"\u0330\u0332\5\u0096L\2\u0331\u032f\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0099\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u033b\5\u0098M\2\u0337\u0338\7;\2\2\u0338\u033a\5\u0098M\2"+
		"\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u009b\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\5\u009aN"+
		"\2\u033f\u0340\7<\2\2\u0340\u0341\5\u009aN\2\u0341\u009d\3\2\2\2\u0342"+
		"\u0347\5\u009aN\2\u0343\u0344\7<\2\2\u0344\u0346\5\u009aN\2\u0345\u0343"+
		"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u009f\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\5\u009eP\2\u034b\u00a1"+
		"\3\2\2\2N\u00a5\u00a9\u00ac\u00af\u00b6\u00bf\u00c5\u00c9\u00d0\u00d8"+
		"\u00dd\u00e1\u00e9\u00f8\u0106\u010d\u011e\u012a\u0136\u013f\u0141\u015d"+
		"\u0164\u016e\u0178\u017e\u0182\u0187\u0193\u019c\u01a6\u01b0\u01ba\u01bd"+
		"\u01c4\u01cb\u01ce\u01d6\u01de\u01e1\u01e6\u0200\u0208\u020f\u0216\u021d"+
		"\u0224\u0229\u023a\u023c\u0241\u0245\u0253\u0278\u0284\u028d\u0298\u02a3"+
		"\u02b7\u02bc\u02c6\u02cb\u02d9\u02df\u02e8\u02ee\u02f3\u0305\u030c\u0315"+
		"\u031a\u0328\u032c\u0333\u033b\u0347";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}