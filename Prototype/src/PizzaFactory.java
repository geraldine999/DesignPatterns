import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {

    public static class PizzaTypes{
        public static final String NEAPOLITAN = "Neapolitan";
        public static final String MARGHERITA = "Margherita";
    }

    private static Map<String, PrototypePizza> prototypes = new HashMap<>();

    public static void loadPizzas(){

        Neapolitan neapolitan = new Neapolitan();
        neapolitan.setBasil(false);
        neapolitan.setMozzarella(true);
        neapolitan.setOlives(false);
        neapolitan.setTomatoSauce(true);

        prototypes.put(PizzaTypes.NEAPOLITAN,neapolitan );

        Margherita margherita = new Margherita();

        margherita.setBasil(true);
        margherita.setMozzarella(true);
        margherita.setOlives(true);
        margherita.setTomatoSauce(true);

        prototypes.put(PizzaTypes.MARGHERITA, margherita );
    }

    public static PrototypePizza getInstance(final String type) throws CloneNotSupportedException{

        return prototypes.get(type).clone();
    }
}
