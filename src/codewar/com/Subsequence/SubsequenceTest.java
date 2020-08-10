package codewar.com.Subsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubsequenceTest {

    @Test
    public void exampleTests() {
        assertEquals("", Subsequence.lcs("a", "b"));
        assertEquals("abc", Subsequence.lcs("abcdef", "abc"));
        assertEquals("12356", Subsequence.lcs("132535365", "123456789"));
        //"132535365", "123456789") => returns "12356"
    }

}
