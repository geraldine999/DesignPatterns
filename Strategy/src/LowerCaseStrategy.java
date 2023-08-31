public class LowerCaseStrategy implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println(text.toLowerCase());
    }
}
