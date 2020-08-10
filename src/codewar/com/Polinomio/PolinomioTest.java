package codewar.com.Polinomio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PolinomioTest {
	
	@Test
	@DisplayName("Given x & Expected 0, 1")
	public void basicTests() {
		assertThat(Polinomio.convertString(new int[] { 0, 1 }), is("x"));
	}
	
	@Test
	@DisplayName("Given -1 & Expected -1, 0")
	public void basicTests1() {
		assertThat(Polinomio.convertString(new int[] { -1, 0 }), is("-1"));
	}
	
	@Test
	@DisplayName("Given null & Expected null")
	public void basicTests2() {
		assertThat(Polinomio.convertString(new int[] {}), is(""));
	}
	
	@Test
	@DisplayName("Given 5x^4-2x^2+x & Expected 0,1,-2,0,5")
	public void basicTests3() {
		assertThat(Polinomio.convertString(new int[] { 0,1,-2,0,5 }), is("5x^4-2x^2+x"));
	}
	
	@Test
	@DisplayName("Given -2x^2+x+1 & Expected 1,1,-2,0,0")
	public void basicTests4() {
		assertThat(Polinomio.convertString(new int[] { 1,1,-2,0,0 }), is("-2x^2+x+1"));
	}
	
	@Test
	@DisplayName("Given 7x^2 & Expected 0,0,7,0,0")
	public void basicTests5() {
		assertThat(Polinomio.convertString(new int[] { 0,0,7,0,0 }), is("7x^2"));
	}
	
	@Test
	@DisplayName("Given 1 & Expected 1,0,0,0,0")
	public void basicTests6() {
		assertThat(Polinomio.convertString(new int[] { 1,0,0,0,0 }), is("1"));
	}
	
	@Test
	@DisplayName("Given x^7+5x^4-x^2+x & Expected 0,1,-1,0,5,0,0,1")
	public void basicTests7() {
		assertThat(Polinomio.convertString(new int[] { 0,1,-1,0,5,0,0,1 }), is("x^7+5x^4-x^2+x"));
	}
	
	@Test
	@DisplayName("Given -2x^2-5 & Expected -5, 0, -2, 0")
	public void basicTests8() {
		assertThat(Polinomio.convertString(new int[] { -5, 0, -2, 0 }), is("-2x^2-5"));
	}
	
	@Test
	@DisplayName("Given -x^2-3 & Expected -3, 0, -1")
	public void basicTests9() {
		assertThat(Polinomio.convertString(new int[] { -3, 0, -1 }), is("-x^2-3"));
	}
}
