package codewar.com.RevRot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevRotTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");   
        testing(RevRot.revRot("123456987654", 6), "234561876549");
        testing(RevRot.revRot("123456987653", 6), "234561356789");
        testing(RevRot.revRot("66443875", 4), "44668753");
        testing(RevRot.revRot("66443875", 8), "64438756");
        testing(RevRot.revRot("664438769", 8), "67834466");
        testing(RevRot.revRot("123456779", 8), "23456771");
        testing(RevRot.revRot("", 0), "");
        testing(RevRot.revRot("1234", 5), "");
        testing(RevRot.revRot("733049910872815764", 5), "330479108928157");
    }
//733049910872815764
//330479108928157
//330479108728157649
}
