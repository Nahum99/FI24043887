# Práctica Programada 2 - SC-304  
**Curso:** Estructuras de Datos  
**Profesor:** Luis Andrés Rojas Matey  
**Estudiante:** Nahúm Mejía Castillo  
**Carné:** FI24043887  


##  IDE o Editor Utilizado
Se utilizó **NetBeans 21** como entorno de desarrollo principal, por su compatibilidad con proyectos Java, manejo de paquetes y soporte integrado para Git.  
Adicionalmente, se empleó **Visual Studio Code** para editar archivos complementarios como `README.md` y `.gitignore`, aprovechando la extensión *Markdown Preview* para verificar el formato.



##  Páginas web consultadas
Durante el desarrollo de esta práctica se consulto la siguiente fuente de información para resolver dudas, errores de sintaxis y optimizar el código:

- [https://docs.oracle.com/javase/8/docs/api/](https://docs.oracle.com/javase/8/docs/api/) — Documentación oficial de Java.  



##  Prompts de Chatbots de IA Utilizados

### ChatGPT (OpenAI)
**Consulta:**  
¿Cómo puedo implementar en Java un programa que lea un archivo de texto carácter por carácter utilizando FileReader, almacene su contenido en una pila y luego lo escriba en otro archivo de forma invertida?

**Respuesta:**  
Se explicó cómo leer el contenido del archivo con BufferedReader (envolviendo un FileReader), almacenar cada línea o carácter en una estructura de tipo Stack<String> o Stack<Character>, y luego escribirlos en orden inverso con BufferedWriter o FileWriter.

## Respuestas a preguntas teóricas

### ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesidad de usar una pila?
Sí, existen varias alternativas para invertir el contenido de un archivo sin utilizar una pila explícitamente. Una opción es usar una lista dinámica como ArrayList, almacenando cada línea o carácter y luego recorriéndola en orden inverso para escribir el archivo. También puede hacerse mediante recursión, donde una función lee hasta el final del archivo y luego escribe los datos en orden inverso al retornar.
En conclusión, la pila es una solución clara y didáctica, pero no la única manera de invertir un archivo.

---

### ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?
Un ejemplo cotidiano es una torre de platos en una cocina. El último plato que se coloca encima de la pila es el primero que se retira cuando se necesita uno, siguiendo el principio LIFO (Last In, First Out). Este comportamiento refleja exactamente cómo funcionan las pilas en programación: el último elemento insertado es el primero en salir.

