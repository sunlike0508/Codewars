package codewar.com.TheClockwiseSpiral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TheClockwiseSpiralTest {
    @Test
    public void should_test_spiral_1() {
        int[][] expected = new int[][]{
                {1}};
                
        assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(1));
        
    }

    @Test
    public void should_test_spiral_3() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
                
        assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(3));
        
    }
    //[1,2,3,4,5],[16,17,18,19,6],[15,24,25,20,7],[14,23,22,21,8],[13,12,11,10,9]
    @Test
    public void should_test_spiral_5() {
        int[][] expected = new int[][]{
                {1,   2,  3,  4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7}, 
                {14, 23, 22, 21, 8}, 
                {13, 12, 11, 10, 9}};
                
        assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(5));
    }

}
