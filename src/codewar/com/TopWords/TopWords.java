package codewar.com.TopWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopWords {
    public static List<String> top3(String s) {
    	
    	PriorityQueue<HashMap.Entry<String, Integer>> pQueue 
    	= new PriorityQueue<HashMap.Entry<String,Integer>>
    	((a,b) -> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue());
    	
    	HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
    	
    	s = s.replaceAll("[^ 'a-zA-Z]", " ").trim().replaceAll(" +", " ").replaceAll("'+", "'");
    	
    	while(s.length() > 0) {
    		String[] split = s.split(" ");
    		int count = countWord(split);
    		
    		s = String.join(" ", split).trim();
    		
    		if(count > 0) {
    			wordMap.put(split[0], count);
    		}
    	}
    	
        for(HashMap.Entry<String, Integer> entry: wordMap.entrySet())
        {
        	pQueue.offer(entry);
        }
    	
    	return covertQueueToList(pQueue);
    }

	private static List<String> covertQueueToList(PriorityQueue<Entry<String, Integer>> pQueue) {
		List<String> list = new ArrayList<String>();
    	
    	int i = 0;
    	
    	while(!pQueue.isEmpty() && i < 3) {
    		list.add(pQueue.poll().getKey().toLowerCase());
    		i++;
    	}
    	
    	return list;
	}

	public static int countWord(String[] split) {
		int count = 0;
		
		for(int i = 0; i < split.length; i++) {
			
			if("'".equals(split[0])) {
				split[i] = "";
			}
			
			if(split[0].equals(split[i])) {
				count++;
				split[i] = "";
			}
		}
		
		return count;
	}
}
