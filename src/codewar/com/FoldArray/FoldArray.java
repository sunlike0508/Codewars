package codewar.com.FoldArray;

public class FoldArray {
	public static int[] foldArray(int[] array, int runs) {
		int[] foldArray = null;
		
		for(int i = 0; i < runs; i++) {
			foldArray = fold(array); 
			
			array = foldArray;
		}
		
		return foldArray;
	}
	
	private static int[] fold(int[] array) {
		
		int[] foldArray = allocateArray(array);
		
		for(int i = 0; i < array.length/2 ; i++) {
			foldArray[i] = array[i] + array[array.length-i-1];
		}
		
		if(array.length%2 == 1) {
			foldArray[foldArray.length-1] = array[array.length/2];
		}
		
		return foldArray;
	}

	public static int[] allocateArray(int[] array) {		
		return new int[array.length%2 == 0? array.length/2 : array.length/2 + 1];
	}
}
