import java.util.Scanner;

public class CreateNewAccount {

    public static void AddNewUserAccount() {

        Scanner reader = new Scanner(System.in); //scanner for username and password
        boolean enteredValidUsername = false; //false until valid username input
        boolean enteredValidPassword = false; //false until valid password input
        String username = null; //setting username and password outside of while loops
        String password = null;

        do {
            System.out.print("Enter Username: ");
            username = reader.nextLine().trim().toLowerCase().replace(" ", ""); //removes all spaces, sets to lowercase
            if (username.isBlank()) { //rejects empty usernames
                System.out.println("Username cannot be empty");
            }
            else {
                enteredValidUsername = true;
            }
        } while (!enteredValidUsername); //repeats until non-blank username entered improve later, check if username already exists in hashmap and REJECT

        do {
            System.out.print("Enter Password: ");
            password = reader.nextLine();
            if (password.isBlank()) { //rejects empty passwords
                System.out.println("Password cannot be empty");
            }
            else {
                enteredValidPassword = true;
            }
        } while (!enteredValidPassword); //repeats until non-blank password entered. Could improve later, min chars, special chars

        System.out.println("New Account " + username + " Created With PWD " + password);
    }
    //add to class
    //add to hashmap
}
