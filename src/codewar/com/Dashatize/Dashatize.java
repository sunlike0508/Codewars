package codewar.com.Dashatize;

import java.util.ArrayList;
import java.util.List;

public class Dashatize {
    public static String dashatize(int num) {
     	
    	String numString = convertNumber(num);
    	
    	if(numString.length() == 1) {
    		return numString;
    	}
    	
		List<String> list = new ArrayList<String>();
		
		String even = "";
		
		while(numString.length() > 0) {
			int number = Integer.valueOf(numString.substring(0,1));
			
			if(number % 2 == 1) {
				if(!"".equals(even)) {
					list.add(even);
					even = "";
				}
				
				list.add(numString.substring(0,1));
				
			} else {
				even += numString.substring(0,1);
			}
			
			numString = numString.substring(1);
		}
		
		if(!"".equals(even)) {
			list.add(even);
		}
    	
    	return String.join("-", list);
    }

	public static String convertNumber(int num) {
		String numString = String.valueOf(num);
    	
    	if(num < 0){
    		numString = numString.substring(1);
    	}
    	
		return numString;
	}
}
