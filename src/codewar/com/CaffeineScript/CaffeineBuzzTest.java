package codewar.com.CaffeineScript;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaffeineBuzzTest {

    @Test
    public void test_Given_one() {
        assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
    }
    
    @Test
    public void test_Given_Two() {
        assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
    }
    
    @Test
    public void test_Given_Three() {
        assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
    }
    
    @Test
    public void test_Given_Twelve() {
        assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
    }
}
