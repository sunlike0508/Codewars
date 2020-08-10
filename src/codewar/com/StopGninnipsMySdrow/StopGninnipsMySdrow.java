package codewar.com.StopGninnipsMySdrow;

import java.util.StringTokenizer;

public class StopGninnipsMySdrow {
	public String spinWords(String sentence) {
		StringTokenizer sTokenizer = new StringTokenizer(sentence, " ");
		StringBuffer sentenceBuffer = new StringBuffer();
		
		while(true) {
			String word = sTokenizer.nextToken();
			
			if(word.length() >= 5) {
				sentenceBuffer.append(new StringBuffer(word).reverse());
			} else {
				sentenceBuffer.append(word);
			}
			
			if(sTokenizer.hasMoreTokens()) {
				sentenceBuffer.append(" ");
			} else {
				break;
			}
		}
				
		return sentenceBuffer.toString();
		
//	    String[] words = sentence.split(" ");
//	    for (int i=0; i<words.length; i++) {
//	      if (words[i].length() >= 5) {
//	        words[i] = new StringBuilder(words[i]).reverse().toString();
//	      }
//	    }
//	    return String.join(" ",words);
	}
}
