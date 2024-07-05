package question03;

public class PasswordAuthenticationHandler extends AuthenticationHandler{
    @Override
    public boolean canAuthenticate(User user) {
        if (user.getMethod().equals(AuthenticationMethod.PASSWORD)){
            return true;
        }else if (successor==null){
            successor.canAuthenticate(user);
        }
        return false;
    }
}
