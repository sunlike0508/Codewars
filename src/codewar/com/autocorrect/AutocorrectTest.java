package codewar.com.autocorrect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutocorrectTest {

	@Test
	public void given_u_expected_your_sister() {
		assertEquals("your sister", Autocorrect.autocorrect("u"));
	}
	
	@Test
	public void given_you_expected_your_sister() {
		assertEquals("your sister", Autocorrect.autocorrect("you"));
	}
	
	@Test
	public void given_Youuuuu_expected_your_sister() {
		assertEquals("your sister", Autocorrect.autocorrect("Youuuuu"));
	}
	
	@Test
	public void given_youtube_expected_youtube() {
		assertEquals("youtube", Autocorrect.autocorrect("youtube"));
	}
	
	@Test
	public void given_special_letter_when_your_sister() {
		assertEquals("I miss your sister!", Autocorrect.autocorrect("I miss you!"));
	}
	
	@Test
	public void nothing() {
		assertEquals("youyouyou uuu", Autocorrect.autocorrect("youyouyou uuu"));
	}
	
	@Test
	public void given_any_sentense_when_you_exist_in_sentense_then_your_sister() {
		assertEquals("your sister want to go to the movies?", 
				Autocorrect.autocorrect("//u want to go to the movies?"));
	}
	
	
}
