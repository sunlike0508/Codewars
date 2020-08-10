package codewar.com.EqualSidesOfAnArray;

import java.util.Arrays;

public class EqualSidesOfAnArray {
	public static int findEvenIndex(int[] arr) {
		
		int leftSum = 0;
		int rightSum = Arrays.stream(arr).sum()-arr[0];
		
		if(leftSum == rightSum) {
			return 0;
		}
		
		for(int i = 1; i < arr.length; i++) {
			leftSum = leftSum + arr[i-1];
			rightSum = rightSum - arr[i];
						
			if(leftSum == rightSum) {
				return i;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		return -1;
	}
}
