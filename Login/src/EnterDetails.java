import java.util.Scanner;

public class EnterDetails {
    private String adminAccess = "root";

    public void inputNewAccount() {
        Scanner user = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = user.nextLine();
        System.out.print("Enter Password: ");
        String password = pass.nextLine();
        InitNewAccount newAccount = new InitNewAccount(username, password);
        newAccount.storeDetails();
        System.out.println("New Account " + username + " Created. Returning to main menu.");
        returnToMainMenu();
    }

    public void inputNewAdminAccount() {
        byte adminAttempts = 0;
        do {
            Scanner adminPass = new Scanner(System.in);
            System.out.print("Enter Admin Password: ");
            String adminPassword = adminPass.nextLine();

            if (adminPassword.equals(adminAccess)) {
                Scanner user = new Scanner(System.in);
                Scanner pass = new Scanner(System.in);
                Scanner email = new Scanner(System.in);
                System.out.print("Enter Username: ");
                String username = user.nextLine();
                System.out.print("Enter Password: ");
                String password = pass.nextLine();
                System.out.print("Enter Email: ");
                String adminEmail = email.nextLine();
                InitNewAdminAccount newAdminAccount = new InitNewAdminAccount(adminEmail, username, password);
                newAdminAccount.storeDetails();
                System.out.println("New Admin Account " + username + " Created. Returning to main menu.");
                returnToMainMenu();
                break;
            }

            else if (!adminPassword.equals(adminAccess) && adminAttempts <= 2) {
                System.out.println("Incorrect Password. Try Again");
                adminAttempts++;
            }

        } while (adminAttempts <= 2);
    }

    public void returnToMainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu(); //initialises main menu
    }
}
