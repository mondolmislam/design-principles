package iterator.question03;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        EmailCollection emailCollection = new EmailCollection();
        emailCollection.addEmail(new Email("Meeting Agenda", "Let's discuss the upcoming project deadline.", Arrays.asList("john@example.com", "jane@example.com")));
        emailCollection.addEmail(new Email("Lunch Invitation", " Join us for lunch at the new Italian restaurant on Friday!", Arrays.asList("jane@example.com")));
        emailCollection.addEmail(new Email("Project Update", "Here's the latest update on the project status.", Arrays.asList("john@example.com")));
        emailCollection.addEmail(new Email("New Product Launch", "We are excited to announce the launch of our new product!", Arrays.asList("jane@example.com")));

        Iterator<Email> emailIterator = emailCollection.iterator("jane@example.com");
        while (emailIterator.hasNext()) {
            Email email = emailIterator.next();
            System.out.println("Subject: " + email.getSubject());
            System.out.println("Body: " + email.getBody());
            System.out.println();
        }

    }
}
