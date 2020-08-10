package com.test.FiveChar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FiveChar {
	
	public static void main (String[] args) {
		int[][] arr = { {101, 5, 2},
						{105, 5, 2},
						{104, 2, 3}, 
						{114, 2, 1}, 
						{121, 2, 2}};
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if (t1[1] == t2[1]) {
					
					return t2[2] - t1[2];
				}

				return t2[1] - t1[1];
			}
		});
		
		//printArray(arr);
		
		int[] arry = arr[0];
		
		System.out.println(arry[2]);
		
//		String str = "1:";
//		String str2 = "2:";
//		String str3 = "=:";
//		
//		System.out.println(str2.compareTo(str3) > 0? 1: 0);
	}
	
	private static void printArray(int[][] sort) {
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i][0] + " " + sort[i][1] + " " + sort[i][2]);
		}
	}
	
	public static double[] averages(int[] numbers) {
		
		if(numbers == null || numbers.length < 2) {
			return new double[0];
		}
		
		double[] result = new double[numbers.length - 1];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (numbers[i] + numbers[i+1] ) / 2.0;
		}
		
		return result;
	}
}
