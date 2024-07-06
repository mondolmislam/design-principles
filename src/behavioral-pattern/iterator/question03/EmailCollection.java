package iterator.question03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmailCollection implements Iterable<Email>{
    private List<Email> emails;

    public EmailCollection() {
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public Iterator<Email> iterator() {
        return new EmailIterator(this.emails.iterator());
    }

    private class EmailIterator implements Iterator<Email> {
        private Iterator<Email> emailIterator;
        private String recipient;

        public EmailIterator(Iterator<Email> emailIterator, String recipient) {
            this.emailIterator = emailIterator;
            this.recipient = recipient;
        }

        public EmailIterator(Iterator<Email> iterator) {
            emailIterator=iterator;
        }

        @Override
        public boolean hasNext() {
            while (emailIterator.hasNext()) {
                Email email = emailIterator.next();
                if (email.getRecipients().contains(recipient)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Email next() {
            return emailIterator.next();
        }
    }

    public Iterator<Email> iterator(String recipient) {
        return new EmailIterator(this.emails.iterator(), recipient);
    }
}
