package codewar.com.PerimeterOfSquaresInRectangle;

import java.math.BigInteger;

public class PerimeterOfSquaresInRectangle {
	public static BigInteger perimeter(BigInteger n) {
		
		BigInteger first = BigInteger.ONE;
		BigInteger second = BigInteger.ONE;
		BigInteger sum = first.add(second);
		
		for(BigInteger i = BigInteger.ONE; n.compareTo(i) == 1; i=i.add(BigInteger.ONE)) {
			BigInteger temp = first;
			first = second;
			second = temp.add(second);
			sum = sum.add(second);
		}
		
		return sum.multiply(BigInteger.valueOf(4));
	}
}
