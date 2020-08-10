package codewar.com.BuddyPairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuddyPairs {
	public static String buddy(long start, long limit) {
		
		while(start <= limit) {
			long relimit = divisorsSum(start);
			
			if(start == divisorsSum(relimit - 1) - 1 && start < relimit) {
				return "(" + start + " " + (relimit - 1) + ")";
			}
			
			System.out.println(start);
			start++;
		}
		
		return "Nothing";
	}

	private static long divisorsSum(long start) {
		int sum = 0;
		
		Map<Integer, Integer> divisorMap = getDivisor(start);
		
		return sum;
	}

	private static Map<Integer, Integer> getDivisor(long start) {
		Map<Integer, Integer> divisorMap = new HashMap<Integer, Integer>();
		
		for(int i = 1; i <= Math.sqrt(start); i++) {
			
			if(start % i == 0) {
				divisorMap.put(i, divisorMap.getOrDefault(i,  0) + 1);
				i--;
			}
		}
		
		return divisorMap;
	}
}
