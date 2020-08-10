package codewar.com.CamelCase;

public class CamelCase {
    public static String camelCase(String str) {
    	
    	if(str.length() == 0) {
    		return "";
    	}
       
    	String[] split = str.trim().split(" +");
    	
    	for(int i = 0 ; i < split.length; i++) {
    		split[i] = split[i].substring(0,1).toUpperCase()
    				+ split[i].substring(1, split[i].length());
    	}
    	
    	return String.join("", split);
    }
}
