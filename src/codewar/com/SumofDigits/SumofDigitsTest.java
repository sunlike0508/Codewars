package codewar.com.SumofDigits;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SumofDigitsTest {

    @Test 
    public void testSomething() {
        assertEquals( "Nope!" , 7, SumofDigits.digital_root(16));
        assertEquals( "Nope!" , 6, SumofDigits.digital_root(195));
        assertEquals( "Nope!" , 2, SumofDigits.digital_root(992));
        assertEquals( "Nope!" , 9, SumofDigits.digital_root(99999999));
        assertEquals( "Nope!" , 9, SumofDigits.digital_root(167346));
        assertEquals( "Nope!" , 1, SumofDigits.digital_root(10));
        assertEquals( "Nope! Should work for 0" , 0, SumofDigits.digital_root(0));
    }

}
