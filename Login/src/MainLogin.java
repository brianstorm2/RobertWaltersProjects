import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.initArray(); //initialises array, only want this happening once so new arrays can be added and retrieved
        mainMenu.mainMenu(); //initialises main menu
    }
}
