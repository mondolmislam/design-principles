package iterator.question03;

import java.util.List;

public class Email {
    private String subject;
    private String body;
    private List<String> receiverList;

    public Email(String subject, String body, List<String> receiver) {
        this.subject = subject;
        this.body = body;
        this.receiverList = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getRecipients() {
        return receiverList;
    }
}
