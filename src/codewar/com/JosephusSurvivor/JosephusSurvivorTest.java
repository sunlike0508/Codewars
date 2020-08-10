package codewar.com.JosephusSurvivor;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JosephusSurvivorTest {

	@Test
	public void test_Given_7_and_3_expected_4() {
		josephusTest(7, 3, 4);
	}

	@Test
	public void test_Given_11_and_19_expected_10() {
		josephusTest(11, 19, 10);
	}

	@Test
	public void test_Given_40_and_3_expected_28() {
		josephusTest(40, 3, 28);
	}

	@Test
	public void test_Given_14_and_2_expected_13() {
		josephusTest(14, 2, 13);
	}

	@Test
	public void test_Given_100_and_1_expected_100() {
		josephusTest(100, 1, 100);
	}

	private void josephusTest(final int n, final int k, final int result) {
		String testDescription = String.format("Testing where n = %d and k = %d", n, k);
		assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivor(n, k));
	}

}
