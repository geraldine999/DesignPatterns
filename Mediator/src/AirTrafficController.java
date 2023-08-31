public class AirTrafficController implements Mediator{

    public void setHelicopter(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    private Helicopter helicopter;
    private Plane plane;
    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == helicopter){
            plane.receive(message);
        }

        if(colleague == plane){
            helicopter.receive(message);
        }
    }
}
