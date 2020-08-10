package codewar.com.EnoughIsEnough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		if(maxOccurrences < 1) {
			return new int[] {};
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> deleteNthList = new ArrayList<Integer>();
		
		for(int number : elements) {
			Integer mapNum = map.put(number, map.getOrDefault(number, 0) + 1);
			
			if(mapNum == null || mapNum < maxOccurrences) {
				deleteNthList.add(number);
			}
		}
		
		return  deleteNthList.stream().mapToInt(i->i).toArray();
	}
}
