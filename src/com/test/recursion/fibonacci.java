package com.test.recursion;

public class fibonacci {
	public static void main(String[] argv) {
		System.out.println(fibonacci(5));
	}

	private static int fibonacci(int i) {
		
		if(i <=2) {
			return i;
		}
		
		return fibonacci(i-2) + fibonacci(i-1);
	}
}