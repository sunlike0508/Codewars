package codewar.com.autocorrect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autocorrect {
	public static String autocorrect(String input) {
		
		Pattern TOKENIZER = Pattern.compile("\\w+\\W*");
		
		Matcher mc = TOKENIZER.matcher(input);
		String output = "";
		
		while(mc.find()) {
			String group = mc.group();

			if(group.matches("(?i)u\\W*") || group.matches("(?i)(YO)(?i)U+\\W*")) {
				output += group.replaceAll("(?i)[YOU]+", "your sister");
			} else {
				output += group;
			}
		}
		
		return output;
		
		//return input.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
	}
}
