package codewar.com.NumberofTrailingZerosofFactorial;

public class NumberofTrailingZerosofFactorial {
	public static int zeros(int n) {
		
		int zeroSum = 0;
		
		while(n/5 > 0) {
			
			zeroSum += n/5;
			
			n = n/5;
		}
		
		return zeroSum;
	}
}