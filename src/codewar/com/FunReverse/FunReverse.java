package codewar.com.FunReverse;

public class FunReverse {
    public static String funReverse(String s) {
        
    	for(int i = 0; i < s.length(); i+=2) {
    		s = s.substring(0, i) + s.substring(s.length() -1) + s.substring(i, s.length() - 1);
    	}
    	
    	return s;
    }
    
//	char[] frontString = s.substring(0, s.length() / 2).toCharArray();
//	char[] beforeString = new StringBuilder(s.substring(s.length() / 2, s.length())).reverse().toString().toCharArray();
//	String funReverse = "";
//	
//	for(int i = 0; i < beforeString.length; i++) {
//		funReverse += beforeString[i];
//		funReverse += i < frontString.length ? frontString[i] : "";
//	}
}
