package codewar.com.Dictionary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DictionaryTest {
	@Disabled
	@Test
	public void testBerries() {
		Dictionary dictionary = new Dictionary(
				new String[] { "cherry", "pineapple", "melon", "strawberry", "raspberry" });
		assertEquals("strawberry", dictionary.findMostSimilar("strawbery"));
		assertEquals("cherry", dictionary.findMostSimilar("berry"));
	}
	
	@Test
	public void testBerries2() {
		Dictionary dictionary = new Dictionary(
				new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
		//assertEquals("java", dictionary.findMostSimilar("heaven"));
		assertEquals("javascript", dictionary.findMostSimilar("javascript"));
	}
	@Disabled
	@Test
	public void testBerries3() {
		Dictionary dictionary = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
		assertEquals("codewars", dictionary.findMostSimilar("coddwars"));
	}
	
	@Disabled
	@Test
	public void testBerries4() {
		Dictionary dictionary = new Dictionary(
				new String[]{"karpscdigdvucfr", "lnjhrzfrosinb", "loogviwcojxgvi", "zqdrhpviqslik"});
		assertEquals("zqdrhpviqslik", dictionary.findMostSimilar("rkacypviuburk"));
	}	
	
//	karps cdigd vucfr
//	rkacy pviub urk
//	
//	zqdhqsli
//	kacyubur
}
