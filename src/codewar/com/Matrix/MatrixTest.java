package codewar.com.Matrix;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MatrixTest {

	//@Disabled
	@Test
	public void sampleTests() {
		int[][] matrix = { { 1 } };
		assertEquals(1, Matrix.determinant(matrix));
	}
	
	//@Disabled
	@Test
	public void sampleTests2() {
		int[][] matrix = { 
				  { 1, 3 }, 
				  { 2, 5 }};
		assertEquals(-1, Matrix.determinant(matrix));
	}
	
	//@Disabled
	@Test
	public void sampleTests3() {
		int[][] matrix = {
					{ 2, 5, 3 }, 
				    { 1,-2,-1 }, 
				    { 1, 3, 4 } };
		assertEquals(-20, Matrix.determinant(matrix));
	}
	
	//@Disabled
	@Test
	public void sampleTests4() {
		int[][] matrix = {
					{ 1, 0, 3, 7 }, 
				    { 4, 2, 0, 1 }, 
				    { 7, 7, 3 ,0 },
				    { 5, 0, 6, 8 }
				    };
		assertEquals(-477, Matrix.determinant2(matrix));
	}
	
	@Test
	public void sampleTests5() {
		int[][] matrix = {
					{ 4, 4, 3, 4, 5 }, 
					{ 2, 2, 3, 4, 5 }, 
					{ 3, 1, 3, 4, 5 }, 
					{ 3, 4, 5, 6, 7 }, 
					{ 1, 2, 3, 1, 5 }
				    };
		assertEquals(-48, Matrix.determinant2(matrix));
	}

}
