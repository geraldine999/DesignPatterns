public class StateMain {
    public static void main(String[] args) {
        testState();
    }

    private static void testState(){
        MobileAlertStateContext context = new MobileAlertStateContext();

        context.alert();

        context.setCurrentState(new Vibration());

        context.alert();

        context.setCurrentState(new Silent());

        context.alert();

    }
}