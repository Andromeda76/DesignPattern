package observer;

public class ObserverImpl implements Observer{

    private Subject topic;
    private final String name;

    public ObserverImpl(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        System.out.println(msg + " is being consumed in " + name);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
