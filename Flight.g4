grammar Flight;

prog: flight EOF;

flight: codigo_vuelo IATA '-' IATA hora ',' estado ',' 'Gate:' terminal;

codigo_vuelo: LETRA LETRA DIGITO DIGITO DIGITO;
IATA: LETRA LETRA LETRA;
hora: DIGITO DIGITO ':' DIGITO DIGITO;
estado: 'ON_TIME' | 'DELAYED' | 'CANCELLED';
terminal: LETRA DIGITO DIGITO;

LETRA: [A-Z];
DIGITO: [0-9];
WS: [ \t\r\n]+ -> skip;