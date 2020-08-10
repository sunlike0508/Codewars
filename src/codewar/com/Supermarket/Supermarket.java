package codewar.com.Supermarket;

import java.util.Arrays;

public class Supermarket {
	public static int solveSuperMarketQueue(int[] customers, int n) {
		
		int[] queue = new int[n];
		
		for(int customer : customers) {
			queue[0] += customer;
			Arrays.sort(queue);
		}
		
		return queue[n-1];
	}
}
