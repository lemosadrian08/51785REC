// Generated from c:/Users/lemos/analizador-vuelos/Flight.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import FlightListener from './FlightListener.js';
import FlightVisitor from './FlightVisitor.js';

const serializedATN = [4,1,11,45,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,
1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,5,1,5,1,5,1,5,1,5,0,0,
6,0,2,4,6,8,10,0,1,1,0,5,7,38,0,12,1,0,0,0,2,15,1,0,0,0,4,26,1,0,0,0,6,32,
1,0,0,0,8,38,1,0,0,0,10,40,1,0,0,0,12,13,3,2,1,0,13,14,5,0,0,1,14,1,1,0,
0,0,15,16,3,4,2,0,16,17,5,8,0,0,17,18,5,1,0,0,18,19,5,8,0,0,19,20,3,6,3,
0,20,21,5,2,0,0,21,22,3,8,4,0,22,23,5,2,0,0,23,24,5,3,0,0,24,25,3,10,5,0,
25,3,1,0,0,0,26,27,5,9,0,0,27,28,5,9,0,0,28,29,5,10,0,0,29,30,5,10,0,0,30,
31,5,10,0,0,31,5,1,0,0,0,32,33,5,10,0,0,33,34,5,10,0,0,34,35,5,4,0,0,35,
36,5,10,0,0,36,37,5,10,0,0,37,7,1,0,0,0,38,39,7,0,0,0,39,9,1,0,0,0,40,41,
5,9,0,0,41,42,5,10,0,0,42,43,5,10,0,0,43,11,1,0,0,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class FlightParser extends antlr4.Parser {

    static grammarFileName = "Flight.g4";
    static literalNames = [ null, "'-'", "','", "'Gate:'", "':'", "'ON_TIME'", 
                            "'DELAYED'", "'CANCELLED'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             "IATA", "LETRA", "DIGITO", "WS" ];
    static ruleNames = [ "prog", "flight", "codigo_vuelo", "hora", "estado", 
                         "terminal" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = FlightParser.ruleNames;
        this.literalNames = FlightParser.literalNames;
        this.symbolicNames = FlightParser.symbolicNames;
    }



	prog() {
	    let localctx = new ProgContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, FlightParser.RULE_prog);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 12;
	        this.flight();
	        this.state = 13;
	        this.match(FlightParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	flight() {
	    let localctx = new FlightContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, FlightParser.RULE_flight);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 15;
	        this.codigo_vuelo();
	        this.state = 16;
	        this.match(FlightParser.IATA);
	        this.state = 17;
	        this.match(FlightParser.T__0);
	        this.state = 18;
	        this.match(FlightParser.IATA);
	        this.state = 19;
	        this.hora();
	        this.state = 20;
	        this.match(FlightParser.T__1);
	        this.state = 21;
	        this.estado();
	        this.state = 22;
	        this.match(FlightParser.T__1);
	        this.state = 23;
	        this.match(FlightParser.T__2);
	        this.state = 24;
	        this.terminal();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	codigo_vuelo() {
	    let localctx = new Codigo_vueloContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, FlightParser.RULE_codigo_vuelo);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.match(FlightParser.LETRA);
	        this.state = 27;
	        this.match(FlightParser.LETRA);
	        this.state = 28;
	        this.match(FlightParser.DIGITO);
	        this.state = 29;
	        this.match(FlightParser.DIGITO);
	        this.state = 30;
	        this.match(FlightParser.DIGITO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	hora() {
	    let localctx = new HoraContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, FlightParser.RULE_hora);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        this.match(FlightParser.DIGITO);
	        this.state = 33;
	        this.match(FlightParser.DIGITO);
	        this.state = 34;
	        this.match(FlightParser.T__3);
	        this.state = 35;
	        this.match(FlightParser.DIGITO);
	        this.state = 36;
	        this.match(FlightParser.DIGITO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	estado() {
	    let localctx = new EstadoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, FlightParser.RULE_estado);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 38;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 224) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminal() {
	    let localctx = new TerminalContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, FlightParser.RULE_terminal);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 40;
	        this.match(FlightParser.LETRA);
	        this.state = 41;
	        this.match(FlightParser.DIGITO);
	        this.state = 42;
	        this.match(FlightParser.DIGITO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

FlightParser.EOF = antlr4.Token.EOF;
FlightParser.T__0 = 1;
FlightParser.T__1 = 2;
FlightParser.T__2 = 3;
FlightParser.T__3 = 4;
FlightParser.T__4 = 5;
FlightParser.T__5 = 6;
FlightParser.T__6 = 7;
FlightParser.IATA = 8;
FlightParser.LETRA = 9;
FlightParser.DIGITO = 10;
FlightParser.WS = 11;

FlightParser.RULE_prog = 0;
FlightParser.RULE_flight = 1;
FlightParser.RULE_codigo_vuelo = 2;
FlightParser.RULE_hora = 3;
FlightParser.RULE_estado = 4;
FlightParser.RULE_terminal = 5;

class ProgContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_prog;
    }

	flight() {
	    return this.getTypedRuleContext(FlightContext,0);
	};

	EOF() {
	    return this.getToken(FlightParser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterProg(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitProg(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitProg(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FlightContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_flight;
    }

	codigo_vuelo() {
	    return this.getTypedRuleContext(Codigo_vueloContext,0);
	};

	IATA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(FlightParser.IATA);
	    } else {
	        return this.getToken(FlightParser.IATA, i);
	    }
	};


	hora() {
	    return this.getTypedRuleContext(HoraContext,0);
	};

	estado() {
	    return this.getTypedRuleContext(EstadoContext,0);
	};

	terminal() {
	    return this.getTypedRuleContext(TerminalContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterFlight(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitFlight(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitFlight(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Codigo_vueloContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_codigo_vuelo;
    }

	LETRA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(FlightParser.LETRA);
	    } else {
	        return this.getToken(FlightParser.LETRA, i);
	    }
	};


	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(FlightParser.DIGITO);
	    } else {
	        return this.getToken(FlightParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterCodigo_vuelo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitCodigo_vuelo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitCodigo_vuelo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class HoraContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_hora;
    }

	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(FlightParser.DIGITO);
	    } else {
	        return this.getToken(FlightParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterHora(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitHora(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitHora(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class EstadoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_estado;
    }


	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterEstado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitEstado(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitEstado(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminalContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = FlightParser.RULE_terminal;
    }

	LETRA() {
	    return this.getToken(FlightParser.LETRA, 0);
	};

	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(FlightParser.DIGITO);
	    } else {
	        return this.getToken(FlightParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.enterTerminal(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof FlightListener ) {
	        listener.exitTerminal(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof FlightVisitor ) {
	        return visitor.visitTerminal(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




FlightParser.ProgContext = ProgContext; 
FlightParser.FlightContext = FlightContext; 
FlightParser.Codigo_vueloContext = Codigo_vueloContext; 
FlightParser.HoraContext = HoraContext; 
FlightParser.EstadoContext = EstadoContext; 
FlightParser.TerminalContext = TerminalContext; 
