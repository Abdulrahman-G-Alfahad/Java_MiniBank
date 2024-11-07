package Bank;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String password, String username) {

        this.password = password;
        this.username = username;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String displayAccountDetails(){
        return "Username: " + username + '\'' +
                " Password: " + password + '\'' +
                " Account: " + account.toString();
    }

    public void updateUsername(String username){
        setUsername(username);
    }

    public void updatePassword(String password){
        setPassword(password);
    }
}

