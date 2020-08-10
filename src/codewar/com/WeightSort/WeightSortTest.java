package codewar.com.WeightSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeightSortTest {

	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
		assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999 59544965313", 
		WeightSort.orderWeight("2000 10003 1234000 59544965313 44444444 9999 11 11 22 123"));
	}

//	10003 1234000 44444444 9999 2000 123456789
//	3 16 9 38 95 1131268 49455 347464 59544965313 496636983114762 85246814996697
}
