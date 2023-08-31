# Singleton
## Patrón creacional
### Por qué?
#### Nos garantiza de que solo haya una instancia de una clase y proporciona un 
#### punto de acceso global y controlado a la misma, así puede ser accedida desde 
#### cualquier parte de la aplicación.

#### Ej: útil en conexiones a servicios externos y bases de datos.

### Elementos:
#### Clase con un atributo de su misma clase (que va a ser la única instancia),
#### un constructor privado, y un método para obtener la instancia público,
#### sincronizado y estático, que se fija si ya se creó la instancia. Si ya se creó, 
#### devuelve ese única instancia. Si no se creó (== null) crea la instancia.

#### Desventaja: hoy en día se utiliza la inyección de dependencias en vez del singleton,
#### porque se considera un antipatrón. Esto es así
#### porque al guardar la misma referencia no se le puede ir cambiando la configuración
#### al testearlo
