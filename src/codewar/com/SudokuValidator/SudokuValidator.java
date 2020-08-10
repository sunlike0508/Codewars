package codewar.com.SudokuValidator;

import java.util.Arrays;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
    	
    	if(!isRowColumn(sudoku)) {
    		return false;
    	}
    	
    	if(!isMatrix(sudoku)) {
    		return false;
    	}
    	
    	return true;
    }

	private static boolean isMatrix(int[][] sudoku) {
		
		for(int i = 0; i < 9; i+=3) {
			for(int j = 0; j < 9; j+=3) {
				if(!isThreeMatrix(i, j, sudoku)) {
					return false;
				}
			}
		}
		
		return true;
	}

	private static boolean isThreeMatrix(int i, int j, int[][] sudoku) {
		int[] check = new int[9];
		
		for(int x = i; x < i+3; x++) {
			for(int y = j; y < j+3; y++) {
				
				if(sudoku[x][y] < 1 || sudoku[x][y] > 10) {
					return false;
				}
				
				if(check[sudoku[x][y]-1] != 0) {
					return false;
				}
				
				check[sudoku[x][y]-1] = sudoku[x][y];
			}
		}
		
		return true;
	}

	private static boolean isRowColumn(int[][] sudoku) {
		int[] checkRow = new int[9];
		int[] checkColumn = new int[9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(sudoku[i][j] < 1 || sudoku[i][j] > 10 || sudoku[j][i] < 1 || sudoku[j][i] > 10) {
					return false;
				}
				
				if(checkRow[sudoku[i][j]-1] != 0 || checkColumn[sudoku[j][i]-1] != 0) {
					return false;
				}
				
				checkRow[sudoku[i][j]-1] = sudoku[i][j];
				checkColumn[sudoku[j][i]-1] = sudoku[j][i];
			}
			
			Arrays.fill(checkRow, 0);
			Arrays.fill(checkColumn, 0);
		}
		
		return true;
	}

}
