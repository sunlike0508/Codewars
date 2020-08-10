package codewar.com.BuildAPileOfCubes;

public class BuildAPileOfCubes {
	public static long findNb(long m) {
		
		for(long start = 1, sum = 0; sum < m; start++) {
			sum += start*start*start;
			
			if(sum == m) {
				return start;
			}
		}
		
		return -1;
	}	
}
