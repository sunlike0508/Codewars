package codewar.com.Recursion101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Recursion101Test {

    @Test
    public void basicTests(){     
        assertArrayEquals(new int [] {6,7}, Recursion101.solve(6,19));
        assertArrayEquals(new int [] {0,1}, Recursion101.solve(2,1));
        assertArrayEquals(new int [] {0,1}, Recursion101.solve(22,5));
        assertArrayEquals(new int [] {2,2}, Recursion101.solve(2,10));
        assertArrayEquals(new int [] {1019,1442}, Recursion101.solve(8796203,7556));
        assertArrayEquals(new int [] {19394,19394}, Recursion101.solve(19394,19394));    
    }

}
