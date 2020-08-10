package codewar.com.SumofDigits;

public class SumofDigits {

	public static int digital_root(int n) {
		
		int sum = 0;
		
		do {
			
			sum += n%10;
			n = n/10;
			
			if(n < 10) {
				sum += n;
				n = sum;
				sum = 0;
			}
			
		} while(n >= 10);
		
		return n;
		
	}
}