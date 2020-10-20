package Security;

public class Credentials {
    private String password;
    private String userName;

    public Credentials(){
        this.password="123";
        this.userName="teacher";
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
