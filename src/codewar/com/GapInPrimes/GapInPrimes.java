package codewar.com.GapInPrimes;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        long beforePrime = Long.MIN_VALUE;
        
        for(long i = m ; i <= n ; i++) {        	
        	if(findPrimeNumber(i)) {
        		if(i - beforePrime == g) {
                	return new long[] {beforePrime, i};
        		}
        		
        		beforePrime = i;
        	}
        }
        
        return null;
    }

    public static boolean findPrimeNumber(long i) {
    	
    	for(int j = 2 ; j < i/2 ; j++) {
    		if(i%j == 0) {
    			return false;
    		}
    	}

		return true;
	}
}
