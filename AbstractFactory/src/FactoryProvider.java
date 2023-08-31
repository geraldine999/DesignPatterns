public class FactoryProvider {

    public static AbstractFactory getFactory(String chooseFactory){
        if("CARD".equals(chooseFactory)){
            return new CardFactory();
        }else if ("PAYMENT METHOD".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
