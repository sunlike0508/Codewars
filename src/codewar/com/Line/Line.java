package codewar.com.Line;

public class Line {
	public static String WhoIsNext(String[] names, int n) {
		int beforeCircleFirstNamesOrder = 1;
		int afterCircleFirstNamesOrder = 1;
		int beforecircleEachNameLength = 1;
		int aftercircleEachNameLength = 1;
		
		for(int circleTime = 1; n >= afterCircleFirstNamesOrder; circleTime++) {
			beforeCircleFirstNamesOrder = afterCircleFirstNamesOrder;
			beforecircleEachNameLength = aftercircleEachNameLength;
			
			aftercircleEachNameLength = findCircleEachNameLength(circleTime);
			afterCircleFirstNamesOrder = findCircleFirstNamesOrder(aftercircleEachNameLength, names.length);
		}
		
		return names[(n - beforeCircleFirstNamesOrder) / beforecircleEachNameLength] ;
	}

	public static int findCircleFirstNamesOrder(int circleEachNameLength, int firstNameLength) {
		return (circleEachNameLength* firstNameLength) - (firstNameLength-1);
	}

	public static int findCircleEachNameLength(int circleTime) {
		return (int)Math.pow(2, circleTime);
	}
}



//System.out.println(n + " " + beforeCircleFirstNamesOrder + " " + circleEachNameLength);
//System.out.println((n - beforeCircleFirstNamesOrder) / circleEachNameLength);
