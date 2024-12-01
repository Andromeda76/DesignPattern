package mediator;

public class UserImpl extends User{
    public UserImpl(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    void send(String message) {
        chatMediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {}
}
