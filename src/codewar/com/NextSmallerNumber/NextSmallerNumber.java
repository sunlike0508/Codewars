package codewar.com.NextSmallerNumber;

import java.util.Arrays;

public class NextSmallerNumber {
	public static long nextSmaller(long n) {
		char[] s = String.valueOf(n).toCharArray();
		
		for (int i = s.length - 2; i >= 0; i--) {
			for (int j = s.length - 1; j > i; j--) {
				
				if (s[i] > s[j]) {
					swap(s, i, j);
					char[] copy = Arrays.copyOfRange(s, i + 1, s.length);
					
					Arrays.sort(copy);
					reverse(copy);
					
					System.arraycopy(copy, 0, s, i+1, copy.length);
					
					long result = Long.valueOf(String.valueOf(s));
					
					if((int)Math.log10(result) == (int)Math.log10(n)) {
						return result;
					}
					
					return -1;
				}
			}
		}
		
		return -1;
	}

	static void swap(char[] a, int idx1, int idx2) {
		char t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(char[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 -i);
		}
	}

}
