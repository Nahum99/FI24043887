Práctica Programada 1 - SC-304  
Curso: Estructuras de Datos  
Profesor: Luis Andrés Rojas Matey  
Estudiante: Nahúm Mejía Castillo
Carné: FI24043887

##  Referencia utilizada
- [Documentación oficial de Java SE 21](https://docs.oracle.com/en/java/javase/21/)  


##  Prompts de IA utilizados
Durante el desarrollo de esta práctica se consultó con herramientas de IA:  
- ChatGPT: consultas sobre cómo estructurar el repositorio, cómo eliminar el "package", y cómo crear la carpeta "PP1" en GitHub.  
  - Prompt:  
    ¿Cómo organizar en GitHub el archivo Inverso.java con un README nuevo en una carpeta?


##  Preguntas y Respuestas

**1. ¿Es posible implementar una solución equivalente pero de comportamiento iterativo?**  
Sí. Se puede lograr con un ciclo "while" o "for" , extrayendo el último dígito en cada iteración con "%" y reconstruyendo el número inverso multiplicando por 10 y sumando el dígito.

**2. ¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?**  
Sí. Se puede variar la lógica de la recursión pasando el número parcial invertido como parámetro, o bien descomponer el número en una cadena y hacer la recursión sobre los caracteres.

**3. ¿Qué relación observa entre el algoritmo para invertir un número natural (calculando cocientes y residuos) con las estrategias para pasar de una base numérica a otra?**  
Ambos algoritmos utilizan "división sucesiva y residuos". Para invertir un número en base 10 se descompone en cocientes y residuos; al cambiar de base, también se emplea la división entre la nueva base y se almacenan los residuos para reconstruir el número en esa representación.

----------
