public class InitNewAccount {
    private String username;
    private String password;

    public InitNewAccount (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void storeDetails() {
        //Login.usernames.add(username);
        //Login.passwords.add(password);
    }
}
