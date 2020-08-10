package codewar.com.DescendingOrder;

import java.util.Arrays;

public class DescendingOrder {
	public static int sortDesc(final int num) {
		int[] numArray = new int[num == 0? 1 :(int) (Math.log10(num)+1)];
		int result = 0;
		int number = num;
		
		for(int i = 0; number > 0; i++) {
			numArray[i] = number % 10;
			number = number / 10;
		}
		
		Arrays.sort(numArray);
		
		for(int i = numArray.length-1; i >=0; i--) {
			result = result * 10;
			result += numArray[i] % 10;
		}
		
		return result;
	}
}
