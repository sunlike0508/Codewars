package codewar.com.CountingDuplicates;

import java.util.Arrays;

public class CountingDuplicates {
//	public static int duplicateCount(String text) {
//		char[] letters = text.toLowerCase().toCharArray();
//		Arrays.sort(letters);
//
//		int letterCount = 0;
//		int duplicateCount = 0;
//		
//		for(int i = 1; i < letters.length; i++) {
//			if(letters[i-1] == letters[i]) {
//				letterCount++;
//				
//				if(letterCount == 1) {
//					duplicateCount++;
//				}
//			} else {
//				letterCount = 0;
//			}
//		}
//		
//		return duplicateCount;
//	}
	
	public static int duplicateCount(String text) {

		int duplicateCount = 0;
		
		text = text.toUpperCase();
		
		while(text.length() > 0) {
			
			String firstLetter = text.substring(0,1);
			text = text.substring(1);
			
			if(text.contains(firstLetter)) {
				duplicateCount++;
			}
			
			text = text.replace(firstLetter, "");
		}
		
		return duplicateCount;
	}
}
