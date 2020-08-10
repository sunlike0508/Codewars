package codewar.com.TribonacciSequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class XbonacciTest {
	
	private double precision = 1e-10;

	@Test
	@DisplayName("given {1,1,1},10 when then result 1,1,1,3,5,9,17,31,57,105")
	void test() {
		assertArrayEquals(new double[] {1,1,1,3,5,9,17,31,57,105}, Xbonacci.tribonacci(new double[]{1,1,1},10), precision);
	}

}
