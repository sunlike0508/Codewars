package codewar.com.PerimeterOfSquaresInRectangle;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class PerimeterOfSquaresInRectangleTest {

	  @Test
	  public void test1() {
	    assertEquals(BigInteger.valueOf(80), PerimeterOfSquaresInRectangle.perimeter(BigInteger.valueOf(5)));
	  }
	  @Test
	  public void test2() {
	    assertEquals(BigInteger.valueOf(216), PerimeterOfSquaresInRectangle.perimeter(BigInteger.valueOf(7)));
	  }
	  @Test
	  public void test3() {
	    assertEquals(BigInteger.valueOf(14098308), PerimeterOfSquaresInRectangle.perimeter(BigInteger.valueOf(30)));
	  }
	  @Test
	  public void test4() {
	    BigInteger r = new BigInteger("6002082144827584333104");
	    assertEquals(r, PerimeterOfSquaresInRectangle.perimeter(BigInteger.valueOf(100)));
	  }
	  @Test
	  public void test5() {
	    BigInteger r = new BigInteger("2362425027542282167538999091770205712168371625660854753765546783141099308400948230006358531927265833165504");
	    assertEquals(r, PerimeterOfSquaresInRectangle.perimeter(BigInteger.valueOf(500)));
	  }

}
