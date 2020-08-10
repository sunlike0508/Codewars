package codewar.com.EncryptThis;

public class Kata {
    public static String encryptThis(String text) {
    	
    	if("".equals(text)) {
    		return "";
    	}
    	
    	String[] textSplit = text.split(" ");
    	
    	for(int i = 0; i < textSplit.length; i++) {
    		textSplit[i] = String.valueOf((int)textSplit[i].charAt(0))+ switchChar(textSplit[i].substring(1));
    	}
    	
    	return String.join(" " , textSplit);
    }

	private static String switchChar(String string) {
		
		if(string.length() == 0) {
			return "";
		} else if(string.length() == 1) {
			return string;
		} else if(string.length() == 2) {
			return string.substring(string.length()-1) + string.substring(0,1);
		} else {
			return string.substring(string.length()-1) + string.substring(1,string.length()-1) + string.substring(0,1);
		}
	}
}
