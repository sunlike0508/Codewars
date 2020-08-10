package codewar.com.Josephus;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		int pos = 0;
		List<T> jose = new ArrayList<T>();
		
		while(items.size() > 0) {
			
			pos += k-1;
			
			if(pos >= items.size()) {
				pos = pos % items.size();
			}
			
			jose.add(items.get(pos));
			items.remove(pos);
		}
		
		return jose;
	}
}
