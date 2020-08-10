package codewar.com.ConvertStringToCamelCase;

public class ConvertStringToCamelCase {
	static String toCamelCase(String s) {
		
		String[] splitString = s.split("[-_]");
		String covertString = splitString[0];
		
		for(int i = 1; i < splitString.length ; i++) {
			String splitWord = splitString[i];
			covertString += splitWord.substring(0, 1).toUpperCase()+splitWord.substring(1);
		}
		
		return covertString;
	}
}
