// abstract: no puede ser instanciada, puede heredar a otra clase y así poder instanciar un objeto
// no se tiene intención de crear objetos, sino que únicamente sirve para
// unificar datos u operaciones de subclases
public abstract class Colleague {

    //protected: accesible al package (carpeta) y a las subclases
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    // métodos abstractos-> no tienen cuerpo, deberán ser sobreescritos en las
    //subclases. Solo pueden existir dentro de una clase abstracta
    public abstract void send(String message);
    public abstract void receive (String message);
}
