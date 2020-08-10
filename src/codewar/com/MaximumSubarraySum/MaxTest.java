package codewar.com.MaximumSubarraySum;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	@DisplayName("Example array should have 0")
	public void testEmptyArray() throws Exception {
		assertEquals(0, Max.sequence(new int[] {}));
	}

	@Test
	@DisplayName("Example array should have a max of 6")
	public void testExampleArray() throws Exception {
		assertEquals(6, Max.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
