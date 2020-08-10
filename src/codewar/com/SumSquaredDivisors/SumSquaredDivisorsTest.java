package codewar.com.SumSquaredDivisors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumSquaredDivisorsTest {
	
	@Test
	@DisplayName("Test sumOfDivisorsSquared when m is 42 then result is 2500")
	void test_sumOfDivisorsSquared_01() {
		assertEquals(2500, SumSquaredDivisors.sumOfDivisorsSquared(42));
	}
	
	@Test
	@DisplayName("Test findListSquared when m is 246 then result is 84100")
	void test_sumOfDivisorsSquared_02() {
		assertEquals(84100, SumSquaredDivisors.sumOfDivisorsSquared(246));
	}

	@Test
	@DisplayName("Test listSquared when m is 1 and n is 42 then result is [[1, 1], [42, 2500]]")
	void test_listSquared_01() {
		assertEquals("[[1, 1], [42, 2500]]", SumSquaredDivisors.listSquared(1, 42));
	}
	
	@Test
	@DisplayName("Test listSquared when m is 42 and n is 250 then result is [[42, 250], [246, 84100]]")
	void test_listSquared_02() {
		assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
	}

	@Test
	@DisplayName("Test listSquared when m is 42 and n is 500 then result is [[42, 250], [246, 84100]]")
	void test_listSquared_03() {
		assertEquals("[[42, 2500], [246, 84100], [287, 84100]]", SumSquaredDivisors.listSquared(42, 500));
	}
}
