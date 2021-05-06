# Decifrando La Entrevista De Programacion Ejercicio 1.1 Es Unico (Cracking The Coding Interview Exercise 1.1 Is Unique)

## Descripcion
En este ejercicio el usuario necesita implementar un algoritmo para determinar si todos los caracteres en una linea de texto son unitcos. Addicionalmente, el usuario debera de tratar de resolver el problema sin utilizar estructuras de datos addicionales fuera de los vectores (arrays) 


# Solucion
In this case we have to take into account that in some programming languages, strings are immutable. 
This means that in order to display a modified version of the string, a new version of the string must be created. 

In order to solve that problem, some of those languages use either a character array, or a string array. Since the data in the array can be modified, operations on the elements of the array can be made in order to solve string problems. 

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