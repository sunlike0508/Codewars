package codewar.com.Mixing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Mixing {
	
	public static String mix(String s1, String s2) {
		
		int[][] array = new int[26][3];
		
		for (char c = 'a'; c <= 'z'; c++) {

            int s1Count = s1.replaceAll("[^"+c+"]","").length();
            int s2Count = s2.replaceAll("[^"+c+"]","").length();
            
			if(s1Count > 1 || s2Count > 1) {
				array[c - 97][0] = c;
				
				if(s1Count > s2Count) {
					array[c - 97][1] = s1Count;
					array[c - 97][2] = 3;
				} else if (s1Count < s2Count) {
					array[c - 97][1] = s2Count;
					array[c - 97][2] = 2;
				} else {
					array[c - 97][1] = s2Count;
					array[c - 97][2] = 1;
				}
			}
		}

		sortArray(array);
		
		return makeResult(array);
	}
	
	private static void sortArray(int[][] array) {
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if (t1[1] == t2[1]) {
					
					return t2[2] - t1[2];
				}

				return t2[1] - t1[1];
			}
		});
	}
	
	private static String makeResult(int[][] array) {
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < 26 && array[i][1] > 0; i++) {
			list.add(prefix(array[i]) + length(array[i]));
		}
		
		return String.join("/", list);
	}

	private static String length(int[] arr) {
		String result = "";
		
		for(int i = 0; i < arr[1]; i++) {
			result += String.valueOf((char)arr[0]);
		}
		
		return result;
	}

	private static String prefix(int[] arr) {
		
		if(arr[2] == 3) {
			return "1:";
		} else if(arr[2] == 2) {
			return "2:";
		} else {
			return "=:";
		}
	}

	
}
