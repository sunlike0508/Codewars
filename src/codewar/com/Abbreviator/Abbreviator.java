package codewar.com.Abbreviator;

public class Abbreviator {
	public static String abbreviate(String string) {
		
		String[] splitWords = string.split("[^a-zA-Z]");
		
		for(String splitWord : splitWords) {
			if(splitWord.length() > 3) {
				string = string.replaceFirst(splitWord, abbreviatorWord(splitWord));
			}
		}
		
		return string;
	}

	public static String abbreviatorWord(String word) {
		return word.substring(0,1) + (word.length()-2) + word.substring(word.length()-1);
	}
}