package codewar.com.SimpleSum;

public class SimpleSum {
	public static int solve(long n) {
		long a = 0;
		long num = n;    
		
        while (num >= 10) { 
            a = a * 10 + 9;
            num /= 10;
        }  

		return digitSum(a) + digitSum(n - a);
	}
	
	private static int digitSum(long num) {
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		
		return sum;
	}
}
