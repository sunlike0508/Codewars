package codewar.com.CountTheSmileyFaces;

import java.util.List;

public class SmileFaces {
	public static int countSmileys(List<String> arr) {
	    String validSmileRegExp = "[:;][-~]?[)D]";
	    int smiles = 0;
	    for (String smile : arr) {
	        if (smile.matches(validSmileRegExp)) {
	            smiles += 1; 
	        }
	    }
	    return smiles;
//		int validFaceCount = 0;
//		
//		for(String face : arr) {
//			validFaceCount += isValidFaceCount(face);
//		}
//		
//		return validFaceCount;
	}

	private static int isValidFaceCount(String face) {
	
		if(face.length() == 2 && isVaildEye(face) && isVaildMouth(face,1,2)) {
			return 1;
		}
		
		if(face.length() == 3 && isVaildEye(face) && isVaildNose(face) && isVaildMouth(face,2,3)) {
			return 1;
		}
		
		return 0;
	}

	public static boolean isVaildEye(String face) {
		return ":;".contains(face.substring(0,1));
	}
	
	public static boolean isVaildNose(String face) {
		return "-~".contains(face.substring(1,2));
	}
	
	public static boolean isVaildMouth(String face, int i, int j) {
		return ")D".contains(face.substring(i,j));
	}
}
