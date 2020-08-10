package codewar.com.ValidateCredit;

public class ValidateCredit {
	public static boolean validate(String n) {
		n = new StringBuilder(n).reverse().toString();
		return sumOfN(n) % 10 == 0;
	}

	public static int sumOfN(String n) {
		int sum = 0;
		
		for(int i = 0; i < n.length() ; i++) {
			
			int number = Integer.parseInt(n.substring(i,i+1));
			
			if(i % 2 == 1) {
				sum += even(number);
			} else {
				sum += number;
			}
		}
		
		return sum;
	}

	private static int even(int number) {
		
		int doubleNumber = number * 2;
		
		if(doubleNumber < 10) {
			return doubleNumber;
		}
		
		return sumOfOwn(doubleNumber);
	}

	private static int sumOfOwn(int doubleNumber) {		
		return doubleNumber / 10  + doubleNumber % 10;
	}
}
