import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public Login() {
    }

    private static int attempts;
    public static ArrayList<String> usernames = new ArrayList<String>(); //public static - tied to class can be accessed without creating new Login object
    public static ArrayList<String> passwords = new ArrayList<String>();

    public void fillArrays() {
        usernames.add("parsonsMatt");
        usernames.add("john_frusciante");
        usernames.add("kiedisAnthony21");
        usernames.add("thomYorke");
        usernames.add("casablancasJulian");

        passwords.add ("Mattisthebest02");
        passwords.add ("RedHot");
        passwords.add("ChiliPeppers");
        passwords.add("karmaPolice");
        passwords.add("isThisit");
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
        for (int i = 0; i < usernames.size(); i++) { //iterates through array to find if username and password combination exists
            if (usernames.get(i).equalsIgnoreCase(username) && passwords.get(i).equals(password)) {
                System.out.print("Welcome Home " + username);
                System.exit(0);
            } else if (i == usernames.size() -1) { //if at the end of array, add 1 to attempt counter
                attempts++;
                System.out.println("Incorrect username or password. Try again.");
                requestLogin();
            }
            else if (attempts >= 2) { //gives user 3 attempts
                System.out.print("Too many attempts. Shutting down.");
                System.exit(0);
            }
        }
    }
}

