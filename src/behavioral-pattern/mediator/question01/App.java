package mediator.question01;

public class App {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new User(mediator, "John");
        User user2 = new User(mediator, "Alice");
        User user3 = new User(mediator, "Bob");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("Hi everyone!");
        user2.send("Hey John!");
    }
}
