package codewar.com.YourOrder;

public class Order {
	public static String order(String words) {

		String[] splitWords = words.split(" ");
		String[] sortWords = new String[splitWords.length];

		for (int i = 0; i < splitWords.length; i++) {

			sortWords[i] = findWord(i + 1, splitWords);
		}

		return String.join(" ", sortWords);
	}

	private static String findWord(int i, String[] splitWords) {

		for (int j = 0; j < splitWords.length; j++) {
			if (splitWords[j].contains(String.valueOf(i))) {
				return splitWords[j];
			}
		}

		return "";
	}

//	public static String order(String words) {
//		if (words == "")
//			return words;
//		String newWords[] = new String[words.split(" ").length];
//		for (String word : words.split(" ")) {
//			int index = Integer.valueOf(word.replaceAll("[^0-9]", "")) - 1;
//			newWords[index] = word;
//		}
//		return String.join(" ", newWords);
//	}
}
