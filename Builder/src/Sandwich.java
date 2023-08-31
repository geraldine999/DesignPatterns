

public class Sandwich {

    private final boolean cheese;
    private final boolean ham;
    private final boolean tomato;
    private final boolean mayonnaise;
    private final boolean pepperoni;
    private final String bread;

    private Sandwich(SandwichBuilder builder){
        this.bread = builder.bread;
        this.cheese= builder.cheese;
        this.ham = builder.ham;
        this.tomato = builder.tomato;
        this.pepperoni = builder.pepperoni;
        this.mayonnaise = builder.mayonnaise;
    }

    //tostring() devuelve una representación en cadena de texto (código hash) del objeto. Es muy útil cuando
    //se quiere devolver un resumen del estado interno del objeto
    @Override
    //@Override se utiliza para sobreescribir un método de la clase padre (Object en este caso)
    public String toString() {
        return "Sandwich{" +
                "cheese=" + cheese +
                ", ham=" + ham +
                ", tomato=" + tomato +
                ", mayonnaise=" + mayonnaise +
                ", pepperoni=" + pepperoni +
                ", bread='" + bread + '\'' +
                '}';
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isHam() {
        return ham;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public String getBread() {
        return bread;
    }

    // clase interna, con la palabra "static" indicamos que puede crearse una instancia de la misma
    //sin crearse anteriormente una instancia de la clase exterior (Sandwich, en este caso). Osea que
    // es una clase
    //interna anidada, si no tuviese la palabra "static" sería interna pero no anidada.
    public static class SandwichBuilder{
        private boolean cheese;
        private boolean ham;
        private boolean tomato;
        private boolean mayonnaise;
        private boolean pepperoni;
        private String bread;

        //bread es el único atributo obligatorio
        public SandwichBuilder(String bread){
            this.bread = bread;
        }

        public SandwichBuilder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }

        public SandwichBuilder tomato(boolean tomato){
            this.tomato = tomato;
            return this;
        }

        public SandwichBuilder ham(boolean ham){
            this.ham = ham;
            return this;
        }

        public SandwichBuilder mayonnaise(boolean mayonnaise){
            this.mayonnaise = mayonnaise;
            return this;
        }

        public SandwichBuilder pepperoni(boolean pepperoni){
            this.pepperoni = pepperoni;
            return this;
        }

        public Sandwich build(){
            return new Sandwich(this);
        }
    }
}
