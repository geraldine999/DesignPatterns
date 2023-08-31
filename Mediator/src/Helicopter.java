public class Helicopter extends Colleague{

    public Helicopter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Helicopter received: "+ message);
    }
}