package codewar.com.Diamond;

public class Diamond {
	public static String print(int n) {
		
		if(n < 1 || n % 2 == 0) {
			return null;
		}
		
		String diamond = "";
		
		for(int row = 0; row < n/2 + 1; row++) {
			
			for(int empty = 0; empty < n/2 - row; empty++) {
				diamond+=" ";
			}
			
			for(int star = 0; star < row*2+1 ; star++) {
				diamond+="*";
			}
			
			diamond+="\n";
		}
		
		for(int row = 0; row < n/2 ; row++) {
			
			for(int empty = 0; empty < row+1; empty++) {
				diamond+=" ";
			}
			
			for(int star = 0; star < n - 2*(row+1); star++) {
				diamond+="*";
			}
			diamond+="\n";
		}
		
		return diamond;
	}
}
