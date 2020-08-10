package codewar.com.ConsonantValue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsonantValueTest {

	@Test
    public void basicTests() {
		//aeiou
        assertEquals(26, ConsonantValue.solve("zodiacs"));
        assertEquals(80, ConsonantValue.solve("chruschtschov"));
        assertEquals(38, ConsonantValue.solve("khrushchev"));
        assertEquals(57, ConsonantValue.solve("strength"));
        assertEquals(73, ConsonantValue.solve("catchphrase"));
        assertEquals(103, ConsonantValue.solve("twelfthstreet"));
        assertEquals(80,  ConsonantValue.solve("mischtschenkoana"));
    }
}
