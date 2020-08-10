package codewar.com.Isograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IsogramsTest {

	@Test
	@DisplayName("Given Dermatoglyphics Expected True")
    public void FixedTests1() {
        assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
    }
	
	@Test
	@DisplayName("Given isogram Expected True")
    public void FixedTests2() {
        assertEquals(true, Isograms.isIsogram("isogram"));
    }
	
	@Test
	@DisplayName("Given moose Expected False")
    public void FixedTests3() {
        assertEquals(false, Isograms.isIsogram("moose"));
    }
	
	@Test
	@DisplayName("Given isIsogram Expected False")
    public void FixedTests4() {
        assertEquals(false, Isograms.isIsogram("isIsogram"));
    }
	
	@Test
	@DisplayName("Given aba Expected False")
    public void FixedTests5() {
        assertEquals(false, Isograms.isIsogram("aba"));
    }
	
	@Test
	@DisplayName("Given moOse Expected False")
    public void FixedTests6() {
        assertEquals(false, Isograms.isIsogram("moOse"));
    }
	
	@Test
	@DisplayName("Given thumbscrewjapingly Expected true")
    public void FixedTests7() {
        assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
    }
	
	@Test
	@DisplayName("Given null Expected true")
    public void FixedTests8() {
        assertEquals(true, Isograms.isIsogram("")); 
    }

}
