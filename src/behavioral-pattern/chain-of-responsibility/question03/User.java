package question03;

public class User {
    private String username;

    public User(String username, String password, String method) {
        this.username = username;
        this.password = password;
        this.method = method;
    }

    private String password;
    private String method;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
