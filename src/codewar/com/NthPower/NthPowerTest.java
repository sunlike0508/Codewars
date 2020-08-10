package codewar.com.NthPower;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NthPowerTest {

    @Test
    public void basicTests() {
        assertEquals(30, NthPower.modifiedSum(new int[] {1,2,3}, 3)); 
        assertEquals(30, NthPower.modifiedSum(new int[] {1,2}, 5));
    }

}
