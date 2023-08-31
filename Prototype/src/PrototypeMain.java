public class PrototypeMain {
    public static void main(String[] args) {
        testPrototype();
    }

    private static void testPrototype(){

        PizzaFactory.loadPizzas();
        try{
            PrototypePizza pizza = PizzaFactory.getInstance("Neapolitan");
            pizza.getPizza();

            PrototypePizza pizza1 = PizzaFactory.getInstance("Margherita");
            pizza1.getPizza();

        }catch (CloneNotSupportedException exception){
            System.out.println("An error has occurred");
        }


    }
}