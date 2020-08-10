package codewar.com.thirteen;

public class Thirteen {
	public static long thirt(long n) {
		
		long remainder = n;
		
		do {
			n = remainder;
			remainder = makeRemainder(makeSequence(n));
						
		} while(n != remainder);
		
		return remainder;
	}

	private static int makeRemainder(int[] sequence) {
		
		int remainder = 0;
		int[] cycle = {1, 10, 9, 12, 3, 4};
		
		for(int i = 0, j = 0; i < sequence.length; i++, j++) {
			
			if(j == cycle.length) {
				j = 0;
			}
			
			remainder += sequence[i] * cycle[j];
		}
		
		return remainder;
	}

	private static int[] makeSequence(long n) {
		
		int[] sequence = new int[(int)Math.log10(n) + 1];
		
		for(int i = 0; i < sequence.length; i++) {
			sequence[i] = (int) (n % 10);
			n = n / 10;
		}
		
		return sequence;
	}
}
