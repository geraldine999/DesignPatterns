public class UpperCaseStrategy implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}
