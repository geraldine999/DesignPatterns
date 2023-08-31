public class Pedestrian implements Observer{
    @Override
    public void update(TrafficLight trafficLight) {
        if(trafficLight.status.equals("RED")){
            System.out.println("RED: Pedestrian cannot pass");
        }else {
            System.out.println("GREEN: Pedestrian can pass");
        }
    }
}
