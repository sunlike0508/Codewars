package codewar.com.StripComments;

public class StripComments {
	public static String stripComments(String text, String[] commentSymbols) {
		
		System.out.println("text : " + text);
		
		for(int i = 0; i < commentSymbols.length; i++) {
			System.out.print(commentSymbols[i]);
		}
		
		System.out.println();
		
		String[] split = text.split("\n");
		
		for(int i = 0; i < split.length; i++) {
			split[i] = removeComment(split[i], commentSymbols);
		}
		
		return String.join("\n", split);
	}
	
	private static String removeComment(String string, String[] commentSymbols) {
		
		int minIndex = Integer.MAX_VALUE;
		
		for(int i = 0; i < commentSymbols.length; i++) {
			int index = string.indexOf(commentSymbols[i]);
			if(minIndex > index && index >= 0) {
				minIndex = index;
			}
		}
		
		return minIndex == Integer.MAX_VALUE ? string.replaceAll("\\s+$", "") : string.substring(0, minIndex).replaceAll("\\s+$", "");
	}
}
