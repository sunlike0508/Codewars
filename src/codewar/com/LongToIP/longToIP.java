package codewar.com.LongToIP;

import java.util.ArrayList;
import java.util.List;

public class longToIP {
	public static String longToIP(long ip) {
		// Java doesn't have uint32, so here we use long to represent int32
		
		long[][] ipSave = makeIP(ip);
		
		List<String> list = convertIP(ipSave);
		
		return String.join(".", list);
	}

	public static List<String> convertIP(long[][] ipSave) {
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < 4 ; i++) {
			int sum = 0;
			
			for(int j = 0; j < 8; j++) {
				if(ipSave[i][j] == 1) {
					sum += (long) Math.pow(2, 7-j);
				}
			}
			
			list.add(String.valueOf(sum));
		}
		
		return list;
	}

	public static long[][] makeIP(long ip) {
		long[][] ipSave = new long[4][8];
		
		for(int i = 3; i >= 0 ; i--) {
			for(int j = 7; j >= 0; j--) {
				ipSave[i][j] = ip % 2;
				ip = ip / 2;
			} 
		}
		return ipSave;
	}
}
