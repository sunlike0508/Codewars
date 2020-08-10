package codewar.com.Xbonacci;

import java.util.Arrays;

public class Xbonacci {
	public double[] xbonacci(double[] signature, int n) {

		double[] xbonacciArray = Arrays.copyOf(signature, n);
		
		int count = signature.length;
		
		for(int i = count; i < n ; i++) {
			xbonacciArray[i] = calculateXbonacci(i, xbonacciArray, count);
		}
		
		return xbonacciArray;
	}

	private double calculateXbonacci(int i, double[] xbonacciArray, int count) {
		double sum = 0;
		
		for(int j = i-count; j < i; j++) {
			sum+=xbonacciArray[j];
		}
		
		return sum;
	}
}
