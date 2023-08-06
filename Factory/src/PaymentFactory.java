public class PaymentFactory {

    public static Payment buildPayment(PaymentType type){
        return switch (type) {
            case CARD -> new CardPayment();
            case GOOGLE_PAY -> new GooglePayment();
            default -> new CardPayment();
        };
    }
}
