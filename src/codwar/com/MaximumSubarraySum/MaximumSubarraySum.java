package codwar.com.MaximumSubarraySum;

public class MaximumSubarraySum {
	public static int sequence(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		if(arr.length == 1) {
			return arr[0];
		}
		
		int max = 0;
		int k = arr[0];
		
		for(int i = 0; i < arr.length -1; i++) {
			k = k + arr[i+1];
					
			if(k < arr[i+1]) {
				k = arr[i+1];
			}
			
			if(max < k) {
				max = k;
			}
		}
		
		return max;
	}
}
