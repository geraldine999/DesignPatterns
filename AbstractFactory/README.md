# Abstract Factory 
## Patrón creacional
### Por qué?
#### Súper fábrica o fábrica de fábricas. Primero hay que indicar qué fábrica va a producir
#### el objeto y después indicar el tipo de objeto.

#### Se utiliza cuando el código debe funcionar con varias familias
#### de objetos relacionados, pero no deseamos que dependa de las clases concretas
#### de esos objetos, ya que puede ser que no los conozcamos de antemano
#### o que queramos permitir una futura extensibilidad.


Le ocultamos a los clientes las clases de implementación. Los clientes pueden manipular los objetos a 
través de las interfaces.
Nos facilita el intercambio de familia de objetos.
Es perfecto para cuando el sistema debe ser independiente de cómo se compone
y se representan los objetos.

### Elementos:
#### Abstract Factory-> interfaz genérica, el genérico hace referencia al tipo/familia de producto
#### Fábricas concretas -> clases, implementaciones de la Abstract Factory
#### Productos abstractos -> interfaz, familia de productos
#### Productos concretos -> clases, implementaciones de los productos abstractos
#### Factory Provider-> tiene un método static que devuelve la Fábrica correcta
