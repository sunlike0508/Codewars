package com.test.sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] sort = new int[] {29, 10, 14, 37, 13};
		mergeSort(sort, 0, sort.length-1);
		printArray(sort);
	}

	private static void mergeSort(int[] sort, int i, int j) {
		//System.out.println(i + " " + j);
		if(i < j) {
			int r = (i+j) /2;
			mergeSort(sort, i, r);
			mergeSort(sort, r+1, j);
			merge(sort, i, r, j);
			printArray(sort);
		}
		
	}

	private static void merge(int[] sort, int i, int r, int j) {
		
		int[] temp = new int[sort.length];
		
		int x = i, y = r+1, z = i;
		
		while(x <= r && y <= j) {
			if(sort[x] > sort[y]) {
				temp[z++] = sort[y++];
			} else {
				temp[z++] = sort[x++];
			}
		}
		
		while(x <= r) {
			temp[z++] = sort[x++];
		}
		while(y <=j) {
			temp[z++] = sort[y++];
		}
		
		for(int t = i; t <=j; t++) {
			sort[t] = temp[t];
		}
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
}
