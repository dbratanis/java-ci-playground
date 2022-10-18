import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.db.*;

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
