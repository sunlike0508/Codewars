package codewar.com.TheClockwiseSpiral;

public class TheClockwiseSpiral {
    public static int[][] createSpiral(int N) {
        int[][] answer = new int[N][N];
        int index = 1;
        
        for (int i = 0; i < N; i++){
			for (int j = i; j < N-i; j++) {
				answer[i][j] = index++;
			}
			  
			for (int j = i+1; j < N-i; j++) {
				answer[j][N-i-1] = index++;
			}
			  
			for (int j = i+1; j < N-i; j++) {
				answer[N-i-1][N-j-1] = index++;
			}
			  
			for (int j = i+1; j < N-i-1; j++) {
				answer[N-j-1][i] = index++;
			}
        }
        
        if (N % 2 != 0) {
        	answer[N/2][N/2] = --index;
        }
        
    	return answer;
    }
    
    static void print(int[][] answer, int N) {
    	for(int i = 0; i < N; i++) {
    		for(int j = 0; j < N; j++) {
    			System.out.print(answer[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    
    public static boolean check(Object[] a, Object x) {
        
        for(int i = 0; i < a.length; i++){
          if(a[i].equals(x)){
            return true;
          }
        }
        
        return false;
    }
}
