package codewar.com.JomoPipi;

import java.util.ArrayList;
import java.util.List;

public class JomoPipi {
	
	public static String stringFunc(String s, long x) {
		if(x == 0) {
			return s;
		}
		
		String origin = s;
		
		int cycle = 0;
		List<String> list = new ArrayList<String>();
		
		for(long i = 0; i < x; i++) {

			s = sort(s);
			list.add(s);
			cycle++;
			
			System.out.println(s);
			
			if (origin.equals(s)) {
                x = x % cycle;
                break;
            }
		}
		
		return list.get((int) (x-1));
	}

	private static String sort(String s) {
		
		StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int i;
        for(i = 0; i < chars.length / 2; i++) {
            sb.append(chars[chars.length - 1 - i]).append(chars[i]);
        }
        return sb.append(chars.length % 2 != 0 ? chars[i] : "").toString();
	}
}