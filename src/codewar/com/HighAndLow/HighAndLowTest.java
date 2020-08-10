package codewar.com.HighAndLow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HighAndLowTest {

	@Test
	public void test1() {
		assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}

}
