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
		COMMA=38, POINT=39, AT=40, SEMICOLON=41, ASSIGN_SYMBOL=42, L_BRACKET=43, 
		R_BRACKET=44, L_BRACE=45, R_BRACE=46, L_ANGLE_BRACKET=47, R_ANGLE_BRACKET=48, 
		ADD=49, SUB=50, MUL=51, DIV=52, MOD=53, NOT=54, CONJUNCTION=55, DISJUNCTION=56, 
		IMPLICATION=57, EXIST=58, EGRE=59, ELES=60, EQU=61, UEQU=62, SEPERATOR=63, 
		BELONG=64, NOTBELONG=65, INTER=66, UNION=67, DIFFER=68, ASSIGNMENT=69, 
		ADDRGET=70, ADDR=71, CHAR=72, STRING=73, AT_STR=74, INTEGER=75, REAL=76, 
		ID=77, WS=78, COMMENT=79;
	public static final String[] tokenNames = {
		"<INVALID>", "'MACHINE'", "'INVARIANT'", "'ATTRIBUTE'", "'OPERATIONS'", 
		"'END'", "'INCLUDE'", "'FUNCTION'", "'ROBUST'", "'Precondition'", "'Postcondition'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'string'", 
		"'proposition'", "'set'", "'tuple'", "'bool'", "'enum'", "'const'", "'unsigned'", 
		"'true'", "'false'", "'nil'", "'struct'", "'void'", "'return'", "'if'", 
		"'else'", "'while'", "'typedef'", "'.bs'", "'#define'", "'#'", "','", 
		"'.'", "'@'", "';'", "ASSIGN_SYMBOL", "'('", "')'", "'{'", "'}'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&&'", "'||'", "'=>'", 
		"'!'", "'>='", "'<='", "'=='", "'!='", "'|'", "':'", "'!:'", "'/-\\'", 
		"'\\-/'", "'--'", "ASSIGNMENT", "'->'", "'&'", "CHAR", "STRING", "AT_STR", 
		"INTEGER", "REAL", "ID", "WS", "COMMENT"
	};
	public static final int
		RULE_abmachine = 0, RULE_machine = 1, RULE_machine_h = 2, RULE_machine_l = 3, 
		RULE_defines = 4, RULE_includes = 5, RULE_declares = 6, RULE_attributes = 7, 
		RULE_attributes_2 = 8, RULE_cv_define = 9, RULE_type = 10, RULE_normal_type = 11, 
		RULE_set_type = 12, RULE_tuple_type = 13, RULE_enum_type = 14, RULE_point_id = 15, 
		RULE_addr_id = 16, RULE_var_define = 17, RULE_cst_define = 18, RULE_invariant = 19, 
		RULE_operations = 20, RULE_declare_operations = 21, RULE_robust = 22, 
		RULE_function = 23, RULE_cfunction_declare = 24, RULE_cdeclare_operations = 25, 
		RULE_function_define = 26, RULE_function_declare = 27, RULE_para_define_list = 28, 
		RULE_function_call = 29, RULE_para_value_list = 30, RULE_append_paras = 31, 
		RULE_com_statement = 32, RULE_statement = 33, RULE_element_take = 34, 
		RULE_assign_stat = 35, RULE_return_stat = 36, RULE_while_stat = 37, RULE_if_stat = 38, 
		RULE_define = 39, RULE_include = 40, RULE_point = 41, RULE_belong = 42, 
		RULE_addr_get = 43, RULE_nil = 44, RULE_id = 45, RULE_string = 46, RULE_at_str = 47, 
		RULE_true_str = 48, RULE_false_str = 49, RULE_integer = 50, RULE_real = 51, 
		RULE_char_str = 52, RULE_statement_at = 53, RULE_term = 54, RULE_one_e = 55, 
		RULE_unary_e = 56, RULE_mse_0 = 57, RULE_mse_1 = 58, RULE_mse = 59, RULE_condition_term = 60, 
		RULE_id_list = 61, RULE_quan_e = 62, RULE_pro_term_e = 63, RULE_and_pro_e = 64, 
		RULE_or_pro_e = 65, RULE_imp_pro_e = 66, RULE_pro_e = 67, RULE_element = 68;
	public static final String[] ruleNames = {
		"abmachine", "machine", "machine_h", "machine_l", "defines", "includes", 
		"declares", "attributes", "attributes_2", "cv_define", "type", "normal_type", 
		"set_type", "tuple_type", "enum_type", "point_id", "addr_id", "var_define", 
		"cst_define", "invariant", "operations", "declare_operations", "robust", 
		"function", "cfunction_declare", "cdeclare_operations", "function_define", 
		"function_declare", "para_define_list", "function_call", "para_value_list", 
		"append_paras", "com_statement", "statement", "element_take", "assign_stat", 
		"return_stat", "while_stat", "if_stat", "define", "include", "point", 
		"belong", "addr_get", "nil", "id", "string", "at_str", "true_str", "false_str", 
		"integer", "real", "char_str", "statement_at", "term", "one_e", "unary_e", 
		"mse_0", "mse_1", "mse", "condition_term", "id_list", "quan_e", "pro_term_e", 
		"and_pro_e", "or_pro_e", "imp_pro_e", "pro_e", "element"
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
		public Machine_lContext machine_l() {
			return getRuleContext(Machine_lContext.class,0);
		}
		public Machine_hContext machine_h() {
			return getRuleContext(Machine_hContext.class,0);
		}
		public MachineContext machine() {
			return getRuleContext(MachineContext.class,0);
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
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); machine();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); machine_h();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); machine_l();
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

	public static class MachineContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public MachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MachineContext machine() throws RecognitionException {
		MachineContext _localctx = new MachineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(MACHINE);
			setState(144); id();
			setState(146);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(145); includes();
				}
			}

			setState(149);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(148); attributes();
				}
			}

			setState(152);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(151); operations();
				}
			}

			setState(154); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Machine_hContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public Declare_operationsContext declare_operations() {
			return getRuleContext(Declare_operationsContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public Machine_hContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine_h; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMachine_h(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Machine_hContext machine_h() throws RecognitionException {
		Machine_hContext _localctx = new Machine_hContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_machine_h);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(MACHINE);
			setState(157); id();
			setState(159);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(158); includes();
				}
			}

			setState(162);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(161); attributes();
				}
			}

			setState(165);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(164); declare_operations();
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

	public static class Machine_lContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public Cdeclare_operationsContext cdeclare_operations() {
			return getRuleContext(Cdeclare_operationsContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public Machine_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine_l; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMachine_l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Machine_lContext machine_l() throws RecognitionException {
		Machine_lContext _localctx = new Machine_lContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_machine_l);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(MACHINE);
			setState(170); id();
			setState(172);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(171); includes();
				}
			}

			setState(175);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(174); attributes();
				}
			}

			setState(178);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(177); cdeclare_operations();
				}
			}

			setState(180); match(END);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182); define();
				setState(183); id();
				setState(184); element();
				}
				}
				setState(188); 
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
		enterRule(_localctx, 10, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190); include();
				setState(197);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(191); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(192); match(L_ANGLE_BRACKET);
					setState(193); id();
					setState(194); match(SUF);
					setState(195); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); match(SEMICOLON);
				}
				}
				setState(203); 
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
		enterRule(_localctx, 12, RULE_declares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205); function_declare();
				}
				}
				setState(208); 
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
		enterRule(_localctx, 14, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(ATTRIBUTE);
			setState(212);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(211); defines();
				}
			}

			setState(214); cv_define();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_attributes_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); cv_define();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_cv_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(224);
				switch (_input.LA(1)) {
				case TYPEDEF:
					{
					setState(218); var_define();
					setState(219); match(SEMICOLON);
					}
					break;
				case CONST:
					{
					setState(221); cst_define();
					setState(222); match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONST || _la==TYPEDEF );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(237);
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
				setState(228); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); id();
				setState(235);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(231); match(L_ANGLE_BRACKET);
					setState(232); type();
					setState(233); match(R_ANGLE_BRACKET);
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
		enterRule(_localctx, 22, RULE_normal_type);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(UNSIGNED);
				setState(241); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243); match(UNSIGNED);
				setState(244); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246); match(UNSIGNED);
				setState(247); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248); match(LONG_TYPE);
				setState(249); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(250); match(UNSIGNED);
				setState(251); match(LONG_TYPE);
				setState(252); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254); match(UNSIGNED);
				setState(255); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(257); match(UNSIGNED);
				setState(258); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(259); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(260); match(UNSIGNED);
				setState(261); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(262); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(263); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(264); match(VOID);
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
		enterRule(_localctx, 24, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(SET_TYPE);
			setState(268); match(L_ANGLE_BRACKET);
			setState(269); type();
			setState(270); match(R_ANGLE_BRACKET);
			setState(272);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(271); at_str();
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

	public static class Tuple_typeContext extends ParserRuleContext {
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
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(STRUCT);
			setState(275); match(L_BRACE);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(276); type();
				setState(277); point_id();
				setState(278); match(SEMICOLON);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
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
		enterRule(_localctx, 28, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(ENUM_TYPE);
			setState(288); match(L_BRACKET);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(289); id();
				setState(292);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(290); match(ASSIGNMENT);
					setState(291); unary_e();
					}
				}

				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294); match(COMMA);
					setState(295); id();
					setState(298);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(296); match(ASSIGNMENT);
						setState(297); unary_e();
						}
					}

					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_point_id);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); match(MUL);
				setState(313); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(315); match(L_BRACKET);
				setState(316); point_id();
				setState(317); match(R_BRACKET);
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
		enterRule(_localctx, 32, RULE_addr_id);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); match(ADDR);
				setState(322); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); match(L_BRACKET);
				setState(325); addr_id();
				setState(326); match(R_BRACKET);
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

	public static class Var_defineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public TerminalNode TYPEDEF() { return getToken(BStarParser.TYPEDEF, 0); }
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
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
		enterRule(_localctx, 34, RULE_var_define);
		int _la;
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(TYPEDEF);
				setState(331); point_id();
				setState(334);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(332); match(ASSIGNMENT);
					setState(333); element();
					}
				}

				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(336); match(COMMA);
					setState(337); point_id();
					setState(340);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(338); match(ASSIGNMENT);
						setState(339); element();
						}
					}

					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); match(TYPEDEF);
				setState(348); enum_type();
				setState(349); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); match(TYPEDEF);
				setState(352); type();
				setState(353); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355); match(TYPEDEF);
				setState(356); tuple_type();
				setState(357); point_id();
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
		enterRule(_localctx, 36, RULE_cst_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(CONST);
			setState(362); type();
			setState(363); point_id();
			setState(364); match(ASSIGNMENT);
			setState(365); element();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366); match(COMMA);
				setState(367); point_id();
				setState(368); match(ASSIGNMENT);
				setState(369); element();
				}
				}
				setState(375);
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
		enterRule(_localctx, 38, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(INVARIANT);
			setState(377); pro_e();
			setState(378); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(OPERATIONS);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381); function_define();
				}
				}
				setState(384); 
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
		enterRule(_localctx, 42, RULE_declare_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(OPERATIONS);
			setState(387); declares();
			}
		}
		catch (RecognitionException re) {
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
			setState(389); match(ROBUST);
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390); match(PRECONDITION);
				setState(391); pro_e();
				setState(392); match(POSTCONDITION);
				setState(393); pro_e();
				}
				}
				setState(397); 
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
			setState(399); match(FUNCTION);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400); match(PRECONDITION);
				setState(401); pro_e();
				setState(402); match(POSTCONDITION);
				setState(403); pro_e();
				}
				}
				setState(407); 
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
		enterRule(_localctx, 48, RULE_cfunction_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); function_declare();
			setState(410); robust();
			setState(411); function();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_cdeclare_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(OPERATIONS);
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414); cfunction_declare();
				}
				}
				setState(417); 
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
		enterRule(_localctx, 52, RULE_function_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); type();
			setState(420); point_id();
			setState(421); match(L_BRACKET);
			setState(422); para_define_list();
			setState(423); match(R_BRACKET);
			setState(424); match(L_BRACE);
			setState(425); com_statement();
			setState(426); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_function_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); type();
			setState(429); point_id();
			setState(430); match(L_BRACKET);
			setState(431); para_define_list();
			setState(432); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_para_define_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(434); type();
				setState(435); point_id();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(436); match(COMMA);
					setState(437); type();
					setState(438); point_id();
					}
					}
					setState(444);
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
		enterRule(_localctx, 58, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); id();
			setState(448); match(L_BRACKET);
			setState(449); para_value_list();
			setState(450); match(R_BRACKET);
			setState(452);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(451); append_paras();
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
		public TerminalNode COMMA() { return getToken(BStarParser.COMMA, 0); }
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
		enterRule(_localctx, 60, RULE_para_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (FORALL - 25)) | (1L << (COMMA - 25)) | (1L << (POINT - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (R_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (DIV - 25)) | (1L << (MOD - 25)) | (1L << (NOT - 25)) | (1L << (CONJUNCTION - 25)) | (1L << (DISJUNCTION - 25)) | (1L << (IMPLICATION - 25)) | (1L << (EXIST - 25)) | (1L << (EGRE - 25)) | (1L << (ELES - 25)) | (1L << (EQU - 25)) | (1L << (UEQU - 25)) | (1L << (BELONG - 25)) | (1L << (NOTBELONG - 25)) | (1L << (INTER - 25)) | (1L << (UNION - 25)) | (1L << (DIFFER - 25)) | (1L << (ADDRGET - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(454); element();
				{
				setState(455); match(COMMA);
				setState(456); element();
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
		enterRule(_localctx, 62, RULE_append_paras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(AT);
			setState(461); id();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462); match(COMMA);
				setState(463); id();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469); match(AT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_com_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if (_la==CONST || _la==TYPEDEF) {
				{
				setState(471); attributes_2();
				}
			}

			setState(475);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(474); invariant();
				}
			}

			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				{
				setState(477); statement();
				}
				}
				setState(482);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Statement_atContext statement_at() {
			return getRuleContext(Statement_atContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Element_takeContext element_take() {
			return getRuleContext(Element_takeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484); element_take();
				setState(485); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487); function_call();
				setState(488); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490); assign_stat();
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
				setState(498); match(L_BRACKET);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (RETURN - 30)) | (1L << (IF - 30)) | (1L << (WHILE - 30)) | (1L << (SEMICOLON - 30)) | (1L << (L_BRACKET - 30)) | (1L << (MUL - 30)) | (1L << (AT_STR - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					{
					setState(499); statement();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505); match(R_BRACKET);
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
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
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
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(510); point();
					setState(511); id();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(541);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(518); point();
				setState(519); match(L_ANGLE_BRACKET);
				setState(522);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(520); id();
					}
					break;
				case INTEGER:
					{
					setState(521); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(524); belong();
				setState(525); element();
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(526); match(COMMA);
					setState(529);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(527); id();
						}
						break;
					case INTEGER:
						{
						setState(528); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(531); belong();
					setState(532); element();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539); match(R_ANGLE_BRACKET);
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
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public List<TerminalNode> ADDRGET() { return getTokens(BStarParser.ADDRGET); }
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
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
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543); point_id();
				setState(544); match(ASSIGNMENT);
				setState(545); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547); point_id();
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(553);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(548); point();
						setState(549); id();
						}
						break;
					case ADDRGET:
						{
						setState(551); match(ADDRGET);
						setState(552); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(557); match(ASSIGNMENT);
				setState(558); element();
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
			setState(562); match(RETURN);
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(563); element();
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
			setState(566); match(WHILE);
			setState(567); match(L_BRACKET);
			setState(568); pro_e();
			setState(569); match(R_BRACKET);
			setState(570); statement();
			}
		}
		catch (RecognitionException re) {
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
			setState(572); match(IF);
			setState(573); match(L_BRACKET);
			setState(574); pro_e();
			setState(575); match(R_BRACKET);
			setState(576); statement();
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(577); match(ELSE);
				setState(578); statement();
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
			setState(581); match(DEFINE);
			}
		}
		catch (RecognitionException re) {
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
			setState(583); match(INCLUDE);
			}
		}
		catch (RecognitionException re) {
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
			setState(585); match(POINT);
			}
		}
		catch (RecognitionException re) {
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
			setState(587); match(BELONG);
			}
		}
		catch (RecognitionException re) {
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
			setState(589); match(ADDRGET);
			}
		}
		catch (RecognitionException re) {
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
			setState(591); match(NIL);
			}
		}
		catch (RecognitionException re) {
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
			setState(593); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(595); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
			setState(597); match(AT_STR);
			}
		}
		catch (RecognitionException re) {
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
			setState(599); match(TRUE);
			}
		}
		catch (RecognitionException re) {
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
			setState(601); match(FALSE);
			}
		}
		catch (RecognitionException re) {
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
			setState(603); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
			setState(605); match(REAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(607); match(CHAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(609); match(AT_STR);
			}
		}
		catch (RecognitionException re) {
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
		public List<Addr_getContext> addr_get() {
			return getRuleContexts(Addr_getContext.class);
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
		public BelongContext belong(int i) {
			return getRuleContext(BelongContext.class,i);
		}
		public List<BelongContext> belong() {
			return getRuleContexts(BelongContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
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
		public Addr_getContext addr_get(int i) {
			return getRuleContext(Addr_getContext.class,i);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public True_strContext true_str() {
			return getRuleContext(True_strContext.class,0);
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
		enterRule(_localctx, 108, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(611); nil();
				}
				break;

			case 2:
				{
				setState(612); string();
				}
				break;

			case 3:
				{
				setState(613); true_str();
				}
				break;

			case 4:
				{
				setState(614); false_str();
				}
				break;

			case 5:
				{
				setState(615); integer();
				}
				break;

			case 6:
				{
				setState(616); real();
				}
				break;

			case 7:
				{
				setState(617); char_str();
				}
				break;

			case 8:
				{
				setState(618); match(L_BRACE);
				setState(619); element();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(620); match(COMMA);
					setState(621); element();
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627); match(R_BRACE);
				}
				break;

			case 9:
				{
				setState(629); match(L_ANGLE_BRACKET);
				setState(630); element();
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(631); match(COMMA);
					setState(632); element();
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638); match(R_ANGLE_BRACKET);
				}
				break;

			case 10:
				{
				setState(640); function_call();
				}
				break;

			case 11:
				{
				setState(641); id();
				}
				break;

			case 12:
				{
				setState(642); match(L_BRACKET);
				setState(643); element();
				setState(644); match(R_BRACKET);
				}
				break;

			case 13:
				{
				}
				break;
			}
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==ADDRGET) {
				{
				setState(678);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(649); point();
					setState(650); match(L_ANGLE_BRACKET);
					setState(653);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(651); id();
						}
						break;
					case INTEGER:
						{
						setState(652); integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(655); belong();
					setState(656); element();
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(657); match(COMMA);
						setState(660);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(658); id();
							}
							break;
						case INTEGER:
							{
							setState(659); integer();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(662); belong();
						setState(663); element();
						}
						}
						setState(669);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(670); match(R_ANGLE_BRACKET);
					}
					break;

				case 2:
					{
					setState(672); point();
					setState(673); id();
					}
					break;

				case 3:
					{
					setState(675); addr_get();
					setState(676); id();
					}
					break;
				}
				}
				setState(682);
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
			setState(690);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683); match(NOT);
				setState(684); one_e();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685); match(MUL);
				setState(686); one_e();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687); match(ADDR);
				setState(688); one_e();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689); term();
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
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(693); term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); one_e();
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
			setState(697); unary_e();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_mse_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699); mse_0();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MUL - 51)) | (1L << (DIV - 51)) | (1L << (MOD - 51)) | (1L << (INTER - 51)) | (1L << (UNION - 51)))) != 0)) {
				{
				setState(710);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(700); match(MUL);
					setState(701); mse_0();
					}
					break;
				case DIV:
					{
					setState(702); match(DIV);
					setState(703); mse_0();
					}
					break;
				case MOD:
					{
					setState(704); match(MOD);
					setState(705); mse_0();
					}
					break;
				case INTER:
					{
					setState(706); match(INTER);
					setState(707); mse_0();
					}
					break;
				case UNION:
					{
					setState(708); match(UNION);
					setState(709); mse_0();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(714);
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
		enterRule(_localctx, 118, RULE_mse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); mse_1();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (DIFFER - 49)))) != 0)) {
				{
				setState(722);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(716); match(ADD);
					setState(717); mse_1();
					}
					break;
				case SUB:
					{
					setState(718); match(SUB);
					setState(719); mse_1();
					}
					break;
				case DIFFER:
					{
					setState(720); match(DIFFER);
					setState(721); mse_1();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(726);
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
		enterRule(_localctx, 120, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); mse();
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(728); match(L_ANGLE_BRACKET);
				setState(729); mse();
				}
				break;

			case 2:
				{
				setState(730); match(ELES);
				setState(731); mse();
				}
				break;

			case 3:
				{
				setState(732); match(R_ANGLE_BRACKET);
				setState(733); mse();
				}
				break;

			case 4:
				{
				setState(734); match(EGRE);
				setState(735); mse();
				}
				break;

			case 5:
				{
				setState(736); match(NOTBELONG);
				setState(737); mse();
				}
				break;

			case 6:
				{
				setState(738); match(BELONG);
				setState(739); mse();
				}
				break;

			case 7:
				{
				setState(740); match(EQU);
				setState(741); mse();
				}
				break;

			case 8:
				{
				setState(742); match(UEQU);
				setState(743); mse();
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
		enterRule(_localctx, 122, RULE_id_list);
		int _la;
		try {
			setState(765);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(746); id();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(747); match(COMMA);
					setState(748); id();
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(754); match(L_BRACKET);
				setState(755); id();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(756); match(COMMA);
					setState(757); id();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763); match(R_BRACKET);
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
		enterRule(_localctx, 124, RULE_quan_e);
		try {
			setState(779);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(767); match(EXIST);
				setState(768); id_list();
				setState(769); match(L_BRACKET);
				setState(770); pro_e();
				setState(771); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(773); match(FORALL);
				setState(774); id_list();
				setState(775); match(L_BRACKET);
				setState(776); imp_pro_e();
				setState(777); match(R_BRACKET);
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
		enterRule(_localctx, 126, RULE_pro_term_e);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(781); quan_e();
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
				setState(782); condition_term();
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
		enterRule(_localctx, 128, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); pro_term_e();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(786); match(CONJUNCTION);
				setState(787); pro_term_e();
				}
				}
				setState(792);
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
		enterRule(_localctx, 130, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); and_pro_e();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(794); match(DISJUNCTION);
				setState(795); and_pro_e();
				}
				}
				setState(800);
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
		enterRule(_localctx, 132, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801); or_pro_e();
			setState(802); match(IMPLICATION);
			setState(803); or_pro_e();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 134, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); or_pro_e();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(806); match(IMPLICATION);
				setState(807); or_pro_e();
				}
				}
				setState(812);
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
		enterRule(_localctx, 136, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813); pro_e();
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3Q\u0332\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\5\2"+
		"\u0090\n\2\3\3\3\3\3\3\5\3\u0095\n\3\3\3\5\3\u0098\n\3\3\3\5\3\u009b\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\5\4\u00a2\n\4\3\4\5\4\u00a5\n\4\3\4\5\4\u00a8\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\5\5\u00af\n\5\3\5\5\5\u00b2\n\5\3\5\5\5\u00b5\n"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u00bd\n\6\r\6\16\6\u00be\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\7\3\7\6\7\u00cc\n\7\r\7\16\7\u00cd\3\b"+
		"\6\b\u00d1\n\b\r\b\16\b\u00d2\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\6\13\u00e3\n\13\r\13\16\13\u00e4\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ee\n\f\5\f\u00f0\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u010c\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0113\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u011b\n\17\f\17\16\17\u011e\13\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0127\n\20\3\20\3\20\3\20\3\20"+
		"\5\20\u012d\n\20\7\20\u012f\n\20\f\20\16\20\u0132\13\20\7\20\u0134\n\20"+
		"\f\20\16\20\u0137\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0142\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014b\n\22\3\23"+
		"\3\23\3\23\3\23\5\23\u0151\n\23\3\23\3\23\3\23\3\23\5\23\u0157\n\23\7"+
		"\23\u0159\n\23\f\23\16\23\u015c\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0176\n\24\f\24\16\24\u0179\13\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\6\26\u0181\n\26\r\26\16\26\u0182\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u018e\n\30\r\30\16\30\u018f\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\6\31\u0198\n\31\r\31\16\31\u0199\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\6\33\u01a2\n\33\r\33\16\33\u01a3\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u01bb\n\36\f\36\16\36\u01be\13\36\5\36\u01c0\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u01c7\n\37\3 \3 \3 \3 \5 \u01cd\n \3!\3"+
		"!\3!\3!\7!\u01d3\n!\f!\16!\u01d6\13!\3!\3!\3\"\5\"\u01db\n\"\3\"\5\"\u01de"+
		"\n\"\3\"\7\"\u01e1\n\"\f\"\16\"\u01e4\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01f7\n#\f#\16#\u01fa\13#\3#\3#\5#\u01fe\n"+
		"#\3$\3$\3$\3$\7$\u0204\n$\f$\16$\u0207\13$\3$\3$\3$\3$\5$\u020d\n$\3$"+
		"\3$\3$\3$\3$\5$\u0214\n$\3$\3$\3$\7$\u0219\n$\f$\16$\u021c\13$\3$\3$\5"+
		"$\u0220\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u022c\n%\r%\16%\u022d\3%\3"+
		"%\3%\5%\u0233\n%\3&\3&\5&\u0237\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u0246\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\78\u0271\n8\f8\168\u0274\138\3"+
		"8\38\38\38\38\38\78\u027c\n8\f8\168\u027f\138\38\38\38\38\38\38\38\38"+
		"\38\58\u028a\n8\38\38\38\38\58\u0290\n8\38\38\38\38\38\58\u0297\n8\38"+
		"\38\38\78\u029c\n8\f8\168\u029f\138\38\38\38\38\38\38\38\38\78\u02a9\n"+
		"8\f8\168\u02ac\138\39\39\39\39\39\39\39\59\u02b5\n9\3:\3:\3:\5:\u02ba"+
		"\n:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u02c9\n<\f<\16<\u02cc\13"+
		"<\3=\3=\3=\3=\3=\3=\3=\7=\u02d5\n=\f=\16=\u02d8\13=\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u02eb\n>\3?\3?\3?\7?\u02f0\n?\f?"+
		"\16?\u02f3\13?\3?\3?\3?\3?\7?\u02f9\n?\f?\16?\u02fc\13?\3?\3?\5?\u0300"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u030e\n@\3A\3A\5A\u0312\nA"+
		"\3B\3B\3B\7B\u0317\nB\fB\16B\u031a\13B\3C\3C\3C\7C\u031f\nC\fC\16C\u0322"+
		"\13C\3D\3D\3D\3D\3E\3E\3E\7E\u032b\nE\fE\16E\u032e\13E\3F\3F\3F\2G\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\2\3\3\2\63"+
		"\64\u0371\2\u008f\3\2\2\2\4\u0091\3\2\2\2\6\u009e\3\2\2\2\b\u00ab\3\2"+
		"\2\2\n\u00bc\3\2\2\2\f\u00cb\3\2\2\2\16\u00d0\3\2\2\2\20\u00d4\3\2\2\2"+
		"\22\u00da\3\2\2\2\24\u00e2\3\2\2\2\26\u00ef\3\2\2\2\30\u010b\3\2\2\2\32"+
		"\u010d\3\2\2\2\34\u0114\3\2\2\2\36\u0121\3\2\2\2 \u0141\3\2\2\2\"\u014a"+
		"\3\2\2\2$\u0169\3\2\2\2&\u016b\3\2\2\2(\u017a\3\2\2\2*\u017e\3\2\2\2,"+
		"\u0184\3\2\2\2.\u0187\3\2\2\2\60\u0191\3\2\2\2\62\u019b\3\2\2\2\64\u019f"+
		"\3\2\2\2\66\u01a5\3\2\2\28\u01ae\3\2\2\2:\u01bf\3\2\2\2<\u01c1\3\2\2\2"+
		">\u01cc\3\2\2\2@\u01ce\3\2\2\2B\u01da\3\2\2\2D\u01fd\3\2\2\2F\u01ff\3"+
		"\2\2\2H\u0232\3\2\2\2J\u0234\3\2\2\2L\u0238\3\2\2\2N\u023e\3\2\2\2P\u0247"+
		"\3\2\2\2R\u0249\3\2\2\2T\u024b\3\2\2\2V\u024d\3\2\2\2X\u024f\3\2\2\2Z"+
		"\u0251\3\2\2\2\\\u0253\3\2\2\2^\u0255\3\2\2\2`\u0257\3\2\2\2b\u0259\3"+
		"\2\2\2d\u025b\3\2\2\2f\u025d\3\2\2\2h\u025f\3\2\2\2j\u0261\3\2\2\2l\u0263"+
		"\3\2\2\2n\u0289\3\2\2\2p\u02b4\3\2\2\2r\u02b9\3\2\2\2t\u02bb\3\2\2\2v"+
		"\u02bd\3\2\2\2x\u02cd\3\2\2\2z\u02d9\3\2\2\2|\u02ff\3\2\2\2~\u030d\3\2"+
		"\2\2\u0080\u0311\3\2\2\2\u0082\u0313\3\2\2\2\u0084\u031b\3\2\2\2\u0086"+
		"\u0323\3\2\2\2\u0088\u0327\3\2\2\2\u008a\u032f\3\2\2\2\u008c\u0090\5\4"+
		"\3\2\u008d\u0090\5\6\4\2\u008e\u0090\5\b\5\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\3\3\2\2\2\u0091\u0092\7\3\2\2"+
		"\u0092\u0094\5\\/\2\u0093\u0095\5\f\7\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\20\t\2\u0097\u0096\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5*\26\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\7\2\2\u009d"+
		"\5\3\2\2\2\u009e\u009f\7\3\2\2\u009f\u00a1\5\\/\2\u00a0\u00a2\5\f\7\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5"+
		"\5\20\t\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6\u00a8\5,\27\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\7\7\2\2\u00aa\7\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac"+
		"\u00ae\5\\/\2\u00ad\u00af\5\f\7\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5\20\t\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5\64\33\2\u00b4\u00b3\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7"+
		"\t\3\2\2\2\u00b8\u00b9\5P)\2\u00b9\u00ba\5\\/\2\u00ba\u00bb\5\u008aF\2"+
		"\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\13\3\2\2\2\u00c0\u00c7\5R*\2\u00c1"+
		"\u00c8\5^\60\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\5\\/\2\u00c4\u00c5\7%"+
		"\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c2\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c0\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d1\58\35\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\17"+
		"\3\2\2\2\u00d4\u00d6\7\5\2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\24\13\2\u00d9\21\3\2"+
		"\2\2\u00da\u00db\5\24\13\2\u00db\23\3\2\2\2\u00dc\u00dd\5$\23\2\u00dd"+
		"\u00de\7+\2\2\u00de\u00e3\3\2\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1\7+\2"+
		"\2\u00e1\u00e3\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\25\3\2\2\2\u00e6"+
		"\u00f0\5\30\r\2\u00e7\u00f0\5\32\16\2\u00e8\u00ed\5\\/\2\u00e9\u00ea\7"+
		"\61\2\2\u00ea\u00eb\5\26\f\2\u00eb\u00ec\7\62\2\2\u00ec\u00ee\3\2\2\2"+
		"\u00ed\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e6"+
		"\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00f0\27\3\2\2\2\u00f1"+
		"\u010c\7\r\2\2\u00f2\u00f3\7\32\2\2\u00f3\u010c\7\r\2\2\u00f4\u010c\7"+
		"\16\2\2\u00f5\u00f6\7\32\2\2\u00f6\u010c\7\16\2\2\u00f7\u010c\7\17\2\2"+
		"\u00f8\u00f9\7\32\2\2\u00f9\u010c\7\17\2\2\u00fa\u00fb\7\17\2\2\u00fb"+
		"\u010c\7\17\2\2\u00fc\u00fd\7\32\2\2\u00fd\u00fe\7\17\2\2\u00fe\u010c"+
		"\7\17\2\2\u00ff\u010c\7\22\2\2\u0100\u0101\7\32\2\2\u0101\u010c\7\22\2"+
		"\2\u0102\u010c\7\20\2\2\u0103\u0104\7\32\2\2\u0104\u010c\7\20\2\2\u0105"+
		"\u010c\7\21\2\2\u0106\u0107\7\32\2\2\u0107\u010c\7\21\2\2\u0108\u010c"+
		"\7\23\2\2\u0109\u010c\7\24\2\2\u010a\u010c\7\37\2\2\u010b\u00f1\3\2\2"+
		"\2\u010b\u00f2\3\2\2\2\u010b\u00f4\3\2\2\2\u010b\u00f5\3\2\2\2\u010b\u00f7"+
		"\3\2\2\2\u010b\u00f8\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u00fc\3\2\2\2\u010b"+
		"\u00ff\3\2\2\2\u010b\u0100\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0103\3\2"+
		"\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0108\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\31\3\2\2\2\u010d\u010e\7\25\2"+
		"\2\u010e\u010f\7\61\2\2\u010f\u0110\5\26\f\2\u0110\u0112\7\62\2\2\u0111"+
		"\u0113\5`\61\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\33\3\2\2"+
		"\2\u0114\u0115\7\36\2\2\u0115\u011c\7/\2\2\u0116\u0117\5\26\f\2\u0117"+
		"\u0118\5 \21\2\u0118\u0119\7+\2\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\60\2\2\u0120\35\3\2\2"+
		"\2\u0121\u0122\7\30\2\2\u0122\u0135\7-\2\2\u0123\u0126\5\\/\2\u0124\u0125"+
		"\7G\2\2\u0125\u0127\5r:\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0130\3\2\2\2\u0128\u0129\7(\2\2\u0129\u012c\5\\/\2\u012a\u012b\7G\2"+
		"\2\u012b\u012d\5r:\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\3\2\2\2\u012e\u0128\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0123\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7.\2\2\u0139\37\3\2\2\2"+
		"\u013a\u013b\7\65\2\2\u013b\u0142\5 \21\2\u013c\u0142\5\\/\2\u013d\u013e"+
		"\7-\2\2\u013e\u013f\5 \21\2\u013f\u0140\7.\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013a\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0142!\3\2\2\2"+
		"\u0143\u0144\7I\2\2\u0144\u014b\5\"\22\2\u0145\u014b\5\\/\2\u0146\u0147"+
		"\7-\2\2\u0147\u0148\5\"\22\2\u0148\u0149\7.\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0143\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014b#\3\2\2\2"+
		"\u014c\u014d\7$\2\2\u014d\u0150\5 \21\2\u014e\u014f\7G\2\2\u014f\u0151"+
		"\5\u008aF\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u015a\3\2\2"+
		"\2\u0152\u0153\7(\2\2\u0153\u0156\5 \21\2\u0154\u0155\7G\2\2\u0155\u0157"+
		"\5\u008aF\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2"+
		"\2\u0158\u0152\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u016a\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7$\2\2\u015e"+
		"\u015f\5\36\20\2\u015f\u0160\5\\/\2\u0160\u016a\3\2\2\2\u0161\u0162\7"+
		"$\2\2\u0162\u0163\5\26\f\2\u0163\u0164\5 \21\2\u0164\u016a\3\2\2\2\u0165"+
		"\u0166\7$\2\2\u0166\u0167\5\34\17\2\u0167\u0168\5 \21\2\u0168\u016a\3"+
		"\2\2\2\u0169\u014c\3\2\2\2\u0169\u015d\3\2\2\2\u0169\u0161\3\2\2\2\u0169"+
		"\u0165\3\2\2\2\u016a%\3\2\2\2\u016b\u016c\7\31\2\2\u016c\u016d\5\26\f"+
		"\2\u016d\u016e\5 \21\2\u016e\u016f\7G\2\2\u016f\u0177\5\u008aF\2\u0170"+
		"\u0171\7(\2\2\u0171\u0172\5 \21\2\u0172\u0173\7G\2\2\u0173\u0174\5\u008a"+
		"F\2\u0174\u0176\3\2\2\2\u0175\u0170\3\2\2\2\u0176\u0179\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\'\3\2\2\2\u0179\u0177\3\2\2\2"+
		"\u017a\u017b\7\4\2\2\u017b\u017c\5\u0088E\2\u017c\u017d\7+\2\2\u017d)"+
		"\3\2\2\2\u017e\u0180\7\6\2\2\u017f\u0181\5\66\34\2\u0180\u017f\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183+\3"+
		"\2\2\2\u0184\u0185\7\6\2\2\u0185\u0186\5\16\b\2\u0186-\3\2\2\2\u0187\u018d"+
		"\7\n\2\2\u0188\u0189\7\13\2\2\u0189\u018a\5\u0088E\2\u018a\u018b\7\f\2"+
		"\2\u018b\u018c\5\u0088E\2\u018c\u018e\3\2\2\2\u018d\u0188\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190/\3\2\2\2"+
		"\u0191\u0197\7\t\2\2\u0192\u0193\7\13\2\2\u0193\u0194\5\u0088E\2\u0194"+
		"\u0195\7\f\2\2\u0195\u0196\5\u0088E\2\u0196\u0198\3\2\2\2\u0197\u0192"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\61\3\2\2\2\u019b\u019c\58\35\2\u019c\u019d\5.\30\2\u019d\u019e\5\60\31"+
		"\2\u019e\63\3\2\2\2\u019f\u01a1\7\6\2\2\u01a0\u01a2\5\62\32\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\65\3\2\2\2\u01a5\u01a6\5\26\f\2\u01a6\u01a7\5 \21\2\u01a7\u01a8\7-\2"+
		"\2\u01a8\u01a9\5:\36\2\u01a9\u01aa\7.\2\2\u01aa\u01ab\7/\2\2\u01ab\u01ac"+
		"\5B\"\2\u01ac\u01ad\7\60\2\2\u01ad\67\3\2\2\2\u01ae\u01af\5\26\f\2\u01af"+
		"\u01b0\5 \21\2\u01b0\u01b1\7-\2\2\u01b1\u01b2\5:\36\2\u01b2\u01b3\7.\2"+
		"\2\u01b39\3\2\2\2\u01b4\u01b5\5\26\f\2\u01b5\u01bc\5 \21\2\u01b6\u01b7"+
		"\7(\2\2\u01b7\u01b8\5\26\f\2\u01b8\u01b9\5 \21\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0;\3\2\2\2\u01c1\u01c2\5\\/\2\u01c2\u01c3\7-\2\2\u01c3"+
		"\u01c4\5> \2\u01c4\u01c6\7.\2\2\u01c5\u01c7\5@!\2\u01c6\u01c5\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7=\3\2\2\2\u01c8\u01c9\5\u008aF\2\u01c9\u01ca"+
		"\7(\2\2\u01ca\u01cb\5\u008aF\2\u01cb\u01cd\3\2\2\2\u01cc\u01c8\3\2\2\2"+
		"\u01cc\u01cd\3\2\2\2\u01cd?\3\2\2\2\u01ce\u01cf\7*\2\2\u01cf\u01d4\5\\"+
		"/\2\u01d0\u01d1\7(\2\2\u01d1\u01d3\5\\/\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6"+
		"\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01d8\7*\2\2\u01d8A\3\2\2\2\u01d9\u01db\5\22\n\2"+
		"\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01de"+
		"\5(\25\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\3\2\2\2\u01df"+
		"\u01e1\5D#\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3C\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01fe"+
		"\7+\2\2\u01e6\u01e7\5F$\2\u01e7\u01e8\7+\2\2\u01e8\u01fe\3\2\2\2\u01e9"+
		"\u01ea\5<\37\2\u01ea\u01eb\7+\2\2\u01eb\u01fe\3\2\2\2\u01ec\u01ed\5H%"+
		"\2\u01ed\u01ee\7+\2\2\u01ee\u01fe\3\2\2\2\u01ef\u01f0\5J&\2\u01f0\u01f1"+
		"\7+\2\2\u01f1\u01fe\3\2\2\2\u01f2\u01fe\5L\'\2\u01f3\u01fe\5N(\2\u01f4"+
		"\u01f8\7-\2\2\u01f5\u01f7\5D#\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2"+
		"\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fb\u01fe\7.\2\2\u01fc\u01fe\5l\67\2\u01fd\u01e5\3\2\2\2\u01fd"+
		"\u01e6\3\2\2\2\u01fd\u01e9\3\2\2\2\u01fd\u01ec\3\2\2\2\u01fd\u01ef\3\2"+
		"\2\2\u01fd\u01f2\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01feE\3\2\2\2\u01ff\u0205\5\\/\2\u0200\u0201\5T+\2\u0201"+
		"\u0202\5\\/\2\u0202\u0204\3\2\2\2\u0203\u0200\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u021f\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u0209\5T+\2\u0209\u020c\7\61\2\2\u020a\u020d\5\\"+
		"/\2\u020b\u020d\5f\64\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\5V,\2\u020f\u021a\5\u008aF\2\u0210\u0213\7"+
		"(\2\2\u0211\u0214\5\\/\2\u0212\u0214\5f\64\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5V,\2\u0216\u0217\5\u008a"+
		"F\2\u0217\u0219\3\2\2\2\u0218\u0210\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2"+
		"\2\2\u021d\u021e\7\62\2\2\u021e\u0220\3\2\2\2\u021f\u0208\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220G\3\2\2\2\u0221\u0222\5 \21\2\u0222\u0223\7G\2\2\u0223"+
		"\u0224\5\u008aF\2\u0224\u0233\3\2\2\2\u0225\u022b\5 \21\2\u0226\u0227"+
		"\5T+\2\u0227\u0228\5\\/\2\u0228\u022c\3\2\2\2\u0229\u022a\7H\2\2\u022a"+
		"\u022c\5\\/\2\u022b\u0226\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\7G\2\2\u0230\u0231\5\u008aF\2\u0231\u0233\3\2\2\2\u0232\u0221\3"+
		"\2\2\2\u0232\u0225\3\2\2\2\u0233I\3\2\2\2\u0234\u0236\7 \2\2\u0235\u0237"+
		"\5\u008aF\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237K\3\2\2\2\u0238"+
		"\u0239\7#\2\2\u0239\u023a\7-\2\2\u023a\u023b\5\u0088E\2\u023b\u023c\7"+
		".\2\2\u023c\u023d\5D#\2\u023dM\3\2\2\2\u023e\u023f\7!\2\2\u023f\u0240"+
		"\7-\2\2\u0240\u0241\5\u0088E\2\u0241\u0242\7.\2\2\u0242\u0245\5D#\2\u0243"+
		"\u0244\7\"\2\2\u0244\u0246\5D#\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2"+
		"\2\u0246O\3\2\2\2\u0247\u0248\7&\2\2\u0248Q\3\2\2\2\u0249\u024a\7\b\2"+
		"\2\u024aS\3\2\2\2\u024b\u024c\7)\2\2\u024cU\3\2\2\2\u024d\u024e\7B\2\2"+
		"\u024eW\3\2\2\2\u024f\u0250\7H\2\2\u0250Y\3\2\2\2\u0251\u0252\7\35\2\2"+
		"\u0252[\3\2\2\2\u0253\u0254\7O\2\2\u0254]\3\2\2\2\u0255\u0256\7K\2\2\u0256"+
		"_\3\2\2\2\u0257\u0258\7L\2\2\u0258a\3\2\2\2\u0259\u025a\7\33\2\2\u025a"+
		"c\3\2\2\2\u025b\u025c\7\34\2\2\u025ce\3\2\2\2\u025d\u025e\7M\2\2\u025e"+
		"g\3\2\2\2\u025f\u0260\7N\2\2\u0260i\3\2\2\2\u0261\u0262\7J\2\2\u0262k"+
		"\3\2\2\2\u0263\u0264\7L\2\2\u0264m\3\2\2\2\u0265\u028a\5Z.\2\u0266\u028a"+
		"\5^\60\2\u0267\u028a\5b\62\2\u0268\u028a\5d\63\2\u0269\u028a\5f\64\2\u026a"+
		"\u028a\5h\65\2\u026b\u028a\5j\66\2\u026c\u026d\7/\2\2\u026d\u0272\5\u008a"+
		"F\2\u026e\u026f\7(\2\2\u026f\u0271\5\u008aF\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7\60\2\2\u0276\u028a\3\2\2\2\u0277"+
		"\u0278\7\61\2\2\u0278\u027d\5\u008aF\2\u0279\u027a\7(\2\2\u027a\u027c"+
		"\5\u008aF\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281"+
		"\7\62\2\2\u0281\u028a\3\2\2\2\u0282\u028a\5<\37\2\u0283\u028a\5\\/\2\u0284"+
		"\u0285\7-\2\2\u0285\u0286\5\u008aF\2\u0286\u0287\7.\2\2\u0287\u028a\3"+
		"\2\2\2\u0288\u028a\3\2\2\2\u0289\u0265\3\2\2\2\u0289\u0266\3\2\2\2\u0289"+
		"\u0267\3\2\2\2\u0289\u0268\3\2\2\2\u0289\u0269\3\2\2\2\u0289\u026a\3\2"+
		"\2\2\u0289\u026b\3\2\2\2\u0289\u026c\3\2\2\2\u0289\u0277\3\2\2\2\u0289"+
		"\u0282\3\2\2\2\u0289\u0283\3\2\2\2\u0289\u0284\3\2\2\2\u0289\u0288\3\2"+
		"\2\2\u028a\u02aa\3\2\2\2\u028b\u028c\5T+\2\u028c\u028f\7\61\2\2\u028d"+
		"\u0290\5\\/\2\u028e\u0290\5f\64\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\5V,\2\u0292\u029d\5\u008aF\2\u0293"+
		"\u0296\7(\2\2\u0294\u0297\5\\/\2\u0295\u0297\5f\64\2\u0296\u0294\3\2\2"+
		"\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5V,\2\u0299\u029a"+
		"\5\u008aF\2\u029a\u029c\3\2\2\2\u029b\u0293\3\2\2\2\u029c\u029f\3\2\2"+
		"\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a1\7\62\2\2\u02a1\u02a9\3\2\2\2\u02a2\u02a3\5T+\2\u02a3"+
		"\u02a4\5\\/\2\u02a4\u02a9\3\2\2\2\u02a5\u02a6\5X-\2\u02a6\u02a7\5\\/\2"+
		"\u02a7\u02a9\3\2\2\2\u02a8\u028b\3\2\2\2\u02a8\u02a2\3\2\2\2\u02a8\u02a5"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"o\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\78\2\2\u02ae\u02b5\5p9\2\u02af"+
		"\u02b0\7\65\2\2\u02b0\u02b5\5p9\2\u02b1\u02b2\7I\2\2\u02b2\u02b5\5p9\2"+
		"\u02b3\u02b5\5n8\2\u02b4\u02ad\3\2\2\2\u02b4\u02af\3\2\2\2\u02b4\u02b1"+
		"\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5q\3\2\2\2\u02b6\u02b7\t\2\2\2\u02b7"+
		"\u02ba\5n8\2\u02b8\u02ba\5p9\2\u02b9\u02b6\3\2\2\2\u02b9\u02b8\3\2\2\2"+
		"\u02bas\3\2\2\2\u02bb\u02bc\5r:\2\u02bcu\3\2\2\2\u02bd\u02ca\5t;\2\u02be"+
		"\u02bf\7\65\2\2\u02bf\u02c9\5t;\2\u02c0\u02c1\7\66\2\2\u02c1\u02c9\5t"+
		";\2\u02c2\u02c3\7\67\2\2\u02c3\u02c9\5t;\2\u02c4\u02c5\7D\2\2\u02c5\u02c9"+
		"\5t;\2\u02c6\u02c7\7E\2\2\u02c7\u02c9\5t;\2\u02c8\u02be\3\2\2\2\u02c8"+
		"\u02c0\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c8\u02c6\3\2"+
		"\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"w\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d6\5v<\2\u02ce\u02cf\7\63\2\2\u02cf"+
		"\u02d5\5v<\2\u02d0\u02d1\7\64\2\2\u02d1\u02d5\5v<\2\u02d2\u02d3\7F\2\2"+
		"\u02d3\u02d5\5v<\2\u02d4\u02ce\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2"+
		"\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"y\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02ea\5x=\2\u02da\u02db\7\61\2\2\u02db"+
		"\u02eb\5x=\2\u02dc\u02dd\7>\2\2\u02dd\u02eb\5x=\2\u02de\u02df\7\62\2\2"+
		"\u02df\u02eb\5x=\2\u02e0\u02e1\7=\2\2\u02e1\u02eb\5x=\2\u02e2\u02e3\7"+
		"C\2\2\u02e3\u02eb\5x=\2\u02e4\u02e5\7B\2\2\u02e5\u02eb\5x=\2\u02e6\u02e7"+
		"\7?\2\2\u02e7\u02eb\5x=\2\u02e8\u02e9\7@\2\2\u02e9\u02eb\5x=\2\u02ea\u02da"+
		"\3\2\2\2\u02ea\u02dc\3\2\2\2\u02ea\u02de\3\2\2\2\u02ea\u02e0\3\2\2\2\u02ea"+
		"\u02e2\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb{\3\2\2\2\u02ec\u02f1\5\\/\2\u02ed\u02ee"+
		"\7(\2\2\u02ee\u02f0\5\\/\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u0300\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f4\u02f5\7-\2\2\u02f5\u02fa\5\\/\2\u02f6\u02f7\7(\2\2\u02f7\u02f9"+
		"\5\\/\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\7."+
		"\2\2\u02fe\u0300\3\2\2\2\u02ff\u02ec\3\2\2\2\u02ff\u02f4\3\2\2\2\u0300"+
		"}\3\2\2\2\u0301\u0302\7<\2\2\u0302\u0303\5|?\2\u0303\u0304\7-\2\2\u0304"+
		"\u0305\5\u0088E\2\u0305\u0306\7.\2\2\u0306\u030e\3\2\2\2\u0307\u0308\7"+
		"\'\2\2\u0308\u0309\5|?\2\u0309\u030a\7-\2\2\u030a\u030b\5\u0086D\2\u030b"+
		"\u030c\7.\2\2\u030c\u030e\3\2\2\2\u030d\u0301\3\2\2\2\u030d\u0307\3\2"+
		"\2\2\u030e\177\3\2\2\2\u030f\u0312\5~@\2\u0310\u0312\5z>\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0081\3\2\2\2\u0313\u0318\5\u0080A"+
		"\2\u0314\u0315\79\2\2\u0315\u0317\5\u0080A\2\u0316\u0314\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0083\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031b\u0320\5\u0082B\2\u031c\u031d\7:\2\2\u031d"+
		"\u031f\5\u0082B\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0085\3\2\2\2\u0322\u0320\3\2\2\2\u0323"+
		"\u0324\5\u0084C\2\u0324\u0325\7;\2\2\u0325\u0326\5\u0084C\2\u0326\u0087"+
		"\3\2\2\2\u0327\u032c\5\u0084C\2\u0328\u0329\7;\2\2\u0329\u032b\5\u0084"+
		"C\2\u032a\u0328\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u0089\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\5\u0088"+
		"E\2\u0330\u008b\3\2\2\2R\u008f\u0094\u0097\u009a\u00a1\u00a4\u00a7\u00ae"+
		"\u00b1\u00b4\u00be\u00c7\u00cd\u00d2\u00d6\u00e2\u00e4\u00ed\u00ef\u010b"+
		"\u0112\u011c\u0126\u012c\u0130\u0135\u0141\u014a\u0150\u0156\u015a\u0169"+
		"\u0177\u0182\u018f\u0199\u01a3\u01bc\u01bf\u01c6\u01cc\u01d4\u01da\u01dd"+
		"\u01e2\u01f8\u01fd\u0205\u020c\u0213\u021a\u021f\u022b\u022d\u0232\u0236"+
		"\u0245\u0272\u027d\u0289\u028f\u0296\u029d\u02a8\u02aa\u02b4\u02b9\u02c8"+
		"\u02ca\u02d4\u02d6\u02ea\u02f1\u02fa\u02ff\u030d\u0311\u0318\u0320\u032c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}