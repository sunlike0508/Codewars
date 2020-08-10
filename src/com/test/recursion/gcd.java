package com.test.recursion;

public class gcd {
	public static void main(String[] argv) {
		System.out.println(gcd(12, 18));
	}

	private static int gcd(int i, int j) {
		
		if(j == 0) {
			return i;
		}
		
		return gcd(j, i % j); // recursion case
	}
}
