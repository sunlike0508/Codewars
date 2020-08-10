package codewar.com.WeightSort;

import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {
	public static String orderWeight(String string) {
	    String[] split = string.split(" ");
	    Arrays.sort(split, new Comparator<String>() {
	        public int compare(String a, String b) {
	            int aWeight = convertWeight(a);
	            int bWeight = convertWeight(b);
	            return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
	        }
	    });
	    return String.join(" ", split);
	}
	
	private static int convertWeight(String valueOf) {
		int sum = 0;
		
		for(int i = 0; i < valueOf.length(); i++) {
			sum += Integer.parseInt(valueOf.substring(i, i+1));
		}
	
		return sum;
	}
	
//	public static String orderWeight(String strng) {
//		
//		if(strng.length() == 0) {
//			return "";
//		}
//		
//		String[] weightSplit = strng.split(" ");
//		int[] weight = new int[weightSplit.length];
//		
//		for(int i = 0; i < weightSplit.length; i++) {
//			weight[i] = convertWeight(weightSplit[i]);
//		}
//		
//		selectSort(weight, weightSplit);
//		
//		return String.join(" " , weightSplit);
//	}
//	
//	private static void selectSort(int[] sort, String[] weightSplit) {
//		
//		for(int i = 0; i < sort.length -1; i++) {
//			
//			for(int j = i+1; j < sort.length; j++) {
//				if((sort[i] > sort[j]) 
//						|| (sort[i] == sort[j] 
//								&& weightSplit[i].compareTo(weightSplit[j]) > 0)) {
//					int temp = sort[i];
//					sort[i] = sort[j];
//					sort[j] = temp;
//					
//					String weight = weightSplit[i];
//					weightSplit[i] = weightSplit[j];
//					weightSplit[j] = weight;
//				}
//			}
//		}
//	}
//
//	private static int convertWeight(String valueOf) {
//		int sum = 0;
//		
//		for(int i = 0; i < valueOf.length(); i++) {
//			sum += Integer.parseInt(valueOf.substring(i, i+1));
//		}
//		
//		return sum;
//	}
}
