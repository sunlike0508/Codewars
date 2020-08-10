package codewar.com.Dubstep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DubstepTest {

	@Test
	@DisplayName("given WUBWUBABCWUB when SongDecoder then result is WE ABC")
	void test_SongDecoder_01() {
		assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
	}
	
	@Test
	@DisplayName("given RWUBWUBWUBLWUB when SongDecoder then result is R L")
	void test_SongDecoder_02() {
		assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
	}
	
	@Test
	@DisplayName("given AWUBBWUBCWUBD when SongDecoder then result is A[ B C ]D")
	void test_SongDecoder_03() {
		assertEquals("A B C D", Dubstep.SongDecoder("AWUBBWUBCWUBD"));
	}

}
