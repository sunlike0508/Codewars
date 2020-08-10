package codewar.com.DetectPangram;

public class PangramChecker {
	public boolean check(String sentence) {
		
		for(int i = 0 ; i < 26; i++) {
			if(!sentence.toLowerCase().contains(String.valueOf((char)('a'+i)))){
				return false;
			}
		}
		
		return true;
	}
}
