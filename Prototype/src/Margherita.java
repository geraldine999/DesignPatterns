public class Margherita implements PrototypePizza{
    private boolean tomatoSauce;
    private boolean mozzarella;
    private boolean basil;
    private boolean olives;

    public Margherita(){

    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public void setMozzarella(boolean mozzarella) {
        this.mozzarella = mozzarella;
    }

    public void setBasil(boolean basil) {
        this.basil = basil;
    }

    public void setOlives(boolean olives) {
        this.olives = olives;
    }

    @Override
    public void getPizza() {
        System.out.println("This is a margherita pizza");
    }

    @Override
    public PrototypePizza clone() throws CloneNotSupportedException {
        return (Margherita) super.clone();
    }
}
