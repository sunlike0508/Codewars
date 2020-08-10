package codewar.com.Supermarket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SupermarketTest {

	@Test
	public void testNormalCondition() {
		assertEquals(9, Supermarket.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
	}

	@Test
	public void testEmptyArray() {
		assertEquals(0, Supermarket.solveSuperMarketQueue(new int[] {}, 1));
	}

	@Test
	public void testSingleTillManyCustomers() {
		assertEquals(15, Supermarket.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

}
