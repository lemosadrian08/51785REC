# Analizador de Vuelos con ANTLR4 + JavaScript

Este proyecto implementa un analizador léxico y sintáctico para descripciones de vuelos usando **ANTLR4** y **JavaScript**, conforme a la gramática definida en `Flight.g4`.

## ✍️ Tarea: Construcción de un Analizador con ANTLR4 y JavaScript Tema: 25914_17
Se proporciona una gramática en notación EBNF que describe un lenguaje específico. Utilizando ANTLR4 con JavaScript, implemente un analizador que procese un archivo de entrada (input.txt) con código fuente escrito en dicho lenguaje. <vuelo>::= <codigo_vuelo><aeropuerto_salida> "-" <aeropuerto_llegada> hora;
<codigo_vuelo>::= <letra><letra><digito><digito><digito>; (* Ej: "AA123" *)
<aeropuerto>::= <letra><letra><letra>; (* Utilizar Código IATA *)
<hora>::=("00".."23" ":" "00".."59" ) | "NOW";
<fecha>::= <digito><digito> "/" <digito><digito> "/" <digito><digito>; (* DD/MM/YY *)
<estado>::= "ON_TIME" | "DELAYED" | "CANCELLED";
<operador>::= <letra> { letra | "" };
(* Ej: "American Airlines" *)
<asiento>::=("A" | "B" | "C" | "D" | "E" | "F" ) <digito> { <digito>}; <puerta>::= <letra><digito> { <digito> };
<terminal>::=<digito> | <letra> ;
El analizador deberá realizar las siguientes tareas:
(* Ej: "B12" *)
1. Análisis léxico y sintáctico: realizar el análisis léxico y sintáctico sobre el código fuente e informar si la entrada es correcta o contiene errores. En caso de errores, indicar la línea en la que ocurren y la causa del problema.
2. Tabla de lexemas-tokens: Generar una tabla que contenga los lexemas y sus respectivos tokens reconocidos durante el análisis léxico.
3. Árbol de análisis sintáctico: Construir y mostrar el árbol de análisis sintáctico concreto de la entrada. Puede representarse en formato de texto.
4. Interpretación: Traducir el código fuente al lenguaje JavaScript y ejecutarlo como lo haría un intérprete básico.
El desarrollo debe entregarse cumpliendo las pautas para la entrega establecidas en el documento Pautas de trabajo para analizador.
Ejemplo de código
AA123 JFK-LAX 15:30, DELAYED, Gate: B12
Traduccion a JavaScript
const flight = {
code: "AA123",
from: "JFK",
to: "LAX",
time: "15:30",
status: "DELAYED", gate: "B12",
};


## 📚 Requisitos

- Node.js (versión 14+)
- ANTLR 4.13.2
- Extensión ANTLR4 para Visual Studio Code

## 🚀 Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/lemosadrian08/51785REC
   cd 51785REC
   ```

2. Instalar dependencias:
   ```bash
   npm install
   ```

3. Generar el parser:
   - En Visual Studio Code, asegurate de que `Flight.g4` está en la raíz.
   - Presionar **F5** con el archivo abierto (si tenés configurado `.vscode/settings.json`).
   - Los archivos se generan en `/generated`.

## 🧪 Pruebas

Se incluyen archivos de prueba:

- ✅ `valido1.txt`, `valido2.txt`, `valido3.txt`  
- ❌ `invalido1.txt`, `invalido2.txt`, `invalido3.txt`

Para ejecutar el analizador con `input.txt`:

```bash
node index.js
```

## 📄 Estructura esperada

Formato válido:
```
AA123 JFK-LAX 15:30, ON_TIME, Gate: B12
```

### Reglas:
- Código de vuelo: 2 letras + 3 dígitos (ej. `AA123`)
- IATA origen y destino: 3 letras (ej. `JFK-LAX`)
- Hora: formato `HH:MM`
- Estado: `ON_TIME`, `DELAYED`, `CANCELLED`
- Gate: palabra `Gate:` + letra + 2 dígitos (ej. `B12`)

## 📁 Estructura del Proyecto

```
├── generated/                # Archivos generados por ANTLR
├── visitor/
│   └── CustomFlightVisitor.js
├── input.txt                 # Archivo de entrada principal
├── valido1.txt ...          # Archivos de prueba
├── Flight.g4                # Gramática ANTLR
├── index.js                 # Punto de entrada
├── package.json
└── README.md
```

## ✍️ Autor

Adrián Lemos 
