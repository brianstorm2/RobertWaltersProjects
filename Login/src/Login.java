import java.util.Locale;

public class Login {

    public Login() {
    }

    private static int attempts;
    String[] usernames = new String[5];
    String[] passwords = new String[5];

    void fillArrays() {
        usernames[0] = "parsonsMatt";
        usernames[1] = "john_frusciante";
        usernames[2] = "kiedisAnthony21";
        usernames[3] = "thomYorke";
        usernames[4] = "casablancasJulian";

        passwords[0] = "Mattisthebest02";
        passwords[1] = "RedHot";
        passwords[2] = "ChiliPeppers";
        passwords[3] = "karmaPolice";
        passwords[4] = "isThisit";
    }

    void attemptLogin(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username.toLowerCase(Locale.ROOT)) && passwords[i].equals(password)) {
                System.out.print("Welcome Home " + username);
                System.exit(0);
            } else if (i == usernames.length - 1) {
                attempts++;
                System.out.print("Incorrect username or password. Try again.");
            }
        }
    }
}

