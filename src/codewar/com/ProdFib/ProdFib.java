package codewar.com.ProdFib;

public class ProdFib {
	public static long[] productFib(long prod) {
		//피보나치수열, 재귀함수
		long firstFibo = 0;
		long secondFibo = 1;
		long sumFibo = 0;
		
		while (sumFibo < prod) {
			
			long temp = firstFibo;
			firstFibo = secondFibo;
			secondFibo  = temp + secondFibo;
			sumFibo = firstFibo*secondFibo;
									
		}
		
		if(sumFibo == prod) {
			return new long[] {firstFibo, secondFibo, 1};
		} else {
			return new long[] {firstFibo, secondFibo, 0};
		}
	}
	
//	public static long Fibonacci(long n) {
//		long first = 0;
//		long second = 1;
//		
//		for(long i=1; i < n; i++) {
//			long sum = first+second;
//			first = second;
//			second = sum;
//		}
//		
//		return second;
//	}
}
