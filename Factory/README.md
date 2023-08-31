# Factory Method
## Patrón creacional
### Por qué? 
#### Se utiliza cuando necesitamos crear una instancia de un objeto que a priori no sabemos qué tipo va a ser. 
#### Definimos una interfaz de creación de un tipo de objeto y permite a las clases del mismo decidir qué tipo de instancia concreta necesita.

### Elementos:
#### Factory-> clase que tiene un método estático que devuelve un tipo de objeto, que será de una clase
#### u otra, dependiendo de lo que se le pida
#### Producto abstracto -> interfaz, familia de productos
#### Productos concretos -> clases, implementaciones del producto abstracto
