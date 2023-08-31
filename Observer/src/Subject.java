
public interface Subject {

    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void notify(TrafficLight trafficLight);
}
