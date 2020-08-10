package codewar.com.IsMyFriendCheating;

import java.util.ArrayList;
import java.util.List;

public class IsMyFriendCheating {
	public static List<long[]> removNb(long n) {
		List<long[]> res = new ArrayList<long[]>();
		
		long sum = (n*(n+1))/2 +1; 
		
		for(long i=3 ; i < n; i++) {
			if(sum % i == 0 && (sum / i <= n)) {
				res.add(new long[] {i-1, sum/i -1});
			}
		}
		
		return res;
	}
}
