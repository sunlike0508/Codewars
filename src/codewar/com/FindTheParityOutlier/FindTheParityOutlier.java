package codewar.com.FindTheParityOutlier;

public class FindTheParityOutlier {
	static int find(int[] integers) {
//		int findNum = 0;
//		
//		for(int i = 2; i < integers.length; i++) {
//			
//			int first = (integers[i-2] > 0 ? integers[i-2]%2 : (integers[i-2]*-1)%2);
//			int second = (integers[i-1] > 0 ? integers[i-1]%2 : (integers[i-1]*-1)%2);
//			int third = (integers[i] > 0 ? integers[i]%2 : (integers[i]*-1)%2);
//			
//			System.out.println(first + " " + second + " " + third);
//			
//			if((first == second) && (first!=third)) {
//				findNum = third;
//				break;
//			} 
//			
//			if((first!=second) && (first==third)) {
//				findNum = second;
//				break;
//			}
//			
//			if((first!=second) && (first!=third)) {
//				findNum = first;
//				break;
//			}
//		}
		
		int odd = 0;
		int even = 0;
		int oddCount = 0;
		
		for(int num : integers) {
			
			int rest = num % 2;
			
			if(rest == 0) {
				even = num;
			} else {
				oddCount++;
				odd = num;
			}
		}
		
		return oddCount > 1 ? even : odd;
	}
}
