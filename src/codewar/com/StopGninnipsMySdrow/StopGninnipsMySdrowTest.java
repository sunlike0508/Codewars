package codewar.com.StopGninnipsMySdrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StopGninnipsMySdrowTest {

	@Test
	void test() {
	      assertEquals("emocleW", new StopGninnipsMySdrow().spinWords("Welcome"));
	      assertEquals("Hey wollef sroirraw", new StopGninnipsMySdrow().spinWords("Hey fellow warriors"));
	      assertEquals("This is a test", new StopGninnipsMySdrow().spinWords("This is a test"));
	      assertEquals("This is rehtona test", new StopGninnipsMySdrow().spinWords("This is another test"));
	      assertEquals("You are tsomla to the last test", new StopGninnipsMySdrow().spinWords("You are almost to the last test"));
	      assertEquals("Just gniddik ereht is llits one more", new StopGninnipsMySdrow().spinWords("Just kidding there is still one more"));
	      assertEquals("ylsuoireS this is the last one", new StopGninnipsMySdrow().spinWords("Seriously this is the last one"));
	}

}
