package codewar.com.Groups;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GroupsTest {

	@Test
	@DisplayName("Given () Expected true")
	public void myTests1() {
		assertEquals(true, Groups.groupCheck("()"));
	}
	
	@Test
	@DisplayName("Given ({ Expected false")
	public void myTests2() {
		assertEquals(false, Groups.groupCheck("({"));
	}

}
