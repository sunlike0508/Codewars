package codewar.com.RevRot;

public class RevRot {
    public static String revRot(String strng, int sz) {

    	String result = "";
    	
    	while(strng.length() >= sz && strng.length() !=0) {
    		
    		String cubes = strng.substring(0,sz);
    		
    		result += isEven(sumCubes(cubes)) ? reverse(cubes) : rotate(cubes);
    		
    		strng = strng.substring(sz);
    	}
    	
    	return result;
    }

	public static boolean isEven(int sumCubes) {
		return sumCubes % 2 == 0;
	}
    
	private static String reverse(String cubes) {
		return new StringBuffer(cubes).reverse().toString();
	}

	private static String rotate(String cubes) {
		return cubes.substring(1) + cubes.substring(0,1);
	}

	private static int sumCubes(String cubes) {
		
		int sum = 0;
		
		while(cubes.length() > 0) {
			sum += Integer.parseInt(cubes.substring(0,1));
			cubes = cubes.substring(1);
		}
		
		return sum;
	}
}
