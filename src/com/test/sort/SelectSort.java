package com.test.sort;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] sort = new int[] {29, 10, 14, 37, 13};
		selectSort(sort);
		printArray(sort);
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}

	private static void selectSort(int[] sort) {
		
		for(int i = sort.length-1; i >= 0 ; i--) {
			
			for(int j = i-1; j >=0; j--) {
				if(sort[i] < sort[j]) {
					
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}
	}
}
