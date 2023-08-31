public class MediatorMain {
    public static void main(String[] args) {

        testMediator();

    }

    private static void testMediator(){
        AirTrafficController airTrafficController= new AirTrafficController();
        Helicopter helicopter = new Helicopter(airTrafficController);
        Plane plane  = new Plane(airTrafficController);

        airTrafficController.setHelicopter(helicopter);
        airTrafficController.setPlane(plane);

        helicopter.send("I am a helicopter in position X");
        plane.send("I am a plane in position Z");
    }
}