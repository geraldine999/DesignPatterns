# Observer
## Patrón de comportamiento

#### Monitorea el estado de un objeto en nuestro programa.
#### Se utiliza cuando tenemos que detectar eventos en tiempo de ejecución y 
#### notificar a ciertos objetos cuándo ha cambiado el estado de un objeto.

#### Muy utilizado en la programación reactiva -> paradigma de programación
#### basado en "observbles" que son flujos de datos que se propagan generando
#### cambios en la aplicación, es decir, la aplicación "reacciona" a ciertos
#### flujos de datos.
#### Se basa en llamadas asíncronas (el cliente recibe una respuesta
#### antes de que el proceso se termine de ejecutar por completo) no bloqueantes
#### (el programa puede seguir respondiendo a otros eventos mientras esa
#### tarea se ejecuta) siempre que sea posible.

### Elementos:
#### Objeto observado
#### Interfaz observador
#### Objetos que observan
#### Interfaz Subject (tema o tópico de suscripción)
#### Message Publisher que implementa la interfaz subject. Tiene una lista de 
#### observers y se encarga de notificarle a cada uno cuando el objeto observado
#### cambia de estado




