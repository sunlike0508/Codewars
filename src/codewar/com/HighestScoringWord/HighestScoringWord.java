package codewar.com.HighestScoringWord;

public class HighestScoringWord {
	public static String high(String s) {
		
		String[] splitString = s.split(" ");
		String maxWord = splitString[0];
		
		for(String word : splitString) {
			if(compareWord(word, maxWord)) {
				maxWord = word;
			}
		}
		
		return maxWord;
	}

	private static boolean compareWord(String word, String maxWord) {
		
		if(scoreWord(word) > scoreWord(maxWord)) {
			return true;
		}
		
		return false;
	}

	private static int scoreWord(String word) {
				
		char[] wordchar = word.toCharArray();
		int count = 0;
		
		for(int i=0; i < wordchar.length ; i++) {
			count += wordchar[i] - 96;
		}
		
		return count;
	}
}
