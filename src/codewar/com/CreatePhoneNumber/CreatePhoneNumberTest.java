package codewar.com.CreatePhoneNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreatePhoneNumberTest {

	@Test
	void test() {
		assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	    assertEquals("(111) 111-1111", CreatePhoneNumber.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
	    assertEquals("(478) 157-9971", CreatePhoneNumber.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
	    assertEquals("(780) 221-7513", CreatePhoneNumber.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
	}

}
