package codewar.com.CaffeineScript;

public class CaffeineBuzz {
	public static String caffeineBuzz(int n){
		
		if(n% 3 != 0) {
			return "mocha_missing!";
		}
		    
	    if(n % 4 == 0){
	    	return "CoffeeScript";
	    } 
	    
	    if (n % 2 == 0) {
	    	return "JavaScript";
	    }
	    
	    return "Java";
	}
}
