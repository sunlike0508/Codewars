package codewar.com.TimeFormatter;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
    	
    	System.out.println(seconds);

    	if(seconds == 0) {
    		return "now";
    	}
    	
    	return timeFormat(timeInputList(timeCalculate(seconds)));
    }

	private static String timeFormat(List<String> timeInputList) {
		String result = timeInputList.get(0);
		
		for(int i = 1; i < timeInputList.size(); i++) {
			result += (i < timeInputList.size()-1 ? ", " : " and ") + timeInputList.get(i);
		}
		
		return result;
	}

	private static List<String> timeInputList(int[] time) {
		String[] timeComponents  = {" year", " day", " hour", " minute", " second"};
		List<String> timeList = new ArrayList<String>();
		
		for(int i = 0; i < time.length; i++) {
			
			if(time[i] > 0) {
				timeList.add(time[i] + timeComponents[i] + (time[i] == 1 ? "" : "s"));
	    	}
		}
		
		return timeList;
	}

	private static int[] timeCalculate(int seconds) {
		int[] time = new int[5];
    	time[4] = seconds % 60;
    	time[3] = (seconds / 60 ) % 60;
    	time[2] = (seconds / 3600) % 24;
    	time[1] = ((seconds / 3600) / 24) % 365; 
    	time[0] = ((seconds / 3600) / 24) / 365;
    	
		return time;
	}
}
