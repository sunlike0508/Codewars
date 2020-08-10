package codewar.com.SumDigPower;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        
    	List<Long> sumDigPow = new ArrayList<Long>();
    	
    	while(a <= b) {
    		
    		if(checkSumDigPow(a)) {
    			sumDigPow.add(a);
    		}
    		
    		a++;
    	}
    	
    	return sumDigPow;
    }

	private static boolean checkSumDigPow(long a) {
		long temp = a;
		long sum = 0;
		long pow = (long) (Math.log10(a) + 1);
		
		while(temp > 0) {
			long rest = temp % 10;
			temp = temp /10;
			
			sum+=(long) Math.pow(rest, pow);
			
			pow--;
		}
		
		return a == sum ? true : false;
	}
}
