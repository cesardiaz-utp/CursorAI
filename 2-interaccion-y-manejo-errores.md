# Hora 2: Interacción Profunda y Manejo de Errores con AI

## El Chat de AI: Conversando con tu Código (25 min)

Ahora que tenemos Cursor AI instalado y conocemos la interfaz básica, vamos a explorar una de las funciones más interactivas y potentes: el chat de IA. Es como tener un colega experto sentado a tu lado, listo para ayudarte.

* **Accediendo al Chat de AI:**
    * Generalmente, el panel de chat de AI se encuentra en el lado derecho de la ventana de Cursor AI. Si no lo ven, busquen un ícono de chat o una opción en el menú `View` o `Panels`.
    * También pueden abrirlo a menudo con un atajo de teclado (`Cmd/Ctrl + Shift + I` en macOS, o similar en otros SO, pueden verificarlo en `Keyboard Shortcuts`).

* **¿Cómo Funciona?**
    * El chat de AI es una conversación en lenguaje natural con el modelo de IA subyacente (GPT-4o, Claude, etc., dependiendo de lo que configuraron).
    * Tiene **conocimiento del contexto** del archivo que tienen abierto, y pueden darle contexto adicional seleccionando código o usando referencias como `@file_name`.
    * Pueden hacer preguntas, pedir explicaciones, solicitar modificaciones, generar código nuevo, etc.

* **Ejemplos de Uso del Chat de AI:**
    * **Entender Código Existente:**
        * Seleccionen un bloque de código complejo o que no entiendan bien.
        * En el chat, escriban algo como: "Explain this code block step by step." (Explica este bloque de código paso a paso.) o "What does this function do?" (¿Qué hace esta función?).
    * **Refactorizar o Mejorar Código:**
        * Seleccionen una función o sección que quieran optimizar o limpiar.
        * Escriban: "Refactor this function to be more readable and efficient." (Refactoriza esta función para que sea más legible y eficiente.) o "Improve the performance of this loop." (Mejora el rendimiento de este bucle.).
    * **Generar Código Nuevo (más complejo que con Cmd/Ctrl + K):**
        * Describe la funcionalidad que necesitas. Puedes referenciar partes de tu proyecto usando `@`.
        * Escribe: "Write a class in Python to manage user profiles with methods for add, update, and delete." (Escribe una clase en Python para gestionar perfiles de usuario con métodos para añadir, actualizar y eliminar.) o "Generate unit tests for the `UserProfile` class I just created." (Genera tests unitarios para la clase `UserProfile` que acabo de crear.).
    * **Obtener Ayuda Conceptual:**
        * Pregunta sobre conceptos de programación, librerías o mejores prácticas relevantes para tu proyecto.
        * Escribe: "What is the best way to handle asynchronous operations in JavaScript in this project's context?" (¿Cuál es la mejor manera de manejar operaciones asíncronas en JavaScript en el contexto de este proyecto?).

* **Demostración en Vivo (por el instructor):**
    * Abrir un archivo con una función simple pero no trivial.
    * Seleccionar la función y pedir al chat que la explique.
    * Luego, pedir al chat que refactorice la función para usar una sintaxis más moderna o idiomática del lenguaje.
    * Mostrar cómo la IA propone el cambio y cómo se puede aplicar.

## Detección y Sugerencia de Corrección de Errores (25 min)

Uno de los mayores beneficios de una IDE con IA es la ayuda con los errores y la depuración. Cursor AI está diseñado para ser proactivo en esto.

* **Identificación de Errores en Tiempo Real:**
    * Al igual que otras IDEs, Cursor AI utiliza linters y herramientas de análisis estático para detectar errores de sintaxis, errores tipográficos o posibles problemas lógicos **mientras escribes**.
    * Verán subrayados (generalmente rojos o amarillos) indicando errores o advertencias.

* **Obteniendo Sugerencias de Corrección:**
    * Al pasar el ratón sobre un error subrayado, Cursor AI a menudo mostrará una descripción del problema.
    * Además, puede ofrecer una "bombilla" o un ícono similar (como en VS Code) que, al hacer clic, muestra "Acciones rápidas" sugeridas por la IA para corregir el problema automáticamente.
    * **Demostración:** Introducir un error de sintaxis simple a propósito (ej: olvidar un paréntesis o una coma). Mostrar cómo Cursor AI lo subraya y las sugerencias de corrección rápida.

* **Uso del Chat de AI para Depuración:**
    * Cuando tu código no solo tiene errores de sintaxis sino problemas lógicos que aparecen en tiempo de ejecución (ej: un error en la terminal al correr un script, una excepción), el chat de AI puede ser un salvavidas.
    * **Paso a Paso:**
        1.  Reproduce el error para que aparezca en la terminal o consola de depuración.
        2.  Copia el **mensaje de error completo** y, si es posible, el **stack trace** (la lista de llamadas a funciones que llevaron al error).
        3.  Pega este mensaje en el chat de AI de Cursor.
        4.  Agrega contexto, como: "I'm getting this error when running my script. Can you help me understand why and suggest a fix?" (Estoy recibiendo este error al correr mi script. ¿Puedes ayudarme a entender por qué y sugerir una solución?).
        5.  La IA analizará el error, intentará relacionarlo con tu código (si tienes el archivo relevante abierto o referenciado) y te explicará la causa probable, proponiendo una solución o pasos para investigar.

* **Ejercicio Práctico 1: Corrigiendo Errores con AI (Trabajo individual guiado)**
    * Les proporcionaré (o abriremos un archivo de ejemplo pre-cargado) con algunos errores comunes intencionalmente.
    * Su tarea es utilizar las funcionalidades de Cursor AI (subrayados, sugerencias rápidas, y/o el chat de AI si el error es más complejo) para identificar y corregir todos los errores en el archivo.
    * *(**Nota para el instructor:** Ten preparado un archivo de código con 2-3 errores típicos que Cursor AI pueda detectar o para los que el chat pueda ofrecer ayuda relevante. Por ejemplo: una variable no definida, un error de sintaxis menor, o un error lógico simple que cause una excepción reproducible.)*

## Preguntas y Respuestas sobre Chat y Errores (5 min)

Para cerrar esta hora, abrimos un breve espacio para preguntas específicas sobre el uso del chat de AI y cómo Cursor les ayuda a encontrar y corregir errores.

*(Gestionar las preguntas para mantenerse dentro del tiempo. Preguntas más complejas o que requieran mucha depuración individual podrían posponerse para después de la clase o un espacio de consulta dedicado si aplica).*
