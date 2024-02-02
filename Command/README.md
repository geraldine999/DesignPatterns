# Command
## Patrón de comportamiento

#### Encapsula una acción o solicitud en un objeto (comando). Sirve para 
#### lograr una separación más clara (desacoplamiento) y flexible
#### (extensibilidad) entre los objetos que emiten
#### solicitudes (invocadores) y los objetos que las ejecutan (receptores).

#### Se utiliza cuando hay que poner operaciones en cola, programar su ejecución, 
#### ejecutarlas de forma remota, deshacer o repetir operaciones, mantener un historial
#### o registro de operaciones.


### Elementos:
#### Interfaz command -> tiene un método ejecutar
#### Objetos comandos -> implementan la interfaz command, tienen un objeto receptor
#### como atributo
#### Objeto receptor -> ejecuta los comandos
#### Objeto Emisor -> tiene un objeto interfaz comando 


