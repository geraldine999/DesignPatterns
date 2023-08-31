//el método clone() puede hacer una copia de las instancias de dicha clase con todos sus atributos
public interface PrototypePizza extends Cloneable{

    void getPizza();

    PrototypePizza clone() throws CloneNotSupportedException;
}
