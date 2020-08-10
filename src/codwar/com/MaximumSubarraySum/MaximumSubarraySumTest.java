package codwar.com.MaximumSubarraySum;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumSubarraySumTest {

	@Test
	public void testEmptyArray() throws Exception {
		assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySum.sequence(new int[] {}));
	}

	@Test
	public void testExampleArray() throws Exception {
		assertEquals("Example array should have a max of 6", 6, MaximumSubarraySum.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
	
	@Test
	public void testNegativeExampleArray() throws Exception {
		assertEquals("Example array with all negative values should have a max of 0", 0, 
				MaximumSubarraySum.sequence(new int[] { -2, -1, -3, -4, -1, -2, -1, -5, -4 }));
	}
}
