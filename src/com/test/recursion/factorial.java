package com.test.recursion;

public class factorial {

	public static void main(String[] argv) {
		System.out.println(factorial(0));
	}

	private static int factorial(int i) {
		
		if(i <= 1) {
			return 1;
		}

		return i+ factorial(i-1); //recursion case
	}
}
