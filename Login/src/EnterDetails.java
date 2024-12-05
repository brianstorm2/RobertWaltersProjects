import java.util.Scanner;

public class EnterDetails {
    private String adminAccess = "root";

    boolean valid_username = false;
    boolean valid_password = false;
    Scanner user = new Scanner(System.in);
    Scanner pass = new Scanner(System.in);
    Scanner email = new Scanner(System.in);
    String username = null;

    public void inputNewAccount() {

        while (!valid_username) {
            System.out.print("Enter Username: ");
            username = user.nextLine();
            if (username.isBlank()) {
                System.out.println("Username field must not be empty");
            } else {
                valid_username = true;
            }
        }
        while (!valid_password) {
            System.out.print("Enter Password: ");
            String password = pass.nextLine();
            if (password.isBlank()) {
                System.out.println("Password field must not be empty");
            }
            else {
                valid_password = true;
                InitNewAccount newAccount = new InitNewAccount(username, password);
                newAccount.storeDetails();
                System.out.println("New Account " + username + " Created. Returning to main menu.");
                returnToMainMenu();
            }
        }

    }

    public void inputNewAdminAccount() {
        byte adminAttempts = 0;

        do {
            Scanner adminPass = new Scanner(System.in);
            System.out.print("Enter Admin Password: ");
            String adminPassword = adminPass.nextLine();

            if (adminPassword.equals(adminAccess)) {
                while (!valid_username) {
                    System.out.print("Enter Username: ");
                    username = user.nextLine();
                    if (username.isBlank()) {
                        System.out.println("Username field must not be empty");
                    }
                    else {
                        valid_username = true;
                    }
                }
                while (!valid_password) {
                    System.out.print("Enter Password: ");
                    String password = pass.nextLine();
                    if (password.isBlank()) {
                        System.out.println("Password field must not be empty");
                    }
                    else {
                        valid_password = true;
                        System.out.print("Enter Email: ");
                        String adminEmail = email.nextLine();
                        InitNewAdminAccount newAdminAccount = new InitNewAdminAccount(adminEmail, username, password);
                        newAdminAccount.storeDetails();
                        System.out.println("New Admin Account " + username + " Created. Returning to main menu.");
                        returnToMainMenu();
                    }
                }
                break;
            } else if (!adminPassword.equals(adminAccess) && adminAttempts <= 2) {
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
