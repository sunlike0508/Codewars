package codewar.com.LongestSlideDown;

class Slide{
	int number;
	int row;
	int col;
}

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {

		for (int i = pyramid.length - 1; i >= 1; i--) {
		
			for (int j = 0; j < i; j++)      {      
				pyramid[i - 1][j] += Math.max(pyramid[i][j], pyramid[i][j + 1]);
			}
		}
	    
	    return pyramid[0][0];
    }
}
//
//	private static int findMax(Slide[] result) {
//		
//		int max = 0;
//		
//		for(int i = 0; i < result.length; i++) {
//			if(result[i].number > max) {
//				max = result[i].number;
//			}
//		}
//		
//		return max;
//	}
//
//	private static Slide[] slideDown(int[][] pyramid, Slide[] sum, int row) {
//		
//		if(row == pyramid.length) {
//			return sum;
//		}
//		
//		Slide[] newSum = new Slide[(int)Math.pow(2, row)];
//
//		for(int i = 0, j = 0; i < sum.length; i++) {
//			newSum[j] = new Slide();
//			newSum[j].number = sum[i].number + pyramid[sum[i].row + 1][sum[i].col]; // 왼쪽
//			newSum[j].row = sum[i].row + 1;
//			newSum[j].col = sum[i].col;
//			j++;
//			newSum[j] = new Slide();
//			newSum[j].number = sum[i].number + pyramid[sum[i].row + 1][sum[i].col+1]; // 오른쪽
//			newSum[j].row = sum[i].row + 1;
//			newSum[j].col = sum[i].col + 1;
//			j++;
//		}
//		
//		return slideDown(pyramid, newSum, row+1);
//	}
	
//    for (int i = p.length - 1; i >= 1; i--)
//        for (int j = 0; j < i; j++)            
//          p[i - 1][j] += Math.max(p[i][j], p[i][j + 1]);
//      
//      return p[0][0];
//}
