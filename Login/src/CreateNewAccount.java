import java.util.Arrays;
import java.util.Scanner;

public class CreateNewAccount {

    public static void AddNewUserAccount() {

        InitNewAccount newAccount;

        Scanner reader = new Scanner(System.in); //scanner for username and password
        boolean enteredValidUsername = false; //false until valid username input
        boolean enteredValidPassword = false; //false until valid password input
        String username = null; //setting username and password outside of while loops
        String password = null;

        do {
            System.out.print("Enter Username: ");
            username = reader.nextLine().trim().toLowerCase().replace(" ", ""); //removes all spaces, sets to lowercase
            if (username.isBlank() || DataStorage.usernamesAndPasswords.containsKey(username)) { //rejects empty usernames or names already in hashmap
                System.out.println("Your username is invalid or already exists");
            }
            else {
                enteredValidUsername = true;
            }
        } while (!enteredValidUsername); //repeats until non-blank username entered, check if username already exists in hashmap and REJECT

        do {
            System.out.print("Enter Password: ");
            password = reader.nextLine();
            if (password.isBlank()) { //rejects empty passwords
                System.out.println("Password cannot be empty");
            }
            else if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters");
            }
            else if (!password.matches(".*[!£$%^&*()'_=+{};:|,./<>?~`@#].*")) { //using regex to check if password has a special char
                System.out.println("Your password must contain at least one special character");
            }
            else if (!password.matches(".*[1234567890].*")) { //using regex to check if password contains number
                System.out.println("Your password must contain at least one number");
            }
            else {
                enteredValidPassword = true;
            }
        } while(!enteredValidPassword); //repeats until non-blank password entered.

        do {
            System.out.print("Enter Password To Confirm: ");
            String passwordTwo = reader.nextLine(); //confirmation password
            if (passwordTwo.equals(password)) {
                enteredValidPassword = true;
            }
            else {
                System.out.println("Passwords do not match. Try again");
            }
        } while (!enteredValidPassword); //Repeats until passwords match

        DataStorage.usernamesAndPasswords.put(username, password);
        newAccount = new InitNewAccount(username, password);
        System.out.println("New Account Created " + username);
    }
}
