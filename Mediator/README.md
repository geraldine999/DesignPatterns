# Mediator
## Patrón de comportamiento

#### Permite reducir las dependencias caóticas entre objetos. El patrón restringe las
#### comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a 
#### través de un objeto mediador. Simplifica la comunicación de muchos a muchos.

#### Se aplica en situaciones donde se necesita centralizar y controlar la comunicación
#### y la coordinación entre varios componentes de un sistema, evitando las conexiones 
#### directas entre ellos y promoviendo un acoplamiento más débil.

####  Principio de responsabilidad única. Puedes extraer las comunicaciones entre 
#### varios componentes dentro de un único sitio, haciéndolo más fácil de comprender
#### y mantener.

#### Principio de abierto/cerrado. Puedes introducir nuevos mediadores sin tener que 
#### cambiar los propios componentes.

#### Reduce el acoplamiento.

### Elementos:
#### Interfaz mediator -> tiene el método mediador
#### Mediator concreto -> conoce todos los objetos colleages
#### Clase abstracta colleage
#### Clases concretas colleages-> tienen un mediator al que llaman para
#### que ejecute el método mediator



