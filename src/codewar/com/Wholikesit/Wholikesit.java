package codewar.com.Wholikesit;

public class Wholikesit {
    public static String whoLikesIt(String... names) {
        //��������
    	
    	int length = names.length;
    	String text = null;
    	
    	if(length == 0) {
    		text = "no one likes this";
    	} else if(length == 1) {
    		text = names[0] + " likes this";
    	} else if(length == 2) {
    		text = names[0] + " and " + names[1] + " like this";
    	} else if(length == 3){
    		text = names[0] + ", " + names[1] +" and " + names[2] + " like this";
    	} else {
    		text = names[0] + ", " + names[1] +" and " + (length-2) + " others like this";
    	}
    	
        return text;
    }
}
