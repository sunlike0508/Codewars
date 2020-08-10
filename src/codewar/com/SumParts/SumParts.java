package codewar.com.SumParts;

public class SumParts {
	public static int[] sumParts(int[] ls) {
		
		int[] result = new int[ls.length+1];
		//int sum = 0;
		
		for(int i = ls.length-1 ; i >= 0; i--) {
			//result[i] = sum + ls[i];
			//sum = sum + ls[i];
			result[i] = result[i+1] + ls[i];
		}
		
		return result;
	}
}
