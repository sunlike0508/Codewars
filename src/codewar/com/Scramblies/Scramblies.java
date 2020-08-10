package codewar.com.Scramblies;

public class Scramblies {
	public static boolean scramble(String str1, String str2) {
		
		java.util.HashMap<Character, Integer> str1Map = new java.util.HashMap<Character, Integer>();
		
		for(char c : str1.toCharArray()){
			if(str1Map.containsKey(c) == false) {
				str1Map.put(c, 1);
			} else {
				str1Map.put(c, str1Map.get(c) + 1);
			}
		}
		
		for(char c : str2.toCharArray()){
			Integer count = str1Map.get(c);
			if(count == null || count == 0) {
				return false;
			} else {
				str1Map.put(c, count-1);
			}
		}
		
//        if (str2.length() > str1.length()) return false;
//        for (String s: str2.split("")) {
//          if (!str1.contains(s))  return false;
//          str1 = str1.replaceFirst(s,"");
//        }        
//       
//        return true;
	
		return true;
	}
}
