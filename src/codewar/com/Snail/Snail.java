package codewar.com.Snail;

import java.util.Arrays;

public class Snail {
	public static int[] snail(int[][] array) {
		
		if(array == null || array[0].length == 0) {
			return new int[] {};
		}
		
		int[] result = Arrays.copyOf(array[0], array.length * array.length);
		
		boolean turn = true;
		int length = array.length-2; 
		int x = 0;
		int y = array.length-1;
		
		int nextX = array.length-1;
		int nextY = 0;
		
		for(int i = array.length ; i < result.length ; i++) {
			if(turn) {
				if(x < nextX) {
					x++;
				} else {
					y--;
				}
			} else {
				if(x > nextX) {
					x--;
				} else {
					y++;
				}
			}
			
			result[i] = array[x][y];
			
			if(x == nextX && y == nextY) {
				nextX = nextX + (turn? -length : length);
				nextY = nextY + (turn? length : -length);
				length-=1;
				turn = !turn;
			}
		}
		
		return result;
	}
}
