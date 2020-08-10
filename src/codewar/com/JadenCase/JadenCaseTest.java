package codewar.com.JadenCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JadenCaseTest {
	JadenCase jadenCase;
	
	@BeforeEach
	void setUp() {
		jadenCase = new JadenCase();
	}
	
	@Test
	public void test() {
		assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull(jadenCase.toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull(jadenCase.toJadenCase(""));
	}

}
