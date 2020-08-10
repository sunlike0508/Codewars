package codewar.com.RomanNumeralsEncoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumeralsEncoderTest {

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", RomanNumeralsEncoder.solution(1));
        assertEquals("IV", RomanNumeralsEncoder.solution(4));
        assertEquals("VI", RomanNumeralsEncoder.solution(6));
    }

}
