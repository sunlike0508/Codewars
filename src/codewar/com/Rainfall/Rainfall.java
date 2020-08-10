package codewar.com.Rainfall;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rainfall {
	public static double mean(String town, String strng) {
		String findTown = findTownRainfallString(town, strng);
		
		if("".equals(findTown)) {
			return -1.0;
		}
		
		return findRainfallAverage(findTown);
	}
	
	public static double variance(String town, String strng) {
		String findTown = findTownRainfallString(town, strng);
		
		if("".equals(findTown)) {
			return -1.0;
		}
		
		double[] monthRainfall = findMonthRainfall(findTown);
		double rainfallAvg = mean(town, strng);
		
		double deviationSqrtSum = 0.0;
		
		for(double rainfall : monthRainfall) {
			deviationSqrtSum += Math.pow(rainfall - rainfallAvg, 2);
		}
		
		return deviationSqrtSum / 12;
	}

	private static double findRainfallAverage(String findTown) {		
		return Arrays.stream(findMonthRainfall(findTown)).sum() / 12;
	}

	private static double[] findMonthRainfall(String findTown) {
		Pattern findRainfallPattern = Pattern.compile("\\d*\\.\\d*");
		Matcher findRainfallMatcher = findRainfallPattern.matcher(findTown);
		double[] monthRainfall = new double[12];
		int i = 0;
		
		while(findRainfallMatcher.find()) {
			monthRainfall[i++] += Double.parseDouble(findRainfallMatcher.group());
		}
		
		return monthRainfall;
	}

	private static String findTownRainfallString(String town, String strng) {
		Pattern findTownPattern = Pattern.compile("\n?" + town + ":.*\n?");
		Matcher findTownMatcher = findTownPattern.matcher(strng);
		
		String findTown = "";
		
		while(findTownMatcher.find()) {
			findTown = findTownMatcher.group().replaceAll("\n", "");
		}
		
		return findTown;
	}
	
    public static int solve(String s){
    	String[] split = s.split("[^aeiou]");
    	int max = 0;
    	
    	for(String str : split) {
    		max = Math.max(str.length(), max);
    	}
    	
		return max;			
    }
}
