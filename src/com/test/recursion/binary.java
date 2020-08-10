package com.test.recursion;

public class binary {
	public static void main(String[] argv) {
		printBinary(12);
	}

	private static void printBinary(int i) {
		if(i < 2) {
			System.out.print(i);
			return;
		}
		
		printBinary(i / 2);
		
		System.out.print(i % 2);
	}
	
	int search(int[] data, int n, int target) {
		for(int i = 0; i < n ; i++) {
			if(data[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	int search(int[] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		}
		else if(target == data[begin]) {
			return begin;
		} else {
			return search(data, begin+1, end, target);
		}
	}
}

//12
//6 0
//3 0
//1 1