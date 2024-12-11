public class InitNewAdminAccount extends InitNewAccount {
    private String adminEmail;

    public InitNewAdminAccount(String adminEmail, String username, String password) {
        super(username, password);
        this.adminEmail = adminEmail;
    }

    public InitNewAdminAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public void storeDetails() {
        String username = getUsername();
        String password = getPassword();
        //Login.usernames.add(username);
        //Login.passwords.add(password);
    }
}
