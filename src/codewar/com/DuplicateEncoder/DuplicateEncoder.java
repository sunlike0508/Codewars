package codewar.com.DuplicateEncoder;

public class DuplicateEncoder {
	static String encode(String word) {
		
		String replaceWord = "";
		
		word = word.toUpperCase();
		
		for(int i = 0 ; i < word.length(); i++) {
			String letter = word.substring(i, i+1);
						
			if(word.lastIndexOf(letter) == word.indexOf(letter)){
				replaceWord +="(";
			} else {
				replaceWord += ")";
			}
		}
		
		return replaceWord;
	}
}
