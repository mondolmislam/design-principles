package mediator.queston03;

import java.util.ArrayList;
import java.util.List;

public class DocumentMediatorImpl implements DocumentMediator{

    private List<User> users;
    private Document document;

    public DocumentMediatorImpl(){
        this.users=new ArrayList<>();
        this.document=new Document();
    }
    @Override
    public void updateDocument(String updateDocument, User user) {
        this.document.updateDocument(updateDocument);
        for (User u : this.users) {
            if (u != user) {
                u.receiveUpdate(updateDocument);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public String getDocumentContent() {
        return document.getContent();
    }
}
