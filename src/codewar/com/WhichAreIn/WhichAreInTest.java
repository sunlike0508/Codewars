package codewar.com.WhichAreIn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WhichAreInTest {

	@Test
	public void test1() {
		String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	String r[] = new String[] { "arp", "live", "strong"};
    	
    	String[] str = WhichAreIn.inArray(a, b);
    	
		assertArrayEquals(r, str);
	}

}
