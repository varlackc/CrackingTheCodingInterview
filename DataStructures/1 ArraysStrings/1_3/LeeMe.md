#  Decifrando La Entrevista Tecnica `Ejercicio 1.3 URLificar`

**`URLify:`** Escribe un metodo para reemmplazar los espacios en en una linea de texto con '%20: puedes asumir que la linea de texto
tiene suficiente espacio al final para recivir los caracteres adicionales, y que has recivido el tamaño "verdadero" de la linea de texto. (Nota: Si implementa el programa en Java, porfavor utilize el vector de caracteres para poder procesar la linea de texto.)

EJEMPLO

**`Entrada:`** "Mr John Smith ", 13
**`Salida:`** "Mr%20John%20Smith"

---

## `Descripcion`
En este problema queremos crear un programa que pueda tomar una linea de texto como valor de entrada, 
y retornar un valor compatible con las reglas de URL como valor de salida. Uno de los detalles mas importantes a tomar encuenta, es el hecho de que los links de URL no puede tener espacios en blanco entre characteres. 

Para poder resolver el problema, el espacio debe de ser substituido por la combinacion de caracteres %20.

---

## `Solucion`
