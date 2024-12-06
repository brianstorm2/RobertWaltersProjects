import java.util.Scanner;

public class MockMainMenu {

    public void mockMainMenu() {
        Scanner input = new Scanner(System.in); //main menu input

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
                        //spinUpLogin.requestLogin(); //brings up login request
                        break;
                    case 2:
                        //CreateAccountMenu createAccountMenu = new CreateAccountMenu();
                        madeChoice = true;
                        break;
                    case 3:
                        System.out.print("Thank you for using Matt's login service");
                        madeChoice = true;
                        break;
                    default:
                        System.out.println("Wrong Input. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Wrong Input. Try again.");
                input.nextLine(); //clears input if string instead of int
            }
        } while (!madeChoice);
    }
}
