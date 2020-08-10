package codewar.com.HalvingSum;

public class HalvingSum {
	int halvingSum(int n) {
		
		int sum = 0;
		
		for(int i = 0; n / (int)Math.pow(2, i) >= 1; i++) {
			sum += n / (int)Math.pow(2, i);
		}
		
		return sum;
	}
}
