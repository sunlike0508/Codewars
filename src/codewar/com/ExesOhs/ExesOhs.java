package codewar.com.ExesOhs;

public class ExesOhs {
	public static boolean getXO(String str) {

		return str.replaceAll("(?i)[^o]", "").length() == str.replaceAll("(?i)[^x]", "").length();
	}
}
