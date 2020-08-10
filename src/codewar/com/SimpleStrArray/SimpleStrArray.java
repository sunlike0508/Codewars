package codewar.com.SimpleStrArray;

public class SimpleStrArray {
	public static int[] Solve(String word) {
		int[] solve = new int[4];
		
		solve[0] = word.replaceAll("[^A-Z]", "").length();
		solve[1] = word.replaceAll("[^a-z]", "").length();
		solve[2] = word.replaceAll("\\D", "").length();
		solve[3] = word.replaceAll("\\w", "").length();
		
		return solve;
	}
}