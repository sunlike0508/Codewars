package codewar.com.Greed;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreedTest {
	
	Greed greed = new Greed();

	@Test
	@DisplayName("Test greedy when input is 5, 1, 3, 4, 1")
	void test_greedy_when_input_is_common() {
		assertEquals("Score for [5,1,3,4,1] must be 250:", 250, greed.greedy(new int[] { 5, 1, 3, 4, 1 }));
	}
	
	@Test
	@DisplayName("Test greedy when input is 1, 1, 1, 3, 4")
	void test_greedy_when_input_is_three_one() {
		assertEquals("Score for [1,1,1,3,4] must be 1000:", 1000, greed.greedy(new int[] { 1, 1, 1, 3, 4 }));
	}
	
	@Test
	@DisplayName("Test greedy when input is 1, 1, 1, 3, 5")
	void test_greedy_when_input_is_four_one_and_one_five() {
		assertEquals("Score for [1,1,1,3,1] must be 1050:", 1050, greed.greedy(new int[] { 1, 1, 1, 3, 5 }));
	}
	
	@Test
	@DisplayName("Test greedy when input is 1, 1, 1, 3, 1")
	void test_greedy_when_input_is_four_one() {
		assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, greed.greedy(new int[] { 1, 1, 1, 3, 1 }));
	}
	
	@Test
	@DisplayName("Test greedy when input is 1, 1, 1, 1, 1")
	void test_greedy_when_input_is_all_one() {
		assertEquals("Score for [1,1,1,1,1] must be 1200:", 1200, greed.greedy(new int[] { 1, 1, 1, 1, 1 }));
	}

}
