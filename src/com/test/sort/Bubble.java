package com.test.sort;

public class Bubble {
	public static void main(String[] args) {
		int[] sort = new int[] {29, 10, 14, 37, 13};
		bubbleSort(sort);
		printArray(sort);
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
	
	private static void bubbleSort(int[] sort) {
		
		for(int i = 0; i < sort.length ; i++) {
			for(int j = 0; j < sort.length-i-1; j++) {
				if(sort[j] > sort[j+1]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
	}
}
