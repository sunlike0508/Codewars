package codewar.com.NumberofTrailingZerosofFactorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class NumberofTrailingZerosofFactorialTest {

	@Test
	void test() {
	    assertThat(NumberofTrailingZerosofFactorial.zeros(0), is(0)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(6), is(1)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(14), is(2)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(30), is(7)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(100), is(24)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(1000), is(249)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(100000), is(24999)); 
	    assertThat(NumberofTrailingZerosofFactorial.zeros(1000000000), is(249999998)); 
	}
}