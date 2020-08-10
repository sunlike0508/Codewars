package codewar.com.SquareDigit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
	}

}
