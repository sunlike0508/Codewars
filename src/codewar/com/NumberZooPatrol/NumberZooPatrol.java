package codewar.com.NumberZooPatrol;

public class NumberZooPatrol {
	public static int findMissingNumber(int[] numbers) {
		
		long n = numbers.length + 1;
		long sum = n * (n + 1) / 2;
		
		long missNum = 0;
		
		for(int num : numbers) {
			missNum += num;
		}
		
		return (int)(sum - missNum);
	}
}
