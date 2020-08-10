package codewar.com.Carboat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarboatTest {

	@Test
	public void test_Given_30_and_100() {
		assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]", Carboat.howmuch(30, 100));
	}
	
	@Test
	public void test_Given_2950_and_2950() {
		assertEquals("[]", Carboat.howmuch(2950, 2950));
	}
	
	@Test
	public void test_Given_60390_and_60391() {
		assertEquals("[[M: 60391 B: 8627 C: 6710]]", Carboat.howmuch(60390, 60391));
	}

}
