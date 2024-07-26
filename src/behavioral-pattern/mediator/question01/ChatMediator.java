package mediator.question01;

public interface ChatMediator {
    void sendMessage(String message,User user);
    void addUser(User user);
}
