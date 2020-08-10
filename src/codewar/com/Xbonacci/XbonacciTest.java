package codewar.com.Xbonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XbonacciTest {
	private Xbonacci variabonacci;

	@BeforeEach
	public void setUp() throws Exception {
		variabonacci = new Xbonacci();
	}
	
	@Test
	public void basicTests1() {
		assertArrayEquals(new double[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 },
				variabonacci.xbonacci(new double[] { 0, 1 }, 10));
	}
	
	@Test
	public void basicTests2() {
		assertArrayEquals(new double[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 },
				variabonacci.xbonacci(new double[] { 1, 1 }, 10));
	}
	
	@Test
	public void basicTests3() {
		assertArrayEquals(new double[] { 0, 0, 0, 0, 1, 1, 2, 4, 8, 16 },
				variabonacci.xbonacci(new double[] { 0, 0, 0, 0, 1 }, 10));
	}
	
	@Test
	public void basicTests4() {
		assertArrayEquals(new double[] { 1, 0, 0, 0, 0, 0, 1, 2, 3, 6 },
				variabonacci.xbonacci(new double[] { 1, 0, 0, 0, 0, 0, 1 }, 10));
	}

	private void assertArrayEquals(double[] expecteds, double[] actuals) {
		for (int i = 0; i < actuals.length; i++)
			assertEquals(expecteds[i], actuals[i], 1e-10);
	}

}
