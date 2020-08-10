package codewar.com.DifferenceOfTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceOfTwo {
	public static int[][] twosDifference(int[] array) {
		
		String str = "";
		
		for(int i = 0; i < array.length; i++) {
			str += " " + array[i] + " ";
		}
		
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
			String towDiff = " " + (array[i] + 2) + " ";
			
			if(str.contains(towDiff)) {
				list.add(array[i]);
			}
		}
		
		int[][] result = new int[list.size()][2];
		
		for(int i = 0; i < list.size(); i++) {
			result[i][0] = list.get(i);
			result[i][1] = list.get(i) + 2;
		}
		
		return result;
	}
}
