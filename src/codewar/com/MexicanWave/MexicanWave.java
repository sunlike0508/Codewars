package codewar.com.MexicanWave;

public class MexicanWave {
	public static String[] wave(String str) {
		
		String[] returnWave = new String[str.replace(" ", "").length()];
		
		for(int i = 0, j = 0; i < str.length(); i++) {
			String letter = str.substring(i, i+1);
			
			if(letter.matches("[a-zA-Z]")) {
				returnWave[j++] = str.substring(0, i) + letter.toUpperCase() + str.substring(i+1);
			}
		}	
		
		return returnWave;
	}
}
