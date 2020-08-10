package codewar.com.Decompose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecomposeTest {

	@Test
	public void test1() {
		Decompose d = new Decompose();
		assertEquals("1 2 4 10", d.decompose(11));
		assertEquals("1 3 5 8 49", d.decompose(50));
	}

}
