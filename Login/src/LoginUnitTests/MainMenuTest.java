import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;

class MockMainMenuTest {
    MockMainMenu testInput = new MockMainMenu();

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void MenuInputEqualToOneEnter() { //successful
        provideInput("1\n");
        testInput.mockMainMenu();
    }

    @Test
    void MenuInputEqualToTwoEnter() { //successful
        provideInput("2\n");
        testInput.mockMainMenu();

    }

    @Test
    void MenuInputEqualToThreeEnter() {
        provideInput("3\n");
        testInput.mockMainMenu();
    }

    @Test
    void MenuInputNotValidIntEnter() {
        provideInput("4\n3\n"); //tests 4 to trigger loop, 3 to exit
        testInput.mockMainMenu();
    }

    @Test
    void MenuInputNotValidStringEnter() {
        provideInput("abcde\n3\n"); //tests abcde to trigger loop, 3 to exit
        testInput.mockMainMenu();
    }
}