package codewar.com.PascalsTriangle;

public class PascalsTriangle {
	public static int[][] pascal(int depth) {
		
		int[][] answer = new int[depth][];
		
		answer[0] = new int[1];
		answer[0][0] = 1;
		
		for(int i = 1; i < depth; i++) {
			int[] array = new int[i+1];
			
			array[0] = 1;
			
			for(int j = 1; j < i; j++) {
				array[j] = answer[i-1][j-1] + answer[i-1][j];
			}
			
			array[i] = 1;
			
			answer[i] = array;
		}
		
		return answer;
	}
}
