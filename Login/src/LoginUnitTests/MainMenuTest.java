import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainMenuTest {

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void MenuInputEqualToOneEnter() { //successful but not sure how and why
        provideInput("1\n");
        MainMenu testInput = new MainMenu();
        testInput.mainMenu();

    }
    @Test
    void MenuInputEqualToString() { //not successful
        provideInput("abcde\n");
        MainMenu incorrectInput = new MainMenu();
        incorrectInput.mainMenu();
    }
}