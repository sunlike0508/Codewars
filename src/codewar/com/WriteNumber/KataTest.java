package codewar.com.WriteNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {
	@Test
	public void testSomething() {
		//assertEquals("10 + 2", Kata.expandedForm(12));
		//assertEquals("40 + 2", Kata.expandedForm(42));
		assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
	}

}
