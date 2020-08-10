package codewar.com.SumSquaredDivisors;

import java.util.*;

public class SumSquaredDivisors {
	
	public static String listSquared(long m, long n) {
		List<String> listSquared = new ArrayList<String>();
		
		for(long i = m ; i <= n ; i++) {
			findListSquared(i, listSquared);
		}
		
		return "[" + String.join(", ", listSquared) + "]";
	}

	public static void findListSquared(long m, List<String> listSquared) {
		long sumOfDivisorsSquared = sumOfDivisorsSquared(m);
		
		if(sumOfDivisorsSquared == longTypeSqrtMultiple(sumOfDivisorsSquared)) {
			listSquared.add("[" + m + ", " + (long)sumOfDivisorsSquared + "]");
		}
	}

	public static long longTypeSqrtMultiple(long sumOfDivisorsSquared) {
		return longTypeSqrt(sumOfDivisorsSquared) * longTypeSqrt(sumOfDivisorsSquared);
	}

	public static long longTypeSqrt(long sumOfDivisorsSquared) {
		return (long)Math.sqrt(sumOfDivisorsSquared);
	}

	public static long sumOfDivisorsSquared(long m) {
		long sum = 0;
		
		for(long i = 1 ; i <= m; i++) {
			if(m%i == 0) {
				sum += Math.pow(i, 2);
			}
		}
		
		return sum;
	}
}
