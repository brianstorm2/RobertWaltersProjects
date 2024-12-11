import java.util.Scanner;

public class Login {

    public static void requestUserLogin() {
        byte count = 3; //counter gives 3 attempts to login before exiting
        boolean credentialsVerified = false;

        do {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String username = reader.nextLine().trim().toLowerCase(); //sanitise username to lowercase removing spaces
            System.out.print("Enter Password: ");
            String password = reader.nextLine();
            if (DataStorage.usernamesAndPasswords.containsKey(username) && DataStorage.usernamesAndPasswords.get(username).equals(password)) { //if username exists and password matches value in hashmap
                System.out.println("Welcome back " + username);
                credentialsVerified = true;
            } else {
                System.out.println("Invalid username or password. You have " + (count-1) + " attempts left to login.");
                count--;
            }
        } while (count > 0 && !credentialsVerified); //loops until count 0
    }
}
