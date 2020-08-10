package codewar.com.BreakCamelCase;

public class Solution {
	
	public static boolean validPhoneNumber(String phoneNumber) {

		return phoneNumber.matches("(\\(\\d{3}\\)) (\\d{3})-\\d{4}$");
	}
	public static String camelCase(String input) {
		
		if(input.length() == 0) {
			return "";
		}
		
		String camel = input.substring(0,1);
		input = input.substring(1);
		
		while(input.length() > 0) {
			String letter = input.substring(0,1);
			input = input.substring(1);
			
			if(letter.matches("[A-Z]")) {
				camel += " ";
			}
			
			camel += letter;
		}
		
		return camel;
	}
}