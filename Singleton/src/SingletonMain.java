public class SingletonMain {
    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton(){

        Printer printer = Printer.getInstance();

        System.out.println(printer);

        Printer printer1 = Printer.getInstance();

        System.out.println(printer1);
    }
}