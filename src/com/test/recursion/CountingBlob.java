package com.test.recursion;

public class CountingBlob {
	private static int N = 8;
	private static int [][] blob = {
		{1,0,0,0,0,0,0,1},
		{0,1,1,0,0,1,0,0},
		{1,1,0,0,1,0,1,0},
		{0,0,0,0,0,1,0,0},
		{0,1,0,1,0,1,0,0},
		{0,1,0,1,0,1,0,0},
		{1,0,0,0,1,0,0,1},
		{0,1,1,0,0,1,1,1},
	};
	
	private static final int BACKGROUND_COLOUR = 0;
	private static final int IMAGE_COLOUR = 1;
	private static final int ALREADY_COUNT = 2;
	
	public static void main(String[] argv) {
		System.out.println(countCells(4, 3));
		printMaze();
	}
	
	public static int countCells(int x, int y) {
		
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return 0;
		} else if(blob[x][y] != IMAGE_COLOUR) {
			return 0;
		} else {
			blob[x][y] = ALREADY_COUNT;
			
			return 1 + countCells(x-1,y+1) + countCells(x,y+1) 
					+ countCells(x+1,y+1) + countCells(x-1,y) 
					+ countCells(x+1,y) + countCells(x-1,y-1) 
					+ countCells(x,y-1) + countCells(x+1,y-1); 
		}
	}
	
	private static void printMaze() {
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N; j++) {
				System.out.print(blob[i][j]);
			}
			System.out.println();
		}
		
	}
}
