package codewar.com.Keypad;

public class Keypad {
	
	public static int presses(String phrase) {
		String[] keypad = {"1ADGJMPTW* #", "BEHKNQUX0", "CFILORVY", "23456S8Z", "79"};
		
		int times = 0;
		
		phrase = phrase.toUpperCase();
		
		while(phrase.length() > 0) {
			
			String button = phrase.substring(0,1);
			
			for(int i = 0 ; i < keypad.length; i++) {
				if(keypad[i].contains(button)) {
					times += i+1;
				}
			}
			
			phrase = phrase.substring(1);
		}
		
		return times;
	}
}