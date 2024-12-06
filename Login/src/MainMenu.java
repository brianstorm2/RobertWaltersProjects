import java.util.Scanner;

public class MainMenu {

    public void mainMenu() {
        Scanner input = new Scanner(System.in); //main menu input
        Scanner user = new Scanner(System.in); //username input
        Scanner pass = new Scanner(System.in); //password input
        boolean madeChoice = false; //initialises variable for while loop until a valid choice is made
        int choice;
        Login spinUpLogin = new Login();

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
                        madeChoice = true;
                        spinUpLogin.requestLogin(); //brings up login request
                        break;
                    case 2:
                        CreateAccountMenu createAccountMenu = new CreateAccountMenu();
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
                input.nextLine(); //clears input if string instead of int
            }
        } while (!madeChoice);
    }

    public void initArray (){
        Login login = new Login();
        login.fillArrays(); //initialises existing accounts
      //  System.out.println(login.usernames.get(0));
    }
}

