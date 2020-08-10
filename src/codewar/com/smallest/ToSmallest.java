package codewar.com.smallest;

public class ToSmallest {
    public static long[] smallest(long n) {
    	long[] numArray = convertArray(n);
    	long smallNum = n;
    	long smallIndex = 0;
    	long bigIndex = 0;
    	
    	for(int i = 0; i < numArray.length; i++) {    		
    		for(int j = i + 1; j < numArray.length; j++) {
    			long[] tempArray = numArray;
    			long tempNum = tempArray[i];
    			tempArray[i] = tempArray[j];
    			tempArray[j] = tempNum;
    			
    			long converNum = convertNum(tempArray);
    			
    			if(smallNum > converNum) {
    				smallNum = converNum;
    				
    				if(tempArray[i] > tempArray[j]) {
    					smallIndex = i;
    					bigIndex = j;
    				} else {
    					smallIndex = j;
    					bigIndex = i;
    				}
    			}
    		}
    	}
    	
    	return new long[] {smallNum, bigIndex, smallIndex };
    }

	private static long[] convertArray(long n) {
		long[] numArray = new long[(int)Math.log10(n) + 1];
		int i = numArray.length -1; 
		
		while(n > 0) {
			numArray[i--] = n % 10;
			n /= 10;
		}
		
		return numArray;
	}

	private static long convertNum(long[] numArray) {
		long sum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			sum *= 10;
			sum +=numArray[i];
		}
		
		return sum;
	}
}
