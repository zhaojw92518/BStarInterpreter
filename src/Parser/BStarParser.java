package Parser;
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
		RULE_cv_define = 4, RULE_var_define = 5, RULE_cst_define = 6, RULE_operations = 7, 
		RULE_function_define = 8, RULE_declare_operations = 9, RULE_declares = 10, 
		RULE_function_declare = 11, RULE_cdeclare_operations = 12, RULE_cfunction_declare = 13, 
		RULE_defines = 14, RULE_type = 15, RULE_normal_type = 16, RULE_set_type = 17, 
		RULE_struct_type = 18, RULE_enum_type = 19, RULE_point_id = 20, RULE_addr_id = 21, 
		RULE_robust = 22, RULE_function = 23, RULE_para_define_list = 24, RULE_function_call = 25, 
		RULE_para_value_list = 26, RULE_append_paras = 27, RULE_attributes_2 = 28, 
		RULE_com_statement = 29, RULE_invariant = 30, RULE_statement = 31, RULE_element_take = 32, 
		RULE_assign_stat = 33, RULE_return_stat = 34, RULE_while_stat = 35, RULE_if_stat = 36, 
		RULE_define = 37, RULE_include = 38, RULE_point = 39, RULE_belong = 40, 
		RULE_addr_get = 41, RULE_nil = 42, RULE_id = 43, RULE_string = 44, RULE_at_str = 45, 
		RULE_true_str = 46, RULE_false_str = 47, RULE_integer = 48, RULE_real = 49, 
		RULE_char_str = 50, RULE_statement_at = 51, RULE_term = 52, RULE_one_e = 53, 
		RULE_unary_e = 54, RULE_mse_0 = 55, RULE_mse_1 = 56, RULE_mse = 57, RULE_condition_term = 58, 
		RULE_id_list = 59, RULE_quan_e = 60, RULE_pro_term_e = 61, RULE_and_pro_e = 62, 
		RULE_or_pro_e = 63, RULE_imp_pro_e = 64, RULE_pro_e = 65, RULE_element = 66;
	public static final String[] ruleNames = {
		"abmachine", "code_text", "includes", "attributes", "cv_define", "var_define", 
		"cst_define", "operations", "function_define", "declare_operations", "declares", 
		"function_declare", "cdeclare_operations", "cfunction_declare", "defines", 
		"type", "normal_type", "set_type", "struct_type", "enum_type", "point_id", 
		"addr_id", "robust", "function", "para_define_list", "function_call", 
		"para_value_list", "append_paras", "attributes_2", "com_statement", "invariant", 
		"statement", "element_take", "assign_stat", "return_stat", "while_stat", 
		"if_stat", "define", "include", "point", "belong", "addr_get", "nil", 
		"id", "string", "at_str", "true_str", "false_str", "integer", "real", 
		"char_str", "statement_at", "term", "one_e", "unary_e", "mse_0", "mse_1", 
		"mse", "condition_term", "id_list", "quan_e", "pro_term_e", "and_pro_e", 
		"or_pro_e", "imp_pro_e", "pro_e", "element"
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
			setState(134); match(MACHINE);
			setState(135); id();
			setState(137);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(136); includes();
				}
			}

			setState(144);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(139); match(ATTRIBUTE);
				setState(141);
				_la = _input.LA(1);
				if (_la==DEFINE) {
					{
					setState(140); defines();
					}
				}

				setState(143); cv_define();
				}
			}

			setState(147);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(146); code_text();
				}
			}

			setState(149); match(END);
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
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); operations();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); declare_operations();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); cdeclare_operations();
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
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156); include();
				setState(163);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(157); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(158); match(L_ANGLE_BRACKET);
					setState(159); id();
					setState(160); match(SUF);
					setState(161); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165); match(SEMICOLON);
				}
				}
				setState(169); 
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
			setState(171); match(ATTRIBUTE);
			setState(173);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(172); defines();
				}
			}

			setState(175); cv_define();
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
		public List<Var_defineContext> var_define() {
			return getRuleContexts(Var_defineContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public Var_defineContext var_define(int i) {
			return getRuleContext(Var_defineContext.class,i);
		}
		public List<Cst_defineContext> cst_define() {
			return getRuleContexts(Cst_defineContext.class);
		}
		public Cst_defineContext cst_define(int i) {
			return getRuleContext(Cst_defineContext.class,i);
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
			setState(183); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(183);
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
						{
						setState(177); var_define();
						setState(178); match(SEMICOLON);
						}
						break;
					case CONST:
						{
						setState(180); cst_define();
						setState(181); match(SEMICOLON);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Var_defineContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(BStarParser.TYPEDEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
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
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
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
		enterRule(_localctx, 10, RULE_var_define);
		int _la;
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); type();
				setState(188); point_id();
				setState(191);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(189); match(ASSIGNMENT);
					setState(190); element();
					}
				}

				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193); match(COMMA);
					setState(194); point_id();
					setState(197);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(195); match(ASSIGNMENT);
						setState(196); element();
						}
					}

					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(TYPEDEF);
				setState(205); enum_type();
				setState(206); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); match(TYPEDEF);
				setState(209); type();
				setState(210); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212); match(TYPEDEF);
				setState(213); struct_type();
				setState(214); point_id();
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
		enterRule(_localctx, 12, RULE_cst_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(CONST);
			setState(219); type();
			setState(220); point_id();
			setState(221); match(ASSIGNMENT);
			setState(222); element();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223); match(COMMA);
				setState(224); point_id();
				setState(225); match(ASSIGNMENT);
				setState(226); element();
				}
				}
				setState(232);
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
		enterRule(_localctx, 14, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(OPERATIONS);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234); function_define();
				}
				}
				setState(237); 
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
		enterRule(_localctx, 16, RULE_function_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); type();
			setState(240); point_id();
			setState(241); match(L_BRACKET);
			setState(242); para_define_list();
			setState(243); match(R_BRACKET);
			setState(244); match(L_BRACE);
			setState(245); com_statement();
			setState(246); match(R_BRACE);
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
		enterRule(_localctx, 18, RULE_declare_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(OPERATIONS);
			setState(249); declares();
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
		enterRule(_localctx, 20, RULE_declares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251); function_declare();
				}
				}
				setState(254); 
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
		enterRule(_localctx, 22, RULE_function_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); type();
			setState(257); point_id();
			setState(258); match(L_BRACKET);
			setState(259); para_define_list();
			setState(260); match(R_BRACKET);
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
		enterRule(_localctx, 24, RULE_cdeclare_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(OPERATIONS);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263); cfunction_declare();
				}
				}
				setState(266); 
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
		enterRule(_localctx, 26, RULE_cfunction_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); function_declare();
			setState(269); robust();
			setState(270); function();
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
		enterRule(_localctx, 28, RULE_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272); define();
				setState(273); id();
				setState(274); element();
				}
				}
				setState(278); 
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
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			setState(289);
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
				setState(280); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(282); id();
				setState(287);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(283); match(L_ANGLE_BRACKET);
					setState(284); type();
					setState(285); match(R_ANGLE_BRACKET);
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
		enterRule(_localctx, 32, RULE_normal_type);
		try {
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(UNSIGNED);
				setState(293); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295); match(UNSIGNED);
				setState(296); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298); match(UNSIGNED);
				setState(299); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300); match(LONG_TYPE);
				setState(301); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(302); match(UNSIGNED);
				setState(303); match(LONG_TYPE);
				setState(304); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(305); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306); match(UNSIGNED);
				setState(307); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(309); match(UNSIGNED);
				setState(310); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(311); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(312); match(UNSIGNED);
				setState(313); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(314); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(315); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(316); match(VOID);
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
		enterRule(_localctx, 34, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(SET_TYPE);
			setState(320); match(L_ANGLE_BRACKET);
			setState(321); type();
			setState(322); match(R_ANGLE_BRACKET);
			setState(324);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(323); at_str();
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
		enterRule(_localctx, 36, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(STRUCT);
			setState(327); match(L_BRACE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(328); type();
				setState(329); point_id();
				setState(330); match(SEMICOLON);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337); match(R_BRACE);
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
		enterRule(_localctx, 38, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(ENUM_TYPE);
			setState(340); match(L_BRACE);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(341); id();
				setState(344);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(342); match(ASSIGNMENT);
					setState(343); unary_e();
					}
				}

				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(346); match(COMMA);
					setState(347); id();
					setState(350);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(348); match(ASSIGNMENT);
						setState(349); unary_e();
						}
					}

					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(R_BRACE);
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
		enterRule(_localctx, 40, RULE_point_id);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(MUL);
				setState(365); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(367); match(L_BRACKET);
				setState(368); point_id();
				setState(369); match(R_BRACKET);
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
		enterRule(_localctx, 42, RULE_addr_id);
		try {
			setState(380);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(373); match(ADDR);
				setState(374); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(376); match(L_BRACKET);
				setState(377); addr_id();
				setState(378); match(R_BRACKET);
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
		enterRule(_localctx, 44, RULE_robust);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); match(ROBUST);
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383); match(PRECONDITION);
				setState(384); pro_e();
				setState(385); match(POSTCONDITION);
				setState(386); pro_e();
				}
				}
				setState(390); 
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
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(FUNCTION);
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
		enterRule(_localctx, 48, RULE_para_define_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(402); type();
				setState(403); point_id();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(404); match(COMMA);
					setState(405); type();
					setState(406); point_id();
					}
					}
					setState(412);
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
		enterRule(_localctx, 50, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); id();
			setState(416); match(L_BRACKET);
			setState(417); para_value_list();
			setState(418); match(R_BRACKET);
			setState(420);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(419); append_paras();
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
		enterRule(_localctx, 52, RULE_para_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(422); element();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423); match(COMMA);
					setState(424); element();
					}
					}
					setState(429);
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
		enterRule(_localctx, 54, RULE_append_paras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); match(AT);
			setState(433); id();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434); match(COMMA);
				setState(435); id();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441); match(AT);
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
		enterRule(_localctx, 56, RULE_attributes_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); cv_define();
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
		enterRule(_localctx, 58, RULE_com_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(445); attributes_2();
				}
				break;
			}
			setState(449);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(448); invariant();
				}
			}

			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				{
				setState(451); statement();
				}
				}
				setState(456);
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
		enterRule(_localctx, 60, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(INVARIANT);
			setState(458); pro_e();
			setState(459); match(SEMICOLON);
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
		enterRule(_localctx, 62, RULE_statement);
		int _la;
		try {
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); assign_stat();
				setState(463); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465); element_take();
				setState(466); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468); function_call();
				setState(469); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471); return_stat();
				setState(472); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474); while_stat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(475); if_stat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(476); match(L_BRACE);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (L_BRACE - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					{
					setState(477); statement();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483); match(R_BRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(484); statement_at();
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
		enterRule(_localctx, 64, RULE_element_take);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487); id();
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(488); match(POINT);
					setState(489); id();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(518);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(495); point();
				setState(496); match(L_ANGLE_BRACKET);
				setState(499);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(497); id();
					}
					break;
				case INTEGER:
					{
					setState(498); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(501); belong();
				setState(502); element();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(503); match(COMMA);
					setState(506);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(504); id();
						}
						break;
					case INTEGER:
						{
						setState(505); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(508); belong();
					setState(509); element();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516); match(R_ANGLE_BRACKET);
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
		enterRule(_localctx, 66, RULE_assign_stat);
		int _la;
		try {
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520); point_id();
				setState(521); match(ASSIGNMENT);
				setState(522); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); point_id();
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(529);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(525); match(POINT);
						setState(526); id();
						}
						break;
					case ADDRGET:
						{
						setState(527); match(ADDRGET);
						setState(528); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(533); match(ASSIGNMENT);
				setState(534); element();
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
		enterRule(_localctx, 68, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); match(RETURN);
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(539); element();
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
		enterRule(_localctx, 70, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(WHILE);
			setState(543); match(L_BRACKET);
			setState(544); pro_e();
			setState(545); match(R_BRACKET);
			setState(546); statement();
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
		enterRule(_localctx, 72, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(IF);
			setState(549); match(L_BRACKET);
			setState(550); pro_e();
			setState(551); match(R_BRACKET);
			setState(552); statement();
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(553); match(ELSE);
				setState(554); statement();
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
		enterRule(_localctx, 74, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(DEFINE);
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
		enterRule(_localctx, 76, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); match(INCLUDE);
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
		enterRule(_localctx, 78, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(POINT);
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
		enterRule(_localctx, 80, RULE_belong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(BELONG);
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
		enterRule(_localctx, 82, RULE_addr_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(ADDRGET);
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
		enterRule(_localctx, 84, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(NIL);
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
		enterRule(_localctx, 86, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(ID);
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
		enterRule(_localctx, 88, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(STRING);
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
		enterRule(_localctx, 90, RULE_at_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(AT_STR);
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
		enterRule(_localctx, 92, RULE_true_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(TRUE);
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
		enterRule(_localctx, 94, RULE_false_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(FALSE);
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
		enterRule(_localctx, 96, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(INTEGER);
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
		enterRule(_localctx, 98, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); match(REAL);
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
		enterRule(_localctx, 100, RULE_char_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(CHAR);
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
		enterRule(_localctx, 102, RULE_statement_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(AT_STR);
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
		enterRule(_localctx, 104, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(587); nil();
				}
				break;

			case 2:
				{
				setState(588); string();
				}
				break;

			case 3:
				{
				setState(589); true_str();
				}
				break;

			case 4:
				{
				setState(590); false_str();
				}
				break;

			case 5:
				{
				setState(591); integer();
				}
				break;

			case 6:
				{
				setState(592); real();
				}
				break;

			case 7:
				{
				setState(593); char_str();
				}
				break;

			case 8:
				{
				setState(594); match(L_BRACE);
				setState(595); element();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(596); match(COMMA);
					setState(597); element();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(603); match(R_BRACE);
				}
				break;

			case 9:
				{
				setState(605); match(L_ANGLE_BRACKET);
				setState(606); element();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(607); match(COMMA);
					setState(608); element();
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(614); match(R_ANGLE_BRACKET);
				}
				break;

			case 10:
				{
				setState(616); function_call();
				}
				break;

			case 11:
				{
				setState(617); id();
				}
				break;

			case 12:
				{
				setState(618); match(L_BRACKET);
				setState(619); element();
				setState(620); match(R_BRACKET);
				}
				break;

			case 13:
				{
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==ADDRGET) {
				{
				setState(652);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(625); match(POINT);
					setState(626); match(L_ANGLE_BRACKET);
					setState(629);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(627); id();
						}
						break;
					case INTEGER:
						{
						setState(628); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(631); belong();
					setState(632); element();
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(633); match(COMMA);
						setState(636);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(634); id();
							}
							break;
						case INTEGER:
							{
							setState(635); integer();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(638); belong();
						setState(639); element();
						}
						}
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(646); match(R_ANGLE_BRACKET);
					}
					break;

				case 2:
					{
					setState(648); match(POINT);
					setState(649); id();
					}
					break;

				case 3:
					{
					setState(650); match(ADDRGET);
					setState(651); id();
					}
					break;
				}
				}
				setState(656);
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
		enterRule(_localctx, 106, RULE_one_e);
		try {
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); match(NOT);
				setState(658); one_e();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659); match(MUL);
				setState(660); one_e();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661); match(ADDR);
				setState(662); one_e();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663); term();
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
		enterRule(_localctx, 108, RULE_unary_e);
		int _la;
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(667); term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668); one_e();
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
		enterRule(_localctx, 110, RULE_mse_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); unary_e();
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
		public TerminalNode INTER(int i) {
			return getToken(BStarParser.INTER, i);
		}
		public List<TerminalNode> UNION() { return getTokens(BStarParser.UNION); }
		public List<TerminalNode> MUL() { return getTokens(BStarParser.MUL); }
		public List<Mse_0Context> mse_0() {
			return getRuleContexts(Mse_0Context.class);
		}
		public List<TerminalNode> DIV() { return getTokens(BStarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BStarParser.DIV, i);
		}
		public List<TerminalNode> INTER() { return getTokens(BStarParser.INTER); }
		public TerminalNode UNION(int i) {
			return getToken(BStarParser.UNION, i);
		}
		public Mse_0Context mse_0(int i) {
			return getRuleContext(Mse_0Context.class,i);
		}
		public TerminalNode MOD(int i) {
			return getToken(BStarParser.MOD, i);
		}
		public TerminalNode MUL(int i) {
			return getToken(BStarParser.MUL, i);
		}
		public List<TerminalNode> MOD() { return getTokens(BStarParser.MOD); }
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
		enterRule(_localctx, 112, RULE_mse_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); mse_0();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (MUL - 50)) | (1L << (DIV - 50)) | (1L << (MOD - 50)) | (1L << (INTER - 50)) | (1L << (UNION - 50)))) != 0)) {
				{
				setState(684);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(674); match(MUL);
					setState(675); mse_0();
					}
					break;
				case DIV:
					{
					setState(676); match(DIV);
					setState(677); mse_0();
					}
					break;
				case MOD:
					{
					setState(678); match(MOD);
					setState(679); mse_0();
					}
					break;
				case INTER:
					{
					setState(680); match(INTER);
					setState(681); mse_0();
					}
					break;
				case UNION:
					{
					setState(682); match(UNION);
					setState(683); mse_0();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(688);
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

	public static class MseContext extends ParserRuleContext {
		public List<Mse_1Context> mse_1() {
			return getRuleContexts(Mse_1Context.class);
		}
		public List<TerminalNode> DIFFER() { return getTokens(BStarParser.DIFFER); }
		public TerminalNode ADD(int i) {
			return getToken(BStarParser.ADD, i);
		}
		public TerminalNode DIFFER(int i) {
			return getToken(BStarParser.DIFFER, i);
		}
		public TerminalNode SUB(int i) {
			return getToken(BStarParser.SUB, i);
		}
		public Mse_1Context mse_1(int i) {
			return getRuleContext(Mse_1Context.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(BStarParser.SUB); }
		public List<TerminalNode> ADD() { return getTokens(BStarParser.ADD); }
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
		enterRule(_localctx, 114, RULE_mse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); mse_1();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (ADD - 48)) | (1L << (SUB - 48)) | (1L << (DIFFER - 48)))) != 0)) {
				{
				setState(696);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(690); match(ADD);
					setState(691); mse_1();
					}
					break;
				case SUB:
					{
					setState(692); match(SUB);
					setState(693); mse_1();
					}
					break;
				case DIFFER:
					{
					setState(694); match(DIFFER);
					setState(695); mse_1();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Condition_termContext extends ParserRuleContext {
		public TerminalNode EGRE() { return getToken(BStarParser.EGRE, 0); }
		public TerminalNode ELES() { return getToken(BStarParser.ELES, 0); }
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode EQU() { return getToken(BStarParser.EQU, 0); }
		public MseContext mse(int i) {
			return getRuleContext(MseContext.class,i);
		}
		public List<MseContext> mse() {
			return getRuleContexts(MseContext.class);
		}
		public TerminalNode NOTBELONG() { return getToken(BStarParser.NOTBELONG, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode UEQU() { return getToken(BStarParser.UEQU, 0); }
		public TerminalNode BELONG() { return getToken(BStarParser.BELONG, 0); }
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
		enterRule(_localctx, 116, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); mse();
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(702); match(L_ANGLE_BRACKET);
				setState(703); mse();
				}
				break;

			case 2:
				{
				setState(704); match(ELES);
				setState(705); mse();
				}
				break;

			case 3:
				{
				setState(706); match(R_ANGLE_BRACKET);
				setState(707); mse();
				}
				break;

			case 4:
				{
				setState(708); match(EGRE);
				setState(709); mse();
				}
				break;

			case 5:
				{
				setState(710); match(NOTBELONG);
				setState(711); mse();
				}
				break;

			case 6:
				{
				setState(712); match(BELONG);
				setState(713); mse();
				}
				break;

			case 7:
				{
				setState(714); match(EQU);
				setState(715); mse();
				}
				break;

			case 8:
				{
				setState(716); match(UEQU);
				setState(717); mse();
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
		enterRule(_localctx, 118, RULE_id_list);
		int _la;
		try {
			setState(739);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(720); id();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(721); match(COMMA);
					setState(722); id();
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); match(L_BRACKET);
				setState(729); id();
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(730); match(COMMA);
					setState(731); id();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737); match(R_BRACKET);
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
		enterRule(_localctx, 120, RULE_quan_e);
		try {
			setState(753);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(741); match(EXIST);
				setState(742); id_list();
				setState(743); match(L_BRACKET);
				setState(744); pro_e();
				setState(745); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(747); match(FORALL);
				setState(748); id_list();
				setState(749); match(L_BRACKET);
				setState(750); imp_pro_e();
				setState(751); match(R_BRACKET);
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
		enterRule(_localctx, 122, RULE_pro_term_e);
		try {
			setState(757);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(755); quan_e();
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
				setState(756); condition_term();
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
		enterRule(_localctx, 124, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759); pro_term_e();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(760); match(CONJUNCTION);
				setState(761); pro_term_e();
				}
				}
				setState(766);
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
		enterRule(_localctx, 126, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); and_pro_e();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(768); match(DISJUNCTION);
				setState(769); and_pro_e();
				}
				}
				setState(774);
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
		enterRule(_localctx, 128, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775); or_pro_e();
			setState(776); match(IMPLICATION);
			setState(777); or_pro_e();
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
		enterRule(_localctx, 130, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); or_pro_e();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(780); match(IMPLICATION);
				setState(781); or_pro_e();
				}
				}
				setState(786);
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
		enterRule(_localctx, 132, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); pro_e();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3Q\u0318\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\5\2\u008c\n\2\3"+
		"\2\3\2\5\2\u0090\n\2\3\2\5\2\u0093\n\2\3\2\5\2\u0096\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\u009d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a6\n\4\3\4\3\4"+
		"\6\4\u00aa\n\4\r\4\16\4\u00ab\3\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6\u00ba\n\6\r\6\16\6\u00bb\3\7\3\7\3\7\3\7\5\7\u00c2"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\7\7\u00ca\n\7\f\7\16\7\u00cd\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00db\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e7\n\b\f\b\16\b\u00ea\13\b\3\t\3"+
		"\t\6\t\u00ee\n\t\r\t\16\t\u00ef\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\6\f\u00ff\n\f\r\f\16\f\u0100\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\6\16\u010b\n\16\r\16\16\16\u010c\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\6\20\u0117\n\20\r\20\16\20\u0118\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0122\n\21\5\21\u0124\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0140\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0147\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u014f\n\24\f"+
		"\24\16\24\u0152\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u015b\n"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0161\n\25\7\25\u0163\n\25\f\25\16\25\u0166"+
		"\13\25\7\25\u0168\n\25\f\25\16\25\u016b\13\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0176\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u017f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0187\n\30\r\30\16"+
		"\30\u0188\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0191\n\31\r\31\16\31\u0192"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u019b\n\32\f\32\16\32\u019e\13\32"+
		"\5\32\u01a0\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u01a7\n\33\3\34\3\34\3"+
		"\34\7\34\u01ac\n\34\f\34\16\34\u01af\13\34\5\34\u01b1\n\34\3\35\3\35\3"+
		"\35\3\35\7\35\u01b7\n\35\f\35\16\35\u01ba\13\35\3\35\3\35\3\36\3\36\3"+
		"\37\5\37\u01c1\n\37\3\37\5\37\u01c4\n\37\3\37\7\37\u01c7\n\37\f\37\16"+
		"\37\u01ca\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\7!\u01e1\n!\f!\16!\u01e4\13!\3!\3!\5!\u01e8\n!\3\"\3\"\3\"\7"+
		"\"\u01ed\n\"\f\"\16\"\u01f0\13\"\3\"\3\"\3\"\3\"\5\"\u01f6\n\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01fd\n\"\3\"\3\"\3\"\7\"\u0202\n\"\f\"\16\"\u0205\13"+
		"\"\3\"\3\"\5\"\u0209\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u0214\n#\r#\16"+
		"#\u0215\3#\3#\3#\5#\u021b\n#\3$\3$\5$\u021f\n$\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u022e\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0259"+
		"\n\66\f\66\16\66\u025c\13\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0264"+
		"\n\66\f\66\16\66\u0267\13\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\5\66\u0272\n\66\3\66\3\66\3\66\3\66\5\66\u0278\n\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u027f\n\66\3\66\3\66\3\66\7\66\u0284\n\66\f\66\16\66\u0287"+
		"\13\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u028f\n\66\f\66\16\66\u0292"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u029b\n\67\38\38\38\58"+
		"\u02a0\n8\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u02af\n:\f:\16:\u02b2"+
		"\13:\3;\3;\3;\3;\3;\3;\3;\7;\u02bb\n;\f;\16;\u02be\13;\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02d1\n<\3=\3=\3=\7=\u02d6\n="+
		"\f=\16=\u02d9\13=\3=\3=\3=\3=\7=\u02df\n=\f=\16=\u02e2\13=\3=\3=\5=\u02e6"+
		"\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u02f4\n>\3?\3?\5?\u02f8\n?"+
		"\3@\3@\3@\7@\u02fd\n@\f@\16@\u0300\13@\3A\3A\3A\7A\u0305\nA\fA\16A\u0308"+
		"\13A\3B\3B\3B\3B\3C\3C\3C\7C\u0311\nC\fC\16C\u0314\13C\3D\3D\3D\2E\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\3\3\2\62\63\u0355\2"+
		"\u0088\3\2\2\2\4\u009c\3\2\2\2\6\u00a9\3\2\2\2\b\u00ad\3\2\2\2\n\u00b9"+
		"\3\2\2\2\f\u00da\3\2\2\2\16\u00dc\3\2\2\2\20\u00eb\3\2\2\2\22\u00f1\3"+
		"\2\2\2\24\u00fa\3\2\2\2\26\u00fe\3\2\2\2\30\u0102\3\2\2\2\32\u0108\3\2"+
		"\2\2\34\u010e\3\2\2\2\36\u0116\3\2\2\2 \u0123\3\2\2\2\"\u013f\3\2\2\2"+
		"$\u0141\3\2\2\2&\u0148\3\2\2\2(\u0155\3\2\2\2*\u0175\3\2\2\2,\u017e\3"+
		"\2\2\2.\u0180\3\2\2\2\60\u018a\3\2\2\2\62\u019f\3\2\2\2\64\u01a1\3\2\2"+
		"\2\66\u01b0\3\2\2\28\u01b2\3\2\2\2:\u01bd\3\2\2\2<\u01c0\3\2\2\2>\u01cb"+
		"\3\2\2\2@\u01e7\3\2\2\2B\u01e9\3\2\2\2D\u021a\3\2\2\2F\u021c\3\2\2\2H"+
		"\u0220\3\2\2\2J\u0226\3\2\2\2L\u022f\3\2\2\2N\u0231\3\2\2\2P\u0233\3\2"+
		"\2\2R\u0235\3\2\2\2T\u0237\3\2\2\2V\u0239\3\2\2\2X\u023b\3\2\2\2Z\u023d"+
		"\3\2\2\2\\\u023f\3\2\2\2^\u0241\3\2\2\2`\u0243\3\2\2\2b\u0245\3\2\2\2"+
		"d\u0247\3\2\2\2f\u0249\3\2\2\2h\u024b\3\2\2\2j\u0271\3\2\2\2l\u029a\3"+
		"\2\2\2n\u029f\3\2\2\2p\u02a1\3\2\2\2r\u02a3\3\2\2\2t\u02b3\3\2\2\2v\u02bf"+
		"\3\2\2\2x\u02e5\3\2\2\2z\u02f3\3\2\2\2|\u02f7\3\2\2\2~\u02f9\3\2\2\2\u0080"+
		"\u0301\3\2\2\2\u0082\u0309\3\2\2\2\u0084\u030d\3\2\2\2\u0086\u0315\3\2"+
		"\2\2\u0088\u0089\7\3\2\2\u0089\u008b\5X-\2\u008a\u008c\5\6\4\2\u008b\u008a"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0092\3\2\2\2\u008d\u008f\7\5\2\2\u008e"+
		"\u0090\5\36\20\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0093\5\n\6\2\u0092\u008d\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\7\2\2\u0098\3\3\2\2\2\u0099\u009d"+
		"\5\20\t\2\u009a\u009d\5\24\13\2\u009b\u009d\5\32\16\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\5\3\2\2\2\u009e\u00a5"+
		"\5N(\2\u009f\u00a6\5Z.\2\u00a0\u00a1\7\60\2\2\u00a1\u00a2\5X-\2\u00a2"+
		"\u00a3\7%\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2"+
		"\2\2\u00a5\u00a0\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u009e\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00af\7\5\2\2\u00ae\u00b0"+
		"\5\36\20\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\5\n\6\2\u00b2\t\3\2\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\7"+
		"+\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\7+\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\13\3\2\2\2\u00bd\u00be"+
		"\5 \21\2\u00be\u00c1\5*\26\2\u00bf\u00c0\7F\2\2\u00c0\u00c2\5\u0086D\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3\u00c4"+
		"\7(\2\2\u00c4\u00c7\5*\26\2\u00c5\u00c6\7F\2\2\u00c6\u00c8\5\u0086D\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00db\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\5(\25"+
		"\2\u00d0\u00d1\5X-\2\u00d1\u00db\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4"+
		"\5 \21\2\u00d4\u00d5\5*\26\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7"+
		"\u00d8\5&\24\2\u00d8\u00d9\5*\26\2\u00d9\u00db\3\2\2\2\u00da\u00bd\3\2"+
		"\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d6\3\2\2\2\u00db"+
		"\r\3\2\2\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\5 \21\2\u00de\u00df\5*\26"+
		"\2\u00df\u00e0\7F\2\2\u00e0\u00e8\5\u0086D\2\u00e1\u00e2\7(\2\2\u00e2"+
		"\u00e3\5*\26\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\5\u0086D\2\u00e5\u00e7\3"+
		"\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\17\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7\6\2"+
		"\2\u00ec\u00ee\5\22\n\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\21\3\2\2\2\u00f1\u00f2\5 \21"+
		"\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\5\62\32\2\u00f5"+
		"\u00f6\7-\2\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\5<\37\2\u00f8\u00f9\7/\2"+
		"\2\u00f9\23\3\2\2\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\5\26\f\2\u00fc\25"+
		"\3\2\2\2\u00fd\u00ff\5\30\r\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\27\3\2\2\2\u0102\u0103"+
		"\5 \21\2\u0103\u0104\5*\26\2\u0104\u0105\7,\2\2\u0105\u0106\5\62\32\2"+
		"\u0106\u0107\7-\2\2\u0107\31\3\2\2\2\u0108\u010a\7\6\2\2\u0109\u010b\5"+
		"\34\17\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\33\3\2\2\2\u010e\u010f\5\30\r\2\u010f\u0110\5.\30"+
		"\2\u0110\u0111\5\60\31\2\u0111\35\3\2\2\2\u0112\u0113\5L\'\2\u0113\u0114"+
		"\5X-\2\u0114\u0115\5\u0086D\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\37"+
		"\3\2\2\2\u011a\u0124\5\"\22\2\u011b\u0124\5$\23\2\u011c\u0121\5X-\2\u011d"+
		"\u011e\7\60\2\2\u011e\u011f\5 \21\2\u011f\u0120\7\61\2\2\u0120\u0122\3"+
		"\2\2\2\u0121\u011d\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u011a\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011c\3\2\2\2\u0124!\3\2\2\2"+
		"\u0125\u0140\7\r\2\2\u0126\u0127\7\32\2\2\u0127\u0140\7\r\2\2\u0128\u0140"+
		"\7\16\2\2\u0129\u012a\7\32\2\2\u012a\u0140\7\16\2\2\u012b\u0140\7\17\2"+
		"\2\u012c\u012d\7\32\2\2\u012d\u0140\7\17\2\2\u012e\u012f\7\17\2\2\u012f"+
		"\u0140\7\17\2\2\u0130\u0131\7\32\2\2\u0131\u0132\7\17\2\2\u0132\u0140"+
		"\7\17\2\2\u0133\u0140\7\22\2\2\u0134\u0135\7\32\2\2\u0135\u0140\7\22\2"+
		"\2\u0136\u0140\7\20\2\2\u0137\u0138\7\32\2\2\u0138\u0140\7\20\2\2\u0139"+
		"\u0140\7\21\2\2\u013a\u013b\7\32\2\2\u013b\u0140\7\21\2\2\u013c\u0140"+
		"\7\23\2\2\u013d\u0140\7\24\2\2\u013e\u0140\7\37\2\2\u013f\u0125\3\2\2"+
		"\2\u013f\u0126\3\2\2\2\u013f\u0128\3\2\2\2\u013f\u0129\3\2\2\2\u013f\u012b"+
		"\3\2\2\2\u013f\u012c\3\2\2\2\u013f\u012e\3\2\2\2\u013f\u0130\3\2\2\2\u013f"+
		"\u0133\3\2\2\2\u013f\u0134\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u013f\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013c\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140#\3\2\2\2\u0141\u0142\7\25\2\2"+
		"\u0142\u0143\7\60\2\2\u0143\u0144\5 \21\2\u0144\u0146\7\61\2\2\u0145\u0147"+
		"\5\\/\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147%\3\2\2\2\u0148\u0149"+
		"\7\36\2\2\u0149\u0150\7.\2\2\u014a\u014b\5 \21\2\u014b\u014c\5*\26\2\u014c"+
		"\u014d\7+\2\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7/\2\2\u0154\'\3\2\2\2\u0155\u0156\7\30\2\2"+
		"\u0156\u0169\7.\2\2\u0157\u015a\5X-\2\u0158\u0159\7F\2\2\u0159\u015b\5"+
		"n8\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0164\3\2\2\2\u015c"+
		"\u015d\7(\2\2\u015d\u0160\5X-\2\u015e\u015f\7F\2\2\u015f\u0161\5n8\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015c\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0157\3\2\2\2\u0168\u016b\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7/\2\2\u016d)\3\2\2\2\u016e\u016f\7\64\2\2"+
		"\u016f\u0176\5*\26\2\u0170\u0176\5X-\2\u0171\u0172\7,\2\2\u0172\u0173"+
		"\5*\26\2\u0173\u0174\7-\2\2\u0174\u0176\3\2\2\2\u0175\u016e\3\2\2\2\u0175"+
		"\u0170\3\2\2\2\u0175\u0171\3\2\2\2\u0176+\3\2\2\2\u0177\u0178\7H\2\2\u0178"+
		"\u017f\5,\27\2\u0179\u017f\5X-\2\u017a\u017b\7,\2\2\u017b\u017c\5,\27"+
		"\2\u017c\u017d\7-\2\2\u017d\u017f\3\2\2\2\u017e\u0177\3\2\2\2\u017e\u0179"+
		"\3\2\2\2\u017e\u017a\3\2\2\2\u017f-\3\2\2\2\u0180\u0186\7\n\2\2\u0181"+
		"\u0182\7\13\2\2\u0182\u0183\5\u0084C\2\u0183\u0184\7\f\2\2\u0184\u0185"+
		"\5\u0084C\2\u0185\u0187\3\2\2\2\u0186\u0181\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189/\3\2\2\2\u018a\u0190"+
		"\7\t\2\2\u018b\u018c\7\13\2\2\u018c\u018d\5\u0084C\2\u018d\u018e\7\f\2"+
		"\2\u018e\u018f\5\u0084C\2\u018f\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\61\3\2\2"+
		"\2\u0194\u0195\5 \21\2\u0195\u019c\5*\26\2\u0196\u0197\7(\2\2\u0197\u0198"+
		"\5 \21\2\u0198\u0199\5*\26\2\u0199\u019b\3\2\2\2\u019a\u0196\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u0194\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\63\3\2\2\2\u01a1\u01a2\5X-\2\u01a2\u01a3\7,\2\2\u01a3\u01a4\5\66\34\2"+
		"\u01a4\u01a6\7-\2\2\u01a5\u01a7\58\35\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01ad\5\u0086D\2\u01a9\u01aa\7(\2\2\u01aa"+
		"\u01ac\5\u0086D\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01a8\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\67\3\2\2\2\u01b2\u01b3\7*\2\2"+
		"\u01b3\u01b8\5X-\2\u01b4\u01b5\7(\2\2\u01b5\u01b7\5X-\2\u01b6\u01b4\3"+
		"\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7*\2\2\u01bc9\3\2\2\2\u01bd"+
		"\u01be\5\n\6\2\u01be;\3\2\2\2\u01bf\u01c1\5:\36\2\u01c0\u01bf\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4\5> \2\u01c3\u01c2"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\3\2\2\2\u01c5\u01c7\5@!\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9=\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7\4\2\2\u01cc\u01cd"+
		"\5\u0084C\2\u01cd\u01ce\7+\2\2\u01ce?\3\2\2\2\u01cf\u01e8\7+\2\2\u01d0"+
		"\u01d1\5D#\2\u01d1\u01d2\7+\2\2\u01d2\u01e8\3\2\2\2\u01d3\u01d4\5B\"\2"+
		"\u01d4\u01d5\7+\2\2\u01d5\u01e8\3\2\2\2\u01d6\u01d7\5\64\33\2\u01d7\u01d8"+
		"\7+\2\2\u01d8\u01e8\3\2\2\2\u01d9\u01da\5F$\2\u01da\u01db\7+\2\2\u01db"+
		"\u01e8\3\2\2\2\u01dc\u01e8\5H%\2\u01dd\u01e8\5J&\2\u01de\u01e2\7.\2\2"+
		"\u01df\u01e1\5@!\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e8\7/\2\2\u01e6\u01e8\5h\65\2\u01e7\u01cf\3\2\2\2\u01e7\u01d0\3\2"+
		"\2\2\u01e7\u01d3\3\2\2\2\u01e7\u01d6\3\2\2\2\u01e7\u01d9\3\2\2\2\u01e7"+
		"\u01dc\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e7\u01de\3\2\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8A\3\2\2\2\u01e9\u01ee\5X-\2\u01ea\u01eb\7)\2\2\u01eb\u01ed\5"+
		"X-\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u0208\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\5P"+
		")\2\u01f2\u01f5\7\60\2\2\u01f3\u01f6\5X-\2\u01f4\u01f6\5b\62\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5R*\2\u01f8"+
		"\u0203\5\u0086D\2\u01f9\u01fc\7(\2\2\u01fa\u01fd\5X-\2\u01fb\u01fd\5b"+
		"\62\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\5R*\2\u01ff\u0200\5\u0086D\2\u0200\u0202\3\2\2\2\u0201\u01f9\3"+
		"\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\61\2\2\u0207\u0209\3"+
		"\2\2\2\u0208\u01f1\3\2\2\2\u0208\u0209\3\2\2\2\u0209C\3\2\2\2\u020a\u020b"+
		"\5*\26\2\u020b\u020c\7F\2\2\u020c\u020d\5\u0086D\2\u020d\u021b\3\2\2\2"+
		"\u020e\u0213\5*\26\2\u020f\u0210\7)\2\2\u0210\u0214\5X-\2\u0211\u0212"+
		"\7G\2\2\u0212\u0214\5X-\2\u0213\u020f\3\2\2\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\7F\2\2\u0218\u0219\5\u0086D\2\u0219\u021b\3\2\2\2\u021a"+
		"\u020a\3\2\2\2\u021a\u020e\3\2\2\2\u021bE\3\2\2\2\u021c\u021e\7 \2\2\u021d"+
		"\u021f\5\u0086D\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021fG\3\2\2"+
		"\2\u0220\u0221\7#\2\2\u0221\u0222\7,\2\2\u0222\u0223\5\u0084C\2\u0223"+
		"\u0224\7-\2\2\u0224\u0225\5@!\2\u0225I\3\2\2\2\u0226\u0227\7!\2\2\u0227"+
		"\u0228\7,\2\2\u0228\u0229\5\u0084C\2\u0229\u022a\7-\2\2\u022a\u022d\5"+
		"@!\2\u022b\u022c\7\"\2\2\u022c\u022e\5@!\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022eK\3\2\2\2\u022f\u0230\7&\2\2\u0230M\3\2\2\2\u0231\u0232"+
		"\7\b\2\2\u0232O\3\2\2\2\u0233\u0234\7)\2\2\u0234Q\3\2\2\2\u0235\u0236"+
		"\7A\2\2\u0236S\3\2\2\2\u0237\u0238\7G\2\2\u0238U\3\2\2\2\u0239\u023a\7"+
		"\35\2\2\u023aW\3\2\2\2\u023b\u023c\7N\2\2\u023cY\3\2\2\2\u023d\u023e\7"+
		"J\2\2\u023e[\3\2\2\2\u023f\u0240\7K\2\2\u0240]\3\2\2\2\u0241\u0242\7\33"+
		"\2\2\u0242_\3\2\2\2\u0243\u0244\7\34\2\2\u0244a\3\2\2\2\u0245\u0246\7"+
		"L\2\2\u0246c\3\2\2\2\u0247\u0248\7M\2\2\u0248e\3\2\2\2\u0249\u024a\7I"+
		"\2\2\u024ag\3\2\2\2\u024b\u024c\7K\2\2\u024ci\3\2\2\2\u024d\u0272\5V,"+
		"\2\u024e\u0272\5Z.\2\u024f\u0272\5^\60\2\u0250\u0272\5`\61\2\u0251\u0272"+
		"\5b\62\2\u0252\u0272\5d\63\2\u0253\u0272\5f\64\2\u0254\u0255\7.\2\2\u0255"+
		"\u025a\5\u0086D\2\u0256\u0257\7(\2\2\u0257\u0259\5\u0086D\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\7/\2\2\u025e\u0272\3\2"+
		"\2\2\u025f\u0260\7\60\2\2\u0260\u0265\5\u0086D\2\u0261\u0262\7(\2\2\u0262"+
		"\u0264\5\u0086D\2\u0263\u0261\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u0269\7\61\2\2\u0269\u0272\3\2\2\2\u026a\u0272\5\64\33\2\u026b\u0272"+
		"\5X-\2\u026c\u026d\7,\2\2\u026d\u026e\5\u0086D\2\u026e\u026f\7-\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u024d\3\2\2\2\u0271\u024e\3\2"+
		"\2\2\u0271\u024f\3\2\2\2\u0271\u0250\3\2\2\2\u0271\u0251\3\2\2\2\u0271"+
		"\u0252\3\2\2\2\u0271\u0253\3\2\2\2\u0271\u0254\3\2\2\2\u0271\u025f\3\2"+
		"\2\2\u0271\u026a\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u026c\3\2\2\2\u0271"+
		"\u0270\3\2\2\2\u0272\u0290\3\2\2\2\u0273\u0274\7)\2\2\u0274\u0277\7\60"+
		"\2\2\u0275\u0278\5X-\2\u0276\u0278\5b\62\2\u0277\u0275\3\2\2\2\u0277\u0276"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5R*\2\u027a\u0285\5\u0086D\2"+
		"\u027b\u027e\7(\2\2\u027c\u027f\5X-\2\u027d\u027f\5b\62\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\5R*\2\u0281"+
		"\u0282\5\u0086D\2\u0282\u0284\3\2\2\2\u0283\u027b\3\2\2\2\u0284\u0287"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u0289\7\61\2\2\u0289\u028f\3\2\2\2\u028a\u028b\7"+
		")\2\2\u028b\u028f\5X-\2\u028c\u028d\7G\2\2\u028d\u028f\5X-\2\u028e\u0273"+
		"\3\2\2\2\u028e\u028a\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291k\3\2\2\2\u0292\u0290\3\2\2\2"+
		"\u0293\u0294\7\67\2\2\u0294\u029b\5l\67\2\u0295\u0296\7\64\2\2\u0296\u029b"+
		"\5l\67\2\u0297\u0298\7H\2\2\u0298\u029b\5l\67\2\u0299\u029b\5j\66\2\u029a"+
		"\u0293\3\2\2\2\u029a\u0295\3\2\2\2\u029a\u0297\3\2\2\2\u029a\u0299\3\2"+
		"\2\2\u029bm\3\2\2\2\u029c\u029d\t\2\2\2\u029d\u02a0\5j\66\2\u029e\u02a0"+
		"\5l\67\2\u029f\u029c\3\2\2\2\u029f\u029e\3\2\2\2\u02a0o\3\2\2\2\u02a1"+
		"\u02a2\5n8\2\u02a2q\3\2\2\2\u02a3\u02b0\5p9\2\u02a4\u02a5\7\64\2\2\u02a5"+
		"\u02af\5p9\2\u02a6\u02a7\7\65\2\2\u02a7\u02af\5p9\2\u02a8\u02a9\7\66\2"+
		"\2\u02a9\u02af\5p9\2\u02aa\u02ab\7C\2\2\u02ab\u02af\5p9\2\u02ac\u02ad"+
		"\7D\2\2\u02ad\u02af\5p9\2\u02ae\u02a4\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae"+
		"\u02a8\3\2\2\2\u02ae\u02aa\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b2\3\2"+
		"\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1s\3\2\2\2\u02b2\u02b0"+
		"\3\2\2\2\u02b3\u02bc\5r:\2\u02b4\u02b5\7\62\2\2\u02b5\u02bb\5r:\2\u02b6"+
		"\u02b7\7\63\2\2\u02b7\u02bb\5r:\2\u02b8\u02b9\7E\2\2\u02b9\u02bb\5r:\2"+
		"\u02ba\u02b4\3\2\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02be"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdu\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02d0\5t;\2\u02c0\u02c1\7\60\2\2\u02c1\u02d1\5t;"+
		"\2\u02c2\u02c3\7=\2\2\u02c3\u02d1\5t;\2\u02c4\u02c5\7\61\2\2\u02c5\u02d1"+
		"\5t;\2\u02c6\u02c7\7<\2\2\u02c7\u02d1\5t;\2\u02c8\u02c9\7B\2\2\u02c9\u02d1"+
		"\5t;\2\u02ca\u02cb\7A\2\2\u02cb\u02d1\5t;\2\u02cc\u02cd\7>\2\2\u02cd\u02d1"+
		"\5t;\2\u02ce\u02cf\7?\2\2\u02cf\u02d1\5t;\2\u02d0\u02c0\3\2\2\2\u02d0"+
		"\u02c2\3\2\2\2\u02d0\u02c4\3\2\2\2\u02d0\u02c6\3\2\2\2\u02d0\u02c8\3\2"+
		"\2\2\u02d0\u02ca\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1w\3\2\2\2\u02d2\u02d7\5X-\2\u02d3\u02d4\7(\2\2\u02d4"+
		"\u02d6\5X-\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2"+
		"\2\u02d7\u02d8\3\2\2\2\u02d8\u02e6\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db"+
		"\7,\2\2\u02db\u02e0\5X-\2\u02dc\u02dd\7(\2\2\u02dd\u02df\5X-\2\u02de\u02dc"+
		"\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e3\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7-\2\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02d2\3\2\2\2\u02e5\u02da\3\2\2\2\u02e6y\3\2\2\2\u02e7\u02e8"+
		"\7;\2\2\u02e8\u02e9\5x=\2\u02e9\u02ea\7,\2\2\u02ea\u02eb\5\u0084C\2\u02eb"+
		"\u02ec\7-\2\2\u02ec\u02f4\3\2\2\2\u02ed\u02ee\7\'\2\2\u02ee\u02ef\5x="+
		"\2\u02ef\u02f0\7,\2\2\u02f0\u02f1\5\u0082B\2\u02f1\u02f2\7-\2\2\u02f2"+
		"\u02f4\3\2\2\2\u02f3\u02e7\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f4{\3\2\2\2"+
		"\u02f5\u02f8\5z>\2\u02f6\u02f8\5v<\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6\3"+
		"\2\2\2\u02f8}\3\2\2\2\u02f9\u02fe\5|?\2\u02fa\u02fb\78\2\2\u02fb\u02fd"+
		"\5|?\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\177\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0306\5~@\2"+
		"\u0302\u0303\79\2\2\u0303\u0305\5~@\2\u0304\u0302\3\2\2\2\u0305\u0308"+
		"\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0081\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0309\u030a\5\u0080A\2\u030a\u030b\7:\2\2\u030b\u030c\5"+
		"\u0080A\2\u030c\u0083\3\2\2\2\u030d\u0312\5\u0080A\2\u030e\u030f\7:\2"+
		"\2\u030f\u0311\5\u0080A\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0085\3\2\2\2\u0314\u0312\3\2"+
		"\2\2\u0315\u0316\5\u0084C\2\u0316\u0087\3\2\2\2N\u008b\u008f\u0092\u0095"+
		"\u009c\u00a5\u00ab\u00af\u00b9\u00bb\u00c1\u00c7\u00cb\u00da\u00e8\u00ef"+
		"\u0100\u010c\u0118\u0121\u0123\u013f\u0146\u0150\u015a\u0160\u0164\u0169"+
		"\u0175\u017e\u0188\u0192\u019c\u019f\u01a6\u01ad\u01b0\u01b8\u01c0\u01c3"+
		"\u01c8\u01e2\u01e7\u01ee\u01f5\u01fc\u0203\u0208\u0213\u0215\u021a\u021e"+
		"\u022d\u025a\u0265\u0271\u0277\u027e\u0285\u028e\u0290\u029a\u029f\u02ae"+
		"\u02b0\u02ba\u02bc\u02d0\u02d7\u02e0\u02e5\u02f3\u02f7\u02fe\u0306\u0312";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}