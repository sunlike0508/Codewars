package codewar.com.BackWardsPrime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackWardsPrimeTest {

	@Test
	public void backWardsPrimeFrom1to100() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
	}

	@Test
	public void backWardsPrimeFrom9900to1000() {
		assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrime(9900, 10000));
	}
}
