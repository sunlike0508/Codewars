package codewar.com.Recursion101;

public class Recursion101 {
	public static int[] solve(int a, int b) {
		
		if(a == 0 || b == 0) {
			return new int[] {a, b};
		} else if( a >= 2 * b ) {
			a = a - 2 * b;
			return solve(a, b);
		} else if (b >= 2 * a) {
			b = b - 2 * a;
			return solve(a, b);
		} else {
			return new int[] {a, b};
		}
	}
}
