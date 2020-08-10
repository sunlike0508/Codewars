package codewar.com.FunReverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunReverseTest {

	private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
  
    @Test
    public void test() {
		testing(FunReverse.funReverse("012"), "201");
		testing(FunReverse.funReverse("012345"), "504132");
		testing(FunReverse.funReverse("0123456789"), "9081726354");
		//0123456789
		//9012345678 0
		//9081234567 2
		//9081723456 4
		//9081726345 6
		//9081726354 8
		testing(FunReverse.funReverse("Hello"), "oHlel");
		testing(FunReverse.funReverse("4ppso1vdjc9rjyf5bkmd5nztr8"), "84rptpzsno51dvmdkjbc59fryj");
    } 

}
