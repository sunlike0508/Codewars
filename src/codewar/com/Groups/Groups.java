package codewar.com.Groups;

public class Groups {
	public static boolean groupCheck(String s) {

		String beforeS = "";

		do {
			beforeS = s;
			s = s.replaceAll("(\\(\\))|(\\{\\})|(\\[\\])", "");
		} while (beforeS.length() > s.length());

		return s.length() == 0;
	}

	public static String getMiddle(String word) {
		int wordLength = word.length();
		int middleLetter = wordLength/2;
		
		if(wordLength % 2 == 0) {
			return word.substring(middleLetter-1 , middleLetter+1);
		}
		
		return word.substring(middleLetter , middleLetter+1);
	}
}
