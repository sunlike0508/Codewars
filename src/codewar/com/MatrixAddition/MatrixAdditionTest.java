package codewar.com.MatrixAddition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MatrixAdditionTest {

	@Test
	public void sampleTest1() {
		int[][] expected = new int[][] { { 3, 4, 4 }, 
										{ 6, 4, 4 }, 
										{ 2, 2, 4 } };
		
		assertArrayEquals(expected,
				MatrixAddition.matrixAddition(
						new int[][] { 	{ 1, 2, 3 }, 
										{ 3, 2, 1 }, 
										{ 1, 1, 1 } },
						new int[][] { 	{ 2, 2, 1 }, 
										{ 3, 2, 3 }, 
										{ 1, 1, 3 } }));
	}
	
	@Test
	public void sampleTest2() {		
		int[][] expected = new int[][] { { 3 } };
		assertArrayEquals(expected, 
				MatrixAddition.matrixAddition(
						new int[][] { { 1 } },
						new int[][] { { 2 } }));
	}
	
	@Test
	public void sampleTest3() {
		int[][] expected = new int[][] { { 3, 5 }, { 3, 5 } };
		assertArrayEquals(expected,
				MatrixAddition.matrixAddition(
						new int[][] { { 1, 2 }, { 1, 2 } },
						new int[][] { { 2, 3 }, { 2, 3 } }));
	}

}
