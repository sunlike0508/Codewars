package codewar.com.RangeExtraction;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
	public static String rangeExtraction(int[] arr) {
		
		List<String> rangeList = new ArrayList<String>();
		int start = arr[0];
		int beforeNumber = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if( beforeNumber +1 == arr[i]) {
				beforeNumber = arr[i];
			} else {
				addRangeList(rangeList, start, beforeNumber);
				
				start = arr[i];
				beforeNumber = arr[i];
			}
		}
		
		addRangeList(rangeList, start, beforeNumber);
		
		return String.join(",", rangeList);
	}

	public static void addRangeList(List<String> rangeList, int start, int beforeNumber) {
		if(start == beforeNumber) {
			rangeList.add(String.valueOf(start));
		} else if(start+1 == beforeNumber){
			rangeList.add(String.valueOf(start));
			rangeList.add(String.valueOf(beforeNumber));
		} else {
			rangeList.add(start + "-" + beforeNumber);
		}
	}
}
