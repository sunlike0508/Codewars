package codewar.com.Interval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Interval {
	public static int sumIntervals(int[][] intervals) {
		if (intervals == null) {
			return 0;
		}
		HashSet<Integer> ints = new HashSet<Integer>();
		
		for (int i = 0; i < intervals.length; i++) {
			System.out.println(i + " >> " + intervals[i][0] + " " + intervals[i][1]);
			for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
				System.out.print(j + " ");
				ints.add(j);
			}
			System.out.println();
		}
		
		return ints.size();

//		if(intervals == null || intervals.length == 0) {
//			return 0;
//		}
//		
//		intervalsSort(intervals);
//		
//		return intevalsList(intervals);
	}

	private static int intevalsList(int[][] intervals) {
		int[][] temp = { { Integer.MIN_VALUE, Integer.MIN_VALUE } };
		int sum = 0;

		for (int i = 0; i < intervals.length; i++) {
			if (temp[0][1] < intervals[i][0]) {
				sum += temp[0][1] - temp[0][0];
				temp[0][0] = intervals[i][0];
				temp[0][1] = intervals[i][1];
			}

			if (temp[0][1] < intervals[i][1]) {
				temp[0][1] = intervals[i][1];
			}
		}

		sum += temp[0][1] - temp[0][0];

		return sum;
	}

	private static void intervalsSort(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if (t1[0] == t2[0]) {
					return t1[1] - t2[1];
				}

				return t1[0] - t2[0];
			}
		});
	}

	private static void printArray(int[][] sort) {
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i][0] + " " + sort[i][1]);
		}
	}
}
