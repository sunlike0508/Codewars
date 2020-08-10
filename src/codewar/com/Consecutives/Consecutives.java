package codewar.com.Consecutives;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {
	public static List<Integer> sumConsecutives(List<Integer> s) {
		
		List<Integer> sumList = new ArrayList<Integer>();
		int previous = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < s.size(); i++) {
			
			if(s.get(i) == previous) {
				sumList.set(sumList.size()-1, sumList.get(sumList.size()-1) + s.get(i));
			} else {
				sumList.add(s.get(i));
				previous = s.get(i);
			}
		}
		
		return sumList;
	}
}

/*
 * 
 * 		int sum = 0;
		int index = 0;
		
		for(int i = 1 ; i < sumList.size() ; i++) {
			
			if(sumList.get(i-1) == sumList.get(i)) {
				sum += sumList.get(i);
				sumList.remove(i);
				i--;
			} else {
				sumList.set(index, sumList.get(index) + sum);
				sum = 0;
				index = i;
			}
		}
		
		*/
