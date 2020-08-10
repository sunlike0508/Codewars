package codewar.com.FindTheParityOutlier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheParityOutlierTest {

	@Test
	void test() {
		int[] ints1 = { 2, 6, 8, 10, 3 }; // odd at the back
		int[] ints2 = { 2, 6, 8, 200, 700, 1, 84, 10, 4 }; // odd in the middle
		int[] ints3 = { 17, 6, 8, 10, 6, 12, 24, 36 }; // odd in the front
		int[] ints4 = { 2, 1, 7, 17, 19, 211, 7 }; // even in the front
		int[] ints5 = { 1, 1, 1, 1, 1, 44, 7, 7, 7, 7, 7, 7, 7, 7 }; // even in the middle
		int[] ints6 = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 35, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 7, 7, 7, 1000 }; 
		// even at the end
		int[] ints7 = { 2, -6, 8, -10, -3 }; // odd at the back, negative
		int[] ints8 = { 2, 6, 8, 2, -66, 34, -35, 66, 700, 1002, -84, 10, 4 }; // odd in the middle, negative
		int[] ints9 = { -1 * Integer.MAX_VALUE, -18, 6, -8, -10, 6, 12, -24, 36 }; // odd in the front, negative
		int[] ints10 = { -20, 1, 7, 17, 19, 211, 7 }; // even in the front, negative
		int[] ints11 = { 1, 1, -1, 1, 1, -44, 7, 7, 7, 7, 7, 7, 7, 7 }; // even in the middle, negative
		int[] ints12 = { 1, 0, 0 }; // odd answer, zeroes
		int[] ints13 = { 3, 7, -99, 81, 90211, 0, 7 }; // even in the middle, zero

		assertEquals(3, FindTheParityOutlier.find(ints1));
		assertEquals(1, FindTheParityOutlier.find(ints2));
		assertEquals(17, FindTheParityOutlier.find(ints3));
		assertEquals(2, FindTheParityOutlier.find(ints4));
		assertEquals(44, FindTheParityOutlier.find(ints5));
		assertEquals(1000, FindTheParityOutlier.find(ints6));
		assertEquals(-3, FindTheParityOutlier.find(ints7));
		assertEquals(-35, FindTheParityOutlier.find(ints8));
		assertEquals(-1 * Integer.MAX_VALUE, FindTheParityOutlier.find(ints9));
		assertEquals(-20, FindTheParityOutlier.find(ints10));
		assertEquals(-44, FindTheParityOutlier.find(ints11));
		assertEquals(1, FindTheParityOutlier.find(ints12));
		assertEquals(0, FindTheParityOutlier.find(ints13));
	}

}
