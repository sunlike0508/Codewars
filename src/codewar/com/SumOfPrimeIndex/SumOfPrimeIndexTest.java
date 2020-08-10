package codewar.com.SumOfPrimeIndex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfPrimeIndexTest {

    @Test
    public void basicTests(){     
        assertEquals(0,SumOfPrimeIndex.solve(new int [] {}));
        assertEquals(7,SumOfPrimeIndex.solve(new int [] {1,2,3,4}));     
        assertEquals(13,SumOfPrimeIndex.solve(new int [] {1,2,3,4,5,6}));
        assertEquals(47,SumOfPrimeIndex.solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }

}
