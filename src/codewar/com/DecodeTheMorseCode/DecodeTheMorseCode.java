package codewar.com.DecodeTheMorseCode;

import java.util.HashMap;

public class DecodeTheMorseCode {
	
	HashMap<String,String> morsdeCodeHashMap = new HashMap<String,String>();
	
	public DecodeTheMorseCode() {
    	String mosString[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ""};
    	String alpabatString[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
    	
    	for(int i=0; i < mosString.length ; i++) {
    		morsdeCodeHashMap.put(mosString[i], alpabatString[i]);
    	}
	}
	
    public String decode(String morseCode) {
 
    	String decodeMorseCode = "";
    	
    	String[] splitMorseCodeArrays = morseCode.trim().split(" ");

    	for(int i = 0; i < splitMorseCodeArrays.length; i++) {
    		String splitMorseCode = splitMorseCodeArrays[i];
    		
    		if(splitMorseCode.length() == 0) {
    			i++;
    		}
    		
    		decodeMorseCode += morsdeCodeHashMap.get(splitMorseCode);
    	}
    	
    	return decodeMorseCode;
    }
}
