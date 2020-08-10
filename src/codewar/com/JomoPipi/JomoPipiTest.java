package codewar.com.JomoPipi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JomoPipiTest {
	
	@Test
	public void a_test_of_0() {
		String s = "This is a string exemplification!";
		String a = s;
		assertEquals(a, JomoPipi.stringFunc(s, 0));
	}
	@Disabled
	@Test
	public void a_1st_test() {
		String s = "String for test: incommensurability";
		String a = "ySttirliinbga rfuosrn etmemsotc:n i";
		assertEquals(a, JomoPipi.stringFunc(s, 1));
	}
	@Disabled
	@Test
	public void a_2nd_test() {
		String s = "Ohh Man God Damn";
		String a = " nGOnmohaadhMD  ";
		assertEquals(a, JomoPipi.stringFunc(s, 7));
	}
	//@Disabled
	@Test
	public void a_3rd_test() {
		String s = "Ohh Man God Damnn";//17
		String a = "haG mnad MhO noDn";
		assertEquals(a, JomoPipi.stringFunc(s, 19));
	}
	@Disabled
	@Test
	public void a_4rd_test() {
		String s = "I like it!";
		String a = "iitkIl !e ";
		assertEquals(a, JomoPipi.stringFunc(s, 1234));
	}
}
