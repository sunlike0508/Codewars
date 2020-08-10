package codewar.com.Square;

public class Square {
    public static boolean isSquare(int n) {
    	
    	for(int i = 0; i <= Math.sqrt(n); i++) {
    		if( i * i == n) {
    			return true;
    		}
    	}
    	
        return false;
    }
}
