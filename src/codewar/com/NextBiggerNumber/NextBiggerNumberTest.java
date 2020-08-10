package codewar.com.NextBiggerNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NextBiggerNumberTest {

	@Test
	public void basicTests() {
		//assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
		//assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
		assertEquals(2017, NextBiggerNumber.nextBiggerNumber(1720));
		//assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
		//assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
		//assertEquals(-1, NextBiggerNumber.nextBiggerNumber(531));
		//1947727956
		//assertEquals(1947727965, NextBiggerNumber.nextBiggerNumber(1947727956));
	}

}

//1027
//1072
//1207
//1270
//1702
//1720
//2017
//2107
//2170
