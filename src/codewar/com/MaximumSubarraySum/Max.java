package codewar.com.MaximumSubarraySum;

public class Max {
//	public static int sequence(int[] arr) {
//		
//		int max = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < arr.length-i; j++) {
//				int sum = 0;
//				
//				for(int x = j; x < j+i+1; x++) {
//					sum+=arr[x];
//				}
//				
//				if(max < sum) {
//					max = sum;
//				}
//			}
//		}
//		
//		return max;
//	}
//-2, 1, -3, 4, -1, 2, 1, -5, 4
	public static int sequence(int[] arr) {
		int cur = 0, max = 0;
		
		for (int i : arr) {
			System.out.println("i : " + i + " " + (cur+i));
			
			cur = Math.max(0, cur + i);
			max = Math.max(max, cur);
			
			System.out.println("cur : " + cur);
			System.out.println("max : " + max);
			System.out.println();
		}
		
		return max;
	}
}
