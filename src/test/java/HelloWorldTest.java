/**
 * This module contains all the tests for HelloWorld
 * <p>
 * Tests that referring to HelloWorld class
 * </p>
 *
 * @since 0.0.1
 * @author com.db
 * @version 0.0.1
 */
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.db.HelloWorld;

class HelloWorldTest {

    @Test
    @DisplayName("Test WelcomeMessage input")
    void testPrintMethod() {

        String inputValue = "FC";
        String excpectedResult = "FC";

        var result = HelloWorld.WelcomeMessage(inputValue);

        assertTrue(result.contains(excpectedResult));
	}
}
