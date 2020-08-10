package codewar.com.BuddyPairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuddyPairsTest {

	private static void testing(long start, long limit, String expected) {
		assertEquals(expected, BuddyPairs.buddy(start, limit));
	}

	@Test
	public void test() {
		testing(1071625, 1103735, "(1081184 1331967)");
		testing(2382, 3679, "Nothing");
		testing(381, 1050, "(1050 1925)");
		testing(10, 50, "(48 75)");
	}

}
