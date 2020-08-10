package codewar.com.BackspacesInString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackspacesInStringTest {

    @Test
    public void testCleanString() {
        assertEquals("ac", BackspacesInString.cleanString("abc#d##c"));
        assertEquals("", BackspacesInString.cleanString("abc####d##c#"));
    }
}
