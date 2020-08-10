package codewar.com.CalculateRotation;

public class CalculateRotation {
	static int shiftedDiff(String first, String second) {
		int maxRatation = first.length();
		
		for(int i = 0; i < maxRatation; i++) {
			
			if(second.equals(first)) {
				return i;
			}
			
			first = first.substring(maxRatation - 1) + first.substring(0, maxRatation - 1);
		}
		
		return -1;
	}
}
