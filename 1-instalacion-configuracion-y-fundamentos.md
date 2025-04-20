# Hora 1: Instalación, Configuración y Fundamentos de Cursor AI

## Bienvenida e Introducción a Cursor AI (10 min)

¡Hola a todos! Bienvenidos a esta clase sobre cómo potenciar su flujo de trabajo de programación con Cursor AI.

* **¿Qué es Cursor AI?**
    * Cursor AI no es solo otro editor de código; es una **IDE (Entorno de Desarrollo Integrado)** construida sobre Visual Studio Code (VS Code), pero **supercargada con capacidades de Inteligencia Artificial**.
    * Piensen en él como su **copiloto de codificación** inteligente, diseñado para entender su código, anticipar sus necesidades y ayudarles a escribir código más rápido y con menos errores.

* **¿Por qué usar Cursor AI?**
    * **Aumento de Productividad:** Autocompletado avanzado, generación de código completa y asistencia en tareas repetitivas.
    * **Mejora la Calidad del Código:** Ayuda a detectar errores tempranamente y sugiere mejoras o refactorizaciones.
    * **Asistencia Contextual:** Entiende no solo la línea actual, sino también el contexto de su archivo e incluso de todo el proyecto.
    * **Interacción Natural:** Pueden "chatear" con la IA sobre su código en lenguaje natural.

* **Nuestro Objetivo en esta Hora:**
    * Que todos salgan de esta primera hora con **Cursor AI instalado y configurado** en sus máquinas.
    * Que se familiaricen con la **interfaz básica**.
    * Que realicen sus **primeras interacciones** con las funcionalidades de IA más fundamentales.

## Instalación Guiada y Configuración Inicial (35 min)

Este es un paso crucial para poder practicar. Sigan mis pasos y, por favor, levanten la mano si encuentran alguna dificultad.

1.  **Descargar Cursor AI:**
    * Abran su navegador web.
    * Vayan a la página oficial: **[cursor.com](https://cursor.com)**
    * La página debería detectar automáticamente su sistema operativo (Windows, macOS, Linux) y ofrecerles el enlace de descarga correcto.
    * Hagan clic en el botón de descarga.

    *(**Nota para el instructor:** Dependiendo de la conexión a internet del grupo, la descarga puede tomar varios minutos. Si es posible, ¡recomendar a los participantes que lo descarguen antes de la clase puede ahorrar mucho tiempo aquí! Si no, gestiona las expectativas de tiempo).*

2.  **Ejecutar el Instalador:**
    * Una vez que la descarga esté completa, localicen el archivo descargado (generalmente en su carpeta de Descargas).
    * Ejecuten el archivo.
    * Sigan las instrucciones en pantalla. El proceso es similar a la instalación de cualquier otra aplicación. Puede que necesiten aceptar acuerdos de licencia o elegir una ubicación de instalación.

    *(**Nota para el instructor:** Estén atentos a las diferencias en los instaladores para Windows (.exe), macOS (.dmg) y Linux (.deb, .rpm o archivo tar.gz). Pueden necesitar guiar a los usuarios de Linux con comandos de terminal si no usan un instalador gráfico).*

3.  **Primera Ejecución y Asistente de Configuración:**
    * Después de la instalación, abran la aplicación Cursor AI.
    * La primera vez que la ejecuten, Cursor les guiará a través de un asistente de configuración inicial.

    * **Paso Clave 1: Atajos de Teclado (Keybindings):**
        * Cursor les preguntará qué atajos de teclado prefieren usar.
        * **Recomendación:** Si ya están familiarizados con VS Code, elijan los atajos de **VS Code** para no tener que aprender nuevos. Si vienen de otro editor (Sublime Text, Emacs, Vim), pueden elegir esos, o simplemente quedarse con los predeterminados de Cursor si no tienen preferencia. ¡La elección es suya!
        * Seleccionen su preferencia y continúen.

    * **Paso Clave 2: Selección del Modelo de AI:**
        * Aquí eligen qué modelo de lenguaje grande (LLM) usarán para las funciones de IA.
        * Cursor ofrece acceso a modelos como los de OpenAI (GPT-4o, GPT-4) y Anthropic (Claude).
        * **Opciones Gratuitas:** Cursor generalmente ofrece acceso a modelos base de forma gratuita (puede variar con el tiempo, pero suelen incluir opciones como GPT-3.5 o modelos equivalentes). Elijan la opción gratuita disponible si no tienen una clave API de pago.
        * **Opciones de Pago (con Clave API):** Si tienen una clave API de OpenAI o Anthropic, pueden configurarla aquí para usar modelos más avanzados como GPT-4o o Claude Opus (estos suelen ser más potentes pero tienen costo por uso). Por ahora, con el modelo gratuito es suficiente para la clase.
        * Seleccionen su modelo y finalicen la configuración inicial.

    *(**Nota para el instructor:** Este es el bloque con mayor probabilidad de tener problemas. Prepárate para ayudar con permisos, firewalls o problemas específicos del sistema operativo. Ten un plan B si alguien simplemente no puede instalarlo a tiempo (ej: pueden seguir viendo tu pantalla o emparejarse con alguien más).)*

## Navegando la Interfaz y Primer Contacto con la IA Básica (15 min)

¡Genial! Ya deberíamos tener Cursor AI funcionando. Ahora, exploremos rápidamente su interfaz y hagamos nuestras primeras interacciones con la IA.

* **Partes Principales de la Interfaz:** (Mostrar en tu pantalla)
    * **Editor Central:** Donde escribes y ves tu código.
    * **Explorador de Archivos (Panel Izquierdo):** Para navegar por las carpetas y archivos de tu proyecto.
    * **Panel de Chat de AI (Panel Derecho o Inferior):** Aquí puedes tener conversaciones más largas y detalladas con la IA sobre tu código o ideas.
    * **Comando en Línea (Inline Command):** Una pequeña ventana que aparece directamente en el editor para interacciones rápidas con la IA (usualmente `Cmd + K` en macOS o `Ctrl + K` en Windows/Linux).

* **Funcionalidades Básicas de Codificación Asistida por AI:**

    * **Autocompletado Inteligente (Similar a Copilot):**
        * Mientras escribes código, Cursor AI te ofrecerá sugerencias para completar líneas o bloques de código enteros.
        * Simplemente presiona `Tab` para aceptar la sugerencia.
        * **Demostración:** Abre un archivo de código simple (ej: un archivo Python `.py` o JavaScript `.js`). Empieza a escribir el comienzo de una función o un bucle y observa cómo Cursor AI sugiere el resto.

    * **Sugerencias Basadas en Comentarios o Contexto:**
        * Puedes escribir un comentario explicando lo que quieres hacer, y Cursor AI intentará generar el código correspondiente debajo.
        * **Demostración:** En tu archivo, escribe un comentario como `# Function to calculate the factorial of a number` (Python) o `// Function to reverse a string` (JavaScript). Espera un momento y ve si Cursor sugiere el código.

    * **Comandos en Línea (`Cmd + K` o `Ctrl + K`):**
        * Esta es una forma muy potente de pedirle a la IA que genere o modifique código directamente donde está tu cursor.
        * Coloca el cursor donde quieres que aparezca el código o selecciona un bloque de código que quieras modificar.
        * Presiona `Cmd + K` (macOS) o `Ctrl + K` (Windows/Linux).
        * Aparecerá una pequeña caja de texto. Describe en lenguaje natural lo que quieres que la IA haga (ej: "escribe una función que sume dos números", "convierte este bucle for a una comprensión de lista", "agrega comentarios a esta función").
        * Presiona Enter. La IA generará una sugerencia que puedes aceptar o rechazar.
        * **Demostración:** Usa `Cmd/Ctrl + K` para pedirle a la IA que escriba una función simple (ej: suma, saludo).

## Preguntas Rápidas sobre Instalación, Configuración o Interfaz (5 min)

¿Alguna pregunta rápida hasta ahora sobre la instalación, la configuración inicial o las partes básicas de la interfaz y las primeras interacciones?

*(Abrir brevemente el micrófono o el chat para preguntas puntuales antes de pasar a temas más complejos).*
