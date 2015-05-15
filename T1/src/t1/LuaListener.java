// Generated from C:\Users\Azathoth\Documents\GitHub\u005Cufscar-cc1-2015-task1\T1\src\t1\Lua.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomedafuncao(@NotNull LuaParser.NomedafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomedafuncao(@NotNull LuaParser.NomedafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(@NotNull LuaParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(@NotNull LuaParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadadefuncao(@NotNull LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadadefuncao(@NotNull LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(@NotNull LuaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(@NotNull LuaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listapar}.
	 * @param ctx the parse tree
	 */
	void enterListapar(@NotNull LuaParser.ListaparContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listapar}.
	 * @param ctx the parse tree
	 */
	void exitListapar(@NotNull LuaParser.ListaparContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull LuaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull LuaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void enterListadenomes(@NotNull LuaParser.ListadenomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void exitListadenomes(@NotNull LuaParser.ListadenomesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(@NotNull LuaParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(@NotNull LuaParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#construtortabela}.
	 * @param ctx the parse tree
	 */
	void enterConstrutortabela(@NotNull LuaParser.ConstrutortabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#construtortabela}.
	 * @param ctx the parse tree
	 */
	void exitConstrutortabela(@NotNull LuaParser.ConstrutortabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void enterSeparadordecampos(@NotNull LuaParser.SeparadordecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void exitSeparadordecampos(@NotNull LuaParser.SeparadordecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(@NotNull LuaParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(@NotNull LuaParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpodafuncao(@NotNull LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpodafuncao(@NotNull LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull LuaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull LuaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void enterUltimocomando(@NotNull LuaParser.UltimocomandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void exitUltimocomando(@NotNull LuaParser.UltimocomandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo(@NotNull LuaParser.ExpprefixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo(@NotNull LuaParser.ExpprefixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void enterListadecampos(@NotNull LuaParser.ListadecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void exitListadecampos(@NotNull LuaParser.ListadecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opbin}.
	 * @param ctx the parse tree
	 */
	void enterOpbin(@NotNull LuaParser.OpbinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opbin}.
	 * @param ctx the parse tree
	 */
	void exitOpbin(@NotNull LuaParser.OpbinContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expprefixo2}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo2(@NotNull LuaParser.Expprefixo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expprefixo2}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo2(@NotNull LuaParser.Expprefixo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opunaria}.
	 * @param ctx the parse tree
	 */
	void enterOpunaria(@NotNull LuaParser.OpunariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opunaria}.
	 * @param ctx the parse tree
	 */
	void exitOpunaria(@NotNull LuaParser.OpunariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void enterListavar(@NotNull LuaParser.ListavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void exitListavar(@NotNull LuaParser.ListavarContext ctx);
}