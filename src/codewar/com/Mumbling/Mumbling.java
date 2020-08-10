package codewar.com.Mumbling;

public class Mumbling {
	public static String accum(String s) {
		String[] split = s.toUpperCase().split("");
		
		for(int i = 0; i < split.length; i++) {
			split[i] = mumbling(split[i], i);
		}
		
		return String.join("-", split);
	}

	private static String mumbling(String string, int i) {
		
		String result = string;
		
		for(int j = 0; j < i; j++) {
			result += string.toLowerCase();
		}
		
		return result;
	}
}
