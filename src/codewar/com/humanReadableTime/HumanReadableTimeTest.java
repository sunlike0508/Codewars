package codewar.com.humanReadableTime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HumanReadableTimeTest {

	@Test
	@DisplayName("Given 60 & Expected 00:01:00")
	public void Tests() {
		assertEquals("00:00:00", HumanReadableTime.makeReadable(0), "makeReadable(0)");
	}
	
	@Test
	@DisplayName("Given 60 & Expected 00:01:00")
	public void Tests2() {
		assertEquals("00:01:00", HumanReadableTime.makeReadable(60), "makeReadable(60)");
	}
	
	@Test
	@DisplayName("Given 59 & Expected 00:00:59")
	public void Tests3() {
		assertEquals("00:00:59", HumanReadableTime.makeReadable(59), "makeReadable(59)");
	}
	
	@Test
	@DisplayName("Given 90 & Expected 00:01:30")
	public void Tests4() {
	    assertEquals("00:01:30", HumanReadableTime.makeReadable(90), "makeReadable(90)");
	}
	
	@Test
	@DisplayName("Given 3599 & Expected 00:59:59")
	public void Tests5() {
	    assertEquals("00:59:59", HumanReadableTime.makeReadable(3599), "makeReadable(3599)");
	}
	
	@Test
	@DisplayName("Given 3600 & Expected 01:00:00")
	public void Tests6() {
	    assertEquals("01:00:00", HumanReadableTime.makeReadable(3600), "makeReadable(3600)");
	}
	
	@Test
	@DisplayName("Given 45296 & Expected 12:34:56")
	public void Tests7() {
	    assertEquals("12:34:56", HumanReadableTime.makeReadable(45296), "makeReadable(45296)");
	}
	
	@Test
	@DisplayName("Given 86399 & Expected 23:59:59")
	public void Tests8() {
	    assertEquals("23:59:59", HumanReadableTime.makeReadable(86399), "makeReadable(86399)");
	}
	
	@Test
	@DisplayName("Given 86400 & Expected 24:00:00")
	public void Tests9() {
	    assertEquals("24:00:00", HumanReadableTime.makeReadable(86400), "makeReadable(86400)");
	}
	
	@Test
	@DisplayName("Given 359999 & Expected 99:59:59")
	public void Tests10() {
	    assertEquals("99:59:59", HumanReadableTime.makeReadable(359999), "makeReadable(359999)");
	}
}
