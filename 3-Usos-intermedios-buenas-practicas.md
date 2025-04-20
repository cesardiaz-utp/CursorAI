# Hora 3: Usos Intermedios, Buenas Prácticas y Cierre

## Análisis de Código con Contexto (Multi-archivo) (25 min)

En esta sección, veremos cómo Cursor AI entiende y trabaja con proyectos que tienen múltiples archivos, algo esencial para proyectos más grandes y realistas.

* **Cursor AI entiende el proyecto:** No solo ve el archivo actual, sino también el contexto de todo tu proyecto. Esto le permite hacer sugerencias más relevantes y entender relaciones entre archivos.

* **El poder de "@" (Arroba):**
    * En el chat de AI y en los comandos en línea, pueden usar el símbolo "@" para referenciar otros archivos, símbolos (clases, funciones, variables) o incluso el codebase completo.
    * Ejemplos:
        * `@nombre_del_archivo.py`: Se refiere a un archivo específico.
        * `@nombre_de_la_funcion`:  Se refiere a una función específica.
        * `@codebase`: Se refiere a todo el proyecto.
    * Esto es *muy* útil para pedir a la IA que haga cambios que involucren varios archivos.

* **Ejemplos de uso de "@":**
    * "Add a unit test for the function `@calculate_primes_inefficient` in `@example.py`" (Añade un test unitario para la función `@calculate_primes_inefficient` en `@example.py`)
    * "Refactor the error handling throughout the `@codebase` to use a consistent logging approach." (Refactoriza el manejo de errores en todo el `@codebase` para usar un enfoque de logging consistente).
    * "What are all the places where the `@divideNumbers` function is used?" (¿En qué lugares se usa la función `@divideNumbers`?)

* **Demostración Sencilla:**
    * Abrir el proyecto de ejemplo de la Hora 2.
    * Pedir a la IA, usando `@`, que cree una nueva función en un nuevo archivo que use una función del archivo original.
    * Por ejemplo, pedirle que cree un archivo llamado `primes_utils.py` y que mueva la función `calculate_primes_inefficient` allí, modificando `example.py` para importarla y usarla.

* **Mención breve de "Agent" (Opcional, si hay tiempo):** Para tareas más complejas que involucran muchos cambios en el proyecto, Cursor AI tiene "Agents". Son flujos de trabajo automatizados controlados por la IA. Se pueden mencionar, pero su uso a fondo está más allá del nivel intermedio.

## Optimizando la Interacción: Prompts y Reglas Básicas (20 min)

Para sacarle el máximo provecho a Cursor AI, aprender a comunicarnos efectivamente con la IA es crucial.

* **Escribiendo Buenos Prompts:**
    * **Sé claro y específico:** En lugar de "make this better", di "refactor this function to be more readable and efficient, using modern Python syntax" (refactoriza esta función para que sea más legible y eficiente, usando sintaxis moderna de Python).
    * **Da contexto:** Si estás en el chat, la IA ya tiene cierto contexto. Pero si usas `Cmd+K`, intenta darle contexto, especialmente si quieres que genere código que se integre bien con el resto del proyecto.
    * **Divide tareas complejas:** Si pides algo muy grande, la IA puede perderse. Es mejor dividirlo en pasos más pequeños.

* **`cursor.rules` (Introducción Conceptual):**
    * `cursor.rules` son archivos de configuración (generalmente en la raíz del proyecto) que te permiten dar *instrucciones específicas* a la IA sobre cómo quieres que formatee el código, qué librerías usar, convenciones del proyecto, etc.
    * Son un tema avanzado, pero es bueno saber que existen.
    * **Ejemplo muy simple (si el tiempo lo permite):** Mostrar un archivo `cursor.rules` que define un estilo de indentación preferido (2 o 4 espacios, por ejemplo).

* **Revisión y Entendimiento del Código Generado:**
    * *Nunca* confíes ciegamente en el código de la IA. Es una herramienta, no un reemplazo para tu cerebro.
    * Lee, entiende y prueba el código que genera. Puede ser bueno, pero también puede tener errores sutiles o no ajustarse *exactamente* a tus necesidades.
    * A veces, es más rápido escribir el código tú mismo que pasar mucho tiempo depurando el código generado por la IA.

## Recursos Adicionales y Comunidad (10 min)

Cursor AI es una herramienta que evoluciona rápidamente. Para mantenerse al día:

* **Documentación Oficial:** La fuente principal de información sobre Cursor AI.  Incluye guías, tutoriales y referencia de la API.
* **Comunidades y Foros:** Hay comunidades online (Reddit, Discord, etc.) donde puedes hacer preguntas, compartir consejos y ver cómo otros usan Cursor AI.
* **Blog y Anuncios:** Sigue el blog oficial o las cuentas de redes sociales de Cursor AI para enterarte de nuevas funciones, mejoras y mejores prácticas.

## Cierre y Preguntas Finales (5 min)

¡Llegamos al final de esta clase! Espero que ahora se sientan mucho más cómodos usando Cursor AI.  ¿Tienen alguna pregunta final antes de terminar?