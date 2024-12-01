package mediator;

import java.util.ArrayList;
import java.util.List;


public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : this.users){
            if (user != sender){
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

}

