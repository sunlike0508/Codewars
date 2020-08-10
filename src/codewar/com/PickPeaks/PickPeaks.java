package codewar.com.PickPeaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
    	
    	Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
    	List<Integer> posS = new ArrayList<Integer>();
    	List<Integer> peaksS = new ArrayList<Integer>();
    	
    	for(int j = 0, i = 1, k = 2; i < arr.length - 1; j++, i++, k++) {
    		if(arr[j] < arr[i] && arr[i] > arr[k]) {
    			posS.add(j+1);
    			peaksS.add(arr[j+1]);
    		} else if(arr[j] < arr[i] && arr[i] == arr[k]) {
    			j--;
    		} else {
    			j = i-1;
    		}
    	}
    	
    	map.put("pos", posS);
    	map.put("peaks", peaksS);
    	
        return map;
    }
}
