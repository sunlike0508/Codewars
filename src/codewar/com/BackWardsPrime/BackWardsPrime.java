package codewar.com.BackWardsPrime;

import java.util.*;

public class BackWardsPrime {
	public static String backwardsPrime(long start, long end) {
		
		List<String> list = new ArrayList<String>();

		while(start <= end) {
			
			if(isBacksPrime(start)) {
				list.add(String.valueOf(start));
			}
			
			start++;
		}
		
		return String.join(" ", list);
	}

	private static boolean isBacksPrime(long start) {
		
		if(start < 10 || !isPrime(start)) {
			return false;
		}
		
		long backPrime = backNumber(start);
		
		if(backPrime == start || !isPrime(backPrime)) {
			return false;
		}
		
		return true;
	}

	private static long backNumber(long start) {
		long back = 0;
		
		while(start > 0) {
			back = back * 10 + start % 10;
			start = start / 10;
		}
		
		return back;
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
