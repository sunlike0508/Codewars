package codewar.com.YourOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	@DisplayName("given 'is2 Thi1s T4est 3a' then result is 'Thi1s is2 3a T4est'")
	void test_order_01() {
		assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
	}
	
	@Test
	@DisplayName("given '4of Fo1r pe6ople g3ood th5e the2' then result is 'Fo1r the2 g3ood 4of th5e pe6ople'")
	void test_order_02() {
		assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Order.order("4of Fo1r pe6ople g3ood th5e the2"));
	}
	
	@Test
	@DisplayName("given '' then result is ''")
	void test_order_03() {
		assertEquals("", Order.order(""));
	}
}
