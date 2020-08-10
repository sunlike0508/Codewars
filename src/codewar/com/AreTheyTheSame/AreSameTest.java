package codewar.com.AreTheyTheSame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreSameTest {

	@Test
	public void testCompWhenTrue() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertTrue(AreSame.comp(a, b)); 
	}

	@Test
	public void testCompWhenFalse() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertFalse(AreSame.comp(a, b)); 
	}
}
