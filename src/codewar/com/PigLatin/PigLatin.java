package codewar.com.PigLatin;

import java.util.regex.Pattern;

public class PigLatin {
	
    public static String pigIt(String str) {
    	String[] split = str.split(" ");
    	
    	for(int i = 0; i < split.length; i++) {
    		split[i] = convertWord(split[i]);
    	}

    	return String.join(" " , split);
    }

	private static String convertWord(String string) {
		if(!Pattern.matches("^[a-zA-Z]*$", string)) {
			return string;
		}
		
		if(string.length() == 1) {
			return string + "ay";
		} 
		
		return string.substring(1) + string.substring(0,1) + "ay";
	}
}
