package codewar.com.TriangleNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleNumbersTest {

	@Test
	public void test1() {
		assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
	}

	@Test
	public void test2() {
		assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
	}

}
