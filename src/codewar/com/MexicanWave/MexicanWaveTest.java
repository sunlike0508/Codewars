package codewar.com.MexicanWave;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MexicanWaveTest {

	@Test
	@DisplayName("Result \"Hello\", \"hEllo\", \"heLlo\", \"helLo\", \"hellO\"")
	public void basicTest_Given_hello() {
		String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
		assertArrayEquals(result, MexicanWave.wave("hello"));
	}

	@Test
	public void basicTest_Given_codewars() {
		String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
				"codewaRs", "codewarS" };
		assertArrayEquals(result, MexicanWave.wave("codewars"));
	}

	@Test
	public void basicTest_Given_null() {
		String[] result = new String[] {};
		assertArrayEquals(result, MexicanWave.wave(""));
	}

	@Test
	@DisplayName("Given two words Expected result")
	public void basicTest4() {
		String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
				"two worDs", "two wordS" };
		assertArrayEquals(result, MexicanWave.wave("two words"));
	}

	@Test
	@DisplayName("Given \" gap \" Expected \" Gap \", \" gAp \", \" gaP \"")
	public void basicTest5() {
		String[] result = new String[] { " Gap ", " gAp ", " gaP " };
		assertArrayEquals(result, MexicanWave.wave(" gap "));
	}

}
