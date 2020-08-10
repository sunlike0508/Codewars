package codewar.com.StringSplit;

public class StringSplit {
	public static String[] solution(String s) {
		
		if(s.length() % 2 == 1) {
			s +="_";
		}
		
		String[] split = new String[s.length()/2];
		
		for(int i = 0 ; i < split.length; i++) {
			split[i] = s.substring(0, 2);
			s = s.substring(2);
		}
		
		return split;
	}
}
