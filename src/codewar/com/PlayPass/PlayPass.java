package codewar.com.PlayPass;
public class PlayPass {
	public static String playPass(String s, int n) {
		
		char[] sArray = s.toCharArray();
		String allLetter = "[a-zA-Z]";
		String lowerLetter = "[a-z]";
		String upperLetter = "[a-z]";
		String numberRegex = "[0-9]";
		
		for(int i = 0; i < sArray.length; i++) {
			String letter = s.substring(i, i+1);
			
			if(letter.matches(lowerLetter)) {
				sArray[i] = (char) ('a' + (sArray[i] - 'a' + n) % 26);
			}
			
			if(letter.matches(upperLetter)) {
				sArray[i] = (char) ('A' + (sArray[i] - 'A' + n) % 26);
			}
			
			if(letter.matches(numberRegex)) {
				sArray[i] = (char) ('9' - sArray[i] + '0');
			}
			
			if(i % 2 == 1 && letter.matches(allLetter)) {
				sArray[i] = String.valueOf(sArray[i]).toLowerCase().charAt(0);
			}
		}
		
		return new StringBuilder(String.valueOf(sArray)).reverse().toString();
	}
}
