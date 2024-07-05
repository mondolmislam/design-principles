package question03;

public class GmailAuthenticationHandler extends AuthenticationHandler{
    @Override
    public boolean canAuthenticate(User user) {
        if (user.getMethod().equals(AuthenticationMethod.GMAIL)){
            return true;
        }else if (successor==null){
            successor.canAuthenticate(user);
        }
        return false;
    }
}
