package codewar.com.missingArray;

import java.util.Arrays;
import java.util.HashMap;

public class Kata {
	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
		
		if(arrayOfArrays == null) {
			return 0;
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int smallSize = Integer.MAX_VALUE;
		
		for (Object[] array : arrayOfArrays) {
			
			if(array == null) {
				return 0;
			}
			
			if(array.length == 0) {
				return 0;
			}
			
			if(array.length < smallSize) {
				smallSize = array.length ;
			}
			
			map.put(array.length, array.length);	
		}
		
		while(smallSize < smallSize + arrayOfArrays.length) {
			smallSize++;
			
			if(map.get(smallSize) == null) {
				return smallSize;
			}
		}

		return 0;
	}
}
