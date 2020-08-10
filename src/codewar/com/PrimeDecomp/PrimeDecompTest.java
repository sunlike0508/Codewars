package codewar.com.PrimeDecomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeDecompTest {

	@Test
	@DisplayName("Given 7775460 & Expected (2**2)(3**3)(5)(7)(11**2)(17)")
	public void testPrimeDecompOne() {
		assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
	}
	
	@Test
	@DisplayName("Given 86240 & Expected (2**5)(5)(7**2)(11)")
	public void testPrimeDecompOne2() {
		assertEquals("(2**5)(5)(7**2)(11)", PrimeDecomp.factors(86240));
	}

}
