package codewar.com.humanReadableTime;

public class HumanReadableTime {

	public static String makeReadable(int seconds) {		
		if(359999 < seconds) {
			return "99:59:59";
		}
		
		int hour = seconds/3600;
		int min = (seconds%3600)/60;
		int sec = (seconds%3600)%60;
		
		return String.format("%02d:%02d:%02d", hour, min, sec);
	}
}
