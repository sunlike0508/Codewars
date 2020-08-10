package codewar.com.PhoneDir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDir {
	public static String phone(String strng, String num) {

		if(!strng.contains("+" + num)) {
			return "Error => Not found: " + num;
		} 
		
		if(strng.replaceFirst("\\+" + num, "").contains("+" + num)) {
			return "Error => Too many people: " + num;
		}
		
		Pattern findPattern = Pattern.compile("\n?.*\\+"+ num + ".*\n?");
		Matcher findMatcher = findPattern.matcher(strng);
		
		String findString = "";
		
		while(findMatcher.find()) {
			findString = findMatcher.group().replaceAll("\n", "").replaceAll("\\s*\\S*\\d+-\\d+-\\d+-\\d+\\S*", "");
		}
		
		String[] result = new String[] {"Phone => " + num, "Name => ", "Address => "};
		
		result[1] += findString.replaceAll(".*<|>.*", "");		
		result[2] += findString.replaceAll("\\s*\\<.*\\>", "").replaceAll("^\\W*\\_*|[^\\w\\.]$", "").replaceAll("[\\s;,_]+", " ");
		
		return String.join(", ", result);
	}
}
