import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        boolean madeChoice = false;
        int choice;

        do {
            System.out.print("""
                    Main Menu:
                    1. Login
                    2. Create Account
                    3. Exit
                    :""");

            try {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        Login spinUpLogin = new Login();
                        spinUpLogin.fillArrays(); //initialises existing accounts
                        System.out.print("Enter Username: ");
                        String username = user.nextLine();
                        System.out.print("Enter Password: ");
                        String password = pass.nextLine();
                        spinUpLogin.attemptLogin(username, password);
                        madeChoice = true;
                        break;
                    case 2:
                        System.out.print("Enter New Username: ");
                        String newUser = user.nextLine();
                        System.out.print("Enter New Password: ");
                        String newPass = pass.nextLine();
                        madeChoice = true;
                        break;
                    case 3:
                        System.out.print("Thank you for using Matt's login service");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Try again");
                }
            } catch (Exception e) {
                System.out.println("Wrong Input. Try again.");
                input.nextLine();
            }
        } while (!madeChoice);

        //search for password in array
    }
}
