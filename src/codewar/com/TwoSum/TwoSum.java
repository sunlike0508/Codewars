package codewar.com.TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target)
    {
    	Arrays.stream(numbers).forEach(System.out::println);
    	System.out.println("Target: " + target);
    	
    	for(int i = 0; i < numbers.length ; i++) {
    		
    		for(int j = i+1; j < numbers.length; j++) {
    			if(numbers[i]+numbers[j] == target) {
    				return new int[] {i, j};
    			}
    			
    			if(i+j > target) {
    				break;
    			}
    		}
    	}
    	
        return new int[] {}; // Do your magic!
    }
}
