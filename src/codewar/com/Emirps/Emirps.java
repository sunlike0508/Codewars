package codewar.com.Emirps;

public class Emirps {
	public static long[] findEmirp(long n) {
		
		long[] emiprs = new long[] {0, 0, 0};
		
		for(long number = 13; number <= n; number++ ) {
			
			if(isPrime(number)) {
				long reverseNumber = reverseNumber(number);
				
				if(isPrime(reverseNumber) && (reverseNumber != number)) {
					
					emiprs[0]++;
					emiprs[1] = Math.max(emiprs[1], number);
					emiprs[2] += number;
				}
			}
		}
		
		return emiprs;
	}

	private static long reverseNumber(long number) {
		long reverse = 0;
		
		while(number > 0) {
			
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		
		return reverse;
	}

	private static boolean isPrime(long number) {
		
		for(int i = 2; i <= (int) Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
