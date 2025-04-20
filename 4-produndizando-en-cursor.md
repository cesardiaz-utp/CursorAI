# Hora 4: Profundizando en Cursor AI - Agentes, Reglas y Flujos de Trabajo Avanzados

## Automatizando Tareas Complejas con Agentes y Acciones Multi-archivo (20 min)

Hemos utilizado el chat y los comandos en línea para interacciones directas con el código. Sin embargo, las tareas de desarrollo a menudo requieren múltiples pasos coordinados a través de varios archivos. Aquí es donde entran los Agentes y las acciones multi-archivo más complejas.

* **Recordando el Contexto Multi-archivo:**
    * Ya saben que Cursor AI entiende el contexto de su proyecto y pueden usar `@archivo` o `@símbolo` para referenciar elementos específicos.
    * Esto es fundamental para pedirle a la IA que realice acciones que afecten a más de un archivo a la vez.

* **Limitaciones de Interacciones Simples:**
    * Pedir en un solo prompt "Implementa una funcionalidad X compleja" es difícil para el chat simple porque no puede ejecutar múltiples pasos, analizar el resultado intermedio y corregir errores sobre la marcha.

* **Introducción al Concepto de Agentes en Cursor AI:**
    * Los Agentes son una característica diseñada para manejar **tareas de mayor alcance** que requieren una secuencia de acciones por parte de la IA.
    * Piensen en ellos como flujos de trabajo autónomos guiados por la IA hacia un **objetivo general**.
    * Pueden:
        * Analizar el **proyecto completo (`@codebase`)**.
        * Planificar y ejecutar una serie de pasos (ej: crear nuevos archivos, modificar existentes, buscar información, ejecutar comandos de terminal).
        * Iterar y corregir errores durante el proceso para alcanzar el objetivo final.
    * Se acceden a ellos a través de interfaces específicas o comandos dedicados dentro de Cursor AI (la interfaz exacta puede variar con las actualizaciones).

* **Ejemplo de Tarea para un Agente:**
    * Imagina que quieres añadir una nueva característica a tu aplicación web que requiere cambios en el frontend y el backend. Un Agente podría ayudarte con partes de esta tarea.
    * **Ejemplo de Prompt para un Agente (Conceptual):** "Implement a simple user authentication flow. Create registration and login endpoints in the backend (`@backend_folder`) and add corresponding forms and basic logic in the frontend (`@frontend_folder`)." (Implementa un flujo simple de autenticación de usuario. Crea endpoints de registro e inicio de sesión en el backend (`@backend_folder`) y añade formularios correspondientes y lógica básica en el frontend (`@frontend_folder`).)

* **Demostración de Alto Nivel / Conceptual sobre Agentes:**
    * **(Instructor):** Explica los pasos que un Agente *podría* seguir al recibir un prompt complejo como el ejemplo anterior.
        * Identificar los archivos y carpetas relevantes (usando `@`).
        * Generar el código para los endpoints del backend en los archivos correctos.
        * Generar el código para los formularios y la lógica básica en los archivos del frontend.
        * Identificar la necesidad de dependencias o configuraciones y sugerir o ejecutar los comandos necesarios (ej: `pip install`, `npm install`).
        * Presentar los cambios para revisión.
    * *(Si tienes un video corto o una simulación interactiva proporcionada por Cursor, este es el momento de usarla. Si no, sé muy claro en que es una explicación del *concepto* y *capacidad* del Agente).*

* **Práctica de Acciones Multi-archivo controladas con Chat/Comando:**
    * Retomando el ejercicio de la Hora 3 (mover una función/método). Ahora que la función está en un archivo separado, pídale a la IA que haga algo más complejo que la simple importación.
    * **Ejemplo con `@` (en el Chat):** "In `@example.py`, write a loop that calls the `calculate_primes_inefficient` function from `@utils.py` for numbers 1 to 5 and print the results." (En `@example.py`, escribe un bucle que llame a la función `calculate_primes_inefficient` desde `@utils.py` para los números del 1 al 5 e imprima los resultados.)
    * Observen cómo la IA maneja la referencia a ambos archivos y genera el código correcto que los conecta.
## Personalizando la Experiencia AI con `.cursorrules` a Fondo (20 min)

Controlar el comportamiento de la IA para que se ajuste a las necesidades de tu proyecto es fundamental. Los archivos `.cursorrules` son la herramienta principal para esto.

* **El Archivo `.cursorrules`:**
    * Es un archivo de texto simple (usualmente en formato Markdown) que colocas en la **raíz de tu proyecto**.
    * Contiene **directivas** e **información contextual** para guiar a Cursor AI.
    * Cuando Cursor AI trabaja en ese proyecto, **leerá y aplicará estas reglas**.

* **Tipos de Información en `.cursorrules`:**
    * **Guías de Estilo:** Especificar preferencias de formato, nombrado, comentarios, etc.
    * **Contexto del Proyecto:** Describir la arquitectura, frameworks, librerías clave (especialmente las internas o menos conocidas).
    * **Directivas de Comportamiento:** Indicar a la IA cómo manejar ciertos escenarios (ej: "al refactorizar, prioriza la inmutabilidad", "cuando generes código de UI, usa estos componentes específicos").

* **Estructura y Sintaxis (Mostrar ejemplos en un archivo `.cursorrules`):**
    * Las reglas suelen escribirse como encabezados y listas en Markdown.
    * Cursor AI parsea este Markdown para entender tus instrucciones.
    * **(Instructor):** Crea un archivo `.cursorrules` en vivo (o ábrelo si ya lo tienes preparado) y muestra ejemplos de las reglas más útiles:
        * **Ejemplo 1: Estilo de Código (Python/Java):**
            ```markdown
            # Style Guide
            Adhere to PEP 8 standards.
            Use 4 spaces for indentation.
            Ensure all public functions have docstrings.
            ```
            ```markdown
            # Style Guide (Java)
            Follow Google Java Style Guide.
            Use K&R brace style.
            Write Javadoc for all public methods and classes.
            ```
        * **Ejemplo 2: Contexto del Proyecto (Conceptual):**
            ```markdown
            # Project Context
            This is a backend service using Flask with SQLAlchemy ORM.
            Database models are defined in `models.py`.
            All API routes are in files within the `routes/` directory.
            ```
        * **Ejemplo 3: Directiva de Comportamiento:**
            ```markdown
            # AI Behavior Directives
            When adding new features, create a separate file for each major component.
            Prioritize using utility functions already present in `utils.py`.
            ```
* **Mini-Ejercicio/Demostración `.cursorrules`:**
    * **(Instructor):** Agrega una regla simple y verificable al `.cursorrules` del proyecto de ejemplo (ej: "all comments should start with `// TODO: [Task]`" o "use single quotes for strings in Python").
    * Pídele a la IA que genere una función simple o modifique una existente usando un comando en línea o el chat.
    * Observa si la IA intenta seguir la nueva regla. (Puede que no siempre lo haga perfectamente, lo cual es una buena oportunidad para hablar de la necesidad de revisión).

## IA para Calidad: Tests y Documentación Asistida (15 min)

Más allá de escribir código, Cursor AI puede ser un gran aliado para mejorar la calidad y mantenibilidad de tu proyecto.

* **Generación de Tests Unitarios:**
    * La IA puede ayudarte a crear el esqueleto o incluso tests completos para tu código.
    * **Demostración:**
        * Abre un archivo con una función (ej: `divide_numbers` o `calculate_primes_inefficient`).
        * Selecciona la función.
        * Usa el chat o `Cmd+K` para pedirle a la IA: "Write unit tests for this function using the `unittest` framework in Python." (Escribe tests unitarios para esta función usando el framework `unittest` en Python.) o "Generate JUnit tests for this Java method." (Genera tests JUnit para este método Java.)
        * Mostrar cómo la IA puede generar el código de prueba en un nuevo archivo o en el chat. Habla sobre la importancia de *revisar* y *ejecutar* estos tests.
* **Generación y Mejora de Documentación (Docstrings / Javadoc):**
    * Mantener la documentación actualizada es vital. La IA puede ayudarte a iniciar o mejorarla.
    * **Demostración:**
        * Abre un archivo con una función o clase que no tenga documentación.
        * Selecciona la función/clase.
        * Usa el chat o `Cmd+K`: "Generate a docstring for this Python function." (Genera un docstring para esta función Python.) o "Add Javadoc to this Java method." (Añade Javadoc a este método Java.)
        * Mostrar cómo la IA genera el bloque de documentación. Enfatiza que el usuario debe *validar* y *completar* los detalles.

## (21:55 - 22:00) Consejos Avanzados, Próximos Pasos y Cierre Final (5 min)

Para terminar, algunos consejos para seguir mejorando con Cursor AI y recursos para continuar aprendiendo.

* **Explora Modelos de AI:** Si tienes acceso a diferentes modelos (GPT-4o, Claude, etc.), experimenta con ellos. Cada uno puede tener fortalezas distintas para diferentes tipos de tareas o lenguajes. Puedes cambiar el modelo en la configuración.
* **Configuraciones Avanzadas:** Dedica tiempo a explorar las `Settings` de Cursor AI. Hay muchas opciones para personalizar atajos, comportamiento de la IA, integraciones, etc.
* **Modo de Privacidad:** Si trabajas con código propietario o sensible, asegúrate de entender y usar el modo de privacidad de Cursor AI para evitar que tu código se use para entrenar modelos públicos.
* **Sigue Aprendiendo:**
    * La **documentación oficial de Cursor AI** es tu mejor amigo para detalles avanzados sobre Agentes, `.cursorrules` y nuevas funcionalidades.
    * Únete a la **comunidad de Cursor AI** (Discord, foros) para hacer preguntas y compartir experiencias.
    * Mantente al tanto de las **actualizaciones** de la herramienta, ya que evoluciona constantemente.

* **Reflexión Final:** Cursor AI es una herramienta poderosa. No es un reemplazo, sino un copiloto. Úsalo para **acelerar tareas tediosas**, **obtener nuevas ideas**, **entender código desconocido** y **mejorar la calidad**, pero siempre **revisa y entiende** lo que genera.
