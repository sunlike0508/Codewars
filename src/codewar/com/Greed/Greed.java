package codewar.com.Greed;

import java.util.HashMap;

public class Greed {
	HashMap<Integer,Integer> diceMap = new HashMap<Integer,Integer>();
	
	public int greedy(int[] dice) {
		int score = 0;
		
		setDiceMap(dice);
		
		for(Integer key : diceMap.keySet()) {
			
			score = calculateScore(score, key);
		}

		return score;
	}

	public int calculateScore(int score, Integer key) {
		int value = diceMap.get(key);
		
		if(value >= 3) {
			score += key*100;
		}
		
		if(key == 5) {
			score += (value%3)*50;
		}
		
		if(key == 10) {
			score += (value%3)*100;
		}
		
		return score;
	}

	public void setDiceMap(int[] dice) {
		for(int number : dice) {
			if(!diceMap.containsKey(number==1? 10:number)) {
				diceMap.put(number==1? 10:number, 1);
			} else {
				diceMap.put(number==1? 10:number, diceMap.get(number==1? 10:number)+1);
			}
		}
	}
}


/*
 *     int n[] = new int[7];
for (int d : dice) n[d]++;
return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
 */