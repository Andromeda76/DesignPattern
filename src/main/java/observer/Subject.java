package observer;


public interface Subject {

    void register(Observer observer);
    void unRegistered(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
}
