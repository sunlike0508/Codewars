package codewar.com.Persist;

public class Persist {
	public static int persistence(long n) {
		int count = 0;
		
		while(n >= 10) {			
			n = multipleDigitNumber(n);
			count++;
		}

		return count;
	}

	public static long multipleDigitNumber(long n) {
		long sum = 1;
		
		while(n > 0) {
			sum = sum * (n%10);
			n = n/10;
		}
		
		return sum;
	}
}

//persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//// and 4 has only one digit
//
//persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
// // 1*2*6 = 12, and finally 1*2 = 2
//
//persistence(4) == 0 // because 4 is already a one-digit number