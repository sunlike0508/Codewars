package codewar.com.TribonacciSequence;

import java.util.Arrays;

public class Xbonacci {
	
	public static double[] tribonacci(double[] s, int n) {

		double[] tribonacci = Arrays.copyOf(s, n);
		
		for(int i = 3; i < n ; i++) {
			
			tribonacci[i] = tribonacci[i-3] + tribonacci[i-2] + tribonacci[i-1];
		}

		return tribonacci;
	}
}
