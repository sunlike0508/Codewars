package com.test.recursion;

public class powerset {
	
	static String[] set = new String[] {"a", "b", "c"};
	static int n = set.length;
	static boolean[] include = new boolean[n];

	private static void powerSet (int k) {
		if(k == n) {
			for(int i = 0; i < n; i++) {
				if(include[i]) {
					System.out.print(set[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		
		include[k] = false;
		powerSet(k+1);
		include[k] = true;
		powerSet(k+1);
	}
	
	public static void main(String[] args) {
		powerSet(0);
	}
}
