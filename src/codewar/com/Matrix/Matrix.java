package codewar.com.Matrix;

public class Matrix {
    public static int determinant2(int[][] m) {
        int d = 0, size = m.length;
        if (size == 1) return m[0][0];
        
		for (int n = 0; n < size; n++) {
			int[][] newM = new int[size - 1][size - 1];
			
			for (int x = 1; x < size; x++) {
				for (int y = 0; y < size; y++) {
					if (y == n) {
						continue;
					}
					
					newM[x - 1][y + (y > n ? -1 : 0)] = m[x][y];
				}
			}
			
			d += (n % 2 != 0 ? -1 : 1) * m[0][n] * determinant2(newM);
		}
        return d;
    }
    
	public static int determinant(int[][] matrix) {
		
		if(matrix.length == 1) {
			return matrix[0][0];
		}else if(matrix.length == 2 ) {
			return matrix[0][0]* matrix[1][1] - matrix[0][1]*matrix[1][0];
		} else {
			int sum = 0;
			
			for(int j = 0; j < matrix.length; j++) {
				sum += matrix[0][j] * deter(matrix, j) * (j % 2 == 0 ? 1 : -1);
			}
			
			return sum;
		}
	}

	private static int deter(int[][] matrix, int j) {
		
		int[][] smallMatrix = makeSmallMatrix(matrix, j);
		
		if(smallMatrix.length == 2) {
			return smallMatrix[0][0]* smallMatrix[1][1] - smallMatrix[0][1]*smallMatrix[1][0];
		} 
		
		int sum = 0;
		
		for(int y = 0; y < smallMatrix.length; y++) {
			sum += smallMatrix[0][y] * deter(smallMatrix, y) * (y % 2 == 0 ? 1 : -1);
		}
		
		return sum;
	}

	private static int[][] makeSmallMatrix(int[][] matrix, int j) {
		int[][] smallMatrix = new int[matrix.length -1][matrix.length -1];
		
		for(int x1 = 0, x2 = 1; x1 < smallMatrix.length; x1++, x2++) {

			for(int y1 = 0, y2 = 0; y1 < smallMatrix.length; y1++, y2++) {
				if(y1 == j) {
					y2++;
				}
				
				smallMatrix[x1][y1] = matrix[x2][y2];
			}
		}
		
		return smallMatrix;
	}
}
