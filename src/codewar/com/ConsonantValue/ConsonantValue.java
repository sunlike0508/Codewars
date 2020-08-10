package codewar.com.ConsonantValue;

public class ConsonantValue {
    public static int solve(final String s) {
    	
    	String[] sSplit = s.split("[aeiou]{1,}");
    	
    	int maxValue = 0;
    	
    	for(String word : sSplit) {
    		int subString = calculateValue(word);
    		
    		if(maxValue < subString) {
    			maxValue = subString;
    		}
    	}
    	
        return maxValue;
    }

	private static int calculateValue(String word) {
		int sum = 0;
		
		for(int i = 0; i < word.length(); i++) {
			sum += word.charAt(i) - 96;
		}
		
		return sum;
	}
}
