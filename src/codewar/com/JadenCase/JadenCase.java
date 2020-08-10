package codewar.com.JadenCase;

public class JadenCase {
	public String toJadenCase(String phrase) {
		
		if(phrase == null || "".equals(phrase)) {
			return null;
		}
		
		String[] split = phrase.split(" ");
		
		for(int i = 0; i < split.length; i++) {
			split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1);
		}

		return String.join(" ", split);
	}
}
