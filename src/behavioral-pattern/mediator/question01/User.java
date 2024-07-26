package mediator.question01;

public class User {
    private ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String msg){
        mediator.sendMessage(msg,this);
    }

    public void receive(String msg){
        System.out.println(name +" received message: "+msg);
    }
}
