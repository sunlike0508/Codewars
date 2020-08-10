package codewar.com.PlayPass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayPassTest {

	@Test
	public void test1() {
		assertEquals("!4897 Oj oSpC", PlayPass.playPass("BORN IN 2015!", 1));
	}
	
	@Test
	public void test2() {
		assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
	}
	
	@Test
	public void test3() {
		assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO", 
				PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
	}

}
