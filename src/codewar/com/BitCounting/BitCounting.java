package codewar.com.BitCounting;

public class BitCounting {
	public static int countBits(int n){
		int count = 0;
		
		do {
			if(n%2 == 1) {
				count++;
			}
			
			n = n/2;
			
		} while(n > 0);
	
		return count;
	}
}
