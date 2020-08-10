package codewar.com.TripleDouble;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TripleDouble {
	public static int TripleDouble(long num1, long num2) {
		
		String num1String = String.valueOf(num1);
		
		Pattern compile = Pattern.compile("(\\d)\\1\\1");
		
		Matcher mc = compile.matcher(num1String);
		
		while(mc.find()) {
			
			String number = mc.group().substring(0,1);
			number += number;
			
			String num2String = String.valueOf(num2);
			compile = Pattern.compile(number);
			
			if(compile.matcher(num2String).find()) {
				return 1;
			}
		}
		
		return 0;
	}
}
