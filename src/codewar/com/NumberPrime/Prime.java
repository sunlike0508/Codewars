package codewar.com.NumberPrime;

public class Prime {
	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		
		for(int i = 2; i <= (int) Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
