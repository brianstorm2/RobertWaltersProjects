import java.util.Scanner;

public class Main { //responsible for menus

    public static void main(String[] args) {
        DataStorage.initialiseAccountHashMap(); //calls method to populate existing data
        mainMenu(); //runs main menu page
    }

    public static void mainMenu() {

        Scanner reader = new Scanner(System.in); //scanner in mainMenu test fails if declared outside
        boolean madeChoice = false;

        do {
            System.out.print("""
                    Main Menu:
                    1. Login
                    2. Create Account
                    3. Exit
                    :""");

            String choice = reader.nextLine(); //using string over int to prevent blank inputs hanging
            //no need for try catch

            switch (choice) {
                case "1": //login case
                    System.out.println("Directing to Login Menu");
                    Login.requestUserLogin(); //calls userLogin method from login class
                    madeChoice = true;
                    break;
                case "2": //create account case
                    System.out.println("Directing to Create Account Menu");
                    createAccountMenu(); //calls menu below
                    madeChoice = true;
                    break;
                case "3": //exit case
                    System.out.print("Thank you for using Matt's login service");
                    madeChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again"); //if input is not 1, 2 or 3
            }
        } while (!madeChoice); //madeChoice set to false unless 1, 2 or 3 entered
    }

    //add login inputs another class
    //user and admin classes seperate

    public static void createAccountMenu() {
        Scanner reader = new Scanner(System.in);
        boolean madeChoice = false;

        do {
            System.out.print("""
                    Account Menu:
                    1. Create Admin Account
                    2. Create User Account
                    3. Back to Main Menu
                    4. Exit
                    :""");

            String choice = reader.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Directing to Admin Account Creation Menu... ");
                    //CreateNewAccount.AddNewUserAccount();
                    madeChoice = true;
                    returnToMainMenu(); //Back to Main Menu after account creation
                    break;
                case "2":
                    System.out.println("Directing to User Account Creation Menu... ");
                    CreateNewAccount.AddNewUserAccount();
                    madeChoice = true;
                    returnToMainMenu(); //Back to Main Menu after account creation
                    break;
                case "3":
                    returnToMainMenu(); //user requested return to main menu
                    madeChoice = true;
                    break;
                case "4": //exit option
                    System.out.print("Thank you for using Matt's login service");
                    madeChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        } while (!madeChoice); //while made choice = false, loop createAccountMenu
    }
    public static void returnToMainMenu() {
        System.out.println("Returning to Main Menu");
        mainMenu();
    }
}
