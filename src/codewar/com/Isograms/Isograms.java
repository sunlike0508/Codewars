package codewar.com.Isograms;

import java.util.HashSet;
import java.util.Set;

public class Isograms {
	public static boolean isIsogram(String str) {
		
		Set<Character> set = new HashSet<Character>();
		
		char[] array = str.toUpperCase().toCharArray();
		
		for(char letter : array) {
			if(set.contains(letter)) {
				return false;
			}
			
			set.add(letter);
		}
		
		return true;
	}
}
