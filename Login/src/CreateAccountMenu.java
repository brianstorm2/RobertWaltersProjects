import java.util.Scanner;

public class CreateAccountMenu {

    public CreateAccountMenu() {

        Scanner input = new Scanner(System.in);
        boolean madeChoice = false; //initialises variable for while loop until a valid choice is made
        int choice;


        do {
            System.out.print("""
                    Account Menu:
                    1. Create Admin Account
                    2. Create User Account
                    3. Back to Main Menu
                    4. Exit
                    :""");

            try {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Directing to Admin Account Creation Menu: ");
                        EnterDetails enterAdminDetails = new EnterDetails();
                        enterAdminDetails.inputNewAdminAccount();
                        madeChoice = true;
                        break;
                    case 2:
                        System.out.println("Directing to User Account Creation Menu: ");
                        EnterDetails enterDetails = new EnterDetails();
                        enterDetails.inputNewAccount();
                        madeChoice = true;
                        break;
                    case 3:
                        MainMenu mainMenu = new MainMenu();
                        mainMenu.mainMenu(); //initialises main menu
                        madeChoice = true;
                        break;
                    case 4:
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
}

