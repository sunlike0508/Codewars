package codewar.com.PrimeDecomp;

import java.util.Iterator;
import java.util.TreeMap;

public class PrimeDecomp {
	
	public static String factors(int n) {		
		int num = 2;
		int count = 0;
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		while(n > 1) {
			
			if(n % num == 0) {
				n = n / num;
				count++;
			} else {				
				num++;
				count = 0;
			}
			
			if(count > 0) {
				treeMap.put(num, count);
			}
		}
		
		return makeResult(treeMap);
	}

	private static String makeResult(TreeMap<Integer, Integer> treeMap) {		
		Iterator<Integer> it = treeMap.keySet().iterator();
		String result = "";
		
		while(it.hasNext()) {
			int key = it.next();
			int count = treeMap.get(key);
			
			result += "(" + (count == 1 ? key : key + "**" + count) + ")";
		}
		
		return result;
	}
}
