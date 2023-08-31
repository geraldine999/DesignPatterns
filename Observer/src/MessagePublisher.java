import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(TrafficLight trafficLight) {
        for(Observer o : observers){
            o.update(trafficLight);
        }
    }
}
