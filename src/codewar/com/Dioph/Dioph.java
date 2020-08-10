package codewar.com.Dioph;

import java.util.ArrayList;
import java.util.List;

public class Dioph {
	public static String solEquaStr(long n) {
		
		List<String> xList = new ArrayList<String>();

		for(long i = 1; i <= Math.sqrt(n); i++) {
			long powerTwoOfX = i + n / i;
			long powerTwoOfY = powerTwoOfX / 2 - i;
			
			if((n % i == 0) && (powerTwoOfX % 2 == 0) && (powerTwoOfY % 2 == 0)) {
				xList.add("[" + powerTwoOfX / 2 + ", " + powerTwoOfY / 2 + "]");
			}
		}

		return "[" + String.join(", ", xList)+ "]";
	}
}
