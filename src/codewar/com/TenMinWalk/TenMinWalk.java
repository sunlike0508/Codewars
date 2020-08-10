package codewar.com.TenMinWalk;

public class TenMinWalk {
	public static boolean isValid(char[] walk) {

		if(walk.length != 10) {
			return false;
		}
		
		int westEast = 0;
		int northSout = 0;
		
		for(char block : walk) {
			if(block == 'w') {
				westEast++;
			} else if(block == 'e') {
				westEast--;
			} else if(block == 'n') {
				northSout++;
			} else {
				northSout--;
			}
		}
				
		return westEast == 0 && northSout == 0;
	}
}
