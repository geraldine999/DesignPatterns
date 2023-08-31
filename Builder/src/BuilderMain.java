public class BuilderMain {
    public static void main(String[] args) {
        testBuilder();
    }

    private static void testBuilder(){
        Sandwich sandwich = new Sandwich.SandwichBuilder("white")
                .build();

        System.out.println(sandwich.toString());

        Sandwich sandwich1 = new Sandwich.SandwichBuilder("whole wheat")
                .ham(true)
                .cheese(true)
                .mayonnaise(true)
                .tomato(true)
                .pepperoni(false)
                .build();

        System.out.println(sandwich1);
    }
}