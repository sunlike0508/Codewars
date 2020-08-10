package codewar.com.ValidateCredit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class ValidateCreditTest {

	@Test
	public void test891() {
		assertEquals(false, ValidateCredit.validate("891"));
	}
	
	@Test
	public void test12345() {
		assertFalse(ValidateCredit.validate("12345"));
	}
	
	@Test
	public void test5111111111111118() {
		assertTrue(ValidateCredit.validate("5111111111111118"));
	}
	
	@Test
	public void test4012888888881881() {
		assertTrue(ValidateCredit.validate("4012888888881881"));
	}

}
