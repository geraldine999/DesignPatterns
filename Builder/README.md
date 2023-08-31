# Builder
## Patrón creacional
### Por qué?
#### Lo usamos cuando necesitamos objetos complejos, con muchos atributos, creándolos paso a paso.
#### Produce distintos tipos y representaciones de un objeto empleando el mismo código
#### de construcción.

#### Ventaja: el código de construcción va a ser independiente del de representación, bajo acoplamiento.
#### Ventaja: total control del proceso de creación de un objeto.

### Elementos:
#### Producto-> clase con sus atributos privados y finals
#### Producto Builder-> clase con los mismos atributos que el Producto,
#### posee un método build() que devuelve un Producto,
#### y varios métodos del mismo nombre de los atributos del producto para setear sus valores.
