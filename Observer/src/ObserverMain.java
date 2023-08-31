public class ObserverMain {
    public static void main(String[] args) {
        testObserver();
    }

    private static void testObserver(){


        MessagePublisher messagePublisher = new MessagePublisher();
        Pedestrian pedestrian = new Pedestrian();
        Car car = new Car();

        messagePublisher.attachObserver(pedestrian);
        messagePublisher.attachObserver(car);

        messagePublisher.notify(new TrafficLight("RED"));

        try{
            Thread.sleep(2000); //2 seconds
        }catch (Exception e){

        }

        messagePublisher.notify(new TrafficLight("GREEN"));
    }
}