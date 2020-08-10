package codewar.com.Dictionary;

public class Dictionary {
	private final String[] words;

	public Dictionary(String[] words) {
		this.words = words;
	}

	public String findMostSimilar(String to) {

		int minPosition = 0;
		int minCount = 0;
		
		for (int i = 0; i < words.length; i++) {
			String s1 = words[i].length() < to.length() ? words[i] : to;
			String s2 = words[i].length() < to.length() ? to : words[i];
			
			for (int i1 = 0; i1 <= s2.length() - s1.length(); i1++) {
				int count = 0;
				
				for (int i2 = 0; i2 < s1.length(); i2++) {
					
					if (s1.charAt(i2) == s2.charAt(i2 + i1)) {
						count++;
					}
				}
				
				if (count - (words[i].length() - count) > minCount - (words[minPosition].length() - minCount)) {
					minCount = count;
					minPosition = i;
				}
			}
		}
		return words[minPosition];
	}
}
