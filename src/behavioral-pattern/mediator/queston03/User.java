package mediator.queston03;

public class User {
    private DocumentMediator mediator;
    private String name;

    public User(DocumentMediator mediator,String name){
        this.mediator=mediator;
        this.name=name;
    }

    public void sendUpdate(String updateDocument){
        mediator.updateDocument(updateDocument,this);
    }

    public void receiveUpdate(String updateDocument){
        System.out.println(name +" received update : "+updateDocument);
    }
}
