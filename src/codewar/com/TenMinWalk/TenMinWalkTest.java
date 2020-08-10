package codewar.com.TenMinWalk;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TenMinWalkTest {
	
	@Test
	@DisplayName("Test isValid when input is 'w' then result is false")
	void test_01() {
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
	}
	
	@Test
	@DisplayName("Test isValid when input is the more than 10 then result is false")
	void test_02() {
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
	}

	@Test
	@DisplayName("Test isValid when input is 'n','n','n','s','n','s','n','s','n','s' then result is false")
	void test_03() {
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}
	
	@Test
	@DisplayName("Test isValid when input is 'n','s','n','s','n','s','n','s','n','s' then result is true")
	void test_4() {
		assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
	}
}
