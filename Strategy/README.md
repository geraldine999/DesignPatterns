# Strategy
## Patrón de comportamiento
#### Nos permite elegir una implementación específica de un algoritmo en 
#### tiempo de ejecución. Encapsula los algoritmos en clases.

#### - Podemos agregar nuevos algoritmos sin cambiar la estructura de la aplicación.

### Elementos:
#### Interfaz strategy
#### Estrategias concretas
#### Objeto Context que tiene referencia a la interfaz strategy. Según el contexto,
#### optará por una estrategia u otra
