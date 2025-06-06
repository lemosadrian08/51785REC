// Generated from c:/Users/lemos/51785REC/Flight.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlightParser}.
 */
public interface FlightListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlightParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FlightParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FlightParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#flight}.
	 * @param ctx the parse tree
	 */
	void enterFlight(FlightParser.FlightContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#flight}.
	 * @param ctx the parse tree
	 */
	void exitFlight(FlightParser.FlightContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#codigo_vuelo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo_vuelo(FlightParser.Codigo_vueloContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#codigo_vuelo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo_vuelo(FlightParser.Codigo_vueloContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#hora}.
	 * @param ctx the parse tree
	 */
	void enterHora(FlightParser.HoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#hora}.
	 * @param ctx the parse tree
	 */
	void exitHora(FlightParser.HoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(FlightParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(FlightParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(FlightParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(FlightParser.TerminalContext ctx);
}