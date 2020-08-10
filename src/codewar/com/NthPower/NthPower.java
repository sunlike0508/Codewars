package codewar.com.NthPower;

public class NthPower {
	public static int modifiedSum(int[] array, int power) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i], power) - array[i];
		}
		
		return sum;
	}
}
