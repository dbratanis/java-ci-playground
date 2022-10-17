import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.db.*;

class HelloWorldTest {

	@Test
	void testPrintMethod() {
		
		String inputValue = "trelos";
		String excpectedResult = "FC";
	
		var result = HelloWorld.WelcomeMessage(inputValue);
		
		assertTrue(result.contains(excpectedResult));
	}
	
	@Test
	void testMain() {
		HelloWorld.main(null);
	}

	@Test 
	void testMainClass() {
		new HelloWorld();
	}
}
