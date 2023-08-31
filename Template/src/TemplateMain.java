public class TemplateMain {
    public static void main(String[] args) {
        testTemplate();
    }

    private static void testTemplate() {
        DailyRoutine dailyRoutine = new Person1();

        dailyRoutine.dailyRoutine();

        dailyRoutine = new Person2();

        dailyRoutine.dailyRoutine();
    }
}