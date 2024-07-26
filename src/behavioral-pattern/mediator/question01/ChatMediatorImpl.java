package mediator.question01;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl() {
        users=new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
       for (User u: users){
           if (u==user){
               user.receive(message);
           }
       }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
