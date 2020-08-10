package com.test.FiveChar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FiveCharTest {

    @Test
    public void basicTests() {
      assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(FiveChar.averages(new int[] { 2, 2, 2, 2, 2 })));
      assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(FiveChar.averages(new int[] { 2, -2, 2, -2, 2 })));
      assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(FiveChar.averages(new int[] { 1, 3, 5, 1, -10 })));    
    }

}
