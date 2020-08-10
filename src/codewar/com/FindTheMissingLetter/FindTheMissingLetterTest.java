package codewar.com.FindTheMissingLetter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindTheMissingLetterTest {

	@Test
	@DisplayName("given array 'a','b','c','d','f' then result is 'e'")
	void testFindMissingLetter_01() {
		assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] {'a','b','c','d','f'}));
	}
	
	@Disabled
	@Test
	@DisplayName("given array 'O','Q','R','S' then result is 'P'")
	void testFindMissingLetter_02() {
		assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] {'O','Q','R','S'}));
	}

}
