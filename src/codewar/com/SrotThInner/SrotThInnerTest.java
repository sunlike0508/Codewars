package codewar.com.SrotThInner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SrotThInnerTest {

    //@Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", SrotThInner.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", SrotThInner.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", SrotThInner.sortTheInnerContent("this kata is easy"));
    }
    
    //@Test
    public void testSolution() {
        assertEquals("############5616", SrotThInner.maskify("4556364607935616"));
        assertEquals("#######5616",      SrotThInner.maskify(     "64607935616"));
        assertEquals("1",                SrotThInner.maskify(               "1"));
        assertEquals("",                 SrotThInner.maskify(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    SrotThInner.maskify("Skippy")                                  );
        assertEquals("####################################man!",  SrotThInner.maskify("Nananananananananananananananana Batman!"));
    }
    
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", SrotThInner.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", SrotThInner.reverseWords("apple"));
        assertEquals("a b c d", SrotThInner.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", SrotThInner.reverseWords("double  spaced  words"));
    }
}
