package codewar.com.HighAndLow;

public class HighAndLow {
	public static String highAndLow(String numbers) {
		
		String[] number = numbers.split(" ");
		String[] highAndLow = new String[] {String.valueOf(Integer.MIN_VALUE), String.valueOf(Integer.MAX_VALUE)};
		
		for(int i = 0; i < number.length; i++) {
			highAndLow[0] = String.valueOf(Math.max(Integer.valueOf(highAndLow[0]), Integer.valueOf(number[i])));
			highAndLow[1] = String.valueOf(Math.min(Integer.valueOf(highAndLow[1]), Integer.valueOf(number[i])));
		}
		
		return String.join(" ", highAndLow);
	}
}
