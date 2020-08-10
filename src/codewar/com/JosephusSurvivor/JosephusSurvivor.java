package codewar.com.JosephusSurvivor;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {

		List<Integer> list = initialList(n);
		
		return survivor(list, k);
	}

	private static int survivor(List<Integer> list, int k) {
		int pos = 0;
		
		while(list.size() > 1) {
			
			pos += k-1;
			
			if(pos >= list.size()) {
				pos = pos % list.size();
			}
			
			list.remove(pos);
		}
		
		return list.get(0);
	}

	private static List<Integer> initialList(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= n ; i++) {
			list.add(i);
		}
		
		return list;
	}
}
