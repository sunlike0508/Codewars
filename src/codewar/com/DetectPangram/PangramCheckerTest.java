package codewar.com.DetectPangram;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class PangramCheckerTest extends TestCase{

    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
    
    @Test
    public void test3() {
      String pangram3 = "Cwm fjord bank glyphs vext quiz";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram3));
    }

}
