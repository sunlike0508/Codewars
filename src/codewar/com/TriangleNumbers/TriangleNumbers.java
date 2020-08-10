package codewar.com.TriangleNumbers;

public class TriangleNumbers {
	public static Boolean isTriangleNumber(long number) {
		
		long num = 1;
		long sum = 0;
		
		while(sum < number) {
			sum = num * (num + 1) / 2;
			
			if(sum == number) {
				return true;
			}
			
			num++;
		}
		
		
		return false;
	}
}
