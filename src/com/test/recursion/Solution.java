package com.test.recursion;

import java.util.*;

class Solution {
    
    class Truck{
		int index;
		int weight;
		
		Truck(int index, int weight) {
			this.index = index;
			this.weight = weight;
		}
	}
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Truck> que = new LinkedList<Truck>();
        
        for(int i = 0; i < truck_weights.length; i++) {
        	answer++;
        	moveIndex(que, bridge_length);
        	
        	int truckWeight = truck_weights[i];
        	int queWeight = calculateQueWeight(que);
        	        	
        	if(queWeight + truckWeight <= weight  && que.size() < bridge_length) {
        		Truck truck = new Truck(1, truckWeight);
        		que.add(truck);
        	} else {
        		i--;
        	}
        }
        
        while(!que.isEmpty()) {
        	moveIndex(que, bridge_length);
        	answer++;
        }
        
        return answer;
    }
    
    private static void moveIndex(Queue<Truck> que, int bridge_length) {
		
		if(!que.isEmpty()) {
			
			if(que.peek().index == bridge_length) {
				que.poll();
			}
			
			for(Truck truck : que) {
				truck.index++;
			}
		}
	}

	private static int calculateQueWeight(Queue<Truck> que) {
		
		int sum = 0;
		
		if(que.isEmpty()) {
			return 0;
		} else {
			for(Truck truck : que) {
				sum += truck.weight;
			}
		}
		
		return sum;
	}
}
