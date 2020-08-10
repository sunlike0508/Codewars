package codewar.com.Subsequence;

public class Subsequence {
    public static String lcs(String x, String y) {
        int[][] arr = new int[x.length()+1][y.length()+1];
        
        for(int i = 0; i < x.length() ; i++) {
        	for(int j = 0; j < y.length(); j++) {
        		if(x.charAt(i) == y.charAt(j)) {
        			arr[i+1][j+1] = arr[i][j]+1;
        		} else {
        			arr[i+1][j+1] = Math.max(arr[i+1][j], arr[i][j+1]);
        		}
        	}
        }
        
        String substring = "";
        int count = 1;
        
        for(int j = 1; j < y.length()+1; j++) {
        	for(int i = 1; i < arr.length; i++) {
        		if(count == arr[i][j]) {
        			substring += String.valueOf(y.charAt(j-1));
        			count++;
        			break;
        		}
        	}
        }
    	
    	return substring;
    }
}
