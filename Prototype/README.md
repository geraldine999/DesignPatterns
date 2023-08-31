# Prototype
## Patrón creacional
### Por qué?
#### Tiene el objetivo de clonar objetos a partir de un objeto modelo (prototipo)
#### cuando el costo de crear objetos es muy grande (en término de recursos),
#### porque posee muchos atributos.

#### El cliente no necesita conocer la clase del tipo de objeto ni ningún detalle sobre
#### cómo crearlo

#### Nos evita repetir la instanciación con parámetros repetidos.

### Elementos:
#### Interfaz Prototype del producto -> extiende de la clase Cloneable, que nos permite
#### utilizar el método clone()
#### Productos-> clases que implementan la interfaz prototype.
#### Producto Factory -> crea los objetos prototipos y carga sus variables,
#### y devuelve clones de esos objetos.
