package codewar.com.FindTheMissingLetter;

import java.util.Arrays;

public class FindTheMissingLetter {
	public static char findMissingLetter(char[] array) {
		
		char findLetter = ' ';
		
		for(int i = 0 ; i < array.length -1; i++) {
			if((char)(array[i]+1) != array[i+1]) {
				findLetter = (char)(array[i]+1);
				break;
			}
		}
		
		return findLetter;
	}
}
