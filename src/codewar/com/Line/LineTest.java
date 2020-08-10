package codewar.com.Line;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {
	
	@Test
	@DisplayName("Test findCircleEachNameLength when input is 3 then result is 8 ")
	void test_findCircleEachNameLength_01() {
		assertEquals(8, Line.findCircleEachNameLength(3));
	}
	
	@Test
	@DisplayName("Test findCircleFirstNamesOrder when inputs are 2,5 then result is 6 ")
	void test_findCircleFirstNamesOrder_01() {
		assertEquals(6, Line.findCircleFirstNamesOrder(2,5));
	}

	@Test
	@DisplayName("Test WhoIsNext when input index is 1 then result is Sheldon")
	void test_WhoIsNext_01() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		assertEquals("Sheldon", Line.WhoIsNext(names, 1));
	}
	
	@Test
	@DisplayName("Test WhoIsNext when input index is 52 then result is Penny")
	void test_WhoIsNext_02() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		assertEquals("Penny", Line.WhoIsNext(names, 52));
	}
	
	@Test
	@DisplayName("Test WhoIsNext when input index is 10010 then result is Howard")
	void test_WhoIsNext_03() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		assertEquals("Howard", Line.WhoIsNext(names, 10010));
	}

}
