package codewar.com.Parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parser {
	
	public static int parseInt(String numStr) {
	
		HashMap<String, Integer> map = setNumbertoMap();
		
		String[] split = numStr.replaceAll(" and ", " ").replaceAll("-", " ").split(" ");
		List<Integer> list = new ArrayList<Integer>();
		int calNumber = 0;
		
		for(int i = 0; i < split.length; i++) {
			int number = map.get(split[i]);
			
			if(number == 100) {
				calNumber *= 100;
			} else if (number == 1000) {
				calNumber *= 1000;
				list.add(calNumber);
				calNumber = 0;
			} else if (number == 1000000){
				calNumber *= 1000000;
				list.add(calNumber);
				calNumber = 0;
			} else {
				calNumber += number;
			}
		}
		
		list.add(calNumber);
		
		int sum = 0;
		
		for(int num : list) {
			sum += num;
		}
	
		return sum;
	}
	
	public static HashMap<String, Integer> setNumbertoMap() {
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 
					20, 30, 40, 50, 60, 70, 80, 90, 100, 1000, 1000000};
		String[] digit = {"zero", "one","two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", 
				"nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred",
				"thousand", "million"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < number.length; i++) {
			map.put(digit[i], number[i]);
		}
		
		return map;
	}
}
