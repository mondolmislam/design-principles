package mediator.queston03;

public class App {
    public static void main(String[] args) {
        DocumentMediator mediator = new DocumentMediatorImpl();
        User user1 = new User(mediator, "Alice");
        User user2 = new User(mediator, "Bob");
        User user3 = new User(mediator, "Charlie");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.sendUpdate("Hello, everyone!");
        user2.sendUpdate("Hello, everyone! How are you");
        System.out.println("Document content: " + mediator.getDocumentContent());
    }
}
