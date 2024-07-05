package question03;

public class Main {
    public static void main(String[] args) {
        AuthenticationProcess processor = new AuthenticationProcess();
        User user = new User("John", "mypassword", AuthenticationMethod.PASSWORD);
        boolean success = processor.authenticateUser(user);
        if (success) {
            System.out.println("User authenticated successfully");
        } else {
            System.out.println("User authentication failed");
        }
    }
}
