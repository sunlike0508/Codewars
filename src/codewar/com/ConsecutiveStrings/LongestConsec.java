package codewar.com.ConsecutiveStrings;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        
    	String consec = "";
    	
    	for(int i = 0 ; i < strarr.length - k + 1; i++) {
    		String tempConsec = "";
    		
    		for(int j = i; j < i+k; j++) {
    			tempConsec += strarr[j];
    		}
    		
			if(consec.length() < tempConsec.length()) {
				consec = tempConsec;
			}
    	}
    	
    	return consec;
    }
}
