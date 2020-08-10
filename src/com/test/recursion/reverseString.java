package com.test.recursion;

public class reverseString {
	public static void main(String[] argv) {
		reverseString("recursion");
	}

	private static void reverseString(String string) {
		
		if(string.length() == 0) {
			return;
		}
		
		reverseString(string.substring(1));
		
		System.out.print(string.charAt(0));
	}
}
