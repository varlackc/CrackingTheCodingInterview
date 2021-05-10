# Decifrando La Entrevista De Programacion Ejercicio 1.1 Es Unico (Cracking The Coding Interview Exercise 1.1 Is Unique)

## Descripcion
En este ejercicio el usuario necesita implementar un algoritmo para determinar si todos los caracteres en una linea de texto son unitcos. Addicionalmente, el usuario debera de tratar de resolver el problema sin utilizar estructuras de datos addicionales fuera de los vectores (arrays). 


# Solucion
En este caso tendremos que tener en cuenta que en algunos lenguages de programacion, las lineas de texto (strings) son immutables. (no se pueden modificar). 
Esto significa que para poder desplegar texto que ha sido modificado, una nueva version del texto debe de ser creado. 

Para poder resolver el problema, algunos lenguages de programacion utilizan un vector de caracteres (character array), o un vector de texto (string array). Debido a que los datos en un vector (array) pueden ser modificados, operaciones en los elementos del vector pueden ser ejecutadas para resolver el ejercicio modificando el texto. 

Nosotros tendremos una linea de texto (string) que sera analizada. 
Tendremos que ver si algunos de los caracteres aparecen mas de una vez en el texto. 

El caso mas simple, es si hay mas characteres en el texto que caracteres disponibles en el conjuto de caracteres (character set). Debido al principio de los agujeros de paloma (pigeon hole principle), si hay mas caracteres en un texto que tipos de caracteres individuales permitidos en un conjunto de caracteres (character set), debido al principio de agujeros de paloma (pigeon hole principle) sabemos que existe al menos un character que se repetira al menos una vez. 

Ahora nosotros necesitaremos saber cual sera el sistema de caracteres que se utilizara. Existen does opciones comunes, Ascii y Unicode. 

Vamos a asumir por razones del argumento que el conjuto de caracteres codificados a utilizar seara ascii extendido. 
Esto significa que el maximo numero de caracteres disponibles seran 256 caracteres. 

Si el texto tiene mas de 256 caracteres entonces sabremos por el principio de agujeros de paloma que no todos los caracteres en el texto son unicos. 
