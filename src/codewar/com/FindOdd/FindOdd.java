package codewar.com.FindOdd;

import java.util.Arrays;

public class FindOdd {
	public static int findIt(int[] a) {
		
		int odd = 0;
//		Arrays.sort(a);
//		
//		for(int i = 0; i < a.length; ) {
//			odd = a[i];
//			int time = 0;
//			
//			for(int j = i ; a[j] == odd; i = j) {
//				time++;
//				
//				if(++j == a.length) {
//					break;
//				}
//			}
//			
//			if(time % 2 != 0) {
//				break;
//			}			
//		}
		
		for(int i : a) {
			
			odd ^=i;
		}
		
		
	  	return odd;
	}
}