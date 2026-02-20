# Maven-_Dependencias-_-Validaci-n-de-Expresiones-_Ofuscaci-n

## 1. Estructura obligatoria del repositorio

**Instrucciones claras de compilación y ejecución:**

* Primero, abre la consola (cmd) y ubícate en la carpeta raíz del proyecto, donde se encuentra el archivo `pom.xml`.

* Para compilar el proyecto, ejecuta:mvn clean package

* Esto eliminará compilaciones anteriores y generará el archivo `.jar` dentro de la carpeta `target`.

* Cuando termine, para ejecutar el programa en su versión normal, utiliza el comando correspondiente.

* Si deseas ejecutar la versión ofuscada, también puedes usar el comando adecuado para esa versión.

* En ambos casos, la expresión que quieras validar se indica al final del comando, y puedes reemplazarla por cualquier otra para hacer pruebas.

* Con esto podrás compilar y ejecutar tanto la versión original como la ofuscada sin problemas.

---

## 5. Parte D

**Breve análisis escrito explicando:**

### ¿Qué tanto se dificulta la lectura?
La lectura del código ofuscado es más complicada. Los nombres de las clases, métodos y variables se cambiaron por letras simples o nombres genéricos como `paramChar1`. Antes, con los nombres originales, era más fácil entender qué hacía cada parte del programa; ahora es necesario revisar todo el bloque para comprender su función.

### ¿Se pierde claridad estructural?
La estructura general del programa se mantiene. Los ciclos `for`, las condiciones `if` y los `return` siguen en el mismo orden y cumplen la misma función. Sin embargo, ahora cuesta más entender la intención de cada sección porque los nombres ya no ayudan a interpretar lo que hace el código.

### ¿Sigue siendo posible entender la lógica?
Sí, todavía se puede entender la lógica, aunque requiere más atención. Las comparaciones y el flujo del programa se mantienen, por lo que una persona que revise el código con cuidado puede deducir que se trata de un validador de símbolos usando una pila.

---

## 6. Parte E

### Conclusión breve confirmando que el comportamiento no cambió:
Al comparar los dos archivos `Main` (el obtenido desde JD-GUI y el de Eclipse), se puede ver que aunque los nombres de clases, métodos y variables cambian por la ofuscación, la lógica y el flujo del programa permanecen iguales. Ambos realizan las mismas operaciones, llaman a los mismos métodos en el mismo orden y producen los mismos resultados.

Esto demuestra que la ofuscación no altera el funcionamiento del programa, solo dificulta su lectura.
