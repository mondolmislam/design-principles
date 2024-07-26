package mediator.question02;

public class Airplane {
    private ATCMediator mediator;
    private String name;

    public Airplane(ATCMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String msg){
        mediator.sendMessage(msg,this);
    }

    public void receive(String msg){
        System.out.println(name + " received message: " + msg);
    }
}


