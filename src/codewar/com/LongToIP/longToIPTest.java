package codewar.com.LongToIP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class longToIPTest {

	@Test
	public void Given_2154959208L_Expected_12811417104() {
		assertEquals("128.114.17.104", longToIP.longToIP(2154959208L));
	}
	
	@Test
	public void Given_0_Expected_0000() {
		assertEquals("0.0.0.0", longToIP.longToIP(0));
	}
	
	@Test
	public void Given_2149583361L_Expected_12832101() {
		assertEquals("128.32.10.1", longToIP.longToIP(2149583361L));
	}

}
