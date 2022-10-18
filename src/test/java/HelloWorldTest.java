import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.db.HelloWorld;

/**
 * HelloWorldTest class
 */
class HelloWorldTest {

    @Test
    @DisplayName("Test WelcomeMessage input")
    void testPrintMethod() {

        String inputValue = "FC";
        String excpectedResult = "FC";

        var result = HelloWorld.welcomeMessage(inputValue);

        assertTrue(result.contains(excpectedResult));
    }
}
