// Generated from D:/git/Infix-Postfix-Translation/ANTLR\Infix2Postfix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Infix2PostfixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MOD=8, ID=9, NUM=10, 
		LETTER=11, DIGIT=12, WS=13;
	public static final int
		RULE_start = 0, RULE_list = 1, RULE_expr = 2, RULE_terms = 3, RULE_term = 4, 
		RULE_factors = 5, RULE_factor = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "list", "expr", "terms", "term", "factors", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'MOD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MOD", "ID", "NUM", "LETTER", 
			"DIGIT", "WS"
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
	public String getGrammarFileName() { return "Infix2Postfix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Infix2PostfixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<String> symbols = new ArrayList<>();
		public List<Integer> lines = new ArrayList<>();
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Infix2PostfixParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			list();
			setState(15);
			match(EOF);

			            System.out.print("EOF\n");
			            System.out.println("symbol table (symbol:line)");
			            for (int i=0; i < _localctx.symbols.size(); i ++) {
			                System.out.print(_localctx.symbols.get(i));
			                System.out.print(":" + _localctx.lines.get(i) + " ");
			            }
			            System.out.println();
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				expr();
				setState(19);
				match(T__0);
				System.out.println(";");
				setState(21);
				list();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			term();
			setState(27);
			terms();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terms);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__1);
				setState(30);
				term();
				System.out.print("+ ");
				setState(32);
				terms();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__2);
				setState(35);
				term();
				System.out.print("- ");
				setState(37);
				terms();
				}
				break;
			case T__0:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			factor();
			setState(43);
			factors();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorsContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public TerminalNode MOD() { return getToken(Infix2PostfixParser.MOD, 0); }
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterFactors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitFactors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitFactors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factors);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__3);
				setState(46);
				factor();
				System.out.print("* ");  
				setState(48);
				factors();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__4);
				setState(51);
				factor();
				System.out.print("/ ");  
				setState(53);
				factors();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(MOD);
				setState(56);
				factor();
				System.out.print("MOD ");
				setState(58);
				factors();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public Token NUM;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(Infix2PostfixParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Infix2PostfixParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Infix2PostfixListener ) ((Infix2PostfixListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Infix2PostfixVisitor ) return ((Infix2PostfixVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__5);
				setState(64);
				expr();
				setState(65);
				match(T__6);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((FactorContext)_localctx).NUM = match(NUM);

				        System.out.print((((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null) + " ");
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				((FactorContext)_localctx).ID = match(ID);

				        System.out.print((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null) + " ");
				        if (!((StartContext)getInvokingContext(0)).symbols.contains((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null))) {
				            ((StartContext)getInvokingContext(0)).symbols.add((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null));
				            ((StartContext)getInvokingContext(0)).lines.add((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getLine():0));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bJ\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2L\2\20\3\2\2\2\4\32\3\2\2\2\6\34"+
		"\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f?\3\2\2\2\16I\3\2\2\2\20\21\5\4\3\2\21"+
		"\22\7\2\2\3\22\23\b\2\1\2\23\3\3\2\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26"+
		"\27\b\3\1\2\27\30\5\4\3\2\30\33\3\2\2\2\31\33\3\2\2\2\32\24\3\2\2\2\32"+
		"\31\3\2\2\2\33\5\3\2\2\2\34\35\5\n\6\2\35\36\5\b\5\2\36\7\3\2\2\2\37 "+
		"\7\4\2\2 !\5\n\6\2!\"\b\5\1\2\"#\5\b\5\2#+\3\2\2\2$%\7\5\2\2%&\5\n\6\2"+
		"&\'\b\5\1\2\'(\5\b\5\2(+\3\2\2\2)+\3\2\2\2*\37\3\2\2\2*$\3\2\2\2*)\3\2"+
		"\2\2+\t\3\2\2\2,-\5\16\b\2-.\5\f\7\2.\13\3\2\2\2/\60\7\6\2\2\60\61\5\16"+
		"\b\2\61\62\b\7\1\2\62\63\5\f\7\2\63@\3\2\2\2\64\65\7\7\2\2\65\66\5\16"+
		"\b\2\66\67\b\7\1\2\678\5\f\7\28@\3\2\2\29:\7\n\2\2:;\5\16\b\2;<\b\7\1"+
		"\2<=\5\f\7\2=@\3\2\2\2>@\3\2\2\2?/\3\2\2\2?\64\3\2\2\2?9\3\2\2\2?>\3\2"+
		"\2\2@\r\3\2\2\2AB\7\b\2\2BC\5\6\4\2CD\7\t\2\2DJ\3\2\2\2EF\7\f\2\2FJ\b"+
		"\b\1\2GH\7\13\2\2HJ\b\b\1\2IA\3\2\2\2IE\3\2\2\2IG\3\2\2\2J\17\3\2\2\2"+
		"\6\32*?I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}