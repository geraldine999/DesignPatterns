public class Car implements Observer{
    @Override
    public void update(TrafficLight trafficLight) {
        if(trafficLight.status.equals("RED")){
            System.out.println("RED: Car can pass");
        }else {
            System.out.println("GREEN: Car cannot pass");
        }
    }
}
