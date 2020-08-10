package codewar.com.Palindromes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

	@Test
	public void basicTests() {
		doTest("a", 1);
		doTest("aa", 2);
		doTest("baa", 2);
		doTest("aab", 2);
		doTest("zyabyz", 1);
		doTest("baabcd", 4);
		doTest("baablkj12345432133d", 9);
		doTest("I like racecars that go fast", 7);
	}

	private void doTest(final String s, int expected) {
		assertEquals(expected, Palindromes.longestPalindrome(s));
	}

}
