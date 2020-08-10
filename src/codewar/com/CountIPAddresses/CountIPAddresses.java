package codewar.com.CountIPAddresses;

public class CountIPAddresses {
	public static long ipsBetween(String start, String end) {
		
		String[] startSplit = start.split("\\.");
		String[] endSplit = end.split("\\.");
		
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			sum += calculateIp(i, Integer.parseInt(endSplit[i]) - Integer.parseInt(startSplit[i]));
		}
		
		return sum;
	}

	private static int calculateIp(int i, int j) {
		
		return power(i) * j;
	}

	private static int power(int i) {
		
		return (int) Math.pow(256, 3-i);
	}
}
