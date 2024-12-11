import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MainMenuTests {
    Main testInput = new Main();

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void MenuInputEqualToOneEnter() {
        // Simulate user input
        provideInput("1\n");

        // Redirect system output to capture println statements
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Call the method
        testInput.mainMenu();

        // Verify the expected output
        String output = testOut.toString();
        assertTrue(output.contains("Directing to Login Menu"));
    }

    @Test
    void MenuInputEqualToTwoEnter() {
        // Simulate user input
        provideInput("2\n");

        // Redirect system output to capture println statements
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Call the method
        testInput.mainMenu();

        // Verify the expected output
        String output = testOut.toString();
        assertTrue(output.contains("Directing to Create Account Menu"));
    }

    @Test
    void MenuInputEqualToThreeEnter() {
        // Simulate user input
        provideInput("3\n");

        // Redirect system output to capture println statements
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Call the method
        testInput.mainMenu();

        // Verify the expected output
        String output = testOut.toString();
        assertTrue(output.contains("Thank you for using Matt's login service"));
    }

    @Test
    void MenuInputInvalidIntEnterThenExit() {
        provideInput("4\n3\n"); //tests 4 to trigger loop, 3 to exit
        testInput.mainMenu(); //test to make sure it runs through no exceptions
    }

    @Test
    void MenuInputInvalidStringEnterThenExit() {
        provideInput("abcdefg\n3\n"); //tests abcdefg to trigger loop, 3 to exit
        testInput.mainMenu();
    }

    @AfterEach
    void tearDown() {
        System.setIn(System.in);  // Reset input stream
        System.setOut(System.out);  // Reset output stream
    }
}
