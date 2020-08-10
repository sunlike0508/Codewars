package codewar.com.DeadFish;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeadFishTest {

	@Test
	public void Given_iiisdoso_expected_8_and_64() {
		assertArrayEquals(new int[] { 8, 64 }, DeadFish.parse("iiisdoso"));
	}
	
	@Test
	public void Given_iiisdosodddddiso_expected_8_and_64_and_3600() {
		assertArrayEquals(new int[] { 8, 64, 3600 }, DeadFish.parse("iiisdosodddddiso"));
	}
	
	@Test
	public void Given_dossiii_expected_minus_one() {
		assertArrayEquals(new int[] { -1 }, DeadFish.parse("dossiii"));
	}
	
	@Test
	public void Given_iissiii_expected_null() {
		assertArrayEquals(new int[] { }, DeadFish.parse("iissiii"));
	}

}
