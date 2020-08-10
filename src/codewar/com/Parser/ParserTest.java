package codewar.com.Parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParserTest {

	@Test
	public void fixedTests() {
		assertEquals(1, Parser.parseInt("one"));
		assertEquals(20, Parser.parseInt("twenty"));
		assertEquals(26, Parser.parseInt("twenty-six"));
		assertEquals(200, Parser.parseInt("two hundred"));
		assertEquals(246, Parser.parseInt("two hundred forty-six"));
		assertEquals(246, Parser.parseInt("two hundred and forty-six"));
		assertEquals(2000, Parser.parseInt("two thousand"));
		assertEquals(2200, Parser.parseInt("two thousand and two hundred "));
		assertEquals(2222, Parser.parseInt("two thousand two hundred and twenty-two"));
		assertEquals(783919, Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
		assertEquals(700919, Parser.parseInt("seven hundred thousand nine hundred and nineteen"));
		assertEquals(700246, Parser.parseInt("seven hundred thousand two hundred and forty-six"));
		assertEquals(2700246, Parser.parseInt("two million seven hundred thousand two hundred and forty-six"));
	}

	//2 1000000 7 100 1000 2 100 40 6
}
