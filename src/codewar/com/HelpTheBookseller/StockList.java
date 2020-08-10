package codewar.com.HelpTheBookseller;

import java.util.HashMap;

public class StockList {
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		
		if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		
		HashMap<String, Integer> artMap = new HashMap<String, Integer>();
		
		for(String list : lstOfArt) {
			String[] art = list.split(" ");
			String firstLetter = art[0].substring(0,1);
			int quantity = Integer.parseInt(art[1]);
			
			artMap.put(firstLetter, artMap.getOrDefault(firstLetter, 0) + quantity);
		}
		
		for(int i= 0; i < lstOf1stLetter.length; i++) {
			Integer sumQuantity = artMap.get(lstOf1stLetter[i]) == null? 0 : artMap.get(lstOf1stLetter[i]);
			lstOf1stLetter[i] = "(" + lstOf1stLetter[i] + " : " + sumQuantity + ")";
		}
		
		return String.join(" - ", lstOf1stLetter);
	}
}
