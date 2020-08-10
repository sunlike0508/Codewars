package codewar.com.DataReverse;

public class DataReverse {
	
	public static int[] DataReverse(int[] data) {
		
		int[] dataArray = new int[data.length];
		
		for(int i = data.length-8, j = 0  ; i >= 0; i-=8, j+=8) {
			for(int x = i, y = j; x < i+8; x++, y++) {
				dataArray[y] = data[x];
			}
		}
		
		return dataArray;
	}
}
