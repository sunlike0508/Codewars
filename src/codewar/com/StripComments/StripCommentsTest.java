package codewar.com.StripComments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StripCommentsTest {

	@Test
	public void stripComments() throws Exception {
		assertEquals("apples, pears\ngrapes\nbananas", StripComments
				.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));

		assertEquals("a\nc\nd", StripComments.stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" }));
		
		assertEquals("", StripComments.stripComments("a", new String[] { "a" }));

	}

}
