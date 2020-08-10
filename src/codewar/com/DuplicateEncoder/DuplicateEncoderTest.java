package codewar.com.DuplicateEncoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DuplicateEncoderTest {
	
	 
	@Test
	@DisplayName("Test encode when input \"Prespecialized\" then result is \")()())()(()()(\"")
    public void test_encode_01() {
      assertEquals(")()())()(()()(",DuplicateEncoder.encode("Prespecialized"));
    }
	
	@Test
	@DisplayName("Test encode when input \"   ()(   \" then result is \"))))())))\"")
    public void test_encode_02() {
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
	
	@Test
	@DisplayName("Test encode when input \"(( @\" then result is \"))((\"")
    public void test_encode_03() {
      assertEquals("))((",DuplicateEncoder.encode("(( @"));
    }

}
