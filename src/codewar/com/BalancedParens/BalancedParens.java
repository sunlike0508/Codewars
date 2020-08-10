package codewar.com.BalancedParens;

import java.util.ArrayList;
import java.util.List;

public class BalancedParens {
    public static List <String> balancedParens (int n) {
    	List<String> parenthesisList = new ArrayList<String>();
    	makeParenthesis(parenthesisList, new char[2*n], 0, n, 0, 0);
        return parenthesisList;
    }
	
	static void makeParenthesis(List<String> parenthesisList, char parenthesis[], int pos, int n, int open, int close) 
    { 
        if(close == n) {
            parenthesisList.add(String.valueOf(parenthesis));
            return; 
        } else { 
        	
            if(open > close) { 
            	parenthesis[pos] = ')'; 
            	makeParenthesis(parenthesisList, parenthesis, pos+1, n, open, close+1); 
            } 
            
            if(open < n) { 
            	parenthesis[pos] = '('; 
            	makeParenthesis(parenthesisList, parenthesis, pos+1, n, open+1, close); 
            } 
        } 
    }
}