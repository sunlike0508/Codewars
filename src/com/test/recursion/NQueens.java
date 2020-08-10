package com.test.recursion;

public class NQueens {
	static final int N = 4;
	static int[] cols = new int[N+1];
	private static int [][] board = {
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}
		};
//	private static int [][] board = {
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0,0,0}
//		};
	
	static void set(int i, int j, String str) {
		
		if(i > 3) {
			return ;
		}
		
		if(j > 3) {
			return ;
		}
		System.out.println("i = " + i + " j= " + j);
		str += (i == 0 ? j : i);
		
		System.out.println(str);
		set(i+1, j+1, str);
		i = 0;
		set(i, j+1, str);
	}

	public static void main(String[] args) {
		
		set(1, 0, "X");
		
//		System.out.println(nQueen(0));
//		
//		for(int i = 0; i < N; i++) {
//			System.out.println(i);
//			board[i][cols[i+1]-1] = 1;
//		}
//		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N ; j++) {
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	private static boolean nQueen(int level) {
		
		if(!isCorrect(level)) {
			return false;
		} else if(level == N) {
			return true;
		} else {
			for(int i = 1; i <= N; i++) {
				cols[level+1] = i;
			
				if(nQueen(level+1)) {
					return true;
				}
			}
			
			return false;
		}
	}

	private static boolean isCorrect(int level) {
		// 열이 같은가
		// 대각선이 같은가
		
		for(int i = 1; i < level; i++) {
			if(cols[level] == cols[i]) { // 열이 같은가
				return false;
			}
			if(level-i == Math.abs(cols[level] - cols[i])) {
				return false;
			}
		}
		
		return true;
	}

}
