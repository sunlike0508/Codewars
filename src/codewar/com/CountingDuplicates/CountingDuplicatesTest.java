package codewar.com.CountingDuplicates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountingDuplicatesTest {

	@Disabled
	@Test
	@DisplayName("Test duplicateCount when input is \"abcde\" then result is 0")
	void test_duplicateCount_result_is_0() {
		assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
	}
	@Disabled
	@Test
	@DisplayName("Test duplicateCount when input is \"aabBcde\" then result is 2")
	void test_02() {
		assertEquals(2, CountingDuplicates.duplicateCount("aabBcde"));
	}
	@Disabled
	@Test
	@DisplayName("Test duplicateCount when input is \"Indivisibilities\" then result is 2")
	void test_03() {
		assertEquals(2, CountingDuplicates.duplicateCount("Indivisibilities"));
	}
	@Disabled
	@Test
	@DisplayName("Test duplicateCount when input is \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix\" "
			+ "then result is 26")
	void test_04() {
		assertEquals(26, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
	}
}
