package codewar.com.StringSplit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringSplitTest {

    @Test
    public void testEvenString() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }
    
    @Test
    public void testEmptyString() {
       String s = "";
       assertEquals("[]", Arrays.toString(StringSplit.solution(s)));
    }
    
    @Test
    public void testOddString() {
       String s = "abcde";
       String s1 = "LovePizza";
       assertEquals("[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
    }

}
