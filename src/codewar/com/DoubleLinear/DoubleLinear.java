package codewar.com.DoubleLinear;

import java.util.ArrayList;
import java.util.List;

public class DoubleLinear {
    public static int dblLinear (int n) {
    	
    	List<Integer> ylist = new ArrayList<Integer>();
    	ylist.add(1);
    	int i = 0;
    	int j = 0;
    	
    	while(ylist.size() <= n+1) {
    		int y = 2 * ylist.get(i) + 1;
    		int z = 3 * ylist.get(j) + 1;
    		
    		if(y < z) {
    			i++;
    		} else if(y > z){
    			j++;
    		} else {
    			i++;
    			j++;
    		}
    		
    		ylist.add(Math.min(y, z));
    	}
    	
    	return ylist.get(n);
    }
}
