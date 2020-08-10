package codewar.com.ExesOhs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExesOhsTest {

	@Test
	public void testSomething1() {
		assertEquals(true, ExesOhs.getXO("xxxooo"));
	}

	@Test
	public void testSomething2() {
		assertEquals(true, ExesOhs.getXO("xxxXooOo"));
	}

	@Test
	public void testSomething3() {
		assertEquals(false, ExesOhs.getXO("xxx23424esdsfvxXXOOooo"));
	}

	@Test
	public void testSomething4() {
		assertEquals(false, ExesOhs.getXO("xXxxoewrcoOoo"));
	}

	@Test
	public void testSomething5() {
		assertEquals(false, ExesOhs.getXO("XxxxooO"));
	}

	@Test
	public void testSomething6() {
		assertEquals(true, ExesOhs.getXO("zssddd"));
	}

	@Test
	public void testSomething7() {
		assertEquals(false, ExesOhs.getXO("Xxxxertr34"));
	}

}
