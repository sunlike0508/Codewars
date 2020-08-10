package com.test.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] sort = new int[] {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};
		quickSort(sort, 0, sort.length-1);
		printArray(sort);
	}
	
	private static void quickSort(int[] sort, int p, int r) {
		if(p < r) {
			int k = partition(sort, p, r); // pivot값을 기준으로
			quickSort(sort, p, k-1); // 왼쪽 배열을 보내기
			quickSort(sort, k+1, r); // 오른쪽 배열을 보내기
		}
	}

	private static int partition(int[] sort, int p, int r) {

		int i = p;
		
		for(int j = p; j < r; j++) {
			if(sort[r] > sort[j]) { // pivot과 비교하며 작은 수들은 왼쪽으로 몰기
				int temp = sort[i];
				sort[i] = sort[j];
				sort[j] = temp;
				i++; // sort[r], 즉, pivot 값이 들어갈 위치
			}
		}
		
		int temp = sort[i];
		sort[i] = sort[r];
		sort[r] = temp;
		
		printArray(sort);
		
		return i; // pivot값의 위치를 반환
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
}
