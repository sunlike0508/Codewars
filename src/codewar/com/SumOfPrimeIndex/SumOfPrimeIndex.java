package codewar.com.SumOfPrimeIndex;

public class SumOfPrimeIndex {
	public static int solve(int[] arr) {
		
		int size = arr.length;
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			if(isPrime(i)) {
				sum += arr[i];
			}
		}
		
		return sum;
	}

	private static boolean isPrime(long start) {
		if(start <= 1) {
			return false;
		}
		
		for(int i = 2; i <= (int) Math.sqrt(start); i++) {
			if(start % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
