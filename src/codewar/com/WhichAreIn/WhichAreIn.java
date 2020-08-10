package codewar.com.WhichAreIn;

import java.util.Arrays;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {

		if(array1.length == 0 || array2.length == 0) {
			return new String[] {};
		}
		
		Arrays.sort(array1);
		
		String contrainString = "";
		String strConvertArray2 = String.join(",", array2);

		for(String array1Str : array1) {
			if(strConvertArray2.contains(array1Str)) {
				contrainString += array1Str + ",";
			}
		}
		
		if("".equals(contrainString)) {
			return new String[] {};
		}
		
		return contrainString.split(",");
	}
}
