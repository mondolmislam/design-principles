package mediator.queston03;

public class Document {
    private String content="";

    public void updateDocument(String updateDocument){
        this.content=updateDocument;
    }

    public String getContent(){
        return content;
    }
}
