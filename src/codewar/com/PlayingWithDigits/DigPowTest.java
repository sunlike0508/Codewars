package codewar.com.PlayingWithDigits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DigPowTest {

	@Test
	@DisplayName("given 89, 1 then result 1")
	void test() {
		assertEquals(1, DigPow.digPow(89, 1));
	}
	
	@Test
	@DisplayName("given 695, 2 then result 2")
	void test_02() {
		assertEquals(2, DigPow.digPow(695, 2));
	}
	
	@Test
	@DisplayName("given 46288,3 then result 51")
	void test_03() {
		assertEquals(51, DigPow.digPow(46288, 3));
	}

}
