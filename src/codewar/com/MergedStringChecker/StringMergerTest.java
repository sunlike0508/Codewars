package codewar.com.MergedStringChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringMergerTest {

	@Test
	public void normalHappyFlow() {
		assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
		assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
		assertFalse("Codewars are not codwars", StringMerger.isMerge("codewar", "cod", "wars"));
	}
	
	@Test
	public void test_01() {
		assertFalse("codewars is not codewar", StringMerger.isMerge("", "code", "war"));
	}
	
	@Test
	public void test_02() {
		assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
	}
	
	@Test
	public void test_03() {
		assertFalse(StringMerger.isMerge("codewars", "code", "code"));
	}
	
	@Test
	public void test_04() {
		assertFalse(StringMerger.isMerge("\\D__!<g7@M)n`v", "D_gMv", "\\_!<7@)n`"));
	}
	
	@Test
	public void test_05() {
		assertFalse(StringMerger.isMerge("O]K0Svr&L&AAv+_$8,(", "rL&Av+$8", "O]K0Sv&A_,("));
	}
	
	@Test
	public void test_06() {
		assertFalse(StringMerger.isMerge("QE[( 8F.q]222$P&Yen1]]!3&o$", "QE 8q]P&en1]3&$", "[(F.222$Y]!o"));
	}
}
