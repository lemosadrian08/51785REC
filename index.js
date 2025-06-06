import antlr4 from 'antlr4';
import fs from 'fs';

import FlightLexer from './generated/FlightLexer.js';
import FlightParser from './generated/FlightParser.js';
import CustomFlightVisitor from './visitor/CustomFlightVisitor.js';

let input;
try {
  input = fs.readFileSync('input.txt', 'utf8');
} catch (err) {
  console.error("No se pudo leer input.txt");
  process.exit(1);
}

const chars = new antlr4.InputStream(input);
const lexer = new FlightLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new FlightParser(tokens);

parser.buildParseTrees = true;
const tree = parser.prog();

if (parser._syntaxErrors > 0) {
  console.error("Se encontraron errores de sintaxis.");
} else {
  console.log("Entrada válida.");
  console.log("Árbol de derivación:\n" + tree.toStringTree(parser.ruleNames));
  const visitor = new CustomFlightVisitor();
  visitor.visit(tree);

  // Tabla de lexemas - tokens (solo si no hay errores)
  tokens.fill(); // fuerza la carga completa
  console.log("\nTabla de lexemas - tokens:");
  console.log("---------------------------");
  tokens.tokens.forEach(token => {
    if (token.type !== -1) {
      const tokenName = FlightLexer.symbolicNames[token.type] || FlightLexer.literalNames[token.type] || 'UNKNOWN';
      console.log(`${token.text}\t→\t${tokenName}`);

    }
  });
}