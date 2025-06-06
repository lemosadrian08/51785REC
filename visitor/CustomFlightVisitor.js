import FlightVisitor from '../generated/FlightVisitor.js';

class CustomFlightVisitor extends FlightVisitor {
  visitFlight(ctx) {
    // Extraer componentes del árbol
    const codigo = ctx.codigo_vuelo().getText();
    const from = ctx.IATA(0).getText();
    const to = ctx.IATA(1).getText();
    const hora = ctx.hora().getText();
    const estado = ctx.estado().getText();
    const terminal = ctx.terminal().getText();

    // Armar objeto en formato JavaScript
    const flight = {
      code: codigo,
      from: from,
      to: to,
      time: hora,
      status: estado,
      gate: terminal
    };

    // Mostrar resultado traducido
    console.log("Traducción a JavaScript:\n");
    console.log(`const flight = ${JSON.stringify(flight, null, 2)};`);

    return flight;
  }
}

export default CustomFlightVisitor;