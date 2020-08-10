package codewar.com.AreTheyTheSame;

import java.util.Arrays;

public class AreSame {
	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null || a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			boolean check = false;

			for (int j = 0; j < b.length; j++) {
				if (a[i] * a[i] == b[j]) {
					check = true;
					b[j] = Integer.MIN_VALUE;
					break;
				}
			}

			if (!check) {
				return false;
			}
		}

		return true;
	}

	/* other solution
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length)
			return false;

		final int l = a.length;
		if (a.length == 0)
			return true;

		for (int i = 0; i < l; i++)
			a[i] = a[i] * a[i];

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b))
			return true;
		return false;
	}
	*/
}
