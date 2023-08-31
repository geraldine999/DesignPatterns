public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Débito";
    }
}
