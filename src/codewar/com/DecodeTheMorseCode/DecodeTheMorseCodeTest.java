package codewar.com.DecodeTheMorseCode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DecodeTheMorseCodeTest {
	
	DecodeTheMorseCode decodeMorseCode = new DecodeTheMorseCode();
	
	@DisplayName("Test Decode Morse Code when input is \"HEY JUDE\"")
	@Test
	void test_Decode_Morse_Code_When_input_is_HEY_JUDE() {
		assertThat(decodeMorseCode.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
	}
	
	@DisplayName("Test Decode Morse Code when compare inputs in space or not in space")
	@Test
	void test_decode_morse_code_compare_space() {
		assertThat(decodeMorseCode.decode("... --- ..."), is("SOS"));
		assertThat(decodeMorseCode.decode("...   ---   ..."), is("S O S"));
	}
	
	@DisplayName("Test Decode Morse Code when input is an char")
	@Test
	void test_decode_morse_code_when_input_is_an_char() {
		assertThat(decodeMorseCode.decode("."), is("E"));
	}
	
	@DisplayName("Test Decode Morse Code when input is an char in space")
	@Test
	void test_decode_morse_code_when_input_is_an_char_in_space() {
		assertThat(decodeMorseCode.decode(" . "), is("E"));
	}
}
