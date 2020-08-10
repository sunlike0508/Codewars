package codewar.com.Emirps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class EmirpsTest {

	@Test
	void test_given_10_expected_0_0_0() {
		assertThat(Emirps.findEmirp(10), is(new long[] {0, 0, 0}));
	}
	
	@Test
	void test_given_50_expected_4_37_98() {
		assertThat(Emirps.findEmirp(50), is(new long[] {4, 37, 98}));
	}
	
	@Test
	void test_given_100_expected_8_97_418() {
		assertThat(Emirps.findEmirp(100), is(new long[] {8, 97, 418}));
	}

	@Test
	void test_given_200_expected_15_199_1489() {
		assertThat(Emirps.findEmirp(200), is(new long[] {15, 199, 1489}));
	}
}
