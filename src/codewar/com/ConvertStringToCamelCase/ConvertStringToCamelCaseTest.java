package codewar.com.ConvertStringToCamelCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConvertStringToCamelCaseTest {

	@Test
	@DisplayName("Test toCamelCase when input data is \"the-stealth-warrior\" then result is theStealthWarrior")
	void test() {
		assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase("the-stealth-warrior"));
	}

}
