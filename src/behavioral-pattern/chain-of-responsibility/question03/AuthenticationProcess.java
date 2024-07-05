package question03;

public class AuthenticationProcess {
    private AuthenticationHandler firstHandler;
    public void AuthenticationProcess(){
        PasswordAuthenticationHandler passwordAuthenticationHandler=new PasswordAuthenticationHandler();
        GmailAuthenticationHandler gmailAuthenticationHandler=new GmailAuthenticationHandler();

        passwordAuthenticationHandler.setSuccessor(gmailAuthenticationHandler);

        firstHandler=passwordAuthenticationHandler;
    }

    public boolean authenticateUser(User user){
        return firstHandler.canAuthenticate(user);
    }
}
