package codewar.com.SquareDigit;

public class SquareDigit {
	public int squareDigits(int n) {
		
		System.out.println(n);
		
		String[] digit = String.valueOf(n).split("");
		
		for(int i = 0; i < digit.length; i++) {
			digit[i] = squareNumber(digit[i]);
		}
		
		String number = String.join("", digit);
		
		return Integer.valueOf(number);
	}

	private String squareNumber(String digit) {
		return String.valueOf(Integer.valueOf(digit) * Integer.valueOf(digit));
	}
}
