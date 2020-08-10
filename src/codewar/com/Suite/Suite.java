package codewar.com.Suite;

public class Suite {
	public static double going(int n) {
		double sum = 1;
		double factorial = 1;
		
		while(n > 1) {
			factorial *= n;
			sum += 1 / factorial;
			n--;
		}

		String num = String.valueOf(sum);
		
		return num.length() > 7 ? Double.valueOf(num.substring(0,8)) : Double.valueOf(num.substring(0,num.length()));
	}
}
