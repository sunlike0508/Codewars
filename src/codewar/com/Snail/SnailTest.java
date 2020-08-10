package codewar.com.Snail;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SnailTest {

	@Test
	public void SnailTest1() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] r = { 1, 2, 3, 6, 9, 8, 7, 4, 5 };
		test(array, r);
	}
	
	@Test
	public void SnailTest2() {
		int[][] array = { { 1, 2, 3, 4 }, 
						  { 5, 6, 7, 8 }, 
						  { 9, 10, 11, 12},
						  { 13, 14, 15, 16}};
		int[] result = { 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
		test(array, result);
	}

	public void test(int[][] array, int[] result) {
		assertArrayEquals(result, Snail.snail(array));
	}

}
