package codewar.com.HalvingSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HalvingSumTest {

    @Test
    @DisplayName("Given 25 Expected 47")
    public void test1() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
    }
    
    @Test
    @DisplayName("Given 127 Expected 247")
    public void test2() {
        HalvingSum hs = new HalvingSum();
        assertEquals(247,hs.halvingSum(127));
    }


}
