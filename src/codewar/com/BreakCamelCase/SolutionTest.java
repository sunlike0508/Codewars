package codewar.com.BreakCamelCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	public void tests() {
		assertEquals("camel Casing", Solution.camelCase("camelCasing"));
		assertEquals("camel Casing Test", Solution.camelCase("camelCasingTest"));
		assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"));
	}

}
