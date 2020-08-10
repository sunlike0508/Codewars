package codewar.com.HighestScoringWord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HighestScoringWordTest {

    @Test
    @DisplayName("Given man i need a taxi up to ubud & Expected taxi")
    public void sampleTests1() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
    }
    
    @Test
    @DisplayName("Given what time are we climbing up to the volcano & Expected volcano")
    public void sampleTests2() {
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
    }
    
    @Test
    @DisplayName("Given take me to semynak & Expected semynak")
    public void sampleTests3() {
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

}