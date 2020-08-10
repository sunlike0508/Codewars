package codewar.com.GapInPrimes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GapInPrimesTest {
	
	@Test
	@DisplayName("Test findPrimeNumber when input 6,100,110 then result is null")
	void test_findPrimeNumber() {
        assertEquals(true, GapInPrimes.findPrimeNumber(11));
	}
	
	@Test
	@DisplayName("Test GapInPrimes when input 6,100,110 then result is null")
	void test_result_is_null() {
        assertEquals(null, GapInPrimes.gap(6,100,110));
	}

	@Test
	@DisplayName("Test GapInPrimes when input 2,100,100 then result is 101,103")
	void test_GapInPrimes_01() {
		assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));
	}
	
	@Test
	@DisplayName("Test GapInPrimes when input 4,100,110 then result is 103, 107")
	void test_GapInPrimes_02() {
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4,100,110)));
        //assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        //assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
	}
	
	@Test
	@DisplayName("Test GapInPrimes when input 8,300,400 then result is 359, 367")
	void test_GapInPrimes_03() {
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        //assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
	}
	
	@Test
	@DisplayName("Test GapInPrimes when input 10,300,400 then result is 337, 347")
	void test_GapInPrimes_04() {
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
	}
	
	@Test
	@DisplayName("Test GapInPrimes when input 10,300,347 then result is 337, 347")
	void test_GapInPrimes_05() {
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,347)));
	}

}
