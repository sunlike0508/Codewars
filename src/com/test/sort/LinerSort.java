package com.test.sort;

public class LinerSort {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 5, 3, 0, 2, 3, 0, 3, 4};
		int[] sort = linerSort(arr, 5);

		printArray(sort);
	}
	
	private static int[] linerSort(int[] arr, int k) {
		//k는 arr 데이터들의 값들이 0부터 K까지 들어온다는 것을 알고 있다는 가정이다.
		int[] sort = new int[arr.length];
		int[] count = new int[k+1];
		
		// arr의 각 데이터들이 몇 개 들어 왔는지 counting 한다.
		for(int i = 0; i < sort.length; i++) {
			count[arr[i]]++;
		}
		
		// 카운팅한 배열 count를 누적 카운트로 바꾼다.
		for(int i = 1; i < count.length; i++) {
			count[i] = count[i-1] + count[i];
		}
		
		// arr을 순환하며 누적 카운트를 이용하여 sort 배열에 정렬한다.
		for(int i = arr.length-1; i >= 0; i--) {
			//배열은 0부터 시작하므로 count의 값에 -1을 해준다.
			sort[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		return sort;
	}

	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
}
