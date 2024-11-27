import java.util.Locale;
import java.util.Scanner;

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

    void requestLogin() {
        Scanner user = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = user.nextLine();
        System.out.print("Enter Password: ");
        String password = pass.nextLine();
        attemptLogin(username, password);
    }

    void attemptLogin(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            //System.out.println(usernames[i] + passwords[i]);
            if (usernames[i].equalsIgnoreCase(username) && passwords[i].equals(password)) {
                System.out.print("Welcome Home " + username);
                System.exit(0);
//            } else if (i == usernames.length -1) {
//                attempts++;
//                System.out.print("Incorrect username or password. Try again.");
//                requestLogin();
            }
        }
    }
}

