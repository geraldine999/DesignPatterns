
//Interfaz -> define firmas de métodos y campos. Desde Java 8 también se pueden crear métodos
// predeterminados (con la palabra default).
//No puede contener métodos constructores porque no se pueden crear instancias a partir de una interfaz.
//Todos sus atributos y métodos son públicos
//Puede tener métodos estáticos (no hace falta instanciar un objeto para llamarlos),
// pero no se van a heredar a las clases que implementan la interfaz.

//Si una clase quiere implementar una interfaz, debe implementar TODOS sus métodos y deben tener
//exactamente la misma firma.
//No hace falta que implementen los atributos.
//Una clase puede implementar muchas interfaces

//También es posible en Java que una interfaz herede otra interfaz usando, la palabra clave extends.

//Las interfaces nos permiten el POLIMORFISMO -> capacidad que tienen los objetos de comportarse
//de manera diferente al invocarse un mismo método.
//Ej: un perro y un humano caminan de forma diferente pero ambos entienden el mensaje “caminar”.

public interface Payment {

    void doPayment();
}
