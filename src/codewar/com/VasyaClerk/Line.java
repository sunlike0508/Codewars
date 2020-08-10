package codewar.com.VasyaClerk;

import java.util.HashMap;

public class Line {
	public static String Tickets(int[] peopleInLine) {
		
		HashMap<Integer, Integer> changeMap = new HashMap<Integer, Integer>(); 
		changeMap.put(25, 0);
		changeMap.put(50, 0);
		changeMap.put(100, 0);
		
		for(int cost : peopleInLine){			
			if(cost == 25) {
				if(changeMap.get(25) == 0) {
					changeMap.put(25, 1);
				} else {
					changeMap.put(25, changeMap.get(25) + 1);
				}
			} else if(cost == 50) {
				if(changeMap.get(25) == 0) {
					return "NO";
				}
					
				changeMap.put(50, changeMap.get(50) + 1);
				changeMap.put(25, changeMap.get(25) - 1);
			} else {
				if(changeMap.get(25) == 0 || (changeMap.get(25) < 3 && changeMap.get(50) == 0)) {
					return "NO";
				} 
				
				if(changeMap.get(50) > 0) {
					changeMap.put(50, changeMap.get(50) - 1);
					changeMap.put(25, changeMap.get(25) - 1);
				} else {
					changeMap.put(25, changeMap.get(25) - 3);
				}
			}
		}
		
		return "YES";
	}
}
