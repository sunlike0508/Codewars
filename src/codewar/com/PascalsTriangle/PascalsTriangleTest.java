package codewar.com.PascalsTriangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[][] { { 1 } }, PascalsTriangle.pascal(1));
	}

	@Test
	public void test5() {
		assertArrayEquals(
				new int[][] { 
						  { 1 }, 
						{ 1,  1 }, 
					   { 1, 2, 1 }, 
					  { 1, 3, 3, 1 }, 
					{ 1, 4, 6, 4, 1 } },
				PascalsTriangle.pascal(5));
	}

}
