package mediator;


public abstract class User {

    protected String name;

    protected ChatMediator chatMediator;


    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    abstract void send(String message);

    abstract void receive(String message);

}

