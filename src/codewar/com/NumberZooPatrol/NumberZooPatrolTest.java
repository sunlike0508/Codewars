package codewar.com.NumberZooPatrol;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberZooPatrolTest {

	@Test
	void test() {
		assertThat(NumberZooPatrol.findMissingNumber(new int[] {1,3,4}), is(2));
	}
	
	@Test
	void test2() {
		assertThat(NumberZooPatrol.findMissingNumber(new int[] {4,3,2}), is(1));
	}

}
