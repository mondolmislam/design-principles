package mediator.queston03;

public interface DocumentMediator {
    void updateDocument(String updateDocument,User user);
    void addUser(User user);
    String getDocumentContent();
}
