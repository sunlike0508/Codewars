package codewar.com.DirReduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        
    	List<String> dirList = new ArrayList<String>(Arrays.asList(arr));
    	int i = 0;
    	
    	do {
    		String temp = dirList.get(i) + dirList.get(i+1);
    		
    		if("WESTEAST".equals(temp) || "EASTWEST".equals(temp) ||
    				"NORTHSOUTH".equals(temp) || "SOUTHNORTH".equals(temp)) {
    			
    			dirList.remove(i+1);
    			dirList.remove(i);
    			
    			if(i > 0) {
    				i--;
    			}
    		}
    		else {
    			i++;
    		}
    		
    	} while( i < dirList.size() -1);   
    	

    	return dirList.toArray(new String[dirList.size()]);
    }
}
