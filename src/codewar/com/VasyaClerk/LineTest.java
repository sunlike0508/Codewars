package codewar.com.VasyaClerk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

	@Disabled
	@Test
	@DisplayName("test should return YES Linke Ticket")
	void test() {
		assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
	}
	
	@Test
	@DisplayName("test should return NO Linke Ticket")
	void test_02() {
		assertEquals("NO", Line.Tickets(new int[] {25, 25, 50, 50, 100}));
	}

}
