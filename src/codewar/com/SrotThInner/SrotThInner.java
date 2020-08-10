package codewar.com.SrotThInner;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrotThInner {
	public static String sortTheInnerContent(String words) {
		
		String[] split = words.split(" ");
		
		for(int i = 0; i < split.length; i++) {
			if(split[i].length() > 3) {
				char[] array = split[i].substring(1, split[i].length()-1).toCharArray();
				Arrays.sort(array);
				
				split[i] = split[i].substring(0, 1) 
						+ new StringBuffer(new String(array)).reverse().toString()
						+ split[i].substring(split[i].length() - 1);
			}
		}
		
		return String.join(" ", split);
	}
	
    public static String maskify(String str) {
        if(str.length() < 5) {
        	return str;
        } else {
        	return "#" + maskify(str.substring(1));
        }
    }
    
    public static String reverseWords(final String original)
    {
    	String reverse = original;
    	Pattern TOKENIZER = Pattern.compile("\\S+");
    	Matcher mc = TOKENIZER.matcher(original);
    	
    	while(mc.find()) {
    		String token = mc.group();
    		reverse = reverse.replaceFirst(token, new StringBuffer(token).reverse().toString());
    	}
    	
    	return reverse;
    }
}
