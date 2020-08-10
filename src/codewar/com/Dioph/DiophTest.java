package codewar.com.Dioph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DiophTest {

	//@Disabled
	@Test
	public void Given_five() {
		assertEquals("[[3, 1]]", Dioph.solEquaStr(5));
	}
	//@Disabled
	@Test
	public void Given_12_expected_4_1() {
		assertEquals("[[4, 1]]", Dioph.solEquaStr(12));
	}
	//@Disabled
	@Test
	public void Given_13_expected_7_3() {
		assertEquals("[[7, 3]]", Dioph.solEquaStr(13));
	}
	//@Disabled
	@Test
	public void Given_16_expected_4_0() {
		assertEquals("[[4, 0]]", Dioph.solEquaStr(16));
	}
	//@Disabled
	@Test
	public void Given_90005_expected_multi_pair() {
		assertEquals("[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]", Dioph.solEquaStr(90005));
	}
	//@Disabled
	@Test
	public void Given_90002_expected_null() {
		assertEquals("[]", Dioph.solEquaStr(90002));
	}
}
