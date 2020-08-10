package codewar.com.Travel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Travel {
//	private final static Pattern pattern = Pattern.compile("(?<nb>\\d{1,5}) (?<str>.+?) (?<zipcode>[A-Z]{2} \\d{5}),?");
//
//    public static String travel(String r, String zipcode) {
//        final Matcher matcher = pattern.matcher(r);
//        final StringBuilder result = new StringBuilder();
//        final StringBuilder nb = new StringBuilder();
//
//        result.append(zipcode)
//                .append(":");
//        String delimiter = "";
//        while (matcher.find()) {
//            if (zipcode.equals(matcher.group("zipcode"))) {
//                result.append(delimiter)
//                        .append(matcher.group("str"));
//                nb.append(delimiter)
//                        .append(matcher.group("nb"));
//                if (delimiter.isEmpty()) {
//                    delimiter = ",";
//                }
//            }
//        }
//        result.append("/").append(nb);
//        System.out.println(result.toString());
//        return result.toString();
//    }
    public static String travel(String travel, String zipcode) {
    	
    	if(zipcode.isEmpty()) {
    		return ":/";
    	}
    	
		Pattern findPattern = Pattern.compile("^\\d+\\D*"+ zipcode + "," + "|\\d+\\D*"+ zipcode + "," + "|\\d+\\D*"+ zipcode + "$");
		Matcher findMatcher = findPattern.matcher(travel);
		
		List<String> houseArray = new ArrayList<String>();
		List<String> streetArray = new ArrayList<String>();

		while(findMatcher.find()) {
			String address = findMatcher.group().replaceAll(" " + zipcode + ",?", "");
			
			houseArray.add(address.split(" ")[0]);
			streetArray.add(address.replaceAll("\\d+ ", ""));
		}
		
		return zipcode + ":" + String.join(",", streetArray) + "/" + String.join(",", houseArray);
    }
}
