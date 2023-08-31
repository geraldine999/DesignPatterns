public class StrategyMain {
    public static void main(String[] args) {
        testStrategy();
    }

    private static void testStrategy() {

        Context context = new Context(new UpperCaseStrategy());

        context.publishText("this text will be transformed according to the chosen algorithm");
    }
}