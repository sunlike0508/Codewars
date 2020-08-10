package codewar.com.Decompose;

import java.util.ArrayList;
import java.util.List;

public class Decompose {
	
	public String decompose(long n) {
		
		long pow = n * n;
		
		List<String> list = new ArrayList<String>();
		
		if(makeDecompose(pow, n-1, list)){
			
			return String.join(" ", list);
		}

		return null;
	}

	private boolean makeDecompose(long pow, long n, List<String> list) {
		if(pow == 0) {
			return true;
		} else {
			while(n > 0) {
				
				long nextPow = pow - n * n;
				
				long nextN = (long) Math.sqrt(nextPow);
				
				if(n == nextN) {
					list.clear();
					return false;
				}
				
				if(makeDecompose(nextPow, nextN, list)) {
					list.add(String.valueOf(n));
					return true;
				}
				
				n--;
			}
			
			list.clear();
			return false;
		}
	}
}
