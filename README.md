# Analizador de Vuelos con ANTLR4 + JavaScript

Este proyecto implementa un analizador léxico y sintáctico para descripciones de vuelos usando **ANTLR4** y **JavaScript**, conforme a la gramática definida en `Flight.g4`.

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
