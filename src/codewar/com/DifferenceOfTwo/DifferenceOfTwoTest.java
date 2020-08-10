package codewar.com.DifferenceOfTwo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DifferenceOfTwoTest {

	@Test
	public void sample_tests() {
		assertArrayEquals(new int[][] { { 1, 3 }, { 2, 4 } }, DifferenceOfTwo.twosDifference(new int[] { 1, 2, 3, 4 }));
		assertArrayEquals(new int[][] { { 1, 3 }, { 4, 6 } }, DifferenceOfTwo.twosDifference(new int[] { 1, 3, 4, 6 }));
	}

}
