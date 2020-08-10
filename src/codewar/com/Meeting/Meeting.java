package codewar.com.Meeting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;


public class Meeting {
    public static String meeting(String s) {
        String[] guestSplit = s.toUpperCase().split(";");
        HashMap<String,String> lastNameMap = new HashMap<String, String>();
        
        for(String guest : guestSplit) {
        	String[] name = guest.split(":");
        	lastNameMap.put(name[1], lastNameMap.getOrDefault(name[1], "") + name[0] + ":");
        }
        
        TreeMap<String,String> tm = new TreeMap<String,String>(lastNameMap);

        Iterator<String> iteratorKey = tm.keySet().iterator();   //키값 오름차순 정렬(기본)
        
        String result = "";
        
        while(iteratorKey.hasNext()) {
        	String lastName = iteratorKey.next();
        	
        	String[] firstNameArray = lastNameMap.get(lastName).split(":");
        	
        	Arrays.sort(firstNameArray);
        	
        	for(String firstName : firstNameArray) {
        		result +="("+lastName+", "+ firstName + ")";
        	}
        }
        
        return result;
    }
}
