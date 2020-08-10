package codewar.com.PlayingWithDigits;

public class DigPow {
	public static long digPow(int n, int p) {
		
		int copyN = n;
		long sum = 0;
		
		for(int i = (int)(Math.log10(n))+p; i > 0 ; i--) {
			sum += Math.pow(n % 10, i);
			n = n / 10;
		}
		
		if(sum % copyN == 0) {
			return sum/copyN;
		}
		
		return -1;
	}
}
