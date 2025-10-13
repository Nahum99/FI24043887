# Práctica Programada 2 - SC-304  
**Curso:** Estructuras de Datos  
**Profesor:** Luis Andrés Rojas Matey  

---

## 👤 Datos del estudiante
**Estudiante:** Nahúm Mejía Castillo  
**Carné:** FI24043887  

---

## 🧰 IDE o Editor Utilizado
Se utilizó **NetBeans 21** como entorno de desarrollo principal, por su compatibilidad con proyectos Java, manejo de paquetes y soporte integrado para Git.  
Adicionalmente, se empleó **Visual Studio Code** para editar archivos complementarios como `README.md` y `.gitignore`, aprovechando la extensión *Markdown Preview* para verificar el formato.

---

## 🌐 Páginas web consultadas
Durante el desarrollo de esta práctica se consultaron las siguientes fuentes de información para resolver dudas, errores de sintaxis y optimizar el código:

- [https://docs.oracle.com/javase/8/docs/api/](https://docs.oracle.com/javase/8/docs/api/) — Documentación oficial de Java.  
- [https://www.geeksforgeeks.org/](https://www.geeksforgeeks.org/) — Ejemplos y explicaciones sobre pilas, colas y manejo de archivos.  
- [https://stackoverflow.com/](https://stackoverflow.com/) — Búsqueda de soluciones a errores específicos y snippets útiles.  
- [https://www.w3schools.com/java/](https://www.w3schools.com/java/) — Repaso general de sintaxis y estructuras básicas.  

---

## 🤖 Prompts de Chatbots de IA Utilizados

### ChatGPT (OpenAI)
**Consulta:**  
> ¿Cómo puedo invertir el contenido de un archivo de texto en Java utilizando una pila?

**Respuesta resumida:**  
ChatGPT explicó cómo leer el contenido del archivo con `BufferedReader`, almacenar cada línea en una `Stack<String>` y luego escribirlas de forma inversa con `BufferedWriter`.  
También recomendó el uso del bloque `try-with-resources` para el manejo automático de archivos y evitar fugas de recursos.

**Enlace al chat:**  
[https://chat.openai.com](https://chat.openai.com)

---

## 💬 Respuestas a preguntas teóricas

### 1️⃣ ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesidad de usar una pila?
Sí, existen varias formas de lograrlo sin usar una pila explícitamente:

- **Usando listas dinámicas (ArrayList):** se puede almacenar cada línea en una lista y luego recorrerla en orden inverso para escribir el archivo.  
- **Mediante recursión:** una función recursiva puede leer línea por línea hasta el final del archivo y luego escribir desde la última hasta la primera.  
- **Utilizando Streams de Java (API moderna):** con `Files.lines()` y `Collections.reverse()` se puede invertir el orden de las líneas de manera funcional y limpia.

En conclusión, la pila es una solución clara y didáctica, pero no la única manera de invertir un archivo.

---

### 2️⃣ ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?
Un ejemplo cotidiano es una **torre de platos** en una cocina:  
el último plato que se coloca en la pila es el primero que se retira para usar (*Last In, First Out — LIFO*).  
Este mismo principio se aplica en estructuras de datos tipo pila dentro de la programación.

---

## 📄 Licencia
Este documento forma parte de la **Práctica Programada 2** del curso *Estructuras de Datos (SC-304)*, con fines exclusivamente académicos.  

---

© 2025 Nahúm Mejía Castillo — Universidad (indicar nombre de la institución)
