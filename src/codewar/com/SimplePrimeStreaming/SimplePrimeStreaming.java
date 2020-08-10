package codewar.com.SimplePrimeStreaming;

public class SimplePrimeStreaming {
    public static String solve(int a, int b) {    	
        return makePrimeStr(a + b).substring(a, a+b);
    }

	private static String makePrimeStr(int count) {
		
		String result = "";
		
		for(int i = 2; result.length() <= count; i++) {
			if(isPrime(i)) {
				result += i;
			}
		}
		
		return result;
	}
	
	private static boolean isPrime(long start) {

		for(int i = 2; i <= (int) Math.sqrt(start); i++) {
			if(start % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
