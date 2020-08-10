package com.test.sort;

public class RadixSort {
	public static void main(String[] args) {
		int[] array=  { 142, 243, 21, 13, 11,7, 86 };
		int[] sort = radixSort(array);

		System.out.print("최종정렬 : ");
		printArray(sort);
	}
	
	private static int[] radixSort(int[] arr) {
		
		int max = getMax(arr); // arr의 최대값을 구한다.
		
		//최대값의 자리수 만큼 반복 수도 코드에서 D라고 보면 된다.
		for(int i = 0; i < (int)Math.log10(max) + 1; i++) {
			arr = linerSort(arr, (int)(Math.pow(10, i)));
			//각 자릿수 기준으로 정렬(계수정렬)
			System.out.print((int)Math.pow(10, i) + "자리로 정렬 : ");
			printArray(arr);
		}
		
		return arr;
	}
	
	static int getMax(int[] data) {
		int mx = data[0];
		for(int i=1; i<data.length; i++) {
			if(data[i] > mx) {
				mx = data[i];
			}
		}
		return mx;
	}
	
	private static int[] linerSort(int[] arr, int k) {
		//k는 arr 데이터들 중 최대값의 자릿수이다.
		int[] sort = new int[arr.length];
		// 어떤 자리수이든 0~9까지 밖에 없으니 누적 가운트 배열 크기는 10이다.
		int[] count = new int[10];
		
		// arr의 수들에 대해서 K의 자리수를 counting 한다.
		for(int i = 0; i < sort.length; i++) {
			count[(arr[i]/k)%10]++;
			/* K가 10일 경우(즉, 10의 자리를 가지고 비교할 경우)
			 * 예로 123일 때 2를 뽑아 내야한다. 따라서 arr[i]를 10으로 나누고
			 * %10을 하면 2가 나온다.
			 */
		}
		
		// 카운팅한 배열 count를 누적 카운트로 바꾼다.
		for(int i = 1; i < count.length; i++) {
			count[i] = count[i-1] + count[i];
		}
		
		// arr을 순환하며 누적 카운트를 이용하여 각 자리수별 기준으로 sort 배열에 정렬한다.
		for(int i = arr.length-1; i >=0 ; i--) {
			sort[count[(arr[i]/k)%10]-1] = arr[i];
			count[(arr[i]/k)%10]--;
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
