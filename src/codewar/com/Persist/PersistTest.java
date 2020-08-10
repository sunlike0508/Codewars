package codewar.com.Persist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersistTest {

	@Test
	@DisplayName("Test persistence when input is 39 then result is 3")
	void test_persistence_when_input_is_39_then_result_is_3() {
		assertEquals(3, Persist.persistence(39));
	}
	
	@Test
	@DisplayName("Test persistence when input is 999 then result is 4")
	void test_persistence_when_input_is_999_then_result_is_4() {
		assertEquals(4, Persist.persistence(999));
	}
	
	@Test
	@DisplayName("Test persistence when input is 4 then result is 0")
	void test_persistence_when_input_is_4_then_result_is_0() {
		assertEquals(0, Persist.persistence(4));
	}

}
