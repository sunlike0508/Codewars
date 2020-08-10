package codewar.com.NumberPrime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	@DisplayName("Test isPrime when input is 7 then result is true")
	void testIsPrimeInputIsSeven() {
		assertTrue(Prime.isPrime(7));
	}

	@Test
	@DisplayName("Test isPrime when input is 2 then result is true")
	void testIsPrimeInputIsTwo() {
		assertTrue(Prime.isPrime(2));
	}
	
	@Test
	@DisplayName("Test isPrime when input is -20 then result is false")
	void testIsPrimeInputIsMinus20() {
		assertFalse(Prime.isPrime(-20));
	}
}
