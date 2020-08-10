package codewar.com.MergedStringChecker;

public class StringMerger {
	
	public static boolean isMerge(String s, String part1, String part2) {
		int tempIndex = 1;
		
		while(s.length() > 0) {
			
			String part1SubString = part1.length() == 0? "" : part1.substring(0, tempIndex);
			String part2SubString = part2.length() == 0? "" : part2.substring(0, tempIndex);
			
			String firstString = s.substring(0,tempIndex);
			
			if(part1SubString.equals(firstString) && part2SubString.equals(firstString)){
				tempIndex++;
				
				if(tempIndex > part1.length() && tempIndex > part2.length()) {
					break;
				}
			} else if (part1SubString.equals(firstString)) {
				part1 = part1.substring(tempIndex);
				s = s.substring(tempIndex);
				tempIndex = 1;
			} else if (part2SubString.equals(firstString)) {
				part2 = part2.substring(tempIndex);
				s = s.substring(tempIndex);
				tempIndex = 1;
			} else {
				return false;
			}
		}
		
		return "".equals(s) && "".equals(part1) && "".equals(part2)? true : false;
	}
}
