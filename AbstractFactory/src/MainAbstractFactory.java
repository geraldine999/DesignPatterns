

public class MainAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory(){

        AbstractFactory abstractFactory = FactoryProvider.getFactory("CARD");
        Card card = (Card) abstractFactory.create("VISA");
        System.out.println(card.getCardNumber());
        System.out.println(card.getCardType());
    }
}