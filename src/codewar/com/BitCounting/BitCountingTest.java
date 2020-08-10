package codewar.com.BitCounting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BitCountingTest {


	@Test
	@DisplayName("Test bit counting when input is 9")
	void Test_Bit_count_when_input_is_1234() {
	    assertEquals(2, BitCounting.countBits(9)); 
	}

	@Test
	@DisplayName("Test bit counting when input is 1234")
	void Test_Bit_count_when_input_is_seven() {
	    assertEquals(5, BitCounting.countBits(1234)); 
	}
	
	@Test
	@DisplayName("Test bit counting when input is 0")
	void Test_Bit_count_when_input_is_zero() {
	    assertEquals(0, BitCounting.countBits(0)); 
	}
	
	@Test
	@DisplayName("Test bit counting when input is 1")
	void Test_Bit_count_when_input_is_one() {
	    assertEquals(1, BitCounting.countBits(1)); 
	}
}
