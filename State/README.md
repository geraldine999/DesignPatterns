# State
## Patrón de comportamiento
#### Un objeto modifica su comportamiento cada vez que cambia su estado interno

#### - Nos permite agregar nuevos estados-comportamientos sin que afecte a otros
#### componentes
#### - Nos ayuda a reducir el uso de la sentencia if-else


### Elementos:
#### Interfaz estado con uno o varios métodos
#### Estados concretos, que implementarán los métodos según corresponda al estado
#### Objeto contexto, que va a tener un atributo interfaz estado y su método setter
#### correspondiente
