package codewar.com.IsMyFriendCheating;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IsMyFriendCheatingTest {

	@Disabled
	@Test
	@DisplayName("given 26 then result is 15 21")
	void test_removNb_01() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[] {15, 21});
		res.add(new long[] {21, 15});
		List<long[]> a = IsMyFriendCheating.removNb(26);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}
	
	@Disabled
	@Test
	@DisplayName("given 100 then result is list size is 0")
	void test_removNb_02() {
		List<long[]> a = IsMyFriendCheating.removNb(100);
		assertEquals(0, a.size());
	}
	
	@Test
	@DisplayName("given 1000003 then result is list size is 0")
	void test_removNb_03() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[] {15, 21});
		res.add(new long[] {21, 15});
		List<long[]> a = IsMyFriendCheating.removNb(1000003);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}

}
