package codewar.com.Abbreviator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AbbreviatorTest {

	@Test
	public void testInternationalization() {
		assertEquals("i18n -i19X", Abbreviator.abbreviate("internationalization -internationalizationX"));
	}
	
	@Test
	public void given_Solo_String_Expected_i19x() {
		assertEquals("i19X", Abbreviator.abbreviate("internationalizationX"));
	}
	
	@Test
	public void given_words_when_word_special_letter_is_included_then_ignore_word_special_letter_exist() {
		assertEquals("e6t-r3s are r4y fun!", Abbreviator.abbreviate("elephant-rides are really fun!"));
	}
}
