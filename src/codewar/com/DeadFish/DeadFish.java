package codewar.com.DeadFish;

public class DeadFish {
    public static int[] parse(String data) {

    	int[] result = new int[data.length() - data.replace("o", "").length()];
    	int sum = 0;
    	
    	for(int i=0, j=0; i < data.length(); i++) {
    		
    		String letter = data.substring(i,i+1);
    		
    		if("i".equals(letter)) {
    			sum++;
    		} else if("d".equals(letter)) {
    			sum--;
    		} else if("s".equals(letter)) {
    			sum *= sum;
    		} else {
    			result[j++] = sum;
    		}
    	}
    	
    	return result;
    }
}
