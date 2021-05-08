# Decifrando La Entrevista De Programacion Ejercicio 1.1 Es Unico (Cracking The Coding Interview Exercise 1.1 Is Unique)

## Descripcion
En este ejercicio el usuario necesita implementar un algoritmo para determinar si todos los caracteres en una linea de texto son unitcos. Addicionalmente, el usuario debera de tratar de resolver el problema sin utilizar estructuras de datos addicionales fuera de los vectores (arrays). 


# Solucion
En este caso tendremos que tener en cuenta que en algunos lenguages de programacion, las lineas de texto (strings) son immutables. (no se pueden modificar). 
Esto significa que para poder desplegar texto que ha sido modificado, una nueva version del texto debe de ser creado. 

Para poder resolver el problema, algunos lenguages de programacion utilizan un vector de caracteres (character array), o un vector de texto (string array). Debido a que los datos en un vector (array) pueden ser modificados, operaciones en los elementos del vector pueden ser ejecutadas para resolver el ejercicio modificando el texto. 

---

We will have a string that will be analized. 
We have to see if a character appears more than once on the string. 

The easiest case, is if there are more characters than what are allowed on the 
character set. By the pigeon hole principle, if there are more characters, 
than there are individual characters allowed on a given character set, 
then by the pigeon hole principle we know that there exists at least one character 
that is repeated at least once. 

We now need to know what will be the character system that will be used. There are two 
common options, Ascii and Unicode.

--
We will assume for the sake of argument that the character set encoding used is the extended ascii.
This means that there will be a maximum number of allowable characters of 256 characters. 

--
If the string is larger than 256 we know by the pigeon whole principle that not all of the characters on the string are unique. 