// Generated from /Users/Domenico/IdeaProjects/Fool/src/parser/FOOL.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASM=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		TRUE=10, FALSE=11, LPAR=12, RPAR=13, CLPAR=14, CRPAR=15, IF=16, THEN=17, 
		ELSE=18, PRINT=19, LET=20, IN=21, VAR=22, FUN=23, INT=24, BOOL=25, OR=26, 
		AND=27, NOT=28, GREATERTHAN=29, LESSERTHAN=30, GREATEREQUAL=31, LESSEREQUAL=32, 
		VOID=33, CLASS=34, THIS=35, NEW=36, DOT=37, EXTENDS=38, NULL=39, INTEGER=40, 
		ID=41, WS=42, LINECOMENTS=43, BLOCKCOMENTS=44, EXP=45;
	public static final int
		RULE_prog = 0, RULE_let = 1, RULE_classdec = 2, RULE_letVar = 3, RULE_vardec = 4, 
		RULE_varasm = 5, RULE_fun = 6, RULE_dec = 7, RULE_type = 8, RULE_print = 9, 
		RULE_exp = 10, RULE_term = 11, RULE_factor = 12, RULE_value = 13, RULE_stm = 14, 
		RULE_stms = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "let", "classdec", "letVar", "vardec", "varasm", "fun", "dec", 
			"type", "print", "exp", "term", "factor", "value", "stm", "stms"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "','", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'true'", "'false'", "'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", 
			"'print'", "'let'", "'in'", "'var'", "'fun'", "'int'", "'bool'", "'||'", 
			"'&&'", "'!='", "'>'", "'<'", "'>='", "'<='", "'void'", "'class'", "'this'", 
			"'new'", "'.'", "'extends'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", 
			"DIV", "TRUE", "FALSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", 
			"ELSE", "PRINT", "LET", "IN", "VAR", "FUN", "INT", "BOOL", "OR", "AND", 
			"NOT", "GREATERTHAN", "LESSERTHAN", "GREATEREQUAL", "LESSEREQUAL", "VOID", 
			"CLASS", "THIS", "NEW", "DOT", "EXTENDS", "NULL", "INTEGER", "ID", "WS", 
			"LINECOMENTS", "BLOCKCOMENTS", "EXP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FOOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetInExpContext extends ProgContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<StmsContext> stms() {
			return getRuleContexts(StmsContext.class);
		}
		public StmsContext stms(int i) {
			return getRuleContext(StmsContext.class,i);
		}
		public LetInExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterLetInExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitLetInExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitLetInExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassExpmissingContext extends ProgContext {
		public List<ClassdecContext> classdec() {
			return getRuleContexts(ClassdecContext.class);
		}
		public ClassdecContext classdec(int i) {
			return getRuleContext(ClassdecContext.class,i);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<StmsContext> stms() {
			return getRuleContexts(StmsContext.class);
		}
		public StmsContext stms(int i) {
			return getRuleContext(StmsContext.class,i);
		}
		public ClassExpmissingContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterClassExpmissing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitClassExpmissing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitClassExpmissing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleExpContext extends ProgContext {
		public TerminalNode SEMIC() { return getToken(FOOLParser.SEMIC, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitSingleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitSingleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TRUE:
			case FALSE:
			case LPAR:
			case IF:
			case PRINT:
			case NOT:
			case NEW:
			case NULL:
			case INTEGER:
			case ID:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
					{
					setState(32);
					print();
					}
					break;
				case MINUS:
				case TRUE:
				case FALSE:
				case LPAR:
				case IF:
				case NOT:
				case NEW:
				case NULL:
				case INTEGER:
				case ID:
					{
					setState(33);
					exp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36);
				match(SEMIC);
				}
				break;
			case LET:
				_localctx = new LetInExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				let();
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(39);
						exp();
						setState(40);
						match(SEMIC);
						}
						break;
					case 2:
						{
						setState(42);
						print();
						setState(43);
						match(SEMIC);
						}
						break;
					case 3:
						{
						setState(45);
						stms();
						}
						break;
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << PRINT) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0) );
				}
				break;
			case CLASS:
				_localctx = new ClassExpmissingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(50);
					classdec();
					}
					}
					setState(53); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS );
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(55);
					let();
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(63);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(56);
							exp();
							setState(57);
							match(SEMIC);
							}
							break;
						case 2:
							{
							setState(59);
							print();
							setState(60);
							match(SEMIC);
							}
							break;
						case 3:
							{
							setState(62);
							stms();
							}
							break;
						}
						}
						setState(65); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << PRINT) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0) );
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(FOOLParser.LET, 0); }
		public TerminalNode IN() { return getToken(FOOLParser.IN, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LET);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				dec();
				setState(73);
				match(SEMIC);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << ID))) != 0) );
			setState(79);
			match(IN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdecContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FOOLParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(FOOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FOOLParser.ID, i);
		}
		public TerminalNode SEMIC() { return getToken(FOOLParser.SEMIC, 0); }
		public TerminalNode EXTENDS() { return getToken(FOOLParser.EXTENDS, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public TerminalNode CLPAR() { return getToken(FOOLParser.CLPAR, 0); }
		public TerminalNode CRPAR() { return getToken(FOOLParser.CRPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public ClassdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterClassdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitClassdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitClassdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdecContext classdec() throws RecognitionException {
		ClassdecContext _localctx = new ClassdecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CLASS);
			setState(82);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(83);
				match(EXTENDS);
				setState(84);
				match(ID);
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(87);
				match(LPAR);
				setState(88);
				vardec();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					match(COMMA);
					setState(90);
					vardec();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(RPAR);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLPAR) {
				{
				setState(100);
				match(CLPAR);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					fun();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << ID))) != 0) );
				setState(106);
				match(CRPAR);
				}
			}

			setState(110);
			match(SEMIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetVarContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(FOOLParser.LET, 0); }
		public TerminalNode IN() { return getToken(FOOLParser.IN, 0); }
		public List<VarasmContext> varasm() {
			return getRuleContexts(VarasmContext.class);
		}
		public VarasmContext varasm(int i) {
			return getRuleContext(VarasmContext.class,i);
		}
		public LetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterLetVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitLetVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitLetVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetVarContext letVar() throws RecognitionException {
		LetVarContext _localctx = new LetVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LET);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				varasm();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << ID))) != 0) );
			setState(118);
			match(IN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			type();
			setState(121);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarasmContext extends ParserRuleContext {
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode ASM() { return getToken(FOOLParser.ASM, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(FOOLParser.SEMIC, 0); }
		public VarasmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varasm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterVarasm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitVarasm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitVarasm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarasmContext varasm() throws RecognitionException {
		VarasmContext _localctx = new VarasmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varasm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			vardec();
			setState(124);
			match(ASM);
			setState(125);
			exp();
			setState(126);
			match(SEMIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public TerminalNode CLPAR() { return getToken(FOOLParser.CLPAR, 0); }
		public TerminalNode CRPAR() { return getToken(FOOLParser.CRPAR, 0); }
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public LetVarContext letVar() {
			return getRuleContext(LetVarContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			type();
			setState(129);
			match(ID);
			setState(130);
			match(LPAR);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(131);
				vardec();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					vardec();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141);
			match(RPAR);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(142);
				letVar();
				}
			}

			setState(145);
			match(CLPAR);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(146);
					exp();
					setState(147);
					match(SEMIC);
					}
					break;
				case 2:
					{
					setState(149);
					print();
					setState(150);
					match(SEMIC);
					}
					break;
				case 3:
					{
					setState(152);
					stm();
					}
					break;
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << PRINT) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0) );
			setState(157);
			match(CRPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends DecContext {
		public VarasmContext varasm() {
			return getRuleContext(VarasmContext.class,0);
		}
		public VarAssignmentContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunDeclarationContext extends DecContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FunDeclarationContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				varasm();
				}
				break;
			case 2:
				_localctx = new FunDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				fun();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FOOLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(FOOLParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(FOOLParser.VOID, 0); }
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(FOOLParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode EXP() { return getToken(FOOLParser.EXP, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PRINT);
			setState(166);
			match(LPAR);
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==EXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TermContext left;
		public ExpContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(FOOLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FOOLParser.MINUS, i);
		}
		public TerminalNode PLUS() { return getToken(FOOLParser.PLUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(170);
				match(MINUS);
				}
				break;
			}
			setState(173);
			((ExpContext)_localctx).left = term();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				((ExpContext)_localctx).right = exp();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public TermContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(FOOLParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(FOOLParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((TermContext)_localctx).left = factor();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIV) {
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				((TermContext)_localctx).right = term();
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

	public static class FactorContext extends ParserRuleContext {
		public ValueContext left;
		public FactorContext right;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(FOOLParser.EQ, 0); }
		public TerminalNode GREATERTHAN() { return getToken(FOOLParser.GREATERTHAN, 0); }
		public TerminalNode LESSERTHAN() { return getToken(FOOLParser.LESSERTHAN, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(FOOLParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEREQUAL() { return getToken(FOOLParser.LESSEREQUAL, 0); }
		public TerminalNode AND() { return getToken(FOOLParser.AND, 0); }
		public TerminalNode OR() { return getToken(FOOLParser.OR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((FactorContext)_localctx).left = value();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << OR) | (1L << AND) | (1L << GREATERTHAN) | (1L << LESSERTHAN) | (1L << GREATEREQUAL) | (1L << LESSEREQUAL))) != 0)) {
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << OR) | (1L << AND) | (1L << GREATERTHAN) | (1L << LESSERTHAN) | (1L << GREATEREQUAL) | (1L << LESSEREQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				((FactorContext)_localctx).right = factor();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExpContext extends ValueContext {
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public BaseExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterBaseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitBaseExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(FOOLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(FOOLParser.NOT, 0); }
		public VarExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValContext extends ValueContext {
		public TerminalNode INTEGER() { return getToken(FOOLParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(FOOLParser.MINUS, 0); }
		public IntValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethExpContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(FOOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FOOLParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(FOOLParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public MethExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterMethExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitMethExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitMethExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ValueContext {
		public TerminalNode NULL() { return getToken(FOOLParser.NULL, 0); }
		public NullContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpContext extends ValueContext {
		public TerminalNode NEW() { return getToken(FOOLParser.NEW, 0); }
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public NewExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ValueContext {
		public ExpContext cond;
		public ExpContext thenBranch;
		public ExpContext elseBranch;
		public TerminalNode IF() { return getToken(FOOLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FOOLParser.THEN, 0); }
		public List<TerminalNode> CLPAR() { return getTokens(FOOLParser.CLPAR); }
		public TerminalNode CLPAR(int i) {
			return getToken(FOOLParser.CLPAR, i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public List<TerminalNode> CRPAR() { return getTokens(FOOLParser.CRPAR); }
		public TerminalNode CRPAR(int i) {
			return getToken(FOOLParser.CRPAR, i);
		}
		public TerminalNode ELSE() { return getToken(FOOLParser.ELSE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(FOOLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FOOLParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(FOOLParser.NOT, 0); }
		public BoolValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public FunExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterFunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitFunExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(188);
					match(MINUS);
					}
				}

				setState(191);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(192);
					match(NOT);
					}
				}

				setState(195);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(LPAR);
				setState(197);
				exp();
				setState(198);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(IF);
				setState(201);
				((IfExpContext)_localctx).cond = exp();
				setState(202);
				match(THEN);
				setState(203);
				match(CLPAR);
				setState(204);
				((IfExpContext)_localctx).thenBranch = exp();
				setState(205);
				match(SEMIC);
				setState(206);
				match(CRPAR);
				setState(207);
				match(ELSE);
				setState(208);
				match(CLPAR);
				setState(209);
				((IfExpContext)_localctx).elseBranch = exp();
				setState(210);
				match(SEMIC);
				setState(211);
				match(CRPAR);
				}
				break;
			case 5:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==NOT) {
					{
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==NOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(216);
				match(ID);
				}
				break;
			case 6:
				_localctx = new FunExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(ID);
				setState(218);
				match(LPAR);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(219);
					exp();
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(220);
						match(COMMA);
						setState(221);
						exp();
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(229);
				match(RPAR);
				}
				break;
			case 7:
				_localctx = new MethExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(ID);
				setState(231);
				match(DOT);
				setState(232);
				match(ID);
				{
				setState(233);
				match(LPAR);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(234);
					exp();
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(235);
						match(COMMA);
						setState(236);
						exp();
						}
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(244);
				match(RPAR);
				}
				}
				break;
			case 8:
				_localctx = new NewExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(NEW);
				setState(246);
				match(ID);
				setState(247);
				match(LPAR);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << NOT) | (1L << NEW) | (1L << NULL) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(248);
					exp();
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(249);
						match(COMMA);
						setState(250);
						exp();
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(258);
				match(RPAR);
				}
				break;
			case 9:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				match(NULL);
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

	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmContext extends StmContext {
		public ExpContext cond;
		public StmsContext thenBranch;
		public StmsContext elseBranch;
		public TerminalNode IF() { return getToken(FOOLParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(FOOLParser.THEN, 0); }
		public List<TerminalNode> CLPAR() { return getTokens(FOOLParser.CLPAR); }
		public TerminalNode CLPAR(int i) {
			return getToken(FOOLParser.CLPAR, i);
		}
		public List<TerminalNode> CRPAR() { return getTokens(FOOLParser.CRPAR); }
		public TerminalNode CRPAR(int i) {
			return getToken(FOOLParser.CRPAR, i);
		}
		public TerminalNode ELSE() { return getToken(FOOLParser.ELSE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmsContext> stms() {
			return getRuleContexts(StmsContext.class);
		}
		public StmsContext stms(int i) {
			return getRuleContext(StmsContext.class,i);
		}
		public IfStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitIfStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsmStmContext extends StmContext {
		public ExpContext body;
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode ASM() { return getToken(FOOLParser.ASM, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsmStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterAsmStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitAsmStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitAsmStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AsmStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(ID);
				setState(263);
				match(ASM);
				setState(264);
				((AsmStmContext)_localctx).body = exp();
				}
				break;
			case IF:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(IF);
				setState(266);
				match(LPAR);
				setState(267);
				((IfStmContext)_localctx).cond = exp();
				setState(268);
				match(RPAR);
				setState(269);
				match(THEN);
				setState(270);
				match(CLPAR);
				setState(271);
				((IfStmContext)_localctx).thenBranch = stms();
				setState(272);
				match(CRPAR);
				setState(273);
				match(ELSE);
				setState(274);
				match(CLPAR);
				setState(275);
				((IfStmContext)_localctx).elseBranch = stms();
				setState(276);
				match(CRPAR);
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

	public static class StmsContext extends ParserRuleContext {
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public StmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterStms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitStms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLVisitor ) return ((FOOLVisitor<? extends T>)visitor).visitStms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmsContext stms() throws RecognitionException {
		StmsContext _localctx = new StmsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(280);
					stm();
					setState(281);
					match(SEMIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\5"+
		"\2%\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\61\n\2\r\2\16\2\62"+
		"\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2B\n\2\r"+
		"\2\16\2C\5\2F\n\2\5\2H\n\2\3\3\3\3\3\3\3\3\6\3N\n\3\r\3\16\3O\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4"+
		"\3\4\5\4e\n\4\3\4\3\4\6\4i\n\4\r\4\16\4j\3\4\3\4\5\4o\n\4\3\4\3\4\3\5"+
		"\3\5\6\5u\n\5\r\5\16\5v\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\5\b\u008e\n\b\3\b"+
		"\3\b\5\b\u0092\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009c\n\b\r\b\16"+
		"\b\u009d\3\b\3\b\3\t\3\t\5\t\u00a4\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\5\f\u00ae\n\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\5\r\u00b8\n\r"+
		"\3\16\3\16\3\16\5\16\u00bd\n\16\3\17\5\17\u00c0\n\17\3\17\3\17\5\17\u00c4"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00e1\n\17\f\17\16\17\u00e4\13\17\5\17\u00e6\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f0\n\17\f\17\16\17\u00f3\13\17"+
		"\5\17\u00f5\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fe\n\17\f"+
		"\17\16\17\u0101\13\17\5\17\u0103\n\17\3\17\3\17\5\17\u0107\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0119\n\20\3\21\3\21\3\21\6\21\u011e\n\21\r\21\16\21\u011f\3"+
		"\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\t\5\2\32\33##++\4"+
		"\2++//\3\2\b\t\3\2\n\13\5\2\6\6\34\35\37\"\3\2\f\r\4\2\t\t\36\36\2\u0141"+
		"\2G\3\2\2\2\4I\3\2\2\2\6S\3\2\2\2\br\3\2\2\2\nz\3\2\2\2\f}\3\2\2\2\16"+
		"\u0082\3\2\2\2\20\u00a3\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00ad"+
		"\3\2\2\2\30\u00b4\3\2\2\2\32\u00b9\3\2\2\2\34\u0106\3\2\2\2\36\u0118\3"+
		"\2\2\2 \u011d\3\2\2\2\"%\5\24\13\2#%\5\26\f\2$\"\3\2\2\2$#\3\2\2\2%&\3"+
		"\2\2\2&\'\7\3\2\2\'H\3\2\2\2(\60\5\4\3\2)*\5\26\f\2*+\7\3\2\2+\61\3\2"+
		"\2\2,-\5\24\13\2-.\7\3\2\2.\61\3\2\2\2/\61\5 \21\2\60)\3\2\2\2\60,\3\2"+
		"\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63H\3\2\2\2"+
		"\64\66\5\6\4\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"E\3\2\2\29A\5\4\3\2:;\5\26\f\2;<\7\3\2\2<B\3\2\2\2=>\5\24\13\2>?\7\3\2"+
		"\2?B\3\2\2\2@B\5 \21\2A:\3\2\2\2A=\3\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DF\3\2\2\2E9\3\2\2\2EF\3\2\2\2FH\3\2\2\2G$\3\2\2\2G(\3\2\2"+
		"\2G\65\3\2\2\2H\3\3\2\2\2IM\7\26\2\2JK\5\20\t\2KL\7\3\2\2LN\3\2\2\2MJ"+
		"\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\27\2\2R\5\3\2\2\2"+
		"ST\7$\2\2TW\7+\2\2UV\7(\2\2VX\7+\2\2WU\3\2\2\2WX\3\2\2\2Xd\3\2\2\2YZ\7"+
		"\16\2\2Z_\5\n\6\2[\\\7\5\2\2\\^\5\n\6\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\17\2\2ce\3\2\2\2dY\3\2\2\2de\3\2\2"+
		"\2en\3\2\2\2fh\7\20\2\2gi\5\16\b\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kl\3\2\2\2lm\7\21\2\2mo\3\2\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7"+
		"\3\2\2q\7\3\2\2\2rt\7\26\2\2su\5\f\7\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wx\3\2\2\2xy\7\27\2\2y\t\3\2\2\2z{\5\22\n\2{|\7+\2\2|\13\3\2"+
		"\2\2}~\5\n\6\2~\177\7\7\2\2\177\u0080\5\26\f\2\u0080\u0081\7\3\2\2\u0081"+
		"\r\3\2\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7+\2\2\u0084\u008d\7\16\2"+
		"\2\u0085\u008a\5\n\6\2\u0086\u0087\7\5\2\2\u0087\u0089\5\n\6\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\17\2\2\u0090\u0092\5\b\5\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009b\7\20"+
		"\2\2\u0094\u0095\5\26\f\2\u0095\u0096\7\3\2\2\u0096\u009c\3\2\2\2\u0097"+
		"\u0098\5\24\13\2\u0098\u0099\7\3\2\2\u0099\u009c\3\2\2\2\u009a\u009c\5"+
		"\36\20\2\u009b\u0094\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\7\21\2\2\u00a0\17\3\2\2\2\u00a1\u00a4\5\f\7\2\u00a2\u00a4"+
		"\5\16\b\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\21\3\2\2\2\u00a5"+
		"\u00a6\t\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\7\16"+
		"\2\2\u00a9\u00aa\t\3\2\2\u00aa\u00ab\7\17\2\2\u00ab\25\3\2\2\2\u00ac\u00ae"+
		"\7\t\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\5\30\r\2\u00b0\u00b1\t\4\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b7\5\32\16\2\u00b5"+
		"\u00b6\t\5\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\31\3\2\2\2\u00b9\u00bc\5\34\17\2\u00ba\u00bb\t\6\2\2\u00bb"+
		"\u00bd\5\32\16\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2"+
		"\2\2\u00be\u00c0\7\t\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u0107\7*\2\2\u00c2\u00c4\7\36\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u0107\t\7\2\2\u00c6"+
		"\u00c7\7\16\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7\17\2\2\u00c9\u0107"+
		"\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\23\2"+
		"\2\u00cd\u00ce\7\20\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\7\3\2\2\u00d0"+
		"\u00d1\7\21\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\7\20\2\2\u00d3\u00d4"+
		"\5\26\f\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\7\21\2\2\u00d6\u0107\3\2\2\2"+
		"\u00d7\u00d9\t\b\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u0107\7+\2\2\u00db\u00dc\7+\2\2\u00dc\u00e5\7\16\2\2\u00dd"+
		"\u00e2\5\26\f\2\u00de\u00df\7\5\2\2\u00df\u00e1\5\26\f\2\u00e0\u00de\3"+
		"\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u0107\7\17\2\2\u00e8\u00e9\7+\2\2\u00e9"+
		"\u00ea\7\'\2\2\u00ea\u00eb\7+\2\2\u00eb\u00f4\7\16\2\2\u00ec\u00f1\5\26"+
		"\f\2\u00ed\u00ee\7\5\2\2\u00ee\u00f0\5\26\f\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u0107\7\17\2\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\7+"+
		"\2\2\u00f9\u0102\7\16\2\2\u00fa\u00ff\5\26\f\2\u00fb\u00fc\7\5\2\2\u00fc"+
		"\u00fe\5\26\f\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\7\17"+
		"\2\2\u0105\u0107\7)\2\2\u0106\u00bf\3\2\2\2\u0106\u00c3\3\2\2\2\u0106"+
		"\u00c6\3\2\2\2\u0106\u00ca\3\2\2\2\u0106\u00d8\3\2\2\2\u0106\u00db\3\2"+
		"\2\2\u0106\u00e8\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\35\3\2\2\2\u0108\u0109\7+\2\2\u0109\u010a\7\7\2\2\u010a\u0119\5\26\f"+
		"\2\u010b\u010c\7\22\2\2\u010c\u010d\7\16\2\2\u010d\u010e\5\26\f\2\u010e"+
		"\u010f\7\17\2\2\u010f\u0110\7\23\2\2\u0110\u0111\7\20\2\2\u0111\u0112"+
		"\5 \21\2\u0112\u0113\7\21\2\2\u0113\u0114\7\24\2\2\u0114\u0115\7\20\2"+
		"\2\u0115\u0116\5 \21\2\u0116\u0117\7\21\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0108\3\2\2\2\u0118\u010b\3\2\2\2\u0119\37\3\2\2\2\u011a\u011b\5\36\20"+
		"\2\u011b\u011c\7\3\2\2\u011c\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120!\3\2\2\2\'$\60"+
		"\62\67ACEGOW_djnv\u008a\u008d\u0091\u009b\u009d\u00a3\u00ad\u00b2\u00b7"+
		"\u00bc\u00bf\u00c3\u00d8\u00e2\u00e5\u00f1\u00f4\u00ff\u0102\u0106\u0118"+
		"\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}