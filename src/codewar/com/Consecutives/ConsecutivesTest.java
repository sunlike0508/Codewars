package codewar.com.Consecutives;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ConsecutivesTest {

	@Test
	public void test1() {
		List<Integer> i = Arrays.asList(0, 4, 4, 4, 0, 4, 3, 3, 1);
		List<Integer> o = Arrays.asList(0, 12, 0, 4, 6, 1);
		assertEquals(o, Consecutives.sumConsecutives(i));
	}
	
	@Test
	public void test2() {
		List<Integer> i = Arrays.asList(-5, -5, 7, 7, 12, 0);
		List<Integer> o = Arrays.asList(-10, 14, 12, 0);
		assertEquals(o, Consecutives.sumConsecutives(i));
	}

}
