package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SubjectImpl implements Subject{

    private final List<Observer> observers;
    private String message;
    private Boolean isChanged;

    public SubjectImpl(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (Objects.nonNull(observer))
            observers.add(observer);
    }

    @Override
    public void unRegistered(Observer observer) {
        if (Objects.nonNull(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (isChanged && !this.observers.isEmpty()) {
            this.observers.forEach(Observer::update);
            this.isChanged = Boolean.FALSE;
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String meg){
        System.out.println(meg + " was posted to the topic");
        this.isChanged = Boolean.TRUE;
        this.message = meg;
        notifyObservers();
    }

}
