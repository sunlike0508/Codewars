package codewar.com.PerfectPower;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PerfectPowerTest {

	@Test
	@DisplayName("Test isPerfectPower when input is 4 then result is 2,2")
	void test_isPerfectPower_01() {
		assertArrayEquals(new int[] {2, 2}, PerfectPower.isPerfectPower(4));
	}
	
	@Test
	@DisplayName("Test isPerfectPower when input is 5 then result is null")
	void test_isPerfectPower_02() {
		assertArrayEquals(null, PerfectPower.isPerfectPower(5));
	}
	
	@Test
	@DisplayName("Test isPerfectPower when input is 100 then result is 10,2")
	void test_isPerfectPower_03() {
		assertArrayEquals(new int[] {10, 2}, PerfectPower.isPerfectPower(100));
	}
	
	@Test
	@DisplayName("Test isPerfectPower when input is 243 then result is 100")
	void test_isPerfectPower_04() {
		assertArrayEquals(new int[] {3, 5}, PerfectPower.isPerfectPower(243));
	}

}
