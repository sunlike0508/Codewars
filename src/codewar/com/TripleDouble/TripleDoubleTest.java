package codewar.com.TripleDouble;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TripleDoubleTest {

	@Test
	public void test1() {
		assertEquals(1, TripleDouble.TripleDouble(451999277L, 41177722899L));
	}

	@Test
	public void test2() {
		assertEquals(0, TripleDouble.TripleDouble(1222345L, 123345L));
	}

	@Test
	public void test3() {
		assertEquals(0, TripleDouble.TripleDouble(12345L, 12345L));
	}

	@Test
	public void test4() {
		assertEquals(1, TripleDouble.TripleDouble(666789L, 12345667L));
	}
	@Disabled
	@Test
	public void test5() {
		assertEquals(0, TripleDouble.TripleDouble(451999277L, 411777228L));
	}
	@Disabled
	@Test
	public void test6() {
		assertEquals(0, TripleDouble.TripleDouble(1112L, 122L));
	}

}
