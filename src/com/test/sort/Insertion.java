package com.test.sort;

public class Insertion {
	public static void main(String[] args) {
		int[] sort = new int[] {29, 10, 14, 37, 13};
		insertSort(sort);
		printArray(sort);
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
	
	private static void insertSort(int[] sort) {
		for(int i = 1; i < sort.length; i++) {
			int key = sort[i];
			int j = 0;
			
			for(j = i-1; j >= 0 && key < sort[j]; j--) {
				sort[j+1] = sort[j];
			}
			
			sort[j+1] = key;
		}
	}
}
