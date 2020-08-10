package codewar.com.Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Permutations {
	
	
    public static List<String> singlePermutations(String s) {
    	HashSet<String> set = new HashSet<String>();
        
    	char[] charArray = s.toCharArray();
    	
    	permutation(set, charArray, 0, charArray.length, charArray.length);
    	
    	List<String> list = convertSet(set);
    	
        return list;
    }
    
    private static List<String> convertSet(HashSet<String> set) {
    	List<String> list = new ArrayList<String>();
    	
    	Iterator<String> iter = set.iterator();
    	
    	while(iter.hasNext()) {    		
    		list.add(iter.next());
    	}
    	
		return list;
	}

	static void permutation(HashSet<String> set, char[] arr, int depth, int n, int r) {
        if (depth == r) {
        	set.add(String.valueOf(arr));
            return;
        }
     
        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(set, arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }
    
	static void swap(char[] arr, int depth, int i) {
		char temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

    public static void main(String[] argv) {
    	String s = "abc";
    	
    	List<String> list = singlePermutations(s);
    	
    	for(int i = 0; i < list.size(); i++) {
    		System.out.println(list.get(i).toString());
    	}
    	
    }
}
