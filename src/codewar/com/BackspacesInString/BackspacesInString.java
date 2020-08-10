package codewar.com.BackspacesInString;

public class BackspacesInString {
	public static String cleanString(String s) {
		
		while(s.contains("#")) {
			s = s.replaceFirst(".?#", "");
		}
		
		return s;
	}
}
