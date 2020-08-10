package codewar.com.Polinomio;

public class Polinomio {
	static String convertString(int[] pol) {
		String result = "";
		
		for(int i = pol.length-1; i >=0; i--) {
			
			if(pol[i] > 0) {
				result += (pol[i] > 0 && "".equals(result) ? "" : "+");
			}
			
			String coefficient = makeCoefficient(pol, i);
			String degree = makeDegree(pol, i);
			
			if(pol[i] != 0) {
				if(isMinusOne(coefficient) && isZero(i)) {
					result += -1;
				} else if(isMinusOne(coefficient) && isNotZero(i)) {
					result += "-" + degree;
				} else if (isOne(coefficient) && isZero(i)) {
					result += 1;
				} else if (isOne(coefficient) && isNotZero(i)) {
					result += degree;
				} else {
					result += coefficient + degree;
				}
			}
		}
		
		return result;
	}

	private static boolean isNotZero(int i) {
		return i != 0;
	}

	private static boolean isZero(int i) {
		return i == 0;
	}

	private static boolean isOne(String coefficient) {
		return "1".equals(coefficient);
	}

	private static boolean isMinusOne(String coefficient) {
		return "-1".equals(coefficient);
	}

	private static String makeCoefficient(int[] pol, int i) {
		return pol[i] == 0? "" : String.valueOf(pol[i]);
	}

	private static String makeDegree(int[] pol, int i) {
		String degree = "";
		
		if(i == 1 && pol[i] != 0) {
			degree = "x";
		} else if(i > 1 && pol[i] != 0) {
			degree = "x^" + i;
		} else {
			degree = "";
		}
		
		return degree;
	}
}
