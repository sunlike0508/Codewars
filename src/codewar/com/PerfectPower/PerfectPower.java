package codewar.com.PerfectPower;

public class PerfectPower {
	public static int[] isPerfectPower(int n) {
		
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			int j = 2;
			int powNumber = 0;
			
			do {
				powNumber = (int)Math.pow(i, j);
				
				if(powNumber == n) {
					return new int[] {i,j};
				}
				
				j++;
				
			} while(powNumber <= n);
		}
		
		return null;
	}
}
