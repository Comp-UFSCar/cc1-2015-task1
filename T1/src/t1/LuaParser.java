// Generated from G:/Programming_Workspace/GitHub/ufscar-cc1-2015-task1/T1/src/t1\Lua.g4 by ANTLR 4.5
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		PALAVRA_CHAVE=39, NUMERO=40, NOME=41, CADEIA=42, COMENTARIO=43, WS=44, 
		OP_REL=45, OP_ARIT_BINARIO=46, OP_LOGICOS=47, CONCATENACAO=48, COMPRIMENTO=49, 
		VARAG=50, ABREPAR=51, FECHAPAR=52, ABRECHAV=53, FECHACHAV=54, ABRECOLC=55, 
		FECHACOLC=56;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, 
		RULE_ultimocomando = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_var = 7, 
		RULE_listadenomes = 8, RULE_listaexp = 9, RULE_exp = 10, RULE_expprefixo = 11, 
		RULE_expprefixo2 = 12, RULE_chamadadefuncao = 13, RULE_args = 14, RULE_funcao = 15, 
		RULE_corpodafuncao = 16, RULE_listapar = 17, RULE_construtortabela = 18, 
		RULE_listadecampos = 19, RULE_campo = 20, RULE_separadordecampos = 21, 
		RULE_opbin = 22, RULE_opunaria = 23;
	public static final String[] ruleNames = {
		"programa", "bloco", "trecho", "comando", "ultimocomando", "nomedafuncao", 
		"listavar", "var", "listadenomes", "listaexp", "exp", "expprefixo", "expprefixo2", 
		"chamadadefuncao", "args", "funcao", "corpodafuncao", "listapar", "construtortabela", 
		"listadecampos", "campo", "separadordecampos", "opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
		"'local'", "'return'", "'break'", "'.'", "':'", "'nil'", "'false'", "'true'", 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'~='", "'and'", "'or'", "'not'", null, null, null, null, null, 
		null, null, null, null, "'..'", "'#'", "'...'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "PALAVRA_CHAVE", "NUMERO", "NOME", "CADEIA", "COMENTARIO", 
		"WS", "OP_REL", "OP_ARIT_BINARIO", "OP_LOGICOS", "CONCATENACAO", "COMPRIMENTO", 
		"VARAG", "ABREPAR", "FECHAPAR", "ABRECHAV", "FECHACHAV", "ABRECOLC", "FECHACOLC"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static String grupo = "344443_e_407976" ;

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			trecho();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			trecho();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME))) != 0)) {
				{
				{
				setState(52); 
				comando();
				setState(54);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(53); 
					match(T__0);
					}
				}

				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(61); 
				ultimocomando();
				setState(63);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(62); 
					match(T__0);
					}
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

	public static class ComandoContext extends ParserRuleContext {
		public Token NOME;
		public NomedafuncaoContext nomedafuncao;
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); 
				listavar();
				setState(68); 
				match(T__1);
				setState(69); 
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); 
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); 
				match(T__2);
				setState(73); 
				bloco();
				setState(74); 
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); 
				match(T__4);
				setState(77); 
				exp(0);
				setState(78); 
				match(T__2);
				setState(79); 
				bloco();
				setState(80); 
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82); 
				match(T__5);
				setState(83); 
				bloco();
				setState(84); 
				match(T__6);
				setState(85); 
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); 
				match(T__7);
				setState(88); 
				exp(0);
				setState(89); 
				match(T__8);
				setState(90); 
				bloco();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(91); 
					match(T__9);
					setState(92); 
					exp(0);
					setState(93); 
					match(T__8);
					setState(94); 
					bloco();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(101); 
					match(T__10);
					setState(102); 
					bloco();
					}
				}

				setState(105); 
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107); 
				match(T__11);
				setState(108); 
				((ComandoContext)_localctx).NOME = match(NOME);
				TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null), Tipo.VARIAVEL);
				setState(110); 
				match(T__1);
				setState(111); 
				exp(0);
				setState(112); 
				match(T__12);
				setState(113); 
				exp(0);
				setState(116);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(114); 
					match(T__12);
					setState(115); 
					exp(0);
					}
				}

				setState(118); 
				match(T__2);
				setState(119); 
				bloco();
				setState(120); 
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122); 
				match(T__11);
				setState(123); 
				listadenomes();
				setState(124); 
				match(T__13);
				setState(125); 
				listaexp();
				setState(126); 
				match(T__2);
				setState(127); 
				bloco();
				setState(128); 
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130); 
				match(T__14);
				setState(131); 
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null), Tipo.FUNCAO);
				setState(133); 
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135); 
				match(T__15);
				setState(136); 
				match(T__14);
				setState(137); 
				match(NOME);
				setState(138); 
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(139); 
				match(T__15);
				setState(140); 
				listadenomes();
				setState(143);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(141); 
					match(T__1);
					setState(142); 
					listaexp();
					}
				}

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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ultimocomando);
		int _la;
		try {
			setState(152);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); 
				match(T__16);
				setState(149);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__37) | (1L << NUMERO) | (1L << NOME) | (1L << CADEIA) | (1L << COMPRIMENTO) | (1L << VARAG) | (1L << ABREPAR) | (1L << ABRECHAV))) != 0)) {
					{
					setState(148); 
					listaexp();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); 
				match(T__17);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public Token NOME;
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			((NomedafuncaoContext)_localctx).NOME = match(NOME);
			String a = (((NomedafuncaoContext)_localctx).NOME!=null?((NomedafuncaoContext)_localctx).NOME.getText():null);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(156); 
				match(T__18);
				setState(157); 
				((NomedafuncaoContext)_localctx).NOME = match(NOME);
				a = a +"."+(((NomedafuncaoContext)_localctx).NOME!=null?((NomedafuncaoContext)_localctx).NOME.getText():null) ;
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(164); 
				match(T__19);
				setState(165); 
				((NomedafuncaoContext)_localctx).NOME = match(NOME);
				}
			}

			TabelaDeSimbolos.adicionarSimbolo(a,Tipo.FUNCAO); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListavarContext extends ParserRuleContext {
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			((ListavarContext)_localctx).var = var();
			TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null), Tipo.VARIAVEL);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(172); 
				match(T__12);
				setState(173); 
				((ListavarContext)_localctx).var = var();
				TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null), Tipo.VARIAVEL);
				}
				}
				setState(180);
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

	public static class VarContext extends ParserRuleContext {
		public Token NOME;
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); 
				((VarContext)_localctx).NOME = match(NOME);
				TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOME!=null?((VarContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); 
				expprefixo();
				setState(184); 
				match(ABRECOLC);
				setState(185); 
				exp(0);
				setState(186); 
				match(FECHACOLC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); 
				expprefixo();
				setState(189); 
				match(T__18);
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

	public static class ListadenomesContext extends ParserRuleContext {
		public Token NOME;
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			((ListadenomesContext)_localctx).NOME = match(NOME);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null), Tipo.VARIAVEL);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195); 
					match(T__12);
					setState(196); 
					((ListadenomesContext)_localctx).NOME = match(NOME);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null), Tipo.VARIAVEL);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203); 
					exp(0);
					setState(204); 
					match(T__12);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(211); 
			exp(0);
			}
		}
		catch (RecognitionException re) {
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
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NUMERO() { return getToken(LuaParser.NUMERO, 0); }
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Expprefixo2Context expprefixo2() {
			return getRuleContext(Expprefixo2Context.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			switch (_input.LA(1)) {
			case T__24:
			case T__37:
			case COMPRIMENTO:
				{
				setState(214); 
				opunaria();
				setState(215); 
				exp(1);
				}
				break;
			case T__20:
				{
				setState(217); 
				match(T__20);
				}
				break;
			case T__21:
				{
				setState(218); 
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(219); 
				match(T__22);
				}
				break;
			case NUMERO:
				{
				setState(220); 
				match(NUMERO);
				}
				break;
			case CADEIA:
				{
				setState(221); 
				match(CADEIA);
				}
				break;
			case VARAG:
				{
				setState(222); 
				match(VARAG);
				}
				break;
			case T__14:
				{
				setState(223); 
				funcao();
				}
				break;
			case NOME:
			case ABREPAR:
				{
				setState(224); 
				expprefixo2();
				}
				break;
			case ABRECHAV:
				{
				setState(225); 
				construtortabela();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(228);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(229); 
					opbin();
					setState(230); 
					exp(3);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpprefixoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expprefixo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			match(NOME);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(244);
					switch (_input.LA(1)) {
					case ABRECOLC:
						{
						setState(238); 
						match(ABRECOLC);
						setState(239); 
						exp(0);
						setState(240); 
						match(FECHACOLC);
						}
						break;
					case T__18:
						{
						setState(242); 
						match(T__18);
						setState(243); 
						match(NOME);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Expprefixo2Context extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expprefixo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo2(this);
		}
	}

	public final Expprefixo2Context expprefixo2() throws RecognitionException {
		Expprefixo2Context _localctx = new Expprefixo2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expprefixo2);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); 
				((Expprefixo2Context)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((Expprefixo2Context)_localctx).var!=null?_input.getText(((Expprefixo2Context)_localctx).var.start,((Expprefixo2Context)_localctx).var.stop):null), Tipo.VARIAVEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); 
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253); 
				match(ABREPAR);
				setState(254); 
				exp(0);
				setState(255); 
				match(FECHAPAR);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public ExpprefixoContext expprefixo;
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chamadadefuncao);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); 
				((ChamadadefuncaoContext)_localctx).expprefixo = expprefixo();
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).expprefixo!=null?_input.getText(((ChamadadefuncaoContext)_localctx).expprefixo.start,((ChamadadefuncaoContext)_localctx).expprefixo.stop):null), Tipo.FUNCAO);
				setState(261); 
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); 
				expprefixo();
				setState(264); 
				match(T__19);
				setState(265); 
				match(NOME);
				setState(266); 
				args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(277);
			switch (_input.LA(1)) {
			case ABREPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); 
				match(ABREPAR);
				setState(272);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__37) | (1L << NUMERO) | (1L << NOME) | (1L << CADEIA) | (1L << COMPRIMENTO) | (1L << VARAG) | (1L << ABREPAR) | (1L << ABRECHAV))) != 0)) {
					{
					setState(271); 
					listaexp();
					}
				}

				setState(274); 
				match(FECHAPAR);
				}
				break;
			case ABRECHAV:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); 
				construtortabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); 
				match(CADEIA);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); 
			match(T__14);
			setState(280); 
			corpodafuncao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			match(ABREPAR);
			setState(284);
			_la = _input.LA(1);
			if (_la==NOME || _la==VARAG) {
				{
				setState(283); 
				listapar();
				}
			}

			setState(286); 
			match(FECHAPAR);
			setState(287); 
			bloco();
			setState(288); 
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listapar);
		int _la;
		try {
			setState(296);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); 
				listadenomes();
				setState(293);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(291); 
					match(T__12);
					setState(292); 
					match(VARAG);
					}
				}

				}
				break;
			case VARAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); 
				match(VARAG);
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); 
			match(ABRECHAV);
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__37) | (1L << NUMERO) | (1L << NOME) | (1L << CADEIA) | (1L << COMPRIMENTO) | (1L << VARAG) | (1L << ABREPAR) | (1L << ABRECHAV) | (1L << ABRECOLC))) != 0)) {
				{
				setState(299); 
				listadecampos();
				}
			}

			setState(302); 
			match(FECHACHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			campo();
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305); 
					separadordecampos();
					setState(306); 
					campo();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(314);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__12) {
				{
				setState(313); 
				separadordecampos();
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_campo);
		try {
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); 
				match(ABRECOLC);
				setState(317); 
				exp(0);
				setState(318); 
				match(FECHACOLC);
				setState(319); 
				match(T__1);
				setState(320); 
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); 
				match(NOME);
				setState(323); 
				match(T__1);
				setState(324); 
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325); 
				exp(0);
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << CONCATENACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__37) | (1L << COMPRIMENTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: 
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\5\49\n\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\5\4"+
		"B\n\4\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5"+
		"\f\5\16\5f\13\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5w\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\5\5\u0094"+
		"\n\5\3\6\3\6\5\6\u0098\n\6\3\6\5\6\u009b\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a2"+
		"\n\7\f\7\16\7\u00a5\13\7\3\7\3\7\5\7\u00a9\n\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16\n"+
		"\u00cc\13\n\3\13\3\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r\u00fa\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0104\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u010f\n\17\3\20\3\20\5\20\u0113\n\20\3\20\3\20\3\20\5\20\u0118"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u011f\n\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u0128\n\23\3\23\5\23\u012b\n\23\3\24\3\24\5\24\u012f\n"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0137\n\25\f\25\16\25\u013a\13"+
		"\25\3\25\5\25\u013d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0149\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\3\26\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\4\2\3\3\17\17\4\2"+
		"\32\'\62\62\5\2\33\33((\63\63\u016d\2\62\3\2\2\2\4\64\3\2\2\2\6<\3\2\2"+
		"\2\b\u0093\3\2\2\2\n\u009a\3\2\2\2\f\u009c\3\2\2\2\16\u00ac\3\2\2\2\20"+
		"\u00c1\3\2\2\2\22\u00c3\3\2\2\2\24\u00d2\3\2\2\2\26\u00e4\3\2\2\2\30\u00ef"+
		"\3\2\2\2\32\u0103\3\2\2\2\34\u010e\3\2\2\2\36\u0117\3\2\2\2 \u0119\3\2"+
		"\2\2\"\u011c\3\2\2\2$\u012a\3\2\2\2&\u012c\3\2\2\2(\u0132\3\2\2\2*\u0148"+
		"\3\2\2\2,\u014a\3\2\2\2.\u014c\3\2\2\2\60\u014e\3\2\2\2\62\63\5\6\4\2"+
		"\63\3\3\2\2\2\64\65\5\6\4\2\65\5\3\2\2\2\668\5\b\5\2\679\7\3\2\28\67\3"+
		"\2\2\289\3\2\2\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"C\3\2\2\2><\3\2\2\2?A\5\n\6\2@B\7\3\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"C?\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EF\5\16\b\2FG\7\4\2\2GH\5\24\13\2H\u0094"+
		"\3\2\2\2I\u0094\5\34\17\2JK\7\5\2\2KL\5\4\3\2LM\7\6\2\2M\u0094\3\2\2\2"+
		"NO\7\7\2\2OP\5\26\f\2PQ\7\5\2\2QR\5\4\3\2RS\7\6\2\2S\u0094\3\2\2\2TU\7"+
		"\b\2\2UV\5\4\3\2VW\7\t\2\2WX\5\26\f\2X\u0094\3\2\2\2YZ\7\n\2\2Z[\5\26"+
		"\f\2[\\\7\13\2\2\\d\5\4\3\2]^\7\f\2\2^_\5\26\f\2_`\7\13\2\2`a\5\4\3\2"+
		"ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2\2\2"+
		"gh\7\r\2\2hj\5\4\3\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\6\2\2l\u0094\3"+
		"\2\2\2mn\7\16\2\2no\7+\2\2op\b\5\1\2pq\7\4\2\2qr\5\26\f\2rs\7\17\2\2s"+
		"v\5\26\f\2tu\7\17\2\2uw\5\26\f\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\5\2"+
		"\2yz\5\4\3\2z{\7\6\2\2{\u0094\3\2\2\2|}\7\16\2\2}~\5\22\n\2~\177\7\20"+
		"\2\2\177\u0080\5\24\13\2\u0080\u0081\7\5\2\2\u0081\u0082\5\4\3\2\u0082"+
		"\u0083\7\6\2\2\u0083\u0094\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5"+
		"\f\7\2\u0086\u0087\b\5\1\2\u0087\u0088\5\"\22\2\u0088\u0094\3\2\2\2\u0089"+
		"\u008a\7\22\2\2\u008a\u008b\7\21\2\2\u008b\u008c\7+\2\2\u008c\u0094\5"+
		"\"\22\2\u008d\u008e\7\22\2\2\u008e\u0091\5\22\n\2\u008f\u0090\7\4\2\2"+
		"\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093E\3\2\2\2\u0093I\3\2\2\2\u0093J\3\2\2\2\u0093N\3\2\2\2\u0093"+
		"T\3\2\2\2\u0093Y\3\2\2\2\u0093m\3\2\2\2\u0093|\3\2\2\2\u0093\u0084\3\2"+
		"\2\2\u0093\u0089\3\2\2\2\u0093\u008d\3\2\2\2\u0094\t\3\2\2\2\u0095\u0097"+
		"\7\23\2\2\u0096\u0098\5\24\13\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u009b\3\2\2\2\u0099\u009b\7\24\2\2\u009a\u0095\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\13\3\2\2\2\u009c\u009d\7+\2\2\u009d\u00a3\b\7\1\2"+
		"\u009e\u009f\7\25\2\2\u009f\u00a0\7+\2\2\u00a0\u00a2\b\7\1\2\u00a1\u009e"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a8\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a9\7"+
		"+\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\7\1\2\u00ab\r\3\2\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00b4\b\b\1"+
		"\2\u00ae\u00af\7\17\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\b\b\1\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\17\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8"+
		"\7+\2\2\u00b8\u00c2\b\t\1\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\79\2\2\u00bb"+
		"\u00bc\5\26\f\2\u00bc\u00bd\7:\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\5\30"+
		"\r\2\u00bf\u00c0\7\25\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1"+
		"\u00b9\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\7+\2\2"+
		"\u00c4\u00ca\b\n\1\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c9"+
		"\b\n\1\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\26\f"+
		"\2\u00ce\u00cf\7\17\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\26\f\2\u00d6\25\3\2\2\2\u00d7\u00d8"+
		"\b\f\1\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\5\26\f\3\u00da\u00e5\3\2\2"+
		"\2\u00db\u00e5\7\27\2\2\u00dc\u00e5\7\30\2\2\u00dd\u00e5\7\31\2\2\u00de"+
		"\u00e5\7*\2\2\u00df\u00e5\7,\2\2\u00e0\u00e5\7\64\2\2\u00e1\u00e5\5 \21"+
		"\2\u00e2\u00e5\5\32\16\2\u00e3\u00e5\5&\24\2\u00e4\u00d7\3\2\2\2\u00e4"+
		"\u00db\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2"+
		"\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00e7\f\4"+
		"\2\2\u00e7\u00e8\5.\30\2\u00e8\u00e9\5\26\f\5\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\27\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f8\7+\2\2\u00f0\u00f1"+
		"\79\2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7:\2\2\u00f3\u00f7\3\2\2\2\u00f4"+
		"\u00f5\7\25\2\2\u00f5\u00f7\7+\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\31\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5\20\t\2\u00fc\u00fd\b\16"+
		"\1\2\u00fd\u0104\3\2\2\2\u00fe\u0104\5\34\17\2\u00ff\u0100\7\65\2\2\u0100"+
		"\u0101\5\26\f\2\u0101\u0102\7\66\2\2\u0102\u0104\3\2\2\2\u0103\u00fb\3"+
		"\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\33\3\2\2\2\u0105"+
		"\u0106\5\30\r\2\u0106\u0107\b\17\1\2\u0107\u0108\5\36\20\2\u0108\u010f"+
		"\3\2\2\2\u0109\u010a\5\30\r\2\u010a\u010b\7\26\2\2\u010b\u010c\7+\2\2"+
		"\u010c\u010d\5\36\20\2\u010d\u010f\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0109"+
		"\3\2\2\2\u010f\35\3\2\2\2\u0110\u0112\7\65\2\2\u0111\u0113\5\24\13\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\7\66"+
		"\2\2\u0115\u0118\5&\24\2\u0116\u0118\7,\2\2\u0117\u0110\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\37\3\2\2\2\u0119\u011a\7\21\2"+
		"\2\u011a\u011b\5\"\22\2\u011b!\3\2\2\2\u011c\u011e\7\65\2\2\u011d\u011f"+
		"\5$\23\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\66\2\2\u0121\u0122\5\4\3\2\u0122\u0123\7\6\2\2\u0123#\3\2\2\2"+
		"\u0124\u0127\5\22\n\2\u0125\u0126\7\17\2\2\u0126\u0128\7\64\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012b\7\64"+
		"\2\2\u012a\u0124\3\2\2\2\u012a\u0129\3\2\2\2\u012b%\3\2\2\2\u012c\u012e"+
		"\7\67\2\2\u012d\u012f\5(\25\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u0131\78\2\2\u0131\'\3\2\2\2\u0132\u0138\5"+
		"*\26\2\u0133\u0134\5,\27\2\u0134\u0135\5*\26\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\5,\27\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d)\3\2\2\2\u013e\u013f\79\2\2\u013f"+
		"\u0140\5\26\f\2\u0140\u0141\7:\2\2\u0141\u0142\7\4\2\2\u0142\u0143\5\26"+
		"\f\2\u0143\u0149\3\2\2\2\u0144\u0145\7+\2\2\u0145\u0146\7\4\2\2\u0146"+
		"\u0149\5\26\f\2\u0147\u0149\5\26\f\2\u0148\u013e\3\2\2\2\u0148\u0144\3"+
		"\2\2\2\u0148\u0147\3\2\2\2\u0149+\3\2\2\2\u014a\u014b\t\2\2\2\u014b-\3"+
		"\2\2\2\u014c\u014d\t\3\2\2\u014d/\3\2\2\2\u014e\u014f\t\4\2\2\u014f\61"+
		"\3\2\2\2\"8<ACdiv\u0091\u0093\u0097\u009a\u00a3\u00a8\u00b4\u00c1\u00ca"+
		"\u00d2\u00e4\u00ec\u00f6\u00f8\u0103\u010e\u0112\u0117\u011e\u0127\u012a"+
		"\u012e\u0138\u013c\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}