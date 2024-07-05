package question03;

public abstract class AuthenticationHandler {
    protected AuthenticationHandler successor;

    public void setSuccessor(AuthenticationHandler successor){
        this.successor=successor;
    }

    public abstract boolean canAuthenticate(User user);
}
