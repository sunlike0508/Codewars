package codewar.com.SortTheOdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
	public static int[] sortArray(int[] array) {
		
		List<Integer> oddList = new ArrayList<Integer>();
		
		for(int number : array) {
			if(number %2 != 0) {
				oddList.add(number);
			}
		}
		
		//Collections.sort(oddList);
		oddList.sort(Integer::compareTo);
		
		for(int i = 0, j = 0 ; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				array[i] = oddList.get(j);
				j++;
			}
		}
		
		return array;
	}
}
